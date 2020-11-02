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

/**
 *
 * @author Johnny
 */
public class Controller {
    
    private MainImage mainScreen; 
    
    private Database database;
    
    private ArrayList<String> resultColumn; 
    private ArrayList<String> resultRow; 
    
    
    public Controller(){
        database = new Database("jdbc:mysql://mysql.stackcp.com:55219/RestaurantApp-37371618", "RestaurantApp-37371618", "oki80a0ih2"); 
        mainScreen = new MainImage(this);
        
        initialize(); 
    }
    
    public void initialize(){
        mainScreen.setVisible(true);
       
    }
    
    public void showLoginScreen(String moduleSelected){
        LoginScreen keypad = new LoginScreen(moduleSelected, this);
        keypad.setVisible(true);
        
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
                System.out.println("employee not found... come back to this line to handle the exception later!!!");
            }
            
        }
        else if(moduleClicked.equalsIgnoreCase("Manager")){
            
            System.out.println("Manager was clicked... prearing to login: " + code);
        
        }
        else if(moduleClicked.equalsIgnoreCase("Hostess")){
            
            System.out.println("Hostess was clicked... prearing to login: " + code);
        
        }
        else if(moduleClicked.equalsIgnoreCase("Server")){
            
            System.out.println("Server was clicked... prearing to login: " + code);
        
        }
        else if(moduleClicked.equalsIgnoreCase("KItchen")){
            
            System.out.println("Kitchen was clicked... prearing to login: " + code);
        
        }
        else{
            System.out.println("Busser was clicked... prearing to login: " + code);
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
}
