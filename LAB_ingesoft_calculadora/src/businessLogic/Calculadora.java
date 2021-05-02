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
    
    public static float add(float a, float b)
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
    
    
    public static float tenPow(float a)
    {
        return a*10;
    }
        
    public static float sqrt(float a)
    {
        return (float) Math.sqrt(a);
    }
            
    public static float nFact(float a)
    {
        int suma = 1;
        for (int i = (int) a; i>1; i--)
        {
            suma = suma * i;
        }
        
        return (float) suma;
    }
                
    public static float log(float a)
    {
        return (float) Math.log(a);
    }
}