/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nove;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author João Pedro Gambirasio da Rosa
 */
public class Nove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner ler = new Scanner(System.in);

        int positivo, val, cont;

        cont = 0;
        positivo = 0;

        while (cont != 10) {
            val = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor:"));
            cont += 1;

            if (val >= 0) {
                positivo += 1;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de positivos:\n" + positivo);

    }

}
