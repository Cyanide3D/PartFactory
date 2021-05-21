package com.company;

import com.company.exceptions.CostExceededException;
import com.company.exceptions.OverweightException;
import com.company.factory.PartFactory;
import com.company.parts.Part;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Client {

    private final PartFactory partFactory;

    public Client(PartFactory partFactory) {
        this.partFactory = partFactory;
    }

    public List<Part> getParts(int amount, int maxCost, int maxWeight) {
        List<Part> parts = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            try {
                Part part = partFactory.getPart();
                verifyPart(part, maxCost, maxWeight);
                parts.add(part);
            } catch (Exception ignore) {
            }
        }
        return parts;
    }

    public Map<String, List<Part>> groupingPartsByNameAndSort(List<Part> parts) {
        return parts.stream().collect(groupingBy(Part::getName,
                collectingAndThen(toList(),
                        e -> e.stream().sorted(comparingInt(Part::getCost)).collect(toList()))));
    }

    private void verifyPart(Part part, int maxCost, int maxWeight) {
        if (part.getCost() > maxCost) {
            throw new CostExceededException();
        }
        if (part.getWeight() > maxWeight) {
            throw new OverweightException();
        }
    }

}
