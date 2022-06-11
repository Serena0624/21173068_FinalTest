package com.example.a2117368_finaltest;

public class movieRank {
    String movieName;
    String peopleCount;

    public movieRank(String movieName, String peopleCount) {
        this.movieName = movieName;
        this.peopleCount = peopleCount;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getPeopleCount() {
        return peopleCount;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setPeopleCount(String peopleCount) {
        this.movieName = peopleCount;
    }
}
