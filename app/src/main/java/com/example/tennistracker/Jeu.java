package com.example.tennistracker;

public class Jeu {
    private int joueur1;
    private int joueur2;
    private boolean fin;
    private boolean gagnant;

    public Jeu() {
        joueur1 = 0;
        joueur2 =0;
        fin = false;
        gagnant = true;
    }

    public int getJoueur1() {
        return joueur1;
    }

    public void setj1() {
        if ((joueur1 ==3 && joueur2 <3) || (joueur1 ==4 && joueur2 ==3) ){
            fin = true;
            gagnant = true;
        }
        else if (joueur1 <4 && joueur2 <4){
            joueur1++;
        }
        else if (joueur1 ==3 && joueur2 ==4){
            joueur2--;
        }
    }

    public int getJoueur2() {
        return joueur2;
    }

    public void setj2() {
        if ((joueur1 <3 && joueur2 ==3) || (joueur1 ==3 && joueur2 ==4) ){
            fin = true;
            gagnant = false;
        }
        else if (joueur1 <4 && joueur2 <4){
            joueur2++;
        }
        else if (joueur1 ==4 && joueur2 ==3){
            joueur1--;
        }
    }

    public boolean getGagnant() {
        return gagnant;
    }

    public boolean isFin() {
        return fin;
    }
}
