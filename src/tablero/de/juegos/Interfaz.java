/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tablero.de.juegos;

import javax.swing.JOptionPane;
import java.awt.*;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author TenmaAlonso0712
 */
public class Interfaz extends javax.swing.JFrame {

    Color player = new Color(0, 51, 153);
    Color casillas = new Color(0, 255, 255);
    ArrayList<JPanel> al = new ArrayList();
    int dadito;
    int n;
    int m;
    public Interfaz() {
        initComponents();
        al.add(casilla1);
        al.add(casilla2);
        al.add(casilla3);
        al.add(casilla4);
        al.add(casilla5);
        al.add(casilla6);
        al.add(casilla7);
        al.add(casilla8);
        al.add(casilla9);
        al.add(casilla10);
        al.add(casilla11);
        al.add(casilla12);
        al.add(casilla13);
        al.add(casilla14);
        al.add(casilla15);
        al.add(casilla16);
        al.add(casilla17);
        al.add(casilla18);
        


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel19 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        casilla1 = new javax.swing.JPanel();
        casilla2 = new javax.swing.JPanel();
        casilla5 = new javax.swing.JPanel();
        casilla4 = new javax.swing.JPanel();
        casilla3 = new javax.swing.JPanel();
        casilla18 = new javax.swing.JPanel();
        casilla17 = new javax.swing.JPanel();
        casilla8 = new javax.swing.JPanel();
        casilla7 = new javax.swing.JPanel();
        casilla6 = new javax.swing.JPanel();
        casilla16 = new javax.swing.JPanel();
        casilla15 = new javax.swing.JPanel();
        casilla14 = new javax.swing.JPanel();
        casilla13 = new javax.swing.JPanel();
        casilla12 = new javax.swing.JPanel();
        casilla10 = new javax.swing.JPanel();
        casilla9 = new javax.swing.JPanel();
        casilla11 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jFinal = new javax.swing.JLabel();
        jInicio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        casilla1.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout casilla1Layout = new javax.swing.GroupLayout(casilla1);
        casilla1.setLayout(casilla1Layout);
        casilla1Layout.setHorizontalGroup(
            casilla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla1Layout.setVerticalGroup(
            casilla1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 70, 70));

        casilla2.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla2Layout = new javax.swing.GroupLayout(casilla2);
        casilla2.setLayout(casilla2Layout);
        casilla2Layout.setHorizontalGroup(
            casilla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla2Layout.setVerticalGroup(
            casilla2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 70, 70));

        casilla5.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla5Layout = new javax.swing.GroupLayout(casilla5);
        casilla5.setLayout(casilla5Layout);
        casilla5Layout.setHorizontalGroup(
            casilla5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla5Layout.setVerticalGroup(
            casilla5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 70, 70));

        casilla4.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla4Layout = new javax.swing.GroupLayout(casilla4);
        casilla4.setLayout(casilla4Layout);
        casilla4Layout.setHorizontalGroup(
            casilla4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla4Layout.setVerticalGroup(
            casilla4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 70, 70));

        casilla3.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla3Layout = new javax.swing.GroupLayout(casilla3);
        casilla3.setLayout(casilla3Layout);
        casilla3Layout.setHorizontalGroup(
            casilla3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla3Layout.setVerticalGroup(
            casilla3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 70, 70));

        casilla18.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla18Layout = new javax.swing.GroupLayout(casilla18);
        casilla18.setLayout(casilla18Layout);
        casilla18Layout.setHorizontalGroup(
            casilla18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla18Layout.setVerticalGroup(
            casilla18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 70, 70));

        casilla17.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla17Layout = new javax.swing.GroupLayout(casilla17);
        casilla17.setLayout(casilla17Layout);
        casilla17Layout.setHorizontalGroup(
            casilla17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla17Layout.setVerticalGroup(
            casilla17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 70, 70));

        casilla8.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla8Layout = new javax.swing.GroupLayout(casilla8);
        casilla8.setLayout(casilla8Layout);
        casilla8Layout.setHorizontalGroup(
            casilla8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla8Layout.setVerticalGroup(
            casilla8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 70, 70));

        casilla7.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla7Layout = new javax.swing.GroupLayout(casilla7);
        casilla7.setLayout(casilla7Layout);
        casilla7Layout.setHorizontalGroup(
            casilla7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla7Layout.setVerticalGroup(
            casilla7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 70, 70));

        casilla6.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla6Layout = new javax.swing.GroupLayout(casilla6);
        casilla6.setLayout(casilla6Layout);
        casilla6Layout.setHorizontalGroup(
            casilla6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla6Layout.setVerticalGroup(
            casilla6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 70, 70));

        casilla16.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla16Layout = new javax.swing.GroupLayout(casilla16);
        casilla16.setLayout(casilla16Layout);
        casilla16Layout.setHorizontalGroup(
            casilla16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla16Layout.setVerticalGroup(
            casilla16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 70, 70));

        casilla15.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla15Layout = new javax.swing.GroupLayout(casilla15);
        casilla15.setLayout(casilla15Layout);
        casilla15Layout.setHorizontalGroup(
            casilla15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla15Layout.setVerticalGroup(
            casilla15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 70, 70));

        casilla14.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla14Layout = new javax.swing.GroupLayout(casilla14);
        casilla14.setLayout(casilla14Layout);
        casilla14Layout.setHorizontalGroup(
            casilla14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla14Layout.setVerticalGroup(
            casilla14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 70, 70));

        casilla13.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla13Layout = new javax.swing.GroupLayout(casilla13);
        casilla13.setLayout(casilla13Layout);
        casilla13Layout.setHorizontalGroup(
            casilla13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla13Layout.setVerticalGroup(
            casilla13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 70, 70));

        casilla12.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla12Layout = new javax.swing.GroupLayout(casilla12);
        casilla12.setLayout(casilla12Layout);
        casilla12Layout.setHorizontalGroup(
            casilla12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla12Layout.setVerticalGroup(
            casilla12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 70, 70));

        casilla10.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla10Layout = new javax.swing.GroupLayout(casilla10);
        casilla10.setLayout(casilla10Layout);
        casilla10Layout.setHorizontalGroup(
            casilla10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla10Layout.setVerticalGroup(
            casilla10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, 70, 70));

        casilla9.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla9Layout = new javax.swing.GroupLayout(casilla9);
        casilla9.setLayout(casilla9Layout);
        casilla9Layout.setHorizontalGroup(
            casilla9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla9Layout.setVerticalGroup(
            casilla9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 70, 70));

        casilla11.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout casilla11Layout = new javax.swing.GroupLayout(casilla11);
        casilla11.setLayout(casilla11Layout);
        casilla11Layout.setHorizontalGroup(
            casilla11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        casilla11Layout.setVerticalGroup(
            casilla11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(casilla11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 70, 70));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 160, 40));

