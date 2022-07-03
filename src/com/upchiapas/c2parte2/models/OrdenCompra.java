package com.upchiapas.c2parte2.models;

import java.util.ArrayList;
import java.util.Random;

public class OrdenCompra{
    private byte id;
    private ArrayList productos = new ArrayList();
    private String[] especilidades = {"Hawaiana", "Mexicana", "Peperonni"};
    private float[] precios = {150, 120, 100};
    private Random random = new Random();
    private int a = 0;

    public ArrayList compras(){
        int i = random.nextInt(1, 4);
        int cantidad = random.nextInt(1,51);
        float sub = precios[i-1] * cantidad;
        a++;
        productos.add(a + "._" + new ItemCompra((byte) cantidad, new Pizza(i, especilidades[i-1], precios[i-1]), sub));
        return productos;
    }
}
