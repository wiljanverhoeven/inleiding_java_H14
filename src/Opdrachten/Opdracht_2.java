package Opdrachten;

import java.awt.*;
import java.util.Random;
import java.applet.*;

public class Opdracht_2 extends Applet{
    String[] deck;
    String[] colors = {"klaver", "schoppen", "harten", "ruiten"};
    String[] ranks = {"aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "boer", "vrouw", "heer"};
    String[] speler1;
    String[] speler2;
    String[] speler3;
    String[] speler4;
    public void init() {
        int total = colors.length * ranks.length;
        deck = new String[total];
        int hand = ranks.length;
        speler1 = new String[hand];
        speler2 = new String[hand];
        speler3 = new String[hand];
        speler4 = new String[hand];


        for(int color = 0; color < colors.length ; color++) {
            for(int rank = 0; rank <ranks.length; rank++) {
                int indexNumber = color * 13 + rank;
                deck[indexNumber] = ranks[rank] + colors[color];
            }
        }

    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
    public void paint(Graphics g) {
        for(int s = 0; s < 13; s++) {
            speler1[s] = deelKaart();
            speler2[s] = deelKaart();
            speler3[s] = deelKaart();
            speler4[s] = deelKaart();
            g.drawString("" +speler1[s], 10, 20 + (20*s));
            g.drawString("" +speler2[s], 110, 20 + (20*s));
            g.drawString("" +speler3[s], 210, 20 + (20*s));
            g.drawString("" +speler4[s], 310, 20 + (20*s));
        }
    }
}