package com.example.custom_spinner;

public class Countrys
{
    private int[] image;
    private String countryName;
    private String countryCity;
    private int Population_size;

    public Countrys(int[] image, String countryName, String countryCity, int population_size)
    {
        this.image = image;
        this.countryName = countryName;
        this.countryCity = countryCity;
        this.Population_size = population_size;
    }

    public int[] getImage() {
        return image;
    }

    public void setImage(int[] image) {
        this.image = image;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCity() {
        return countryCity;
    }

    public void setCountryCity(String countryCity) {
        this.countryCity = countryCity;
    }

    public int getPopulation_size() {
        return Population_size;
    }

    public void setPopulation_size(int population_size) {
        Population_size = population_size;
    }


}
