package com.example.tennistracker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test
    public void jeublanc (){
        Jeu p  =new Jeu();
        p.setj1();
        p.setj1();
        p.setj1();
        p.setj1();
        assertEquals(true, p.isFin());
    }

    @Test
    public void egalite (){
        Jeu p  =new Jeu();
        p.setj1();
        p.setj1();
        p.setj1();
        p.setj2();
        p.setj2();
        p.setj2();
        System.out.println("serveur : "+p.getJoueur1()+" relanceur : " +p.getJoueur2());
        p.setj1();
        //p.setRelanceur();
        assertEquals(false, p.isFin());
    }

    @Test
    public void jeu1 (){
        Jeu p  =new Jeu();
        p.setj1();
        p.setj1();
        p.setj1();
        p.setj2();
        p.setj2();
        p.setj2();
        p.setj2();
        p.setj1();
        p.setj1();
        p.setj1();
        System.out.println("serveur : "+p.getJoueur1()+" relanceur : " +p.getJoueur2());
        p.setj1();
        //p.setRelanceur();
        assertEquals(true, p.isFin());
        assertEquals( true , p.getGagnant());
    }

}
