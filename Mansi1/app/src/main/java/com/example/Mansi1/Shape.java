/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Mansi1;

/**
 *
 * @author sonam
 */
public class Shape {
    
      private String color;
    private int border_width;

    public Shape(String color, int border_width) {
        this.color = color;
        this.border_width = border_width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBorder_width() {
        return border_width;
    }

    public void setBorder_width(int border_width) {
        this.border_width = border_width;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", border_width=" + border_width + '}';
    }
    
    
}
