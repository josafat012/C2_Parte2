package com.upchiapas.c2parte2.models;

import java.util.ArrayList;

public class CatalogoPizza {
    ArrayList catalogo = new ArrayList<>();
    String[] especilidades = {"Hawaiana", "Mexicana", "Peperonni"};
    float[] precios = {150, 120, 100};

    public void catalogoLista(){
        for (int i=0; i<3; i++){
            catalogo.add(new Pizza((i+1), especilidades[i], precios[i]));
        }
    }
}
