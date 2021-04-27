package com.company.parts;

import com.company.Material;

public class Handle extends Part {

    public Handle() {
    }

    public Handle(Material material, int weight, int cost) {
        super(material, weight, cost);
        setName("handle");
    }
}
