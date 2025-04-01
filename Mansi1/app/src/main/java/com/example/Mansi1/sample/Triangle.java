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
public class Triangle extends Shape {
      private int base;
    private int height;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Triangle(int base, int height, String color, int border_width) {
        super(color, border_width);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", height=" + height + '}';
    }
    
    
}
