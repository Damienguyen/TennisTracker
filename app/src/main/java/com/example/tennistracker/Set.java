package com.example.tennistracker;

public class Set {
    private int joueur1 = 0;
    private int joueur2 = 0;
    private boolean serveur = true;
    private  Jeu jeu;
    private boolean fin =false;
    private boolean tie = false;
    private int tie1;
    private int tie2;

    public Set() {
        jeu = new Jeu();
        fin =false;
        tie = false;
        joueur1 = 0;
        joueur2 = 0;
        tie1=0;
        tie2=0;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public void j1 (){
        if (!tie) {
            jeu.setj1();
            if (jeu.isFin()) {
                if (jeu.getGagnant()) {
                    joueur1++;
                } else {
                    joueur2++;
                }
                serveur = !serveur;
                jeu = new Jeu();
            }
            if ((joueur1 == 6 && joueur2 <5) || (joueur1 == 7 && joueur2 == 5)) {
                fin = true;
                System.out.println(""+joueur1+""+joueur2);
            } else if (joueur1 == 6 && joueur2 == 6) {
                tie = true;
            }
        }
        else {
            tie1++;
            if((tie1-tie2>=2) &&(tie1>6)){
                joueur1++;
                fin =true;
            }
        }
    }

    public void j2 (){
        if (!tie) {
            jeu.setj2();
            if (jeu.isFin()) {
                if (jeu.getGagnant()) {
                    joueur1++;
                } else {
                    joueur2++;
                }
                serveur = !serveur;
                jeu = new Jeu();
            }
            if ((joueur2 == 6 && joueur1 <5) || (joueur2 == 7 && joueur1 == 5)) {
                fin = true;
            } else if (joueur1 == 6 && joueur2 == 6) {
                tie = true;
            }
        }
        else {
            tie2++;
            if((tie2-tie1>=2) &&(tie2>6)){
                joueur2++;
                fin =true;
            }
        }
    }

    public int getJoueur1() {
        return joueur1;
    }

    public int getJoueur2() {
        return joueur2;
    }

    public void addj1(){

    }

    public boolean isServeur() {
        return serveur;
    }

    public boolean isTie() {
        return tie;
    }

    public boolean isFin() {
        return fin;
    }

    public int getTie1() {
        return tie1;
    }

    public int getTie2() {
        return tie2;
    }
}
