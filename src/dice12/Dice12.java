/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice12;

import java.util.Random;

/**
 *
 * @author Petra
 */
public class Dice12 {
    private static final boolean derp = true;
    public int roll_D12(){
       return(12);
   
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random number = new Random();
      Dice12 dice12 = new Dice12();
      int answer = number.nextInt(12)+1;
        System.out.println("Dette e      int answer = number.nextInt(12)+1;\n" +
"r et automatisk genereret tal = " + answer);       
    }
    
}
