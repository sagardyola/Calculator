/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sagar
 */
public class Calc extends javax.swing.JDialog {
       double firstnum;
       double secondnum;
       double result;
       String operations;
       
    public Calc(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        sText1 = new javax.swing.JTextField();
        sLabel1 = new javax.swing.JLabel();
        sButton1 = new javax.swing.JButton();
        sButton3 = new javax.swing.JButton();
        sButton2 = new javax.swing.JButton();
        sButton4 = new javax.swing.JButton();
        sButton5 = new javax.swing.JButton();
        sButton6 = new javax.swing.JButton();
        sButton7 = new javax.swing.JButton();
        sButton8 = new javax.swing.JButton();
        sButton9 = new javax.swing.JButton();
        sButtonDot = new javax.swing.JButton();
        sButton0 = new javax.swing.JButton();
        sButtonPM = new javax.swing.JButton();
        sButtonPlus = new javax.swing.JButton();
        sButtonMinus = new javax.swing.JButton();
        sButtonMul = new javax.swing.JButton();
        sButtonDiv = new javax.swing.JButton();
        sButtonEquals = new javax.swing.JButton();
        sButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButton1.setText("1");
        sButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton1ActionPerformed(evt);
            }
        });

        sButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButton3.setText("3");
        sButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton3ActionPerformed(evt);
            }
        });

        sButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButton2.setText("2");
        sButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton2ActionPerformed(evt);
            }
        });

        sButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButton4.setText("4");
        sButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton4ActionPerformed(evt);
            }
        });

        sButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButton5.setText("5");
        sButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton5ActionPerformed(evt);
            }
        });

        sButton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButton6.setText("6");
        sButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton6ActionPerformed(evt);
            }
        });

        sButton7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButton7.setText("7");
        sButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton7ActionPerformed(evt);
            }
        });

        sButton8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButton8.setText("8");
        sButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton8ActionPerformed(evt);
            }
        });

        sButton9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButton9.setText("9");
        sButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton9ActionPerformed(evt);
            }
        });

        sButtonDot.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButtonDot.setText(".");
        sButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonDotActionPerformed(evt);
            }
        });

        sButton0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButton0.setText("0");
        sButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButton0ActionPerformed(evt);
            }
        });

        sButtonPM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButtonPM.setText("+/-");
        sButtonPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonPMActionPerformed(evt);
            }
        });

        sButtonPlus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButtonPlus.setText("+");
        sButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonPlusActionPerformed(evt);
            }
        });

        sButtonMinus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButtonMinus.setText("-");
        sButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonMinusActionPerformed(evt);
            }
        });

        sButtonMul.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButtonMul.setText("*");
        sButtonMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonMulActionPerformed(evt);
            }
        });

        sButtonDiv.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButtonDiv.setText("/");
        sButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonDivActionPerformed(evt);
            }
        });

        sButtonEquals.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButtonEquals.setText("=");
        sButtonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonEqualsActionPerformed(evt);
            }
        });

        sButtonClear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sButtonClear.setText("C");
        sButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(sButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(sButtonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11)
                                    .addComponent(sButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(sButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sButtonPM, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sButtonMul, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(sText1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sText1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sButtonPM, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sButtonMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sButtonMul, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButton1ActionPerformed
        sText1.setText(sText1.getText()+sButton1.getText());
        sLabel1.setText(sLabel1.getText()+sButton1.getText());
    }//GEN-LAST:event_sButton1ActionPerformed

    private void sButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButton3ActionPerformed
        sText1.setText(sText1.getText()+sButton3.getText());
        sLabel1.setText(sLabel1.getText()+sButton3.getText());
    }//GEN-LAST:event_sButton3ActionPerformed

    private void sButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButton2ActionPerformed
        sText1.setText(sText1.getText()+sButton2.getText());
        sLabel1.setText(sLabel1.getText()+sButton2.getText());
    }//GEN-LAST:event_sButton2ActionPerformed

    private void sButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButton4ActionPerformed
        sText1.setText(sText1.getText()+sButton4.getText());
        sLabel1.setText(sLabel1.getText()+sButton4.getText());
    }//GEN-LAST:event_sButton4ActionPerformed

    private void sButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButton5ActionPerformed
        sText1.setText(sText1.getText()+sButton5.getText());
        sLabel1.setText(sLabel1.getText()+sButton5.getText());
    }//GEN-LAST:event_sButton5ActionPerformed

    private void sButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButton6ActionPerformed
        sText1.setText(sText1.getText()+sButton6.getText());
        sLabel1.setText(sLabel1.getText()+sButton6.getText());
    }//GEN-LAST:event_sButton6ActionPerformed

    private void sButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButton7ActionPerformed
        sText1.setText(sText1.getText()+sButton7.getText());
        sLabel1.setText(sLabel1.getText()+sButton7.getText());
    }//GEN-LAST:event_sButton7ActionPerformed

    private void sButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButton8ActionPerformed
        sText1.setText(sText1.getText()+sButton8.getText());
        sLabel1.setText(sLabel1.getText()+sButton8.getText());
    }//GEN-LAST:event_sButton8ActionPerformed

    private void sButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButton9ActionPerformed
        sText1.setText(sText1.getText()+sButton9.getText());
        sLabel1.setText(sLabel1.getText()+sButton9.getText());
    }//GEN-LAST:event_sButton9ActionPerformed

    private void sButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonDotActionPerformed
        sText1.setText(sText1.getText()+sButtonDot.getText());
        sLabel1.setText(sLabel1.getText()+sButtonDot.getText());
    }//GEN-LAST:event_sButtonDotActionPerformed

    private void sButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButton0ActionPerformed
        sText1.setText(sText1.getText()+sButton0.getText());
        sLabel1.setText(sLabel1.getText()+sButton0.getText());
    }//GEN-LAST:event_sButton0ActionPerformed

    private void sButtonPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonPMActionPerformed
           double ops=Double.parseDouble(String.valueOf(sText1.getText()));
           ops=ops*(-1);
           sText1.setText(String.valueOf(ops));
    }//GEN-LAST:event_sButtonPMActionPerformed

    private void sButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonPlusActionPerformed
         firstnum=Double.parseDouble(sText1.getText());
         sText1.setText("");
         operations="+";
         sLabel1.setText(sLabel1.getText()+"+");
    }//GEN-LAST:event_sButtonPlusActionPerformed

    private void sButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonMinusActionPerformed
         firstnum=Double.parseDouble(sText1.getText());
         sText1.setText("");
         operations="-";
         sLabel1.setText(sLabel1.getText()+"-");
    }//GEN-LAST:event_sButtonMinusActionPerformed

    private void sButtonMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonMulActionPerformed
         firstnum=Double.parseDouble(sText1.getText());
         sText1.setText("");
         operations="*";
         sLabel1.setText(sLabel1.getText()+"*");
    }//GEN-LAST:event_sButtonMulActionPerformed

    private void sButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonDivActionPerformed
         firstnum=Double.parseDouble(sText1.getText());
         sText1.setText("");
         operations="/";
         sLabel1.setText(sLabel1.getText()+"/");
    }//GEN-LAST:event_sButtonDivActionPerformed

    private void sButtonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonEqualsActionPerformed
            String answer;
            secondnum=Double.parseDouble(sText1.getText());
            if (operations=="+")
            {
                result=firstnum+secondnum;
                answer=String.format("%.0f",result);
                sText1.setText(answer);
                sLabel1.setText(sLabel1.getText()+" = "+answer);
            }
            else if (operations=="-")
            {
                result=firstnum-secondnum;
                answer=String.format("%.0f",result);
                sText1.setText(answer);
                sLabel1.setText(sLabel1.getText()+" = "+answer);
            }
              else if (operations=="*")
            {
                result=firstnum*secondnum;
                answer=String.format("%.0f",result);
                sText1.setText(answer);
                sLabel1.setText(sLabel1.getText()+" = "+answer);
            }
            else if (operations=="/")
            {
                result=firstnum/secondnum;
                answer=String.format("%.0f",result);
                sText1.setText(answer);
                sLabel1.setText(sLabel1.getText()+" = "+answer);
            } 
            
            
    }//GEN-LAST:event_sButtonEqualsActionPerformed

    private void sButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sButtonClearActionPerformed
        sText1.setText("");
        sLabel1.setText("");
    }//GEN-LAST:event_sButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Calc dialog = new Calc(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton sButton0;
    private javax.swing.JButton sButton1;
    private javax.swing.JButton sButton2;
    private javax.swing.JButton sButton3;
    private javax.swing.JButton sButton4;
    private javax.swing.JButton sButton5;
    private javax.swing.JButton sButton6;
    private javax.swing.JButton sButton7;
    private javax.swing.JButton sButton8;
    private javax.swing.JButton sButton9;
    private javax.swing.JButton sButtonClear;
    private javax.swing.JButton sButtonDiv;
    private javax.swing.JButton sButtonDot;
    private javax.swing.JButton sButtonEquals;
    private javax.swing.JButton sButtonMinus;
    private javax.swing.JButton sButtonMul;
    private javax.swing.JButton sButtonPM;
    private javax.swing.JButton sButtonPlus;
    private javax.swing.JLabel sLabel1;
    private javax.swing.JTextField sText1;
    // End of variables declaration//GEN-END:variables
}
