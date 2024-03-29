/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edd.proyecto;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;

/**
 *
 * @author pedro
 */

// Clase de la Interfaz

public class InicioInterfaz extends javax.swing.JFrame {
    Grafos newgrafo;
    
    /**
     * Creates new form InicioInterfaz
     */
    
    /**
     * Método para presentar la Interfaz 
     */
    
    public InicioInterfaz() {
        
        this.newgrafo = new Grafos( 25);
//        newgrafo.Insert("5");
//        newgrafo.Insert("4");
//        newgrafo.Insert("3");
//        newgrafo.Insert("2");
//        newgrafo.Insert("1");
//        newgrafo.InsertArista(23, "1", "3");
//        newgrafo.InsertArista(25, "1", "2");
//        //newgrafo.InsertArista(33, "1", "4");
//     //   newgrafo.InsertArista(101, "1", "5");
//        newgrafo.InsertArista(13, "2", "3");
//      //  newgrafo.InsertArista(19, "2", "4");
//        newgrafo.InsertArista(29, "2", "5");
//        newgrafo.InsertArista(26, "3", "5");
//        newgrafo.InsertArista(73, "4", "5");
//        System.out.println(newgrafo.Imprimir());
//        newgrafo.ChangeLast("1");
//        for (int i = 0; i < 20; i++) {
//            for (int j = 0; j < 10; j++) {
//                Ants a = new Ants();
//                newgrafo.profundidad(1, 1, a);
//                System.out.println(a.getVisited());
//                System.out.println(a.getDistance());
//                
//            }
//            newgrafo.ActFeromonas(0.5);
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
        PrintGrafo = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        ShowTXT = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();

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

        Exit.setBackground(new java.awt.Color(255, 0, 0));
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("X");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel2.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 50, 40));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingrese el valor que desea:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, -1));

        InputArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputAristaActionPerformed(evt);
            }
        });
        jPanel2.add(InputArista, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 150, 30));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Unimet Ant");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Qué desea realizar?");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Insertar");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Insertar Aristas");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("3.-Eliminar Arista");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, 10));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("4.-Eliminar Vértice");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("5.-Imprimir");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 70, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingrese una ciudad: ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        InsertarCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarCity1ActionPerformed(evt);
            }
        });
        jPanel2.add(InsertarCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 240, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ingrese otra ciudad: ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        InsertarCity2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarCity2ActionPerformed(evt);
            }
        });
        jPanel2.add(InsertarCity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 230, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ingrese una ciudad: ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ingrese la distancia: ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, 20));

        Distance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistanceActionPerformed(evt);
            }
        });
        jPanel2.add(Distance, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 240, -1));

        DeleteCity2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCity2ActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteCity2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 280, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ingrese otra ciudad:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
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

        DeleteCity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCity1ActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 280, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ver Ciclos:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 80, 20));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ingrese el punto de partida:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 160, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ingrese alfa:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 70, -1));

        NewAlfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAlfaActionPerformed(evt);
            }
        });
        jPanel2.add(NewAlfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 240, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
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

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 600, 270, -1));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Recorrido más rapido:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 130, -1));

        ShowShorter.setColumns(20);
        ShowShorter.setRows(5);
        jScrollPane3.setViewportView(ShowShorter);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 600, 230, 90));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Cantidad de Hormigas: ");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        NewAnts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewAntsActionPerformed(evt);
            }
        });
        jPanel2.add(NewAnts, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 230, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Ingrese Ro(p):");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 80, -1));

        NewRo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewRoActionPerformed(evt);
            }
        });
        jPanel2.add(NewRo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 200, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Pasadas: ");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, -1, -1));

        Moves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovesActionPerformed(evt);
            }
        });
        jPanel2.add(Moves, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 200, -1));

        ShowCicles.setText("Iniciar Simulación");
        ShowCicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCiclesActionPerformed(evt);
            }
        });
        jPanel2.add(ShowCicles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, -1, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Orden de Pasadas:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 670, 110, -1));

        PrintGrafo.setText("Show");
        PrintGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintGrafoActionPerformed(evt);
            }
        });
        jPanel2.add(PrintGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, -1));

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Mostrar Grafo: ");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, -1, -1));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Mostar TXT: ");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, -1, -1));

        ShowTXT.setText("Show");
        ShowTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowTXTActionPerformed(evt);
            }
        });
        jPanel2.add(ShowTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 180, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Fondo Vinotinto.png"))); // NOI18N
        jLabel27.setText("jLabel27");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método para Cerrar la Interfaz
     */
    
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    /**
     * Método para Ingresar una Arista / Camino
     */
    
    private void InputAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputAristaActionPerformed
        
    }//GEN-LAST:event_InputAristaActionPerformed

    /**
     * Método para Ingresar una Primera Ciudad
     */
    
    private void InsertarCity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarCity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarCity1ActionPerformed

    /**
     * Método para Ingresar una Segunda Ciudad
     */
    
    private void InsertarCity2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarCity2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertarCity2ActionPerformed

    /**
     * Método para Ingresar una Segunda Ciudad a Eliminar
     */
    
    private void DeleteCity2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCity2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteCity2ActionPerformed

    /**
     * Método / Botón  para Insertar
     */
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String inputArista = this.InputArista.getText();
        newgrafo.Insert(inputArista);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Método para Mostrar
     */
    
    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        // TODO add your handling code here:
        this.ShowGrafo.setText(this.newgrafo.Imprimir());
    }//GEN-LAST:event_ShowActionPerformed

    /**
     * Método para Insertar un Vértice / Una Ciudad
     */
    
    private void InsertAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertAristaActionPerformed
        // TODO add your handling code here:
        String City1 = this.InsertarCity1.getText();
        String City2 = this.InsertarCity2.getText();
        double d = Double.parseDouble(this.Distance.getText());
        newgrafo.InsertArista(City1, City2, d);
    }//GEN-LAST:event_InsertAristaActionPerformed

    /**
     * Método para Eliminar una Arista / Dos Ciudades
     */
    
    private void DeleteAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAristaActionPerformed
        // TODO add your handling code here:
        String City1 = this.DeleteCity1.getText();
        String City2 = this.DeleteCity2.getText();
        newgrafo.DeleteArista(City1, City2);
    }//GEN-LAST:event_DeleteAristaActionPerformed

    /**
     * Método para Eliminar un Vértice / Una Ciudad
     */
    
    private void DeleteVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteVerticeActionPerformed
        // TODO add your handling code here:
        String element = this.InputDelete.getText();
        newgrafo.DeleteVertice(element);
    }//GEN-LAST:event_DeleteVerticeActionPerformed

    /**
     * Método para conocer la Distancia entre las Dos Ciudades
     */
    
    private void DistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DistanceActionPerformed

    /**
     * Método para Eliminar un Vértice
     */
    
    private void InputDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputDeleteActionPerformed

    /**
     * Método para Ingresar una Primera Ciudad
     */
    
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
        this.Cicles.setText(view);
        this.ShowShorter.setText("La menor distancia es: " + minor.getVisited() + "," +"con una distancia de: " + minor.getDistance());
    }//GEN-LAST:event_ShowCiclesActionPerformed

    private void MovesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MovesActionPerformed

    private void PrintGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintGrafoActionPerformed
        // TODO add your handling code here:
        Graph graph = new SingleGraph("MyGraph");
        graph.setAttribute("ui.stylesheet", "node { shape: circle; fill-color: #5DC1B9; text-color: #000000; size: 40px; } "
                + " edge { size: 2px; shape: line; fill-color: #D3D3D3; }");
        for (int i = 0; i < newgrafo.getGrafosize(); i++) {
            if (newgrafo.vertices[i].primero != null) {
                String username = newgrafo.vertices[i].primero.getElement();
                Node user = graph.addNode(username);
                user.setAttribute("ui.label", username);
            }
        }

        for (int i = 0; i < newgrafo.getGrafosize(); i++) {
            if (newgrafo.vertices[i].primero != null) {
                String source = newgrafo.vertices[i].primero.getElement();
                Arista currentUser = newgrafo.vertices[i].primero.getNext();
                while (currentUser != null) {
                    String target = currentUser.getCity();
                    try{
                    Edge edge = graph.addEdge(source + "-" + target, source, target, false);
                    edge.setAttribute("ui.style", "fill-color: black;");
                    currentUser = currentUser.getNext();}catch(Exception e){currentUser = currentUser.getNext();}
                }
            }
        }
        System.setProperty("org.graphstream.ui", "org.graphstream.ui.swing");
    Viewer viewer = graph.display();
    }//GEN-LAST:event_PrintGrafoActionPerformed

    private void ShowTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowTXTActionPerformed
        // TODO add your handling code here:
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Texto", "txt");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        File ruta = new File("e:/carpeta/");
        fileChooser.setCurrentDirectory(ruta);
        int result = fileChooser.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            String linea;
            int estado = 1;
            String lineas[]; 
            try{
                if (!file.exists()){
                    file.createNewFile();
                }else{
                    FileReader fr = new FileReader(file);
                    try (BufferedReader br = new BufferedReader(fr)) {
                        while((linea = br.readLine())!= null){
                            if(!linea.isEmpty() && !linea.equals("ciudad")){
                                if(linea.equals("aristas")){
                                    estado =2;
                                }else if (estado == 1){
                                    System.out.println("ciudad" + linea);
                                    newgrafo.Insert(linea);
                                    System.out.println("jdlfñsd");
                                }else if (estado ==2){
                                    linea = linea.replace(" ", "");
                                    lineas = linea.split(",");
                                    System.out.println(lineas.length);
                                    newgrafo.InsertArista(lineas[0],lineas[1], Double.parseDouble(lineas[2]));
                                    
                                }                      
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Se ha leido el archivo");
                }
            }catch( HeadlessException | IOException | NumberFormatException ex){
                JOptionPane.showMessageDialog(null, ex);
            }}
        
    }//GEN-LAST:event_ShowTXTActionPerformed

    /**
     * Método para Ingresar una Primera Ciudad a Eliminar
     */
    
    private void DeleteCity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteCity1ActionPerformed
    
    
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
    private javax.swing.JButton PrintGrafo;
    private javax.swing.JButton Show;
    private javax.swing.JButton ShowCicles;
    private javax.swing.JTextArea ShowGrafo;
    private javax.swing.JTextArea ShowShorter;
    private javax.swing.JButton ShowTXT;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
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
