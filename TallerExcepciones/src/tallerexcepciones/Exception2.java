/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerexcepciones;

import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class Exception2 {
    public static void main(String[] args) { 
        System.out.println("Krnny Camba Torres\n");
        int total = 0; int num = 0; 
        File myFile = null; 
        Scanner inputFile = null;
        boolean a = true;
            try{
                myFile = new File("inFile.txt"); 
                inputFile = new Scanner(myFile);
                while (inputFile.hasNext()) { 
                    num = inputFile.nextInt(); 
                    total += num;  
                }
            }catch(FileNotFoundException | InputMismatchException e){
                System.err.println(e);
            }
    System.out.println("The total value is " +    total); 
    } 
}
