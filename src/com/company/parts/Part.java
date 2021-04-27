package com.company.parts;

import com.company.Material;

public abstract class Part {

    private String name;
    private Material material;
    private int weight;
    private int cost;

    public Part() {
    }

    public Part(Material material, int weight, int cost) {
        this.material = material;
        this.weight = weight;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Part{" +
                "name='" + name + '\'' +
                ", material=" + material +
                ", weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
