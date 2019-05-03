/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forza_4;

import java.util.Scanner;

/**
 *
 * @author archimede
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Forza4 f = new Forza4();
        while(true){
            try { 
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter column for " + f.nextPlayer());
                int column = myObj.nextInt();  // Read user input
                if (column == -1) break;
                System.out.println("column is: " + column);  // Output user 
                boolean win = f.addCoin(column, "P");
                System.out.println(f);
                System.out.println("win:"+ win);
                if(win) break;
            } catch (Exception err){
                System.out.println(err);
            }
        }   
       
       
        
        
    }
    
}
