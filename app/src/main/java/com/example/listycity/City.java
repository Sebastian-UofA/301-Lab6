package com.example.listycity;



/**
 * This is a class that defines a City
 */
public class City implements Comparable<City> { // Implement the Comparable interface
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this City with another City for order.
     * Returns a negative integer, zero, or a positive integer as this City
     * is less than, equal to, or greater than the specified City.
     * Comparison is based on the city name.
     *
     * @param other The City to be compared.
     * @return a negative integer, zero, or a positive integer as this city's name
     *         is less than, equal to, or greater than the specified city's name.
     */
    @Override
    public int compareTo(City other) { // Changed parameter type from Object to City
        return this.city.compareTo(other.getCityName());
    }
}


