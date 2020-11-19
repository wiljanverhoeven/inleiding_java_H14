package Opdrachten;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_1 extends Applet {
    double r, r2;
    Button knop;
    int kleur, rang;
    String kaartkleur, kaartrang;

    public void init() {
        r = Math.random();
        r2 = Math.random();
        knop = new Button("Geef kaart");
        knop.addActionListener(new knoplistener());
        add(knop);
        kaartkleur = " ";
        kaartrang = " ";
    }
    public void paint(Graphics g) {
        g.drawString("" +kaartkleur  +kaartrang, 50, 50);
    }
    class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = (int) (r * 4 + 1);
            switch (kleur) {
                case 1:
                    kaartkleur = "harten";
                    break;
                case 2:
                    kaartkleur = "schoppen";
                    break;
                case 3:
                    kaartkleur = "klaver";
                    break;
                case 4:
                    kaartkleur = "ruiten";
                    break;
            }

            rang = (int) (r2 * 13 + 1);
            switch (rang) {
                case 1:
                    kaartrang = "Aas";
                    break;
                case 2:
                    kaartrang = "2";
                    break;
                case 3:
                    kaartrang = "3";
                    break;
                case 4:
                    kaartrang = "4";
                    break;
                case 5:
                    kaartrang = "5";
                    break;
                case 6:
                    kaartrang = "6";
                    break;
                case 7:
                    kaartrang = "7";
                    break;
                case 8:
                    kaartrang = "8";
                    break;
                case 9:
                    kaartrang = "9";
                    break;
                case 10:
                    kaartrang = "10";
                    break;
                case 11:
                    kaartrang = "Boer";
                    break;
                case 12:
                    kaartrang = "Vrouw";
                    break;
                default:
                    kaartrang = "Heer";
                    break;
            }
            repaint();
        }
    }
}
