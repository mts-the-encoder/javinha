package com.example.apiseries;

public class Serie {

    public int id;
    private String name;
    private int year;
    private String principalActor;
    private String gender;
    private boolean isEnded;
    private double avaliation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPrincipalActor() {
        return principalActor;
    }

    public void setPrincipalActor(String principalActor) {
        this.principalActor = principalActor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isEnded() {
        return isEnded;
    }

    public void setEnded(boolean ended) {
        isEnded = ended;
    }

    public double getAvaliation() {
        return avaliation;
    }

    public void setAvaliation(double avaliation) {
        this.avaliation = avaliation;
    }
}
