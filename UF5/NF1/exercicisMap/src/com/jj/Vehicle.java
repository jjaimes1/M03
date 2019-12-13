/*
 * Copyright (c) 2019.
 * Made by JJ Company
 */

package com.jj;

import java.util.Calendar;

public class Vehicle {
    public String color;
    public String marca;
    public String model;
    public int any;


    public Vehicle(String color, String marca, String model, int any) {
        this.color = color;
        this.marca = marca;
        this.model = model;
        this.any = any;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", any=" + any +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }
}