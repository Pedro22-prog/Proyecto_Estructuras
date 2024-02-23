/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edd.proyecto;

/**
 *
 * @author pedro
 */
public class InicioInterfaz extends javax.swing.JFrame {
    Grafos newgrafo;
    /**
     * Creates new form InicioInterfaz
     */
    public InicioInterfaz() {
        initComponents();
        this.newgrafo = new Grafos(7);
    
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
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        InputArista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        InsertarCity1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        InsertarCity2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Distance = new javax.swing.JTextField();
        DeleteCity2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        InputDelete = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShowGrafo = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        InsertArista = new javax.swing.JButton();
        DeleteArista = new javax.swing.JButton();
        DeleteVertice = new javax.swing.JButton();
        DeleteCity1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        InputFirst = new javax.swing.JTextField();
        InputLast = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        NewAlfa = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        NewBeta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Cicles = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ShowShorter = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        NewAnts = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        NewRo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        Moves = new javax.swing.JTextField();
        ShowCicles = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setText("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel2.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, -1));

        jLabel1.setText("Ingre el valor que desea:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, -1));

        InputArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputAristaActionPerformed(evt);
            }
        });
        jPanel2.add(InputArista, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 150, 30));

        jLabel2.setText("Unimet Ant");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 70, -1));

        jLabel3.setText("Que desea realizar?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 110, 30));

        jLabel4.setText("Insertar");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, -1));

        jLabel5.setText("Insertar Aristas");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 20));

        jLabel6.setText("3.-Eliminar Arista");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 100, 10));

        jLabel7.setText("4.-Eliminar Vertice");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jLabel8.setText("5.-Imprimir");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 70, -1));

        jLabel9.setText("Ingrese una ciudad: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        InsertarCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarCity1ActionPerformed(evt);
            }
        });
        jPanel2.add(InsertarCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 240, -1));

        jLabel10.setText("Ingrese otra ciudad: ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        InsertarCity2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarCity2ActionPerformed(evt);
            }
        });
        jPanel2.add(InsertarCity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 230, -1));

        jLabel11.setText("Ingrese una ciudad: ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jLabel12.setText("Ingrese la distancia: ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 110, 20));

        Distance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistanceActionPerformed(evt);
            }
        });
        jPanel2.add(Distance, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 240, -1));

        DeleteCity2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCity2ActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteCity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 280, -1));

        jLabel13.setText("Ingrese otra ciudad:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        jLabel14.setText("Ingrese para eliminar: ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        InputDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(InputDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 220, -1));

        ShowGrafo.setColumns(20);
        ShowGrafo.setRows(5);
        jScrollPane1.setViewportView(ShowGrafo);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 280, 120));

        jButton2.setText("Insertar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, 20));

        Show.setText("Show");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        jPanel2.add(Show, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 70, 20));

        InsertArista.setText("Insertar");
        InsertArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertAristaActionPerformed(evt);
            }
        });
        jPanel2.add(InsertArista, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, 20));

        DeleteArista.setText("Delete");
        DeleteArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAristaActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteArista, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 70, 20));

        DeleteVertice.setText("Delete");
        DeleteVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteVerticeActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteVertice, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 70, 20));
        jPanel2.add(DeleteCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 280, -1));

        jLabel15.setText("Ver Ciclos:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 80, 20));

        jLabel16.setText("Ingrese el punto de partida:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 160, -1));

        jLabel17.setText("Ingrese la ciudad de llegada: ");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        InputFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFirstActionPerformed(evt);
            }
        });
        jPanel2.add(InputFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 160, -1));

        InputLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputLastActionPerformed(evt);
            }
        });
        jPanel2.add(InputLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 160, -1));

        jLabel18.setText("Ingrese alfa:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 70, -1));

        NewAlfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAlfaActionPerformed(evt);
            }
        });
        jPanel2.add(NewAlfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 240, -1));

        jLabel19.setText("Ingrese Beta: ");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, -1, -1));

        NewBeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBetaActionPerformed(evt);
            }
        });
        jPanel2.add(NewBeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, 240, -1));

        Cicles.setColumns(20);
        Cicles.setRows(5);
        jScrollPane2.setViewportView(Cicles);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 690, 270, -1));

        jLabel20.setText("Recorrido mas rapido:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 650, 130, -1));

        ShowShorter.setColumns(20);
        ShowShorter.setRows(5);
        jScrollPane3.setViewportView(ShowShorter);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 680, 230, 90));

        jLabel21.setText("Contidad de Hormigas: ");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        NewAnts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAntsActionPerformed(evt);
            }
        });
        jPanel2.add(NewAnts, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 230, -1));

        jLabel22.setText("Ingrese Ro(p):");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 80, -1));

        NewRo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRoActionPerformed(evt);
            }
        });
        jPanel2.add(NewRo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 200, -1));

        jLabel23.setText("Pasadas: ");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, -1, -1));

        Moves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovesActionPerformed(evt);
            }
        });
        jPanel2.add(Moves, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 200, -1));

        ShowCicles.setText("Iniciar Simulacion: ");
        ShowCicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCiclesActionPerformed(evt);
            }
        });
        jPanel2.add(ShowCicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, -1, -1));

        jLabel24.setText("Orden de Pasadas:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void InputAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputAristaActionPerformed
        
    }//GEN-LAST:event_InputAristaActionPerformed

    private void InsertarCity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarCity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarCity1ActionPerformed

    private void InsertarCity2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarCity2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarCity2ActionPerformed

    private void DeleteCity2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCity2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteCity2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String inputArista = this.InputArista.getText();
        newgrafo.Insert(inputArista);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        // TODO add your handling code here:
        this.ShowGrafo.setText(this.newgrafo.Imprimir());
    }//GEN-LAST:event_ShowActionPerformed

    private void InsertAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertAristaActionPerformed
        // TODO add your handling code here:
        String City1 = this.InsertarCity1.getText();
        String City2 = this.InsertarCity2.getText();
        int d = Integer.parseInt(this.Distance.getText());
        newgrafo.InsertArista(d, City1, City2);
    }//GEN-LAST:event_InsertAristaActionPerformed

    private void DeleteAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAristaActionPerformed
        // TODO add your handling code here:
        String City1 = this.DeleteCity1.getText();
        String City2 = this.DeleteCity2.getText();
        newgrafo.DeleteArista(City1, City2);
    }//GEN-LAST:event_DeleteAristaActionPerformed

    private void DeleteVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteVerticeActionPerformed
        // TODO add your handling code here:
        String element = this.InputDelete.getText();
        newgrafo.DeleteVertice(element);
    }//GEN-LAST:event_DeleteVerticeActionPerformed

    private void DistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DistanceActionPerformed

    private void InputDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputDeleteActionPerformed

    private void InputFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFirstActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_InputFirstActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void NewBetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewBetaActionPerformed

    private void NewAntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAntsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewAntsActionPerformed

    private void NewRoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewRoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewRoActionPerformed

    private void InputLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputLastActionPerformed

    private void NewAlfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewAlfaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewAlfaActionPerformed

    private void ShowCiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowCiclesActionPerformed
        // TODO add your handling code here:
        String i = this.InputFirst.getText();
        String j = this.InputLast.getText();
        double alpha = Double.parseDouble(this.NewAlfa.getText());
        double beta = Double.parseDouble(this.NewBeta.getText());
        double p = Double.parseDouble(this.NewRo.getText());
        int ant = Integer.parseInt(this.NewAnts.getText());
        int cicle = Integer.parseInt(this.Moves.getText());
        String view = "";
        Ants minor = null;
        for (int k = 0; k < cicle; k++) {
            for (int l = 0; l < ant; l++) {
                Ants a = new Ants();
                newgrafo.profundidad((int)alpha, (int)beta, a);
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
        this.Cicles.setText(view);
        this.ShowShorter.setText("La menor distancia es: " + minor.getVisited() + "," +"con una distancia de: " + minor.getDistance());
    }//GEN-LAST:event_ShowCiclesActionPerformed

    private void MovesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MovesActionPerformed

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
            java.util.logging.Logger.getLogger(InicioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Cicles;
    private javax.swing.JButton DeleteArista;
    private javax.swing.JTextField DeleteCity1;
    private javax.swing.JTextField DeleteCity2;
    private javax.swing.JButton DeleteVertice;
    private javax.swing.JTextField Distance;
    private javax.swing.JButton Exit;
    private javax.swing.JTextField InputArista;
    private javax.swing.JTextField InputDelete;
    private javax.swing.JTextField InputFirst;
    private javax.swing.JTextField InputLast;
    private javax.swing.JButton InsertArista;
    private javax.swing.JTextField InsertarCity1;
    private javax.swing.JTextField InsertarCity2;
    private javax.swing.JTextField Moves;
    private javax.swing.JTextField NewAlfa;
    private javax.swing.JTextField NewAnts;
    private javax.swing.JTextField NewBeta;
    private javax.swing.JTextField NewRo;
    private javax.swing.JButton Show;
    private javax.swing.JButton ShowCicles;
    private javax.swing.JTextArea ShowGrafo;
    private javax.swing.JTextArea ShowShorter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
