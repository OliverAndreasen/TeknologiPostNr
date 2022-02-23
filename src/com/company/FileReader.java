package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    private ArrayList<City> cities = new ArrayList<>();

    public ArrayList<City> getCities() {
        return cities;
    }

    public void loadCities() throws FileNotFoundException {
        File file = new File("postnumre.csv");
        Scanner sc = new Scanner(file);
        sc.nextLine();
        while (sc.hasNext()) {
            String[] citiesSplit = sc.nextLine().split(";");
            int zipCode = Integer.parseInt(citiesSplit[0]);
            String name = citiesSplit[1];
            City city = new City(name, zipCode);
            cities.add(city);
        }
    }
}
