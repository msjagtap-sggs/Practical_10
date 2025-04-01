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
public class Cylinder extends Circle {
      private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cylinder(int height, int radius, String color, int border_width) {
        super(radius, color, border_width);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }
    
}