        jFinal.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFinal.setText("FINAL");
        getContentPane().add(jFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 90, 50));

        jInicio.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jInicio.setText("INICIO");
        getContentPane().add(jInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 90, 50));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            dadito = (int)((Math.random())*5)+1 ;
            JOptionPane.showMessageDialog(null, dadito);
            m = m + dadito;
            for (int i = 0; i <= m ; i++) {
                al.get(i).setBackground(player);
            }
            if(m == al.size()){
                JOptionPane.showMessageDialog(null,"Game Over");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Game Over");
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel casilla1;
    private javax.swing.JPanel casilla10;
    private javax.swing.JPanel casilla11;
    private javax.swing.JPanel casilla12;
    private javax.swing.JPanel casilla13;
    private javax.swing.JPanel casilla14;
    private javax.swing.JPanel casilla15;
    private javax.swing.JPanel casilla16;
    private javax.swing.JPanel casilla17;
    private javax.swing.JPanel casilla18;
    private javax.swing.JPanel casilla2;
    private javax.swing.JPanel casilla3;
    private javax.swing.JPanel casilla4;
    private javax.swing.JPanel casilla5;
    private javax.swing.JPanel casilla6;
    private javax.swing.JPanel casilla7;
    private javax.swing.JPanel casilla8;
    private javax.swing.JPanel casilla9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jFinal;
    private javax.swing.JLabel jInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
