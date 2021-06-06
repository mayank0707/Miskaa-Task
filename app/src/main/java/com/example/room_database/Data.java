package com.example.room_database;

public class Data {
    private String name;
    private String capital;
    private String region;
    private String subregion;
    private long population;
    //private String flag;



    public Data(String name, String capital, String region, String subregion, long population) {
        //this.name = MainActivity.name;
        this.name=name;
        this.capital = capital;
        this.region = region;
        this.subregion = subregion;
        this.population = population;
        //this.flag = flag;
        //this.borders = borders;

    }

    //public String getFlag() {
        //return flag;
    //}

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getRegion() {
        return region;
    }

    public String getSubregion() {
        return subregion;
    }

    public long getPopulation() {
        return population;
    }




}
