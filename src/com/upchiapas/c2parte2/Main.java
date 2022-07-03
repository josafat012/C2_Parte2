package com.upchiapas.c2parte2;

import com.upchiapas.c2parte2.models.OrdenCompra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrdenCompra pedidos = new OrdenCompra();
        int index = 0;
        String nombre;
        String[] nombres = new String[100];

        Scanner sc = new Scanner(System.in);
        int opc=0;
        do {

            System.out.println("\n==Escoge una opcion==\n1. Generar compra\n2. Reportes\n3. Reporte Ordenado\n4. Salir");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    sc.nextLine();
                    System.out.println("Ingrese el nombre del cliente: "); nombre = sc.nextLine();
                    nombres[index] = nombre;
                    pedidos.compras();
                    System.out.println("¡Orden generada!");
                    nombre="";
                    index++;
                    break;
                case 2:
                    for (int i=0;i<index;i++) {
                        System.out.println(nombres[i] + " " + pedidos.compras().get(i));
                    }
                    break;
                case 3:
                    String auxiliar;

                    for (int i=0; i<(index-1);i++){
                        for (int j=0; j<(index-1);j++){
                            if (nombres[j].compareTo(nombres[j+1]) > 0){
                                auxiliar = nombres[j];
                                nombres[j] = nombres[j+1];
                                nombres[j+1] = auxiliar;
                            }
                        }
                    }
                    for (int i=0;i<index;i++) {
                        System.out.println(nombres[i] + " " + pedidos.compras().get(i));
                    }

                    break;
            }
        }while (opc!=4);
    }
}
