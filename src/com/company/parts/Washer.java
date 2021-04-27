package com.company.parts;

import com.company.Material;

public class Washer extends Part {

    public Washer() {
    }

    public Washer(Material material, int weight, int cost) {
        super(material, weight, cost);
        setName("washer");
    }
}
