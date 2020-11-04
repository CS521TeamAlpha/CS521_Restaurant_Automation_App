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
    private ArrayList<String> column = new ArrayList<String>();
    private ArrayList<String> row = new ArrayList<String>();
    
    
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
}
