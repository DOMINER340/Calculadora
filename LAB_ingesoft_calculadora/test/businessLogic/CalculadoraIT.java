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
        float expResult = Float.NEGATIVE_INFINITY;
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

    /**
     * Test of mod method, of class Calculadora.
     */
    @Test
    public void testMod_9_6() {
        System.out.println(" 9 mod 6");
        float a = 9;
        float b = 6;
        float expResult = 3;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of mod method, of class Calculadora.
     */
    @Test
    public void testMod_2_0() {
        System.out.println(" 2 mod 0");
        float a = 2;
        float b = 0;
        float expResult = 0;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of mod method, of class Calculadora.
     */
    @Test
    public void testMod_0_0() {
        System.out.println(" 0 mod 0");
        float a = 0;
        float b = 0;
        float expResult = 0;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of mod method, of class Calculadora.
     */
    @Test
    public void testModDecimals() {
        System.out.println(" 6.8 mod 4.3");
        float a = 6.8F;
        float b = 4.3F;
        float expResult = 2.5F;
        float result = Calculadora.mod(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of back method, of class Calculadora.
     */
    @Test
    public void testBackEmpty() {
        System.out.println(" Back to empty string");
        String a = "";
        String expResult = "";
        String result = Calculadora.back(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of back method, of class Calculadora.
     */
    @Test
    public void testBackNumber() {
        System.out.println(" Back to 463");
        String a = "463";
        String expResult = "46";
        String result = Calculadora.back(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of back method, of class Calculadora.
     */
    @Test
    public void testBackSymbol() {
        System.out.println(" Back to .");
        String a = ".";
        String expResult = "";
        String result = Calculadora.back(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of signo method, of class Calculadora.
     */
    @Test
    public void testSignoEmpty() {
        System.out.println("+/- to empty string");
        String a = "";
        String expResult = "";
        String result = Calculadora.signo(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of signo method, of class Calculadora.
     */
    @Test
    public void testSignoPositive() {
        System.out.println("+/- to positive number");
        String a = "234";
        String expResult = "-234";
        String result = Calculadora.signo(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of signo method, of class Calculadora.
     */
    @Test
    public void testSignoNegative() {
        System.out.println("+/- to negative number");
        String a = "-456";
        String expResult = "456";
        String result = Calculadora.signo(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of punto method, of class Calculadora.
     */
    @Test
    public void testPuntoEmpty() {
        System.out.println(". to empty string");
        String a = "";
        String expResult = "";
        String result = Calculadora.punto(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of punto method, of class Calculadora.
     */
    @Test
    public void testPuntoNumber() {
        System.out.println(". to a number");
        String a = "12";
        String expResult = "12.";
        String result = Calculadora.punto(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of punto method, of class Calculadora.
     */
    @Test
    public void testPuntoToPunto() {
        System.out.println(". to number ending in .");
        String a = "14.";
        String expResult = "14.";
        String result = Calculadora.punto(a);
        assertEquals(expResult, result);
    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstractIntegers() {
        System.out.println("2 - 1");
        float a = 2;
        float b = 1;
        float expResult = 1;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstractZero() {
        System.out.println("2 - 0");
        float a = 2;
        float b = 0;
        float expResult = 2;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstractNegative() {
        System.out.println("2 - (-2)");
        float a = 2;
        float b = -2;
        float expResult = 4;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of substract method, of class Calculadora.
     */
    @Test
    public void testSubstractDecimal() {
        System.out.println("2.6 - 4.6");
        float a = 2.6F;
        float b = 4.6F;
        float expResult = -2;
        float result = Calculadora.substract(a, b);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDivIntegers() {
        System.out.println("3 % 3");
        float a = 3;
        float b = 3;
        float expResult = 1;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDivInOne() {
        System.out.println("3 % 1");
        float a = 3;
        float b = 1;
        float expResult = 3;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDivInZero() {
        System.out.println("3 % 0");
        float a = 3;
        float b = 0;
        float expResult = Float.POSITIVE_INFINITY;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDivZeroPos() {
        System.out.println("0 % 3");
        float a = 0;
        float b = 3;
        float expResult = 0;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDivZeroNeg() {
        System.out.println("-3 % 0");
        float a = -3;
        float b = 0;
        float expResult = Float.NEGATIVE_INFINITY;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of div method, of class Calculadora.
     */
    @Test
    public void testDivDecimal() {
        System.out.println("4.7 % 2.5");
        float a = 4.7F;
        float b = 2.5F;
        float expResult = 1.88F;
        float result = Calculadora.div(a, b);
        assertEquals(expResult, result, 0.001);
    }

}
