package com.company.parts;

import com.company.Material;

public class Valve extends Part {

    public Valve() {
    }

    public Valve(Material material, int weight, int cost) {
        super(material, weight, cost);
        setName("valve");
    }
}
