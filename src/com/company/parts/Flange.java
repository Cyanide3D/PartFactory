package com.company.parts;

import com.company.Material;

public class Flange extends Part {

    public Flange() {
    }

    public Flange(Material material, int weight, int cost) {
        super(material, weight, cost);
        setName("flange");
    }
}
