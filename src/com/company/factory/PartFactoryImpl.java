package com.company.factory;

import com.company.Material;
import com.company.exceptions.UnsupportedPartException;
import com.company.parts.*;

import java.util.Random;

public class PartFactoryImpl implements PartFactory {

    @Override
    public Part getPart() {
        switch (randInt(8)) {
            case 0:
                return new Fitting(getRandMaterial(), randInt(100), randInt(1250));
            case 1:
                return new Flange(getRandMaterial(), randInt(100), randInt(1250));
            case 2:
                return new Handle(getRandMaterial(), randInt(100), randInt(1250));
            case 3:
                return new Nut(getRandMaterial(), randInt(100), randInt(1250));
            case 4:
                return new PistonDrive(getRandMaterial(), randInt(100), randInt(1250));
            case 5:
                return new StaffingBox(getRandMaterial(), randInt(100), randInt(1250));
            case 6:
                return new Valve(getRandMaterial(), randInt(100), randInt(1250));
            case 7:
                return new Washer(getRandMaterial(), randInt(100), randInt(1250));
            default:
                throw new UnsupportedPartException();
        }
    }

    private int randInt(int range) {
        return new Random().nextInt(range);
    }

    private Material getRandMaterial() {
        Material[] materials = Material.values();
        return materials[randInt(materials.length)];
    }

}
