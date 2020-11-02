/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_automatation_app;

import java.lang.*; 
import java.awt.*; 
import javax.swing.*; 

import View.TimeClock;
import View.MainImage;
import View.Tables;
import View.LoginScreen;
        

/**
 *
 * @author Owner
 */
public class MainClass {
    public static void main (String [] args){
        MainImage application = new MainImage(); 
                application.setVisible(true);
                
                // get the screen size as a java dimension
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

                // get 2/3 of the height, and 2/3 of the width
                int height = screenSize.height * 2 / 3;
                int width = screenSize.width * 2 / 3;

                // set the jframe height and width
                application.setPreferredSize(new Dimension(1080, 1920));
   
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                
            }
        });
    }
}


