package com.company;

public class City {
    private String name;
    private int zipCode;

    public City(String name, int zipCode) {
        this.name = name;
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }


}
