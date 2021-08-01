package com.stackroute.streams;

/* Write test cases for positive and negative scenarios*/

import com.sun.source.doctree.SeeTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class CountryUtilityTests {

    CountryUtility countryUtility;
    List<String> listCountry;
    Map<String, String> map;

    @BeforeEach
    void setUp() {
        countryUtility = new CountryUtility();

        listCountry= new ArrayList<>();

        listCountry.add("India-Delhi");
        listCountry.add("USA-Washington");
        listCountry.add("Canada-Ottawa");
        listCountry.add("China-Beijing");
        listCountry.add("Colombia-Bogota");
        listCountry.add("Cuba-Havana");
        listCountry.add("Australia-Canberra");
        listCountry.add("Australia-Canberra");
        listCountry.add("Comoros-Moroni");
        listCountry.add("Comoros-Moroni");
        listCountry.add("Denmark Copenhagen");

        map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Canada", "Ottawa");
        map.put("USA", "Washington");
        map.put("Japan", "Tokyo");
        map.put("Australia", "Canberra");
        map.put("Denmark", "Copenhagen");
        map.put("Comoros", "Moroni");
        map.put("Cuba", "Havana");

    }

    @ParameterizedTest
    @ValueSource(strings = {"India-deLhi","Cuba-Havana", "australia-CaNberra", "China-Beijing"})
    void searchCountryTest(String string)
    {
        assertTrue(countryUtility.searchCountry(listCountry, string));
    }

    @ParameterizedTest
    @ValueSource(strings = {""," "})
    void searchCountryEmptyTest(String string) {
        assertFalse(countryUtility.searchCountry(listCountry, string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Indonesia-Bali", "Pakistan-Islamabad", "Nepal-Kathmandu", "Bhutan-Thimphu"})
    void searchFruitFalseTest (String string) {
        assertFalse(countryUtility.searchCountry(listCountry, string));
    }


    @Test
    void sortCountriesTest(){
        Optional<List<String>> countryListSortedExpected = Optional.of(listCountry.stream()
                .sorted()
                .collect(Collectors.toList()));
        assertEquals(countryListSortedExpected, countryUtility.sortCountries(listCountry));
    }


    @Test
    void getDistinctCountriesInUpperCaseSortedByLengthTest() {
        Set<String> expected = listCountry.stream().map(String::toUpperCase)
                .collect(Collectors.toSet());
        assertEquals(expected, countryUtility.getDistinctCountriesInUpperCaseSortedByLength(listCountry));
    }

    @Test
    void getCountryByCapitalTest() {
        assertEquals("India", countryUtility.getCountryByCapital(map,"Delhi"));
    }

    @Test
    void getCountryByCapitalTestExpectedException() {
        Assertions.assertThrows(CountryNotFoundException.class, () -> {
            countryUtility.getCountryByCapital(map,"Kathmandu");
        });
    }

    @Test
    void sortCountriesCheckEmptyListTest () {
        assertTrue(countryUtility.sortCountries(listCountry).isPresent());
    }
}