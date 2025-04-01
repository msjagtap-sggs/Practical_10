/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Mansi1.sample1;

import com.example.Mansi1.sample.Circle;

/**
 *
 * @author sonam
 */
public class Sphere extends Circle {
      private int diameter;

    public Sphere(int diameter, int radius, String color, int border_width) {
        super(radius, color, border_width);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Sphere{" + "diameter=" + diameter + '}';
    }
}
