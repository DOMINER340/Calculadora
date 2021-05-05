/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorgui;

import businessLogic.Calculadora;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author Anabel
 */
public class FXMLDocumentController implements Initializable {

    private float data = 0;
    private int operation = -1;
    private float secondOperand = 0;
    private float ans = 0;

    @FXML
    private Button one;

    @FXML
    private Button eight;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button five;

    @FXML
    private Button seven;

    @FXML
    private Button four;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button mult;

    @FXML
    private Button zero;

    @FXML
    private Button equals;

    @FXML
    private Button clear;

    @FXML
    private Button div;

    @FXML
    private Button back;

    @FXML
    private Button mod;

    @FXML
    private Button signo;

    @FXML
    private Button punto;

    @FXML
    private Button tenPow;

    @FXML
    private Button sqrt;

    @FXML
    private Button nFact;

    @FXML
    private Button log;

    @FXML
    private TextField display;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        if (event.getSource() == one) {
            if (operation == -1) {
                display.setText("");
                operation = 0;
            }
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            if (operation == -1) {
                display.setText("");
                operation = 0;
            }
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            if (operation == -1) {
                display.setText("");
                operation = 0;
            }
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            if (operation == -1) {
                display.setText("");
                operation = 0;
            }
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            if (operation == -1) {
                display.setText("");
                operation = 0;
            }
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            if (operation == -1) {
                display.setText("");
                operation = 0;
            }
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            if (operation == -1) {
                display.setText("");
                operation = 0;
            }
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            if (operation == -1) {
                display.setText("");
                operation = 0;
            }
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            if (operation == -1) {
                display.setText("");
                operation = 0;
            }
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            if (operation == -1) {
                display.setText("");
                operation = 0;
            }
            display.setText(display.getText() + "0");
        } else if (event.getSource() == clear) {
            display.setText("");
        } else if (event.getSource() == plus) {
            if (!display.getText().isEmpty()) {
                data = Float.parseFloat(display.getText());
                operation = 1; //Addition 
            }
            display.setText("");
        } else if (event.getSource() == minus) {
            if (!display.getText().isEmpty()) {
                data = Float.parseFloat(display.getText());
                operation = 2; //Substraction
            }
            display.setText("");
        } else if (event.getSource() == mult) {
            if (!display.getText().isEmpty()) {
                data = Float.parseFloat(display.getText());
                operation = 3; //Mul 
            }
            display.setText("");
        } else if (event.getSource() == div) {
            if (!display.getText().isEmpty()) {
                data = Float.parseFloat(display.getText());
                operation = 4; //Division
            }
            display.setText("");
        } //añadido por miguel
        else if (event.getSource() == tenPow) {
            if (!display.getText().isEmpty()) {
                data = Float.parseFloat(display.getText());
                operation = 5; //potencia de 10
                display.setText(String.valueOf(potenciaDe10()));
            }
        } else if (event.getSource() == sqrt) {
            if (!display.getText().isEmpty()) {
                data = Float.parseFloat(display.getText());
                operation = 6; //Raiz cuadrada
                display.setText(String.valueOf(RaizCuadrada()));
            }
        } else if (event.getSource() == nFact) {
            if (!display.getText().isEmpty()) {
                data = Float.parseFloat(display.getText());
                operation = 7; //Factorial n!
                display.setText(String.valueOf(FactorialN()));
            }
        } else if (event.getSource() == log) {
            if (!display.getText().isEmpty()) {
                data = Float.parseFloat(display.getText());
                operation = 8; //logaritmo
                display.setText(String.valueOf(Logaritmo()));
            }
        }
        
//añadido por Santiago
        else if (event.getSource() == back) {
            display.setText(Calculadora.back(display.getText()));
        } else if (event.getSource() == mod) {
            if (!display.getText().isEmpty()) {
                data = Float.parseFloat(display.getText());
                operation = 9; //Mod
            }
            display.setText("");
        } else if (event.getSource() == signo) {
            display.setText(Calculadora.signo(display.getText()));
        } else if (event.getSource() == punto) {
            display.setText(Calculadora.punto(display.getText()));
        } else if (event.getSource() == equals) {
            secondOperand = 0;
            if (!"".equals(display.getText())) {
                secondOperand = Float.parseFloat(display.getText());
            }
            switch (operation) {
                case 1: //Addition
                    ans = Calculadora.sumar_dos_numeros(data, secondOperand);
                    display.setText(String.valueOf(ans));
                    break;
                case 2: //Subtraction
                    ans = Calculadora.substract(data, secondOperand);
                    display.setText(String.valueOf(ans));
                    break;
                case 3: //Mul
                    ans = Calculadora.multiply(data, secondOperand);
                    display.setText(String.valueOf(ans));
                    break;
                case 4: //Div
                    ans = 0f;
                    ans = Calculadora.div(data, secondOperand);
                    if(ans != Float.POSITIVE_INFINITY && ans != Float.NEGATIVE_INFINITY)
                        display.setText(String.valueOf(ans));
                    else
                        display.setText("NO SE PUEDE DIVIDR ENTRE 0");
                    break;
                case 5: //Potencia de 10
                    display.setText(String.valueOf(potenciaDe10()));
                    break;
                case 6: //Raiz cuadrada
                    display.setText(String.valueOf(RaizCuadrada()));
                    break;
                case 7: //Factorial n!
                    display.setText(String.valueOf(FactorialN()));
                    break;
                case 8: //logaritmo
                    display.setText(String.valueOf(Logaritmo()));
                    break;
                case 9: //mod
                    ans = 0f;
                    ans = Calculadora.mod(data, secondOperand);
                    display.setText(String.valueOf(ans));
                    break;
            }
            operation = -1;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    private float potenciaDe10()
    {
        ans = 0f;
        ans = Calculadora.Potencia_base_diez(data);
        return ans;
    }
    
    private float RaizCuadrada()
    {
        ans = 0f;
        ans = Calculadora.sqrt(data);
        display.setText(String.valueOf(ans));
        return ans;
    }

    private float FactorialN() {
        ans = 0f;
        ans = Calculadora.nFact(data);
        return ans;
    }

    private float Logaritmo() {
        ans = 0f;
        ans = Calculadora.log(data);
        return ans;

    }

}
