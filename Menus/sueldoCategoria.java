package Menus;

import javax.swing.*;

public class sueldoCategoria {
    public static void main(String[] args) {
        /*
        De un empleado se conoce la categoría 1, 2, 3 y 4 y el sueldo básico.
        El empleado posee una bonificación de un descuento según la siguiente información:
        Categoría 1: Bonificación = 15%, Descuento = 2%.
        Categoría 2: Bonificación = 10%, Descuento = 1.5%.
        Categoría 3: Bonificación 8%, Descuento 1.0%.
        Categoría 4: Bonificación 0%, Descuento 0.0%.
        SalarioFinal = Sueldo básico + Bonificación - Descuento
        */
        String inicio = "Bienvenido al sistema de cálculo de sueldo" +
                "\n Presione enter para continuar";
        JOptionPane.showMessageDialog(null, inicio);
        int codMenuPpal = 0;
        double bonificacion, porcentajeBonificacion, porcentajeDescuento, descuento, total;
        do {
            String nombre = JOptionPane.showInputDialog(
                    "Por favor ingrese el nombre del empleado: ");
            int sueldo = Integer.parseInt(JOptionPane.showInputDialog(
                    "Por favor ingrese el sueldo del empleado: "));
            int categoria = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Por favor ingrese la categoria del empleado:"));
            switch (categoria) {
                case 1:
                    bonificacion = sueldo * 0.15;
                    porcentajeBonificacion = 15;
                    descuento = sueldo * 0.02;
                    porcentajeDescuento = 2;
                    total = (sueldo + bonificacion) - descuento;
                    JOptionPane.showMessageDialog(null, "RESULTADO" +
                            "\n\nNombre del empleado: "+
                            "\n" + nombre +
                            "\nCategoria: " + categoria +
                            "\nPorcentaje de bonificacion: " + porcentajeBonificacion + "%" +
                            "\nBonificacion: " + bonificacion +
                            "\nPorcentaje de descuento: " + porcentajeDescuento + "%" +
                            "\nDescuento: " + descuento +
                            "\nSueldo final: $" + total);
                    break;
                case 2:
                    bonificacion = sueldo * 0.1;
                    porcentajeBonificacion = 10;
                    descuento = sueldo * 0.015;
                    porcentajeDescuento = 1.5;
                    total = (sueldo + bonificacion) - descuento;
                    JOptionPane.showMessageDialog(null, "RESULTADO" +
                            "\n\nNombre del empleado: "+
                            "\n" + nombre +
                            "\nCategoria: " + categoria +
                            "\nPorcentaje de bonificacion: " + porcentajeBonificacion + "%" +
                            "\nBonificacion: " + bonificacion +
                            "\nPorcentaje de descuento: " + porcentajeDescuento + "%" +
                            "\nDescuento: " + descuento +
                            "\nSueldo final: $" + total);
                    break;
                case 3:
                    bonificacion = sueldo * 0.08;
                    porcentajeBonificacion = 8;
                    descuento = sueldo * 0.01;
                    porcentajeDescuento = 1;
                    total = (sueldo + bonificacion) - descuento;
                    JOptionPane.showMessageDialog(null, "RESULTADO" +
                            "\n\nNombre del empleado: "+
                            "\n" + nombre +
                            "\nCategoria: " + categoria +
                            "\nPorcentaje de bonificacion: " + porcentajeBonificacion + "%" +
                            "\nBonificacion: " + bonificacion +
                            "\nPorcentaje de descuento: " + porcentajeDescuento + "%" +
                            "\nDescuento: " + descuento +
                            "\nSueldo final: $" + total);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,
                            "La categoría 4 no tiene bonificación ni descuento" +
                                    "\nSueldo final: " + sueldo);
                    break;
                default
                        : JOptionPane.showMessageDialog(null, "Entrada no valida",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
            } codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog("Desea calcular otro sueldo? \n1. Si \n2. No"));
            if (codMenuPpal != 1 && codMenuPpal != 2) {
                JOptionPane.showMessageDialog(null, "Entrada no valida",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }while (codMenuPpal == 1);
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros servicios");
    }

}
