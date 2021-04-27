package com.company.factory;

import com.company.Material;
import com.company.exceptions.UnsupportedPartException;
import com.company.parts.*;

import java.util.Random;

public class PartFactoryImpl implements PartFactory {

    @Override
    public Part getPart() {
        int part = randInt(8);
        switch (part) {
            case 0:
                return new Fitting(getMaterial(), randInt(100), randInt(1250));
            case 1:
                return new Flange(getMaterial(), randInt(100), randInt(1250));
            case 2:
                return new Handle(getMaterial(), randInt(100), randInt(1250));
            case 3:
                return new Nut(getMaterial(), randInt(100), randInt(1250));
            case 4:
                return new PistonDrive(getMaterial(), randInt(100), randInt(1250));
            case 5:
                return new StaffingBox(getMaterial(), randInt(100), randInt(1250));
            case 6:
                return new Valve(getMaterial(), randInt(100), randInt(1250));
            case 7:
                return new Washer(getMaterial(), randInt(100), randInt(1250));
            default:
                throw new UnsupportedPartException();
        }
    }

    private int randInt(int range) {
        return new Random().nextInt(range);
    }

    private Material getMaterial() {
        Material[] materials = Material.values();
        return materials[randInt(materials.length)];
    }

}
