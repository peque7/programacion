/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.text.Format;
import javax.swing.JOptionPane;

/**
 *
 * @author pequesillo
 */
public class Capturar {
    
    public String ingresaCaracter(String caracter){
        String array[];
        
        array = build_operacion(caracter);
        
        return operacion(Double.parseDouble(array[0]), (array[2].equals(""))?0:Double.parseDouble(array[2]), array[1], caracter);
    }
    
    public String[] build_operacion(String caracter){
        
        String array[]={"","",""};
        String p = caracter;
            for (int i = 0; i < caracter.length(); i++) {
            
                if(isNumeric(String.valueOf(caracter.charAt(i))) || caracter.charAt(i) == '.'){
                    if(array[1].equals("")){
                        array[0] += caracter.charAt(i);
                        p = p.substring(1, p.length());
                    }
                }

                if(String.valueOf(caracter.charAt(i)).equals("+") ||
                   String.valueOf(caracter.charAt(i)).equals("-") ||
                   String.valueOf(caracter.charAt(i)).equals("*") ||
                   String.valueOf(caracter.charAt(i)).equals("/") )
                {
                    if (array[0].equals("")) {
                      array[0] += caracter.charAt(i);
                        p = p.substring(1, p.length());
                    }else if(array[1].equals("")){
                      array[1] = String.valueOf(caracter.charAt(i));
                        p = p.substring(1, p.length());
                    }
                    /*else{
                       array[0] = operacion(Double.parseDouble(array[0]), (array[2].equals(""))?0:Double.parseDouble(array[2]), array[1], p);
                    }*/

                }
                if(isNumeric(String.valueOf(caracter.charAt(i)))  || caracter.charAt(i) == '.'){
                    if(!array[1].equals("")){
                        array[2] += caracter.charAt(i);
                        p = p.substring(1, p.length());
                    }
                }

                //JOptionPane.showMessageDialog(null, p);
            }
        return array;
    }
    
    public static boolean isNumeric(String cadena){
	try {
		Double.parseDouble(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    public String operacion(double a,double b, String op, String caracter){
        double res = 0;
        //String array[] = {"","",""};
        switch(op){
            case "+":
                res = a+b;
                break;
            case "-":
                res = a-b;
                break;
            case "*":
                res = a*b;
                break;
            case "/":
                res = a/b;
                break;
            case "": 
                res = a;
                break;
        }
       /* if (!caracter.equals("")) {
            caracter = res + caracter;
            array = build_operacion(caracter);
            res = Double.parseDouble(operacion(Double.parseDouble(array[0]), (array[2].equals(""))?0:Double.parseDouble(array[2]), array[1], caracter));
            JOptionPane.showMessageDialog(null, "pase por aqui"+b);
        }
        */
        int p_ent= (int)res;
        double p_dec = res - p_ent;
        int res2 = 0;
        
        if (p_dec == 0.0) { res2 = (int)res; }
        
        return (res2==0)?String.valueOf(res):String.valueOf(res2);
    }
}
