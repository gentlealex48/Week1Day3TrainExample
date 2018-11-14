package com.kkaty.week1day3trainexample.view;

public class Eagle extends Bird {
    public String name = "eagle";
    public  int lifespan = 15;

    public Eagle(String name, int lifespan) {
        this.name = name;
        this.lifespan = lifespan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
}
