package com.homework.homework.Spring.model;

public class Furniture {

    private String name;
    private double length;
    private double width;
    private double height;
    private double price;
    private int quantity;

    public Furniture(String name, double length, double width, double height, double price, int quantity) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
