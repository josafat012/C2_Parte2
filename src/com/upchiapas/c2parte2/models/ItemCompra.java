package com.upchiapas.c2parte2.models;

public class ItemCompra {
    private byte id;
    private byte cantidad;
    private Pizza producto;
    private float subtotal;

    public ItemCompra(byte cantidad, Pizza producto, float subtotal) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Reporte{" +
                "cantidad=" + cantidad +
                ", producto='" + producto + '\'' +
                ", subtotal=" + subtotal +
                '}';
    }
}
