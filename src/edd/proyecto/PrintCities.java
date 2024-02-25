/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edd.proyecto;

/**
 *
 * @author pedro
 */
public class PrintCities extends javax.swing.JFrame {
    static Grafos newgrafo;

    /**
     * Creates new form PrintCities
     */
    public PrintCities(Grafos graph) {
        this.newgrafo = new Grafos(25);
        this.newgrafo = graph;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PrintCities = new javax.swing.JButton();
        ReturnMenu = new javax.swing.JButton();
        Cities = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setText("X");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jLabel1.setText("Aqui se agregan las ciudades al grafo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 200, 40));

        PrintCities.setText("Add");
        PrintCities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintCitiesActionPerformed(evt);
            }
        });
        getContentPane().add(PrintCities, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        ReturnMenu.setText("Menu");
        ReturnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        Cities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitiesActionPerformed(evt);
            }
        });
        getContentPane().add(Cities, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 90, -1));

        jLabel2.setText("Ingrese una o varias ciudades:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed

    private void PrintCitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintCitiesActionPerformed
        // TODO add your handling code here:
        try{
         String inputArista = this.Cities.getText();
         newgrafo.Insert(inputArista);   
        } catch(Exception err){
            System.out.println("Ha ocurrido un error: "+err);
        }
    }//GEN-LAST:event_PrintCitiesActionPerformed

    private void ReturnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnMenuActionPerformed
        // TODO add your handling code here:
         StartInterface interfaz = new StartInterface(newgrafo);
         this.dispose();
    }//GEN-LAST:event_ReturnMenuActionPerformed

    private void CitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CitiesActionPerformed

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
            java.util.logging.Logger.getLogger(PrintCities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintCities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintCities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintCities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintCities(newgrafo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cities;
    private javax.swing.JButton Close;
    private javax.swing.JButton PrintCities;
    private javax.swing.JButton ReturnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
