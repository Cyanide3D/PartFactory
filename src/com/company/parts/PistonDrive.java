package com.company.parts;

import com.company.Material;

public class PistonDrive extends Part {

    public PistonDrive() {
    }

    public PistonDrive(Material material, int weight, int cost) {
        super(material, weight, cost);
        setName("piston_drive");
    }
}
