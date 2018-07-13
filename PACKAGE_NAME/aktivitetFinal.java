/** Version 1 */

package PACKAGE_NAME;

import javax.swing.*;
import java.awt.*;

public class aktivitetFinal {

    public static void main(String[] args) {
        //lägg till variablerna som behövs för beräkningen
        int     A1 = 0, //Antal män
                A2 = 0, //Antal kvinnor
                G1 = 0, //Ålder på män
                G2 = 0, //Ålder på kvinnor
                M1 = 0, //Ålder på män delat med antalet män
                M2 = 0, //Ålder på kvinnor delat med antalet kvinnor
                nyPerson; //värdet av om programmet ska fortsätta eller avslutas



        //Gör en loop som återgår till ursprungsläget om man vill lägga till en ny användare
        do {
            
            Object[] kön = {"Man","Kvinna"};
            int x = JOptionPane.showOptionDialog(
            		null, "Vänligen ange kön",
            							"Ange kön",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,//do not use a custom Icon
            kön,//the titles of buttons
            kön[1]);//default button title
            	if (x == 0) {
            		A1++; // Om användaren klickar på Man addera 1 till A1
            		G1 = G1 + Integer.parseInt(JOptionPane.showInputDialog("Hur gammal är mannen?"));          		
            	} else {
            		A2++; //Om användaren klickar på Kvinna addera 1 till A2
            		G2 = G2 + Integer.parseInt(JOptionPane.showInputDialog("Hur gammal är kvinnan?"));
            	}
            	//Fråga användaren om dom vill lägga till en ny person
                nyPerson = JOptionPane.showConfirmDialog(null, "Vill du lägga till en ny person?",
                                                                          "Fråga", JOptionPane.YES_NO_OPTION);
            	
               
                                                               
        } while (nyPerson == 0);
        
        /**Visa på skärmen genomsnittåldern för respektive kategori samt antalet personer i den kategorin*/
        //Männen
        JOptionPane.showMessageDialog(null,
        		"Genomsnittåldern för män är " + (M1=G1/A1) +"\n" + "Av totalt " + A1 + " Män");
        //Kvinnor
        JOptionPane.showMessageDialog(null,
        		"Genomsnittåldern för kvinnor är " + (M2=G2/A2) +"\n" + "Av totalt " + A2 + " Kvinnor");
        
    }
}