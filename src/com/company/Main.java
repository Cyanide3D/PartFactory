package com.company;

import com.company.factory.PartFactoryImpl;
import com.company.parts.Nut;
import com.company.parts.Part;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Client client = new Client(new PartFactoryImpl());

        List<Part> parts = client.getParts(200, 100);
        printParts(parts);

        System.out.println("--------------------------------------------------------------");

        Map<String, List<Part>> groupingParts = client.groupingPartsByNameAndSort(parts);
        groupingParts.forEach((k, v) -> printParts(v));
    }

    private static void printParts(List<Part> parts) {
        for (Part part : parts) {
            System.out.println(part);
        }
    }

}
