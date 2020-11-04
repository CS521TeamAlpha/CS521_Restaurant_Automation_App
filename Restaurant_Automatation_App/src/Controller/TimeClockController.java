/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*; 
import Model.*; 
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Johnny
 */
public class TimeClockController {
    
    private MainImage mainScreen; 
    
    private Database database;
    
    private ArrayList<String> resultColumn; 
    private ArrayList<String> resultRow; 
    private LoginScreen keypad; 
    
    
    public TimeClockController(){
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
        
        keypad.setVisible(false);
        
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
    
    public void showHostessModule(){
        
        Tables tables = new Tables(this);
        System.out.println("method performed");
        tables.setVisible(true);
        JFrame frame = new JFrame("Error Message");
        frame.add(tables);
        //frame.pack();
        frame.setSize(1920,1080);
        frame.setVisible(true); 
    
    }
    
}