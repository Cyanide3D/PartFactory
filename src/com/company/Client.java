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

import static java.util.stream.Collectors.toList;

public class Client {

    private final PartFactory partFactory;
    private final List<Part> parts;

    public Client(PartFactory partFactory) {
        parts = new ArrayList<>();
        this.partFactory = partFactory;
    }

    public List<Part> getParts(int maxCost, int maxWeight) {
        for (int i = 0; i < 100; i++) {
            try {
                Part part = partFactory.getPart();
                verifyPart(part, maxCost, maxWeight);
                parts.add(part);
            } catch (Exception e) {
            }
        }
        return parts;
    }

    public Map<String, List<Part>> groupingPartsByNameAndSort(List<Part> parts) {
        return parts.stream().collect(Collectors.groupingBy(Part::getName,
                Collectors.mapping(Function.identity(), Collectors.collectingAndThen(toList(),
                        e -> e.stream().sorted(Comparator.comparingInt(Part::getCost)).collect(toList())))));
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
