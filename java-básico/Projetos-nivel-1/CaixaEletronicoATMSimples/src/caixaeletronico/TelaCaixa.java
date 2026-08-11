/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package caixaeletronico;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class TelaCaixa extends javax.swing.JFrame {

    double saldo = 1000;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCaixa.class.getName());

    /**
     * Creates new form TelaCaixa
     */
    public TelaCaixa() {
        initComponents();

        panSaque.setVisible(false);
        panDep.setVisible(false);
        panSaldo.setVisible(false);
        panInfo.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSaque = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panSaque = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSaque = new javax.swing.JTextField();
        btSaqueOk = new javax.swing.JButton();
        Sacar1 = new javax.swing.JButton();
        panDep = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDep = new javax.swing.JTextField();
        btDepOk = new javax.swing.JButton();
        btSaldo = new javax.swing.JButton();
        panSaldo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        panInfo = new javax.swing.JPanel();
        lblNot = new javax.swing.JLabel();
        lblNotas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btSaque.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btSaque.setText("Sacar");
        btSaque.addActionListener(this::btSaqueActionPerformed);
        getContentPane().add(btSaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 95, 139, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CAIXA ELETRÔNICO SIMPLES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 648, -1));

        panSaque.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Digite o valor do saque: R$");
        panSaque.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, 215, -1));

        txtSaque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panSaque.add(txtSaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 6, 162, -1));

        btSaqueOk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btSaqueOk.setText("OK!");
        btSaqueOk.setMargin(new java.awt.Insets(2, 2, 3, 2));
        btSaqueOk.addActionListener(this::btSaqueOkActionPerformed);
        panSaque.add(btSaqueOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 6, 43, -1));

        getContentPane().add(panSaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 95, -1, -1));

        Sacar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Sacar1.setText("Depositar");
        Sacar1.addActionListener(this::Sacar1ActionPerformed);
        getContentPane().add(Sacar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 163, -1, 44));

        panDep.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Digite o valor do depósito: R$");
        panDep.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, 241, -1));

        txtDep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panDep.add(txtDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 6, 168, -1));

        btDepOk.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btDepOk.setText("OK!");
        btDepOk.setMargin(new java.awt.Insets(2, 2, 3, 2));
        btDepOk.addActionListener(this::btDepOkActionPerformed);
        panDep.add(btDepOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 6, 43, -1));

        getContentPane().add(panDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 163, -1, -1));

        btSaldo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btSaldo.setText("Saldo");
        btSaldo.addActionListener(this::btSaldoActionPerformed);
        getContentPane().add(btSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 237, 139, -1));

        panSaldo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Saldo atual:");
        panSaldo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 8, -1, -1));

        lblSaldo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSaldo.setText("< vazio >");
        panSaldo.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 8, 126, -1));

        getContentPane().add(panSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 237, -1, -1));

        panInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNot.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNot.setText("jLabel5");
        panInfo.add(lblNot, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 14, 516, -1));

        lblNotas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNotas.setText("jLabel5");
        panInfo.add(lblNotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 64, -1, -1));

        getContentPane().add(panInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 303, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaqueActionPerformed
        // TODO add your handling code here:
        panSaque.setVisible(true);

    }//GEN-LAST:event_btSaqueActionPerformed

    private void Sacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sacar1ActionPerformed
        // TODO add your handling code here:
        panDep.setVisible(true);
    }//GEN-LAST:event_Sacar1ActionPerformed

    private void btSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaldoActionPerformed
        // TODO add your handling code here:
        panSaldo.setVisible(true);

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        String resultadoFormatado = formatoMoeda.format(saldo);

        lblSaldo.setText(resultadoFormatado);
    }//GEN-LAST:event_btSaldoActionPerformed

    private void btSaqueOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaqueOkActionPerformed
        // TODO add your handling code here:
        double saque = Double.parseDouble(txtSaque.getText().replace(".", "").replace(",", "."));

        int saqueint = (int) saque;

        int n200, n100, n50, n20, n10, n5, n2, n1;
        
        String recibo = "<html>";

        if (saque > saldo) {
            lblNot.setText("Saldo insuficiente para saque");
        } else if (saqueint < 10) {
            lblNot.setText("Saldo insuficiente para saque");
        } else {
            lblNot.setText("Saque efetuado com sucesso ");
            saldo = saldo - (int) saque;

            n200 = saqueint / 200;
            saqueint = saqueint % 200;

            n100 = saqueint / 100;
            saqueint = saqueint % 100;

            n50 = saqueint / 50;
            saqueint = saqueint % 50;

            n20 = saqueint / 20;
            saqueint = saqueint % 20;

            n10 = saqueint / 10;
            saqueint = saqueint % 10;

            n5 = saqueint / 5;
            saqueint = saqueint % 5;

            n2 = saqueint / 2;
            saqueint = saqueint % 2;

            n1 = saqueint / 1;
            saqueint = saqueint % 1;

            lblNotas.setVisible(true);

            if (n200 > 0) {
                recibo += n200 + " nota(s) de R$ 200,00<br>";
            }

            if (n100 > 0) {
                recibo += n100 + " nota(s) de R$ 100,00<br>";
            }

            if (n50 > 0) {
                recibo += n50 + " nota(s) de R$ 50,00<br>";
            }

            if (n20 > 0) {
                recibo += n20 + " nota(s) de R$ 20,00<br>";
            }

            if (n10 > 0) {
                recibo += n10 + " nota(s) de R$ 10,00<br>";
            }

            if (n5 > 0) {
                recibo += n5 + " nota(s) de R$ 5,00<br>";
            }

            if (n2 > 0) {
                recibo += n2 + " nota(s) de R$ 2,00<br>";
            }

            if (n1 > 0) {
                recibo += n1 + " nota(s) de R$ 1,00<br>";
            }

            recibo += "</html>";
            lblNotas.setText(recibo);

            panInfo.setVisible(true);

        }


    }//GEN-LAST:event_btSaqueOkActionPerformed

    private void btDepOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepOkActionPerformed
        // TODO add your handling code here:
        double dep = (Double.parseDouble(txtDep.getText().replace(".", "").replace(",", ".")));
        saldo += dep;
        lblNot.setText("Depósito efetuado com sucesso");
        lblNotas.setVisible(false);

        panInfo.setVisible(true);
    }//GEN-LAST:event_btDepOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new TelaCaixa().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sacar1;
    private javax.swing.JButton btDepOk;
    private javax.swing.JButton btSaldo;
    private javax.swing.JButton btSaque;
    private javax.swing.JButton btSaqueOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNot;
    private javax.swing.JLabel lblNotas;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel panDep;
    private javax.swing.JPanel panInfo;
    private javax.swing.JPanel panSaldo;
    private javax.swing.JPanel panSaque;
    private javax.swing.JTextField txtDep;
    private javax.swing.JTextField txtSaque;
    // End of variables declaration//GEN-END:variables
}
