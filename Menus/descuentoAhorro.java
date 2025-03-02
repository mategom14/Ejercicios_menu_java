package Menus;

import javax.swing.*;

public class descuentoAhorro {
    public static void main (String [] args) {
        /*En la nómina de una empresa se le hace descuento
        * a los empleados por concepto de ahorro, de acuerdo
        * al estrato social en el que vive. Calcular e imprimir
        * el valor a descontar según la siguiente información:
        * Estrato 1 y 2: Descuento: 2%.
        * Estrato 3 y 4: Descuento: 4%.
        * Estrato 5: Descuento: 8%.
        * Estrato 6: Descuento 10%.*/
        String inicio = "Bienvenido al sistema de descuento " +
                "\nPor concepto de ahorro" +
                "\n\n Presione enter para continuar";
        JOptionPane.showMessageDialog(null, inicio);
        int codMenuPpal;
        do {
            String nombre = JOptionPane.showInputDialog(
                    "Por favor ingrese el nombre del empleado: ");
            int sueldo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Por favor ingrese el sueldo del empleado: "));
            int estrato = Integer.parseInt(JOptionPane.showInputDialog(
                    "Por favor ingrese el estrato del empleado: "));
            double descuento, total;
            int porcentaje;

            switch (estrato) {
                case 1, 2:
                    porcentaje = 2;
                    descuento = sueldo * 0.02;
                    total = sueldo - descuento;
                    JOptionPane.showMessageDialog(null, "RESULTADO" +
                            "\n\nNombre del empleado: "+
                            "\n" + nombre +
                            "\nEstrato: " + estrato +
                            "\nPorcentaje descontado: " + porcentaje + "%" +
                            "\nValor descontado: $" + descuento +
                            " \nSueldo final: $" + total);
                    break;
                case 3, 4:
                    porcentaje = 4;
                    descuento = sueldo * 0.04;
                    total = sueldo - descuento;
                    JOptionPane.showMessageDialog(null, "RESULTADO" +
                            "\n\nNombre del empleado: "+
                            "\n" + nombre +
                            "\nEstrato: " + estrato +
                            "\nPorcentaje descontado: " + porcentaje + "%" +
                            "\nValor descontado: $" + descuento +
                            " \nSueldo final: $" + total);
                    break;
                case 5:
                    porcentaje = 8;
                    descuento = sueldo * 0.08;
                    total = sueldo - descuento;
                    JOptionPane.showMessageDialog(null, "RESULTADO" +
                            "\n\nNombre del empleado: "+
                            "\n" + nombre +
                            "\nEstrato: " + estrato +
                            "\nPorcentaje descontado: " + porcentaje + "%" +
                            "\nValor descontado: $" + descuento +
                            " \nSueldo final: $" + total);
                    break;
                case 6:
                    porcentaje = 10;
                    descuento = sueldo * 0.1;
                    total = sueldo - descuento;
                    JOptionPane.showMessageDialog(null, "RESULTADO" +
                            "\n\nNombre del empleado: "+
                            "\n" + nombre +
                            "\nEstrato: " + estrato +
                            "\nPorcentaje descontado: " + porcentaje + "%" +
                            "\nValor descontado: $" + descuento +
                            " \nSueldo final: $" + total);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Entrada no valida",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
            } codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog("Desea calcular otro descuento? \n1. Si \n2. No"));
            if (codMenuPpal != 1 && codMenuPpal != 2) {
                JOptionPane.showMessageDialog(null, "Entrada no valida",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (codMenuPpal == 1);
        JOptionPane.showMessageDialog(null, "Gracias por usar el sistema");
    }
}