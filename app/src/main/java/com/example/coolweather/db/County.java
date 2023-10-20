package com.example.coolweather.db;

public class County {
    private int id;
    private String countyName;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCountyCode() {
        return countyCode;
    }

    private String weatherId;
    private int countyCode;
}
