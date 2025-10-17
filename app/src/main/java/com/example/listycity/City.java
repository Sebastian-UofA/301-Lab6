package com.example.listycity;

/**
 * This is a class that defines a City
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructor for City
     * @param city The name of the city
     * @param province The name of the province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city
     * @return The city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the name of the province
     * @return The province name
     */
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
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName());
    }

    /**
     * Compares this City with another object for equality.
     * Two cities are considered equal if they have the same city name and province name.
     *
     * @param obj The object to compare with
     * @return true if the cities are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        City other = (City) obj;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }

    /**
     * Returns a hash code value for the City.
     * The hash code is calculated based on the city name and province name.
     *
     * @return a hash code value for this City
     */
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + city.hashCode();
        result = 31 * result + province.hashCode();
        return result;
    }
}