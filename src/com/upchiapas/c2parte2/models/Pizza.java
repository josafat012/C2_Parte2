package com.upchiapas.c2parte2.models;

public class Pizza {
    private int id;
    private String especialidad;
    private float precio;

    public Pizza() {
    }

    public Pizza(int id, String especialidad, float precio) {
        this.id = id;
        this.especialidad = especialidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza " + id +
                ", especialidad='" + especialidad + '\'' +
                ", precio=" + precio;
    }
}
