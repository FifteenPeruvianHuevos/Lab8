package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return list
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * checks if the city is in the CityList
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        // Checks if its true
        assertTrue(list.hasCity(edmonton));
    }

    /**
     * checks if we deleted the city
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        int citySize = list.getCount();

        list.deleteCity(edmonton);

        // Checks if the CityList is the same size as initial (0 items)
        assertEquals(list.getCount(), citySize - 1);
    }

    /**
     * Gives us the amount of cities we have in the CityList.
     */
//    @Test
//    public void countCitiesTest(){
//        list = MockCityList();
//        City edmonton = new City("Edmonton", "AB");
//        City vancouver = new City("Vancouver", "BC");
//        City winnipeg = new City("Winnipeg", "MB");
//        list.addCity(edmonton);
//        list.addCity(vancouver);
//        list.addCity(winnipeg);
//
//        // Checks if countCities() returns the correct amount of cities
//        assertEquals(list.getCount(), list.countCities());
//    }
}
