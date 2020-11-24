/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;
import java.util.*; 
/**
 *
 * @author Johnny
 */
public class Database {

    private String DB_URL = "";
    private String USER = "";
    private String PASS = "";   
    private ArrayList<String> column;
    private ArrayList<String> row;
    
    
    public Database(String DB_URL, String USER,String PASS){
    
        this.DB_URL = DB_URL;
        this.USER = USER; 
        this.PASS = PASS; 
        
        
    }
    
    public ArrayList getCurrentColumn(){
        return column; 
    }
    public ArrayList getCurrentRow(){
        return row; 
    }
    
    public boolean findEmployeeByloginCode(String code){
        
        String employeeName = "null";
        String query = "Select * from Employee";
        Connection conn = null;
        Statement statement = null;
        column = new ArrayList<String>();
        row = new ArrayList<String>();

        try{

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                String loginCode = rs.getString("loginCode");
    
                if(loginCode.equals(code)){
                    String empoloyeeId = rs.getString("employeeId");       
                    column.add("empoloyeeId");
                    row.add(empoloyeeId);
                    String firstName = rs.getString("firstName");
                    column.add("firstName");
                    row.add(firstName);
                    String lastName = rs.getString("lastName");   
                    column.add("lastName");
                    row.add(lastName);
                    String dob = rs.getString("dob");
                    column.add("dob");
                    row.add(dob);
                    String ssn = rs.getString("ssn");  
                    column.add("ssn");
                    row.add(ssn);
                    String taxStatus = rs.getString("taxStatus");
                    column.add("taxStatus");
                    row.add(taxStatus);
                    String address = rs.getString("address");
                    column.add("address");
                    row.add(address);
                    String positionId = rs.getString("positionId");
                    column.add("positionId");
                    row.add(positionId);
                    return true; 
                }
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
            return false; 
       
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            return false; 
         
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return false; 
        
    }
    
    public boolean runSelectQuery(String query){
        
        
        Connection conn = null;
        Statement statement = null;
        try{

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                for(int i = 1; i <= numColumns; i++){
                    if (i > 1) System.out.print(",  ");
                    String columnValue = rs.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
            return false; 
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            return false;
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return true; 
    }
    public boolean runInsertQuery(String query){
        
        
        Connection conn = null;
        Statement statement = null;
        try{

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            statement.executeUpdate(sql);

        
            //STEP 6: Clean-up environment
            statement.close();
            conn.close();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
            return false; 
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            return false;
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return true; 
        //https://github.com/suchamillennial/RestaurantAutomation
    }
    
    public boolean updateTableStatus(String query){
        
        
        Connection conn = null;
        Statement statement = null;
        try{

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            statement.executeUpdate(sql);

        
            //STEP 6: Clean-up environment
            statement.close();
            conn.close();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
            return false; 
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            return false;
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return true; 
        
    }
    public Map<String, String> getBoothsTable(String query){
        
        Map<String, String> hm = new HashMap<String, String>(); 
        
        Connection conn = null;
        Statement statement = null;
        try{

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            //STEP 5: Extract data from result set
           while(rs.next()){
                //Retrieve by column name
                
                
                String tableName = rs.getString("tableName");
                String status = rs.getString("status");
                hm.put(tableName, status);
                System.out.println(tableName + ", line 307 " + status);
                //Display values
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();
            return hm; 
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
           
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
      
        return hm; 
    }
    public String getTableColor(String query){
        
        
        Connection conn = null;
        Statement statement = null;
        
        try{
            
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                String status = rs.getString("status");
                return status; 
         
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
          
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return "null";
    }
    public String[] grabServerList(String query){
        Connection conn = null;
        Statement statement = null;
        
        try{
            
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            //STEP 5: Extract data from result set
            
            List<String> temp = new ArrayList<String>();
            while(rs.next()){
                //Retrieve by column name
                String serverName = rs.getString("firstName");
                
                temp.add(serverName);  
         
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();
            
            String result[]=temp.toArray(new String[temp.size()]);

            return result; 
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
          
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return null;
    }
    
    public Map<String, String[]> getMenuItems(String query){
        Connection conn = null;
        Statement statement = null;
        
        try{
            
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            
            Map<String, String[]> menuItems = new HashMap<String, String[]>(); 
            //STEP 5: Extract data from result set
            /*
            String[] list1 = {"entree 1","entree2"};
            String[] list2 = {"drink2","drink","drinksss"};
            String[] list3 = {"dessert"};
            String[] list4 = {"sides","ssss","side numba 3", "sides numba 4"};

            

            menuItems.put("ENTREES", list1);
            menuItems.put("DRINKS", list2);
            menuItems.put("DESSERTS", list3);
            menuItems.put("SIDES", list4);
            */
            List<String> entrees = new ArrayList<String>();
            List<String> drinks = new ArrayList<String>();
            List<String> sides = new ArrayList<String>();
            List<String> desserts = new ArrayList<String>();
            while(rs.next()){
                //Retrieve by column name
                String name = rs.getString("name");
                String price = rs.getString("price");
                String category = rs.getString("category");
                String active = rs.getString("active");       

                if(active.equals("1")){
                    if(category.equals("Sides")){
                        sides.add(name + " $" + price);
                    }
                    if(category.equals("Drinks")){
                        drinks.add(name+ " $" + price);
                    }
                    if(category.equals("Entrees")){
                        entrees.add(name+ " $" + price);
                    }
                    if(category.equals("Desserts")){
                        desserts.add(name+ " $" + price);
                    }
                }
         
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();
            
            String[] entreeList = entrees.toArray(new String[entrees.size()]);
            String[] drinksList = drinks.toArray(new String[drinks.size()]);
            String[] dessertList = desserts.toArray(new String[desserts.size()]);
            String[] sidesList = sides.toArray(new String[sides.size()]);
            
            menuItems.put("ENTREES", entreeList);
            menuItems.put("DRINKS", drinksList);
            menuItems.put("SIDES", sidesList);
            menuItems.put("DESSERTS", dessertList);
            
            return menuItems; 
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
          
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return null;
    }
    
    public int getLastOrderID(String query){
        Connection conn = null;
        Statement statement = null;
        
        try{
            
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            
  
            while(rs.next()){
                //Retrieve by column name
                String id = rs.getString("orderId");
                return Integer.parseInt(id); 
         
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();

            
            
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
          
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return -1; 
    }
    public int getActiveOrder(String query){
        Connection conn = null;
        Statement statement = null;
        
        try{
            
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            
  
            while(rs.next()){
                //Retrieve by column name
                String activeOrder = rs.getString("ActiveOrder");
                return Integer.parseInt(activeOrder); 
         
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();

            
            
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
          
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return 0; 
    }
    public String getOrderItems(String query){
        Connection conn = null;
        Statement statement = null;
        
        try{
            
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            
  
            while(rs.next()){
                //Retrieve by column name
                String OrderItems = rs.getString("orderItems");
                return (OrderItems); 
         
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();

            
            
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
          
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return null; 
    }
    
    public String getEmployeeIdByName(String query){
        Connection conn = null;
        Statement statement = null;
        
        try{
            
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            
  
            while(rs.next()){
                //Retrieve by column name
                String id = rs.getString("employeeId");
                return (id); 
         
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();

            
            
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
          
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return null; 
    }
    public String getEmployeeNameById(String query){
        Connection conn = null;
        Statement statement = null;
        
        try{
            
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            
  
            while(rs.next()){
                //Retrieve by column name
                String Name = rs.getString("firstName");
                return (Name); 
         
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();

            
            
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
          
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return "null"; 
    }
    public boolean updateTableServer(String query){
        
        
        Connection conn = null;
        Statement statement = null;
        try{

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            statement.executeUpdate(sql);

        
            //STEP 6: Clean-up environment
            statement.close();
            conn.close();
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
            return false; 
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            return false;
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
        return true; 
        
    }
    public Map<String, String> getAssignedTableServerList(String query){
        
        Map<String, String> hm = new HashMap<String, String>(); 
        
        Connection conn = null;
        Statement statement = null;
        try{

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            
            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            statement = conn.createStatement();
            String sql = query; 
            ResultSet rs = statement.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rs.getMetaData().getColumnCount();
            //STEP 5: Extract data from result set
           while(rs.next()){
                //Retrieve by column name
                
                
                String tableName = rs.getString("tableName");
                String firstName = rs.getString("firstName");
                hm.put(tableName, firstName);
               
                
                
                

               
                System.out.println(tableName + ", line 937 " + firstName);
               
            }
            //STEP 6: Clean-up environment
            rs.close();
            statement.close();
            conn.close();
            return hm; 
            
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
           
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
            
        }finally{
          //finally block used to close resources
            try{
            if(statement!=null)
                statement.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
            if(conn!=null)
                conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");    
      
        return hm; 
    }
}