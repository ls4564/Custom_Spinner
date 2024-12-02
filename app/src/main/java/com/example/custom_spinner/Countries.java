package com.example.custom_spinner;

public class Countries
{
    private int image;
    private String countryName;
    private String countryCity;
    private String Population_size;

    public Countries(int image, String countryName, String countryCity, String population_size)
    {
        this.image = image;
        this.countryName = countryName;
        this.countryCity = countryCity;
        this.Population_size = population_size;
    }
    public Countries()
    {
        this.image = 0;
        this.countryName = "";
        this.countryCity = "";
        this.Population_size = "";
    }

    public int getImage()
    {
        return image;
    }

    public void setImage(int image) {
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

    public String getPopulation_size() {
        return Population_size;
    }

    public void setPopulation_size(String population_size) {
        Population_size = population_size;
    }


}
