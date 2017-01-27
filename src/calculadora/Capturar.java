/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author pequesillo
 */
public class Capturar {
    int res_global;
    public int ingresaCaracter(String caracter){
        String value="";
        String a = "";
        String op = "";
        String b = "";
        for (int i = 0; i < caracter.length(); i++) {
            
            if(isNumeric(String.valueOf(caracter.charAt(i)))){
                if(op.equals("")){
                    a += caracter.charAt(i);
                }
            }
            //JOptionPane.showMessageDialog(null, "pase por aqui"+a);
            
            if(String.valueOf(caracter.charAt(i)).equals("+") ||
               String.valueOf(caracter.charAt(i)).equals("-") ||
               String.valueOf(caracter.charAt(i)).equals("*") ||
               String.valueOf(caracter.charAt(i)).equals("/") )
            {
                op = String.valueOf(caracter.charAt(i));
                //JOptionPane.showMessageDialog(null, "entre");
            }
            //JOptionPane.showMessageDialog(null, "pase por aqui"+op);
            if(isNumeric(String.valueOf(caracter.charAt(i)))){
                if(!op.equals("")){
                    b += caracter.charAt(i);
                }
            }
            //JOptionPane.showMessageDialog(null, "pase por aqui"+b);
        }
        
        return operacion(Integer.parseInt(a), Integer.parseInt(b), op);
    }
    
    public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    public int operacion(int a,int b, String op){
        int res =0;
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
        }
        res_global=res;
        return res;
    }
}
