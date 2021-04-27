package com.company.parts;

import com.company.Material;

public class Nut extends Part {

    public Nut() {
    }

    public Nut(Material material, int weight, int cost) {
        super(material, weight, cost);
        setName("nut");
    }
}
