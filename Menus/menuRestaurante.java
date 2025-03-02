package Menus;

import javax.swing.*;

public class menuRestaurante {
    public static void main(String[] args) {
        int codMenuPpal = 0, codMenuTipico = 0, codMenuCarta = 0, codMenuInter = 0,
        totalPlatos = 0, platosTipicos = 0, platosCarta = 0, platosInter = 0,
        precioBandeja = 25000, precioAjiaco = 20000, precioSancocho = 18000,
        precioPechuga = 18000, precioCostillas= 22000 , precioChurrasco= 27000,
        precioPaella= 38000, precioSushi = 32000, precioPasta = 30000, totalCompra = 0;
        String usuario = JOptionPane.showInputDialog("Ingrese su nombre: ");
        do {
            String menu = "MENU RESTAURANTE\n\n";
            menu += "1. Platos tipicos\n";
            menu += "2. Platos a la carta\n";
            menu += "3. Platos Internacionales\n";
            menu += "4. Salir\n\n";
            menu += "Por favor, seleccione una opción: \n ";

            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (codMenuPpal) {
                case 1:
                    do {
                        String menuTipico = "MENU TIPICO:\n\n";
                        menuTipico += "1. Bandeja Paisa - $25.000\n";
                        menuTipico += "2. Ajiaco - $20.000\n";
                        menuTipico += "3. Sancocho - $18.000\n";
                        menuTipico += "4. Regresar al menu principal\n\n";
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));
                        switch (codMenuTipico) {
                            case 1:
                                JOptionPane.showMessageDialog(null,
                                        "Se ha seleccionado Bandeja Paisa, " +
                                                "\nel costo es: $" + precioBandeja);
                                totalCompra += precioBandeja;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null,
                                        "Se ha seleccionado Ajiaco, " +
                                                "\nel costo es: $" + precioAjiaco);
                                totalCompra += precioAjiaco;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null,
                                        "Se ha seleccionado Sancocho, " +
                                                "\nel costo es: $" + precioSancocho);
                                totalCompra += precioSancocho;
                                break;
                            case 4:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,
                                        "No corresponde a un codigo valido" ,
                                        "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese 1 si desea repetir el menú tipico." +
                                        "\nIngrese otro numero si desea regresar al menu principal"));
                        if (codMenuTipico != 1) {
                            codMenuTipico = 4;
                        }
                        platosTipicos++;
                    } while (codMenuTipico != 4);
                    break;
                case 2:
                    do {
                        String menuCarta = "MENU A LA CARTA:\n\n";
                        menuCarta += "1. Pechuga de pollo a la plancha - $18.000\n";
                        menuCarta += "2. Costillas ahumadas - $22.000\n";
                        menuCarta += "3. churrasco - $27.000\n";
                        menuCarta += "4. Regresar al menu principal\n\n";
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));
                        switch (codMenuCarta) {
                            case 1:
                                JOptionPane.showMessageDialog(null,
                                        "Se ha seleccionado Pechuga de pollo a la plancha, " +
                                                "\nel costo es: $" + precioPechuga);
                                totalCompra += precioPechuga;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null,
                                        "Se ha seleccionado Costillas ahumadas, " +
                                                "\nel costo es: $" + precioCostillas);
                                totalCompra += precioCostillas;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null,
                                        "Se ha seleccionado Churrasco, " +
                                                "\nel costo es: $" + precioChurrasco);
                                totalCompra += precioChurrasco;
                                break;
                            case 4:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,
                                        "No corresponde a un codigo valido" ,
                                        "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese 1 si desea repetir el menú tipico." +
                                        "\nIngrese otro numero si desea regresar al menu principal"));
                        if (codMenuCarta != 1) {
                            codMenuCarta = 4;
                        }
                        platosCarta++;
                    } while (codMenuCarta != 4);
                    break;
                case 3:
                    do {
                        String menuInter = "MENU INTERNACIONAL:\n\n";
                        menuInter += "1. Paella - $38.000\n";
                        menuInter += "2. Sushi - $32.000\n";
                        menuInter += "3. Pasta Alfredo - $30.000\n";
                        menuInter += "4. Regresar al menu principal\n\n";
                        codMenuInter = Integer.parseInt(JOptionPane.showInputDialog(menuInter));
                        switch (codMenuInter) {
                            case 1:
                                JOptionPane.showMessageDialog(null,
                                        "Se ha seleccionado Paella, " +
                                                "\nel costo es: $" + precioPaella);
                                totalCompra += precioPaella;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null,
                                        "Se ha seleccionado Sushi, " +
                                                "\nel costo es: $" + precioSushi);
                                totalCompra += precioSushi;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null,
                                        "Se ha seleccionado Pasta Alfredo, " +
                                                "\nel costo es: $" + precioPasta);
                                totalCompra += precioPasta;
                                break;
                            case 4:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,
                                        "No corresponde a un codigo valido" ,
                                        "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuInter = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese 1 si desea repetir el menú tipico." +
                                        "\nIngrese otro numero si desea regresar al menu principal"));
                        if (codMenuInter != 1) {
                            codMenuInter = 4;
                        }
                        platosInter++;
                    } while (codMenuInter != 4);
                    break;

                case 4:
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "No corresponde a un codigo valido" ,
                            "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);

        totalPlatos += platosTipicos + platosCarta + platosInter;
        JOptionPane.showMessageDialog(null,
                "Factura de venta" +
                "\n\nCliente: " + usuario +
                "\nPlatos Tipicos: " + platosTipicos +
                "\nPlatos a la carta: " + platosCarta +
                "\nPlatos Internacionales: " + platosInter +
                "\nTotal de platos: " + totalPlatos +
                "\nTotal a pagar: $" + totalCompra +
                "\n\n" + "Gracias por su compra!");
    }
}