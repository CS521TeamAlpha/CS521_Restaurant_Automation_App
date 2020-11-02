/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*; 
import Model.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Johnny
 */
public class Controller {
    
    private MainImage mainScreen; 
    
    private Database database;
    
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
            String name = database.findMatchingEmployee(code);
            if(name.equals("null")){
                System.out.println("employee not found... come back to this line to handle the exception later!!!");
            }
            else{
                System.out.println("Logged in as: "  + name);
                TimeClock tc = new TimeClock(name);
                tc.setVisible(true);
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
}
