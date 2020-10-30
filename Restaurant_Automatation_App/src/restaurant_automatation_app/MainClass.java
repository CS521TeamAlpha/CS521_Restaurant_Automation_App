/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_automatation_app;

import GUI.TimeClock;
import GUI.MainImage;
import GUI.Tables;
import GUI.LoginScreen;
        

/**
 *
 * @author Owner
 */
public class MainClass {
    public static void main (String [] args){
          java.awt.EventQueue.invokeLater(new Runnable(){
        public void run(){
            new MainImage().setVisible(true);
        }
    });
    }
}


