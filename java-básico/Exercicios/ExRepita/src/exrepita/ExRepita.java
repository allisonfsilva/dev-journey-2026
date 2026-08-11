package exrepita;

import javax.swing.JOptionPane;

public class ExRepita {

    public static void main(String[] args) {
        // TODO: Escreva a logica do seu codigo aqui

        /*  JOptionPane.showMessageDialog(null, "Olá, mundo!", "Boas Vindas",  JOptionPane.WARNING_MESSAGE);
        
       int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        JOptionPane.showMessageDialog(null, "Você digitou o valor " + n);*/
        int n, s = 0, totv = 0, totpar = 0, totimp = 0, m100 = 0;
        float mv = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("<html>Digite um número:  <br>0 INTERROMPE</br></html>"));
            s += n;
            totv++;
            if (n % 2 == 0) {
                totpar++;
            } else {
                totimp++;
            }
            if (n >= 100) {
                m100++;
            }

        } while (n != 0);
        totv--;
        totpar--;
        mv = (float) s / totv;

        JOptionPane.showMessageDialog(null, "<html>Resultado final <br>--------------------------"
                + "<br>A soma final foi: " + s
                + "<br> Total de valores: " + totv
                + "<br>Total de pares: " + totpar
                + "<br>Total de ímpares" + totimp
                + "<br> Maiores que 100: " + m100
                + "<br>Media geral: " + String.format("%.2f", mv)
                + "</html>");
        

    }

}
