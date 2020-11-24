/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import ActiveView.AddEmployee;
import ActiveView.Tables; 
import ActiveView.LoginScreen;
import ActiveView.TableManagement;
import ActiveView.OrderEntryScreen;
import ActiveView.TimeClock;
import ActiveView.KitchenOrderScreen;
import ActiveView.MainImage;
import ActiveView.ManagerModule;
import Model.*; 
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author Johnny
 */
public class Controller {
    
    private MainImage mainScreen; 
    
    private Database database;
    
    private ArrayList<String> resultColumn; 
    private ArrayList<String> resultRow; 
    private LoginScreen keypad; 
    private Tables tables;
    
    public Controller(){
        database = new Database("jdbc:mysql://mysql.stackcp.com:55219/RestaurantApp-37371618", "RestaurantApp-37371618", "oki80a0ih2"); 
        mainScreen = new MainImage(this);
        
        initialize(); 
    }

    public void initialize(){
        mainScreen.setVisible(true);
       
    }
    
    public void showLoginScreen(String moduleSelected){
        keypad = new LoginScreen(moduleSelected, this);
        keypad.setVisible(true);
        
    }
    public void hideLoginScreen(){
        
        keypad.dispose();
        
    }
    public void updateAllTableColor(){
        String query = "SELECT * FROM `Booths`";
        Map<String, String> statusMap = database.getBoothsTable(query);
        //System.out.println("Table One's status is: " + statusMap.get("ONE"));
        
        String[] tableNames = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        for(int i = 0; i < 9; i++){
            String status = statusMap.get(tableNames[i]); 
            String[] tempArray;
            /* delimiter */
            String delimiter = " ";
            /* given string will be split by the argument delimiter provided. */
            tempArray = status.split(delimiter);

            String color = tempArray[tempArray.length-1];
            switch(color) {
                case "RED":
                    tables.setTableColor(tableNames[i], Color.RED);
                    break;
                case "GREEN":
                    tables.setTableColor(tableNames[i], Color.GREEN);
                    break;
                case "YELLOW":
                    tables.setTableColor(tableNames[i], Color.YELLOW);
                    break;
                case "BLUE":
                    tables.setTableColor(tableNames[i], Color.BLUE);
                    break;
                case "MAGENTA":
                    tables.setTableColor(tableNames[i], Color.MAGENTA);
                    break; 
                default:
                  // code block
                    System.out.println("Controller: Something has gone terribly wrong in the set color method, please contact support");
            }
        }
        
    }
    public void updateAllTableServer(){

        
        String query = "SELECT tableName, Booths.employeeId, firstName FROM `Booths` Left Join Employee on Booths.employeeId = Employee.employeeId";
        Map<String, String> namesMap = database.getAssignedTableServerList(query);
        //System.out.println("Table One's status is: " + statusMap.get("ONE"));
        
        String[] tableNames = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        
        
        
        for(int i = 0; i < 9; i++){
            
            if(namesMap.containsKey(tableNames[i])){
                
                String serverName = namesMap.get(tableNames[i]); 

                if(serverName == null){
                    tables.setTableServer(tableNames[i], "No Server Assigned");
                }
                else{
                    tables.setTableServer(tableNames[i], serverName);
                }
            }

        }
    }
    public void showHostessModule(){
        
        tables = new Tables(this);
        System.out.println("method performed");
        tables.setVisible(true);
        JFrame frame = new JFrame("Table Management");
        frame.add(tables);
        frame.pack();
        frame.setSize(1470,970);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);        
        updateAllTableColor();
        updateAllTableServer(); 

    }
    
    public void showManagementModule(){
        ManagerModule manager = new ManagerModule();
        manager.setVisible(true);
    }
    
    public void showAddEmployeeForm(){
        AddEmployee employee = new AddEmployee();
        employee.setVisible(true);
    }
    
    public void showTableManagmentScreen(String tableSelected){
        
        String query = "SELECT Employee.firstName FROM `Booths` Left Join Employee on Booths.employeeId = Employee.employeeId WHERE tableName = '"+tableSelected+"'";
        String serverName = database.getEmployeeNameById(query);
        
       
        if(serverName == null){
        
            TableManagement tm = new TableManagement(tableSelected, this);
            tm.setVisible(true);
            
            System.out.println("tablestatus is null, this is not an error. ");
            
            tables.setTableServer(tableSelected, "No Server Assigned");
            
        }
        else{
            
            String tableQuery = "SELECT * FROM `Booths` WHERE tableName = '" + tableSelected + "'";
            String status = database.getTableColor(tableQuery);
            
       
                    
            String[] tempArray;
        
            String delimiter = " ";
         
            tempArray = status.split(delimiter);

            String color = tempArray[tempArray.length-1];
           
            String tableStatus = "null"; 
            if(tempArray.length == 3){
                tableStatus = tempArray[0] + " " + tempArray[1];
            }else if(tempArray.length == 2){
                tableStatus = tempArray[0];
            }
          
                    
            TableManagement tm = new TableManagement(tableSelected, this, serverName, tableStatus);
            tm.setVisible(true);
            
            tables.setTableServer(tableSelected, serverName);
        }
        
        
           
    }
    

    
    public void updateServer(String tableSelected, String tableServer){
        tables.setTableServer(tableSelected, tableServer) ;
        
        String query = "SELECT employeeId FROM `Employee` WHERE firstName = '"+ tableServer +"'";
        String id = database.getEmployeeIdByName(query);
        //System.out.println(tableServer + "'s ID is " + id);
        
        query = "UPDATE `Booths` SET `employeeId`= '" + id + "' WHERE tableName = '" + tableSelected + "'";
                
        database.updateTableServer(query);
        
    }
    
    
    public void updateTableStatus(String selectedTable, String status){ //updates the database
        System.out.println("Setting table " + selectedTable + "'s status to " + status);
        if(status.equalsIgnoreCase("dirty")){
            String query = "UPDATE `Booths` SET `status` = 'DIRTY RED' WHERE tableName = '" + selectedTable.toUpperCase() + "'";
            database.updateTableStatus(query);
            updateTableColor(selectedTable);
        }else if (status.equalsIgnoreCase("ready")){
            String query = "UPDATE `Booths` SET `status` = 'READY GREEN' WHERE tableName = '" + selectedTable.toUpperCase() + "'";
            database.updateTableStatus(query);
            updateTableColor(selectedTable);
        }else if (status.equalsIgnoreCase("new arrival")){
            String query = "UPDATE `Booths` SET `status` = 'NEW ARRIVAL YELLOW' WHERE tableName = '" + selectedTable.toUpperCase() + "'";
            database.updateTableStatus(query);
            updateTableColor(selectedTable);
        }else if (status.equalsIgnoreCase("order in")){
            String query = "UPDATE `Booths` SET `status` = 'ORDER IN BLUE' WHERE tableName = '" + selectedTable.toUpperCase() + "'";
            database.updateTableStatus(query);
            updateTableColor(selectedTable);
        }else if (status.equalsIgnoreCase("order ready")){
            String query = "UPDATE `Booths` SET `status` = 'ORDER READY MAGENTA' WHERE tableName = '" + selectedTable.toUpperCase() + "'";
            database.updateTableStatus(query);
            updateTableColor(selectedTable);
            
        }
        else{
            System.out.println("oops, something has gone terribly wrong... please contact customer support");
        }
        
    }
    public void updateTableColor(String selectedTable){ //updates the gui
        
        String query = "SELECT * FROM `Booths` WHERE tableName = '" + selectedTable + "'";
        String status = database.getTableColor(query);
        
        String[] tempArray;
        /* delimiter */
        String delimiter = " ";
        /* given string will be split by the argument delimiter provided. */
        tempArray = status.split(delimiter);
        
        String color = tempArray[tempArray.length-1];
        switch(color) {
            case "RED":
                tables.setTableColor(selectedTable, Color.RED);
                break;
            case "GREEN":
                tables.setTableColor(selectedTable, Color.GREEN);
                break;
            case "YELLOW":
                tables.setTableColor(selectedTable, Color.YELLOW);
                break;
            case "BLUE":
                tables.setTableColor(selectedTable, Color.BLUE);
                break;
            case "MAGENTA":  
                tables.setTableColor(selectedTable, Color.MAGENTA);
                break; 
            default:
              // code block
                System.out.println("Something has gone terribly wrong in the set color method, please contact support");
                //System.out.println(color);
        }
        //tables.setTableColor(selectedTable, color);
    
    }
    
   
    public void login(String moduleClicked, String code){
        if(moduleClicked.equalsIgnoreCase("TimeCard")){
            
            System.out.println("Timecard was clicked... prearing to login: " + code);
            //database.runSelectQuery("Select * from Employee");
            if(database.findEmployeeByloginCode(code)){
                
                resultColumn = database.getCurrentColumn();
                resultRow = database.getCurrentRow();
                System.out.println("Logged in as: "  + resultRow.get(1));
                TimeClock tc = new TimeClock(resultRow.get(1), this);
                tc.setVisible(true);
                /*
                for(int i = 0; i < resultColumn.size(); i++){
                    System.out.print(resultRow.get(i)); 
                }
                */
            }
            else{
                JFrame frame = new JFrame("Error Message");
                JOptionPane.showMessageDialog(frame,"Incorrect Login Code");
                //System.out.println("employee not found... come back to this line to handle the exception later!!!");
            }
            
        }
       
    }
    
    public void clockIn(GregorianCalendar now){
        //this method should only be called within timeclock's gui, 
        //which means login method has to run before this, which means resultRow and resultColumn are not null; 
        
        System.out.println("Logging in... Current time is: " + now.getTime());
        //sql datetime format 2020-11-02 14:50:10
                            //2020-11-02 14:58:51
        //Logging in... Current time is: Mon Nov 02 14:51:09 CST 2020
        
        // Creating an object of SimpleDateFormat 
        SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss"); 
  
        // Use format() method to change the format 
        // Using getTime() method, 
        // this required date is passed 
        // to format() method 
        String dateFormatted  = formattedDate.format( now.getTime()); 
  
        // Displaying grogorian date ia SimpleDateFormat 
        System.out.print("SimpleDateFormat: "+ dateFormatted); 
        String query = "INSERT INTO TimeCard (employeeId, clockInTime) VALUES ('" + resultRow.get(0) + "', '" + dateFormatted + "')";
        
        database.runInsertQuery(query);
        
        query = "UPDATE Employee SET clockedIn = 'TRUE' WHERE employeeId = '" + resultRow.get(0) + "'";
        
        database.runInsertQuery(query);
      
        
        
        
    }
    public void clockOut(GregorianCalendar now2){
        //this method should only be called within timeclock's gui, 
        //which means login method has to run before this, which means resultRow and resultColumn are not null; 
        
        System.out.println("Logging out... Current time is: " + now2.getTime());
        //sql datetime format 2020-11-02 14:50:10
                            //2020-11-02 14:58:51
        //Logging in... Current time is: Mon Nov 02 14:51:09 CST 2020
        
        // Creating an object of SimpleDateFormat 
        SimpleDateFormat formattedDate2 = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss"); 
  
        // Use format() method to change the format 
        // Using getTime() method, 
        // this required date is passed 
        // to format() method 
        String dateFormatted2  = formattedDate2.format( now2.getTime()); 
  
        // Displaying grogorian date ia SimpleDateFormat 
        System.out.print("SimpleDateFormat: "+ dateFormatted2); 
        String query = "INSERT INTO TimeCard (employeeId, clockOutTime) VALUES ('" + resultRow.get(0) + "', '" + dateFormatted2 + "')";
        
        database.runInsertQuery(query);
}
    public void startBreak(GregorianCalendar now3){
        System.out.println("Starting Break... Current time is: " + now3.getTime());
        //sql datetime format 2020-11-02 14:50:10
                            //2020-11-02 14:58:51
        //Logging in... Current time is: Mon Nov 02 14:51:09 CST 2020
        
        // Creating an object of SimpleDateFormat 
        SimpleDateFormat formattedDate3 = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss"); 
  
        // Use format() method to change the format 
        // Using getTime() method, 
        // this required date is passed 
        // to format() method 
        String dateFormatted3  = formattedDate3.format( now3.getTime()); 
  
        // Displaying grogorian date ia SimpleDateFormat 
        System.out.print("SimpleDateFormat: "+ dateFormatted3); 
        String query = "INSERT INTO Breaks (timeCardId, beginBreakTime) VALUES ('" + resultRow.get(0) + "', '" + dateFormatted3 + "')";
        
        database.runInsertQuery(query);
        
    }
    
    public void endBreak(GregorianCalendar now4){
        System.out.println("Ending Break... Current time is: " + now4.getTime());
        //sql datetime format 2020-11-02 14:50:10
                            //2020-11-02 14:58:51
        //Logging in... Current time is: Mon Nov 02 14:51:09 CST 2020
        
        // Creating an object of SimpleDateFormat 
        SimpleDateFormat formattedDate4 = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss"); 
  
        // Use format() method to change the format 
        // Using getTime() method, 
        // this required date is passed 
        // to format() method 
        String dateFormatted4  = formattedDate4.format( now4.getTime()); 
  
        // Displaying grogorian date ia SimpleDateFormat 
        System.out.print("SimpleDateFormat: "+ dateFormatted4); 
        String query = "INSERT INTO Breaks (timeCardId, endBreakTime) VALUES ('" + resultRow.get(0) + "', '" + dateFormatted4 + "')";
        
        database.runInsertQuery(query);
        
    }

    public void showBusserModule(){
        
        tables = new Tables(this);
        System.out.println("method performed");
        tables.setVisible(true);
        JFrame frame = new JFrame("Table Management");
        frame.add(tables);
        frame.pack();
        frame.setSize(1470,970);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        updateAllTableColor();
       
        updateAllTableServer(); 
        
        
    }
    
    public void showServerModule(){
        tables = new Tables(this);
        System.out.println("method performed");
        tables.setVisible(true);
        JFrame frame = new JFrame("Table Management");
        frame.add(tables);
        frame.pack();
        frame.setSize(1470,970);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        updateAllTableColor();
        
     
        updateAllTableServer(); 
    }
    
    public void enterOrder(String selectedTable){
        OrderEntryScreen enterOrder = new OrderEntryScreen(this, selectedTable);
        enterOrder.setVisible(true);
       
    }
    
    public void showKitchenModule(){
        tables = new Tables(this, "kitchen");
        System.out.println("method performed");
        tables.setVisible(true);
        JFrame frame = new JFrame("Table Management");
        frame.add(tables);
        frame.pack();
        frame.setSize(1470,970);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        updateAllTableColor();  
    
        updateAllTableServer(); 
    }
    public void showKitchenOrderScreen(String table){
        KitchenOrderScreen screen = new KitchenOrderScreen(this, table);
       
        screen.setVisible(true);

        updateAllTableColor();  
        screen.setText(getKitchenOrder(table));
    }
    
        
    public String[] getServerList(){
    
        String query = "SELECT * FROM `Employee` Left Join Position on Position.positionId = Employee.positionId Where Position.Name = 'Server' AND Employee.clockedIn = 'TRUE'";
        
        return database.grabServerList(query);
        
    }
    
    public  Map<String, String[]> getMenuItems(){
        
        String query = "SELECT * FROM `MenuItems";
        
        //return database.getMenuItems(query);
        /*
        String[] list1 = {"entree 1","entree2"};
        String[] list2 = {"drink2","drink","drinksss"};
        String[] list3 = {"dessert"};
        String[] list4 = {"sides","ssss","side numba 3", "sides numba 4"};
        
        Map<String, String[]> menuItems = new HashMap<String, String[]>(); 
        
        menuItems.put("ENTREES", list1);
        menuItems.put("DRINKS", list2);
        menuItems.put("DESSERTS", list3);
        menuItems.put("SIDES", list4);
        */
        
        
        return database.getMenuItems(query);
        
        
    }
    
    public void sendOrderToKitchen(String order, String table){
        
        String query = "SELECT * FROM CustomerOrders ORDER BY orderId DESC LIMIT 1";
        int lastId = database.getLastOrderID(query); 
        int incrememt = lastId + 1; 
        System.out.println(table);
        query = "INSERT INTO `CustomerOrders`(`orderId`, `orderItems`) VALUES ('" + Integer.toString(incrememt) + "','"+ order +"')";
        database.runInsertQuery(query);
        query = "UPDATE `Booths` SET `ActiveOrder` = '"+ Integer.toString(incrememt) +"' WHERE tableName = '" + table.toUpperCase() + "'";
        database.updateTableStatus(query);
    }
    
    public String getKitchenOrder(String table){
        String query = "SELECT ActiveOrder FROM Booths Left Join CustomerOrders on CustomerOrders.orderId = Booths.ActiveOrder Where TableName = '"+ table +"'";
        int activeOrder = database.getActiveOrder(query);
        
        if(activeOrder == 0){
            return "There is no order on this table";
        }
        else{
            query = "SELECT * FROM `CustomerOrders` WHERE orderId = '"+ activeOrder +"'"; 
            String s = database.getOrderItems(query); 
            return s;
        }
        
    }

}