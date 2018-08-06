package com.example.admin.cricket_info_5;

public class Bowler_Info {
    private String rank;
    private String name;
    private String overs;
    private String maiden;
    private String runs;
    private String wickets;
    private String average;

    public Bowler_Info(String rank, String name, String overs, String maiden, String runs, String wickets, String average) {

        this.rank = rank;
        this.name = name;
        this.overs = overs;
        this.maiden = maiden;
        this.runs = runs;
        this.wickets = wickets;
        this.average = average;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOvers() {
        return overs;
    }

    public void setOvers(String overs) {
        this.overs = overs;
    }

    public String getMaiden() {
        return maiden;
    }

    public void setMaiden(String maiden) {
        this.maiden = maiden;
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public String getWickets() {
        return wickets;
    }

    public void setWickets(String wickets) {
        this.wickets = wickets;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }
}
