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

    public static float sumar_dos_numeros(float a, float b) {
        return a + (b);
    }

    public static float substract(float a, float b) {
        
        return a -b ;
    }

    public static float multiply(float a, float b) {
        return a * (b);
    }

    public static float div(float a, float b) {

        return a / b;
    }

    public static float Potencia_base_diez(float a) {
        return (float) Math.pow(10, a);
    }

    public static float sqrt(float a) {
        return (float) Math.sqrt(a);
    }

    public static float nFact(float a) {
        if (a < 0) {
            return Float.NaN;
        }
        int suma = 1;
        for (int i = (int) a; i > 1; i--) {
            suma = suma * i;
        }

        return (float) suma;
    }

    public static float log(float a) {
        return (float) Math.log10(a);
    }

    public static float mod(float a, float b) {
        if(a == 0 || b == 0)
            return 0;
        else
            return (float) a % b;
    }

    public static String back(String actual) {
        if (!actual.isEmpty()) {
            return actual.substring(0, actual.length() - 1);
        } else {
            return actual;
        }
    }

    public static String signo(String actual) {
        if (!actual.isEmpty()) {
            if (actual.codePointAt(0) != '-') {
                return "-" + actual;
            } else {
                return actual.substring(1, actual.length());
            }
        } else {
            return actual;
        }
    }

    public static String punto(String actual) {

        if (!actual.isEmpty()) {
            if (actual.contains(".")) {
                return actual;
            } else {
                return actual + ".";
            }
        } else {
            return actual;
        }
    }

}
