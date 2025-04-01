/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Mansi1.sample;

import com.example.Mansi1.Shape;

/**
 *
 * @author sonam
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int radius, String color, int border_width) {
        super(color, border_width);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}
