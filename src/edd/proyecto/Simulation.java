/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edd.proyecto;

/**
 *
 * @author pedro
 */
public class Simulation extends javax.swing.JFrame {
    static Grafos newgrafo;
    /**
     * Creates new form Simulation
     */
    public Simulation(Grafos graph) {
        initComponents();
        this.newgrafo = graph;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Paths = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        MinusPath = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        InputFirst = new javax.swing.JTextField();
        InputLast = new javax.swing.JTextField();
        NewAlfa = new javax.swing.JTextField();
        NewBeta = new javax.swing.JTextField();
        NewRo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NewAnts = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Moves = new javax.swing.JTextField();
        ReturnMenu = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ShowGrafo = new javax.swing.JTextArea();
        Show = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setBackground(new java.awt.Color(255, 0, 0));
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setText("X");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 50, 50));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        jLabel1.setText("Aquí Puede visualizar la ruta más corta y los caminos que toman las Hormigas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 850, 20));

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 110, 30));

        Paths.setColumns(20);
        Paths.setRows(5);
        jScrollPane1.setViewportView(Paths);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 310, 280));

        MinusPath.setColumns(20);
        MinusPath.setRows(5);
        jScrollPane2.setViewportView(MinusPath);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 340, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese la ciudad de Partida: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese la ciudad de llegada: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese su Alfa: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Ingrese su Beta: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Ingrese su Ro:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 90, -1));

        InputFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFirstActionPerformed(evt);
            }
        });
        jPanel1.add(InputFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 130, -1));
        jPanel1.add(InputLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 150, -1));
        jPanel1.add(NewAlfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 220, -1));
        jPanel1.add(NewBeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 110, 20));
        jPanel1.add(NewRo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 120, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Cantidad de Hormigas:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));
        jPanel1.add(NewAnts, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 110, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Pasadas: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        Moves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovesActionPerformed(evt);
            }
        });
        jPanel1.add(Moves, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 100, -1));

        ReturnMenu.setText("Menu");
        ReturnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(ReturnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 590, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Recorridos: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Recorrido Más Corto: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        ShowGrafo.setColumns(20);
        ShowGrafo.setRows(5);
        jScrollPane3.setViewportView(ShowGrafo);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 250, 160));

        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        jPanel1.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Aristas Actuales: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String i = this.InputFirst.getText();
        String j = this.InputLast.getText();
        double alpha = Double.parseDouble(this.NewAlfa.getText());
        double beta = Double.parseDouble(this.NewBeta.getText());
        double p = Double.parseDouble(this.NewRo.getText());
        int ant = Integer.parseInt(this.NewAnts.getText());
        int cicle = Integer.parseInt(this.Moves.getText());
        String view = "";
        Ants minor = null;
        newgrafo.ChangeFirst(this.InputFirst.getText());
        newgrafo.ChangeLast((this.InputLast.getText()));
        newgrafo.NewFeromona();
        //newgrafo.verferomonas();
        System.out.println(newgrafo.Imprimir());
        for (int k = 0; k < cicle; k++) {
            for (int l = 0; l < ant; l++) {
                Ants a = new Ants();
                this.newgrafo.profundidad(alpha, beta, a);
                view += "Recorrido: "+a.getVisited() +","+"Distancia: "+ a.getDistance() + "\n";
                if (minor == null){
                  minor = a;  
                }else{
                    if(minor.getDistance() > a.getDistance()){
                        minor = a;
                    }
                }
            }
        }
        this.Paths.setText(view);
        this.MinusPath.setText("La menor distancia es: " + minor.getVisited() + "," +"con una distancia de: " + minor.getDistance());
        } catch (Exception err){
            System.out.println("Ha ocurrido un error: " + err);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ReturnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnMenuActionPerformed
        // TODO add your handling code here:
        StartInterface interfaz = new StartInterface(newgrafo);
        this.dispose();
    }//GEN-LAST:event_ReturnMenuActionPerformed

    private void MovesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MovesActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        // TODO add your handling code here:
        this.ShowGrafo.setText(this.newgrafo.Imprimir());
    }//GEN-LAST:event_ShowActionPerformed

    private void InputFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputFirstActionPerformed

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
            java.util.logging.Logger.getLogger(Simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulation(newgrafo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JTextField InputFirst;
    private javax.swing.JTextField InputLast;
    private javax.swing.JTextArea MinusPath;
    private javax.swing.JTextField Moves;
    private javax.swing.JTextField NewAlfa;
    private javax.swing.JTextField NewAnts;
    private javax.swing.JTextField NewBeta;
    private javax.swing.JTextField NewRo;
    private javax.swing.JTextArea Paths;
    private javax.swing.JButton ReturnMenu;
    private javax.swing.JButton Show;
    private javax.swing.JTextArea ShowGrafo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
