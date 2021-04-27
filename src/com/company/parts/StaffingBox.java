package com.company.parts;

import com.company.Material;

public class StaffingBox extends Part {

    public StaffingBox() {
    }

    public StaffingBox(Material material, int weight, int cost) {
        super(material, weight, cost);
        setName("staffing_box");
    }
}
