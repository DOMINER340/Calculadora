/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import java.util.*;

/**
 *
 * @author Anabel
 * @author Miguel Uribe
 */

public class Calculadora {
    
    public static float sumar_dos_numeros(float a, float b)
    {
        return a+b;
    }
    
    public static float substract(float a, float b)
    {
        return a-b;
    }
    
    public static float multiply(float a, float b)
    {
        return a*b;
    }
    
    public static float div(float a, float b)
    {
        
        return a/b;
    }
    
    
    public static float Potencia_base_diez(float a)
    {
        return (float) Math.pow(10, a );
    }
        
    public static float sqrt(float a)
    {
        return (float) Math.sqrt(a);
    }
            
    public static float nFact(float a)
    {
        if(a < 0) 
        {
            return Float.NaN;
        }
        int suma = 1;
        for (int i = (int) a; i>1; i--)
        {
            suma = suma * i;
        }
        
        return (float) suma;
    }
                
    public static float log(float a)
    {
        return (float) Math.log10(a);
    }
}