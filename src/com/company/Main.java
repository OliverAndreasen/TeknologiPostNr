package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        FileReader reader = new FileReader();
        reader.loadCities();
        ArrayList<City> cities = reader.getCities();


        Scanner sc = new Scanner(System.in);

        System.out.println("Indtast postnr");
        int zipCode = sc.nextInt();


        for (City city : cities){
            if(zipCode == city.getZipCode()){
                System.out.println(city.toString());
            }
        }
    }
}
