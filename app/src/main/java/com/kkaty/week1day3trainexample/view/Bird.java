package com.kkaty.week1day3trainexample.view;

import java.sql.SQLOutput;

public class Bird {
    private String reproduction = "egg";

    private String outerCovering = "feather";
    public  void  flyup( ){
        System.out.println("flying up...");

    }

    public String getReproduction() {
        return reproduction;
    }


    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public String getOuterCovering() {
        return outerCovering;
    }

    public void setOuterCovering(String outerCovering) {
        this.outerCovering = outerCovering;
    }

}