package com.example.adapter;

public class Breakfast {
    private int calories;
    private String name;

    public Breakfast(int calories, String name) {
        this.calories = calories;
        this.name = name;
    }

    public Breakfast() {
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
