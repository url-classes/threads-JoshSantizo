
package main;

import java.util.logging.Level;
import java.util.logging.Logger;


public class frmMain extends javax.swing.JFrame {

    Numero hilo1;
    Letra hilo2;
    
    public frmMain() {
        initComponents();
    }
    
    public class Numero extends Thread {
       
        private int valor;
        
        public Numero(){
            valor = 0;
        }
        
        @Override
        public void run(){
                btnIniciarNumero.setEnabled(false);
            while(valor <= 100){
                lblNumero1.setText(String.valueOf(valor));
                valor++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            btnIniciarNumero.setEnabled(true);
        }
    }
    
     public class Letra extends Thread {
        private char letra;
        
        public Letra() {
            letra = 'a';
        }
        
        @Override
        public void run(){
            btnIniciarLetra.setEnabled(false);
            do {
                lblLetra.setText(String.valueOf(letra));
                letra++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            } while(letra <= 'z');
            btnIniciarLetra.setEnabled(true);
        }
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLetra = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        btnIniciarNumero = new javax.swing.JButton();
        btnIniciarLetra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLetra.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblLetra.setText("a");

        lblNumero1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblNumero1.setText("0");

        btnIniciarNumero.setText("Iniciar");
        btnIniciarNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarNumeroActionPerformed(evt);
            }
        });

        btnIniciarLetra.setText("Iniciar");
        btnIniciarLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarLetraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLetra)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnIniciarNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnIniciarLetra)
                .addGap(63, 63, 63))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(lblNumero1)
                    .addContainerGap(294, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblLetra)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarNumero)
                    .addComponent(btnIniciarLetra))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(lblNumero1)
                    .addContainerGap(178, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarNumeroActionPerformed
        
        hilo1 = new Numero();   
        hilo1.start();
    }//GEN-LAST:event_btnIniciarNumeroActionPerformed

    private void btnIniciarLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarLetraActionPerformed
        
        hilo2 = new Letra();
        hilo2.start();
    }//GEN-LAST:event_btnIniciarLetraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarLetra;
    private javax.swing.JButton btnIniciarNumero;
    private javax.swing.JLabel lblLetra;
    private javax.swing.JLabel lblNumero1;
    // End of variables declaration//GEN-END:variables
}
