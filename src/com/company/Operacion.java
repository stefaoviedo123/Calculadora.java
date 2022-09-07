package com.company;

import javax.swing.*;

public class Operacion {

    public static void main(String[] args){

        double numero1, numero2;
        int opcion = 0;
        boolean condicion = true;

        while (condicion) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. SUMA\s " +
                    "2. RESTA\s " +
                    "3.MULTIPLICACION\s " +
                    "4.DIVISION\s " +
                    "5. MODULO\s"));
        }


        switch (opcion) {

            case 1 -> {
                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                double suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "Resultado de la suma es: " + suma);
            }

            case 2 -> {
                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                double resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "Resultado de la resta  es: " + resta);
            }

            case 3 -> {
                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                double multiplicacion = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "Resultado de la multiplicacion  es: " + multiplicacion);
            }

            case 4 -> {
                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                if (numero2==0){

                    JOptionPane.showMessageDialog(null,"No se puede entrar a dividir por cero");

                }else {
                    double division = numero1 / numero2;
                    JOptionPane.showMessageDialog(null, "Resultado de la division  es: " + division);
                }
            }

            case 5 -> {
                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
                double modulo = numero1 % numero2;
                JOptionPane.showMessageDialog(null, "Resultado de la modulo  es: " + modulo);
            }


        }

    }


}

