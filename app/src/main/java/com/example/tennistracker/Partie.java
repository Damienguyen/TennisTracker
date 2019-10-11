package com.example.tennistracker;

public class Partie {
    private Set set;
    private int nb = 0;
    protected int j1;
    protected int j2;

    public Partie() {
        set = new Set();
        nb =0;
    }

    public Set getSet() {
        return set;
    }

    public void j1(){
        set.j1();
    }

    public void j2(){
        set.j2();
    }

    public String getJ1(){
        if (!set.isTie()) {
            int j1 = set.getJeu().getJoueur1();
            if (j1 == 0) {
                return "0";
            } else if (j1 == 1) {
                return "15";
            } else if (j1 == 2) {
                return "30";
            } else if (j1 == 3) {
                return "40";
            } else {
                return "Ad";
            }
        }
        else {
            return ""+set.getTie1();
        }
    }

    public String getJ2(){

        if (!set.isTie()) {
            int j2 = set.getJeu().getJoueur2();
            if (j2 == 0) {
                return "0";
            } else if (j2 == 1) {
                return "15";
            } else if (j2 == 2) {
                return "30";
            } else if (j2 == 3) {
                return "40";
            } else {
                return "Ad";
            }
        }
        else {
            return ""+set.getTie2();
        }
    }

    public String getj1(){
        int i = set.getJoueur1();
        return ""+i;
    }

    public String getj2(){
        int i = set.getJoueur2();
        return ""+i;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public void newSet(){
        set = new Set();
    }
}
