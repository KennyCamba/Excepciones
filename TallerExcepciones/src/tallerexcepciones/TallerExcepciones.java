/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerexcepciones;

/**
 *
 * @author Estudiante
 */
public class TallerExcepciones {

    /**
     * @param args the command line arguments
     */
static String s = "";
 public static void main(String[] args) {
        String[] arreglo = {"a", "b", "c"};
 	try { doStuff(arreglo); }
 	catch (ArithmeticException|IllegalArgumentException e) { s += "e "; }
 	s += "x ";
 	System.out.println(s);
 }
 static void doStuff(String[] args) {
 	if(args.length == 0)
 		throw new IllegalArgumentException();
 	s += "d ";
    }
}
