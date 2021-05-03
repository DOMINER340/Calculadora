/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anabel
 */
public class CalculadoraIT {
    
    public CalculadoraIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Calculadora.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        float a = 3F;
        float b = 5F;
        float expResult = 8F;
        float result = Calculadora.sumar_dos_numeros(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        float a = 10F;
        float b = 5F;
        float expResult = 5F;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        float a = 7F;
        float b = 2F;
        float expResult = 14F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0); 
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        float a = 20F;
        float b = 1F;
        float expResult = 20f;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    
    /**
    * Test of sumar_dos_numeros method, of class Calculadora.
    */
    @Test
    public void sumar_dos_numeros_5_1() {
        System.out.println("sumar_dos_numeros_5_1");
        float a = 5F;
        float b = 1F;
        float expResult = 6;
        float result = Calculadora.sumar_dos_numeros(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
    * Test of sumar_dos_numeros method, of class Calculadora.
    */
    @Test
    public void sumar_dos_numeros_5_0() {
        System.out.println("sumar_dos_numeros_5_0");
        float a = 5F;
        float b = 0F;
        float expResult = 5;
        float result = Calculadora.sumar_dos_numeros(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
    * Test of sumar_dos_numeros method, of class Calculadora.
    */
    @Test
    public void sumar_dos_numeros_5_minus5() {
        System.out.println("sumar_dos_numeros_5_-5");
        float a = 5F;
        float b = -5F;
        float expResult = 0;
        float result = Calculadora.sumar_dos_numeros(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
    * Test of sumar_dos_numeros method, of class Calculadora.
    */
    @Test
    public void sumar_dos_numeros_5_minus10() {
        System.out.println("sumar_dos_numeros_5_-10");
        float a = 5F;
        float b = -10F;
        float expResult = -5F;
        float result = Calculadora.sumar_dos_numeros(a, b);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void multiplicar_dos_numeros_7_1() {
        System.out.println("multiplicar_dos_numeros_7_1");
        float a = 7F;
        float b = 1F;
        float expResult = 7F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0); 
    }
    
    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void multiplicar_dos_numeros_7_0() {
        System.out.println("multiplicar_dos_numeros_7_0");
        float a = 7F;
        float b = 0F;
        float expResult = 0F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0); 
    }
    
    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void multiplicar_dos_numeros_7_minus1() {
        System.out.println("multiplicar_dos_numeros_7_-1");
        float a = 7F;
        float b = -1F;
        float expResult = -7F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0); 
    }
    
    /**
     * Test of multiply method, of class Calculadora.
     */
    @Test
    public void multiplicar_dos_numeros_7_2() {
        System.out.println("multiplicar_dos_numeros_7_2");
        float a = 7F;
        float b = 2F;
        float expResult = 14F;
        float result = Calculadora.multiply(a, b);
        assertEquals(expResult, result, 0.0); 
    }
    
        /**
     * Test of "Potencia_base_diez" method, of class Calculadora.
     */
    @Test
    public void Potencia_base_diez_2() {
        System.out.println("Potencia_base_diez_2");
        float a = 2F;
        float expResult = 100F;
        float result = Calculadora.Potencia_base_diez(a);
        assertEquals(expResult, result, 0.0); 
    }
    
    /**
     * Test of "Potencia_base_diez" method, of class Calculadora.
     */
    @Test
    public void Potencia_base_diez_1() {
        System.out.println("Potencia_base_diez_1");
        float a = 1F;
        float expResult = 10F;
        float result = Calculadora.Potencia_base_diez(a);
        assertEquals(expResult, result, 0.0); 
    }
    
    /**
    * Test of "Potencia_base_diez" method, of class Calculadora.
    */
    @Test
    public void Potencia_base_diez_0() {
        System.out.println("Potencia_base_diez_0");
        float a = 0F;
        float expResult = 1F;
        float result = Calculadora.Potencia_base_diez(a);
        assertEquals(expResult, result, 0.0); 
    }
    
    /**
    * Test of "Potencia_base_diez" method, of class Calculadora.
    */
    @Test
    public void Potencia_base_diez_minus1() {
        System.out.println("Potencia_base_diez_-1");
        float a = -1F;
        float expResult = 0.1F;
        float result = Calculadora.Potencia_base_diez(a);
        assertEquals(expResult, result, 0.0); 
    }
    
    /**
     * Test of "Raiz_cuadrada" method, of class Calculadora.
     */
    @Test
    public void Raiz_cuadrada_5() {
        System.out.println("Raiz_cuadrada_5");
        float a = 5F;
        float expResult = 2.23F;
        float result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.01); 
    }
    
    /**
     * Test of "Raiz_cuadrada" method, of class Calculadora.
     */
    @Test
    public void Raiz_cuadrada_minus5() {
        System.out.println("Raiz_cuadrada_-5");
        float a = -5F;
        float expResult = Float.NaN;
        float result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.01); 
    }


    /**
     * Test of "Raiz_cuadrada" method, of class Calculadora.
     */
    @Test
    public void Raiz_cuadrada_0() {
        System.out.println("Raiz_cuadrada_0");
        float a = 0F;
        float expResult = 0F;
        float result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.01); 
    }


    /**
     * Test of "Raiz_cuadrada" method, of class Calculadora.
     */
    @Test
    public void Raiz_cuadrada_1() {
        System.out.println("Raiz_cuadrada_1");
        float a = 1F;
        float expResult = 1F;
        float result = Calculadora.sqrt(a);
        assertEquals(expResult, result, 0.01); 
    }

    /**
     * Test of "Logaritmo" method, of class Calculadora.
     */
    @Test
    public void Logaritmo_2() {
        System.out.println("Logaritmo_2");
        float a = 2F;
        float expResult = 0.30F;
        float result = Calculadora.log(a);
        assertEquals(expResult, result, 0.01); 
    }
    
    /**
     * Test of "Logaritmo" method, of class Calculadora.
     */
    @Test
    public void Logaritmo_minus2() {
        System.out.println("Logaritmo_-2");
        float a = -2F;
        float expResult = Float.NaN;
        float result = Calculadora.log(a);
        assertEquals(expResult, result, 0.01); 
    }
    
    /**
     * Test of "Logaritmo" method, of class Calculadora.
     */
    @Test
    public void Logaritmo_0() {
        System.out.println("Logaritmo_0");
        float a = 0F;
        float expResult = Float.NEGATIVE_INFINITY ;
        float result = Calculadora.log(a);
        assertEquals(expResult, result, 0.01); 
    }
    
    /**
     * Test of "Logaritmo" method, of class Calculadora.
     */
    @Test
    public void Logaritmo_1() {
        System.out.println("Logaritmo_1");
        float a = 1F;
        float expResult = 0F;
        float result = Calculadora.log(a);
        assertEquals(expResult, result, 0.01); 
    }
    
    /**
     * Test of "Factorial_N" method, of class Calculadora.
     */
    @Test
    public void Factorial_N_5() {
        System.out.println("Factorial_N_5");
        float a = 5F;
        float expResult = 120F;
        float result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.01); 
    }
    
    /**
     * Test of "Factorial_N" method, of class Calculadora.
     */
    @Test
    public void Factorial_N_minus5() {
        System.out.println("Factorial_N_-5");
        float a = -5F;
        float expResult = Float.NaN;
        float result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.01); 
    }


    /**
     * Test of "Factorial_N" method, of class Calculadora.
     */
    @Test
    public void Factorial_N_0() {
        System.out.println("Factorial_N_0");
        float a = 0F;
        float expResult = 1F;
        float result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.01); 
    }


    /**
     * Test of "Factorial_N" method, of class Calculadora.
     */
    @Test
    public void Factorial_N_1() {
        System.out.println("Factorial_N_1");
        float a = 1F;
        float expResult = 1F;
        float result = Calculadora.nFact(a);
        assertEquals(expResult, result, 0.01); 
    }


    

    


}