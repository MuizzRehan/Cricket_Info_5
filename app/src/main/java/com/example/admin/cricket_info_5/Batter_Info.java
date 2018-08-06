package com.example.admin.cricket_info_5;

public class Batter_Info {
    private String rank;
    private String name;
    private String status;
    private String runs;
    private String balls;
    private String fours;
    private String sixes;
    private String runRate;

    public Batter_Info(String rank, String name, String status, String runs, String balls, String fours, String sixes, String runRate) {
        this.rank = rank;
        this.name = name;
        this.status = status;
        this.runs = runs;
        this.balls = balls;
        this.fours = fours;
        this.sixes = sixes;
        this.runRate = runRate;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRuns() {
        return runs;
    }

    public void setRuns(String runs) {
        this.runs = runs;
    }

    public String getBalls() {
        return balls;
    }

    public void setBalls(String balls) {
        this.balls = balls;
    }

    public String getFours() {
        return fours;
    }

    public void setFours(String fours) {
        this.fours = fours;
    }

    public String getSixes() {
        return sixes;
    }

    public void setSixes(String sixes) {
        this.sixes = sixes;
    }

    public String getRunRate() {
        return runRate;
    }

    public void setRunRate(String runRate) {
        this.runRate = runRate;
    }
}
