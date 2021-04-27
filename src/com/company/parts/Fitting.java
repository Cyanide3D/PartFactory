package com.company.parts;

import com.company.Material;

public class Fitting extends Part {

    public Fitting() {
    }

    public Fitting(Material material, int weight, int cost) {
        super(material, weight, cost);
        setName("fitting");
    }
}
