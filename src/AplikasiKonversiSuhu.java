
import javax.swing.JOptionPane;



/**
 *
 * @author ACER
 */
public class AplikasiKonversiSuhu extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiKonversiSuhu
     */
    public AplikasiKonversiSuhu() {
        initComponents();
        
         inputSuhu.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
        public void insertUpdate(javax.swing.event.DocumentEvent evt) {
            konversiOtomatis();
        }
        public void removeUpdate(javax.swing.event.DocumentEvent evt) {
            konversiOtomatis();
        }
        public void changedUpdate(javax.swing.event.DocumentEvent evt) {
            konversiOtomatis();
        }
    });
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
        jLabel1 = new javax.swing.JLabel();
        inputSuhu = new javax.swing.JTextField();
        skalaAsal = new javax.swing.JComboBox<>();
        skalaTujuan = new javax.swing.JComboBox<>();
        rbAsalKeTujuan = new javax.swing.JRadioButton();
        rbTujuanKeAsal = new javax.swing.JRadioButton();
        btnKonversi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        hasilTextField = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setText("Input Suhu");

        inputSuhu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputSuhuKeyTyped(evt);
            }
        });

        skalaAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcisus", "Fahrenheit", "Reamur", "Kelvin" }));

        skalaTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcisus", "Fahrenheit", "Reamur", "Kelvin" }));

        rbAsalKeTujuan.setText("Asal Ke Tujuan");
        rbAsalKeTujuan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbAsalKeTujuanItemStateChanged(evt);
            }
        });

        rbTujuanKeAsal.setText("Tujuan Ke Asal");
        rbTujuanKeAsal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbTujuanKeAsalItemStateChanged(evt);
            }
        });

        btnKonversi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKonversi.setText("KONVERSI");
        btnKonversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKonversiActionPerformed(evt);
            }
        });

        jLabel2.setText("Hasil Konversi");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(inputSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(skalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skalaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnKonversi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbTujuanKeAsal)
                                    .addComponent(rbAsalKeTujuan)))
                            .addComponent(hasilTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btnHapus)
                        .addGap(47, 47, 47)
                        .addComponent(btnKeluar)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(skalaAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAsalKeTujuan))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbTujuanKeAsal)
                            .addComponent(skalaTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnKonversi, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hasilTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKonversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKonversiActionPerformed
        try {
            double input = Double.parseDouble(inputSuhu.getText());
            String fromScale = skalaAsal.getSelectedItem().toString();
            String toScale = skalaTujuan.getSelectedItem().toString();
            
            if (rbAsalKeTujuan.isSelected()) {
                double result = konversiSuhu(input, fromScale, toScale);
                hasilTextField.setText(String.format("%.2f %s", result, getSymbol(toScale)));
            } else if (rbTujuanKeAsal.isSelected()) {
                double result = konversiSuhu (input, toScale, fromScale);
                hasilTextField.setText(String.format("%.2f %s", result, getSymbol(fromScale)));
            } else {
                JOptionPane.showMessageDialog(this, "Pilih arah konversi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnKonversiActionPerformed

    private void inputSuhuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputSuhuKeyTyped
        char c = evt.getKeyChar();
    if (!Character.isDigit(c) && c != '.') {
        evt.consume();
}
    }//GEN-LAST:event_inputSuhuKeyTyped

    private void rbAsalKeTujuanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbAsalKeTujuanItemStateChanged
      if (rbAsalKeTujuan.isSelected()) {
        hasilTextField.setText(""); 
    }
    }//GEN-LAST:event_rbAsalKeTujuanItemStateChanged

    private void rbTujuanKeAsalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbTujuanKeAsalItemStateChanged
         if (rbTujuanKeAsal.isSelected()) {
        hasilTextField.setText(""); 
    }
    }//GEN-LAST:event_rbTujuanKeAsalItemStateChanged

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
       inputSuhu.setText("");
        hasilTextField.setText("");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

     private double konversiSuhu(double input, String from, String to) {
        double result = input;

        if (from.equals("Celcisus")) {
            if (to.equals("Fahrenheit")) result = input * 9/5 + 32;
            else if (to.equals("Reamur")) result = input * 4/5;
            else if (to.equals("Kelvin")) result = input + 273.15;
        } else if (from.equals("Fahrenheit")) {
            if (to.equals("Celcisus")) result = (input - 32) * 5/9;
            else if (to.equals("Reamur")) result = (input - 32) * 4/9;
            else if (to.equals("Kelvin")) result = (input - 32) * 5/9 + 273.15;
        } else if (from.equals("Reamur")) {
            if (to.equals("Celcisus")) result = input * 5/4;
            else if (to.equals("Fahrenheit")) result = input * 9/4 + 32;
            else if (to.equals("Kelvin")) result = input * 5/4 + 273.15;
        } else if (from.equals("Kelvin")) {
            if (to.equals("Celcisus")) result = input - 273.15;
            else if (to.equals("Fahrenheit")) result = (input - 273.15) * 9/5 + 32;
            else if (to.equals("Reamur")) result = (input - 273.15) * 4/5;
        }

        return result;
    }
     
     private String getSymbol(String scale) {
        switch (scale) {
            case "Celcisus": return "°C";
            case "Fahrenheit": return "°F";
            case "Reamur": return "°Ré";
            case "Kelvin": return "K";
            default: return "";
        }
    }    
     
     private void konversiOtomatis() {
    try {
        if (!inputSuhu.getText().isEmpty()) {
            double input = Double.parseDouble(inputSuhu.getText());
            String fromScale = skalaAsal.getSelectedItem().toString();
            String toScale = skalaTujuan.getSelectedItem().toString();

            if (rbAsalKeTujuan.isSelected()) {
                double result = konversiSuhu(input, fromScale, toScale);
                hasilTextField.setText(String.format("%.2f %s", result, getSymbol(toScale)));
            } else if (rbTujuanKeAsal.isSelected()) {
                double result = konversiSuhu(input, toScale, fromScale);
                hasilTextField.setText(String.format("%.2f %s", result, getSymbol(fromScale)));
            }
        } else {
            hasilTextField.setText("");
        }
    } catch (NumberFormatException ex) {
        hasilTextField.setText("");
    }
}
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
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiKonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiKonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnKonversi;
    private javax.swing.JTextField hasilTextField;
    private javax.swing.JTextField inputSuhu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbAsalKeTujuan;
    private javax.swing.JRadioButton rbTujuanKeAsal;
    private javax.swing.JComboBox<String> skalaAsal;
    private javax.swing.JComboBox<String> skalaTujuan;
    // End of variables declaration//GEN-END:variables
}