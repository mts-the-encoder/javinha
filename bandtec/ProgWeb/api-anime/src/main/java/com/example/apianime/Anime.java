package com.example.apianime;

public class Anime {

    private int id;
    private String name;
    private int episodes;
    private double duration;
    private boolean isSubtitled;

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

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isSubtitled() {
        return isSubtitled;
    }

    public void setSubtitled(boolean subtitled) {
        isSubtitled = subtitled;
    }
}
