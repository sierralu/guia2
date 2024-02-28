package algoritmo;

public class GUI extends javax.swing.JFrame 
{
    Persona obj = new Persona();
    int t = 0;
    public GUI()
    {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Metodos De Ordenamiento");
    }
    public void HabilitarBoton()
    {
        if(!TxtNombre.getText().isEmpty() && !TxtCedula.getText().isEmpty() && !TxtEdad.getText().isEmpty() && !TxtEstatura.getText().isEmpty())
        {
            BtDatos.setEnabled(true);
        }
        else
        {
            BtDatos.setEnabled(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtDimension = new javax.swing.JTextField();
        BtVector = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        BtDatos = new javax.swing.JButton();
        BtMostrar = new javax.swing.JButton();
        BtBurbuja = new javax.swing.JButton();
        BtMergesort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtSalida = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtEdad = new javax.swing.JTextField();
        TxtEstatura = new javax.swing.JTextField();
        BtEdad = new javax.swing.JButton();
        BtEstatura = new javax.swing.JButton();
        BtBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("numero de personas ");

        TxtDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDimensionActionPerformed(evt);
            }
        });

        BtVector.setText("crear lista");
        BtVector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVectorActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese Nombre");

        TxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtNombreKeyReleased(evt);
            }
        });

        BtDatos.setText("Guardar Datos");
        BtDatos.setEnabled(false);
        BtDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDatosActionPerformed(evt);
            }
        });

        BtMostrar.setText("mostrar persononas ");
        BtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMostrarActionPerformed(evt);
            }
        });

        BtBurbuja.setText("Burbuja");
        BtBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBurbujaActionPerformed(evt);
            }
        });

        BtMergesort.setText("Mergesort");
        BtMergesort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMergesortActionPerformed(evt);
            }
        });

        TxtSalida.setColumns(20);
        TxtSalida.setRows(5);
        jScrollPane1.setViewportView(TxtSalida);

        jLabel3.setText("Ingrese Cedula");

        TxtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtCedulaKeyReleased(evt);
            }
        });

        jLabel4.setText("Ingrese Edad");

        jLabel5.setText("Ingrese Estatura");

        TxtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtEdadKeyReleased(evt);
            }
        });

        TxtEstatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtEstaturaKeyReleased(evt);
            }
        });

        BtEdad.setText("Edad");

        BtEstatura.setText("Estatura");

        BtBorrar.setText("Borrar");
        BtBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtEdad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtEstatura, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                            .addComponent(TxtDimension, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtBurbuja)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtMergesort))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BtDatos)
                                            .addComponent(BtVector)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(BtEdad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BtEstatura)))
                                .addGap(0, 8, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtMostrar)
                                .addGap(255, 255, 255)
                                .addComponent(BtBorrar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BtVector)
                    .addComponent(TxtDimension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtDatos)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(TxtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtEdad)
                            .addComponent(BtEstatura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtMergesort)
                            .addComponent(BtBurbuja))))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtMostrar)
                    .addComponent(BtBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
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

    private void TxtDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDimensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDimensionActionPerformed

    private void BtVectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVectorActionPerformed
        // TODO add your handling code here:
        obj.setTam(Integer.parseInt(TxtDimension.getText()));
        obj.CrearVector();
    }//GEN-LAST:event_BtVectorActionPerformed

    private void BtDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDatosActionPerformed
        // TODO add your handling code here:
        if(t < obj.getTam())
        {
            obj.setNombre(t, TxtNombre.getText());
            obj.setVectorCedula(t, Integer.parseInt(TxtCedula.getText()));
            obj.setVectorEdad(t, Integer.parseInt(TxtEdad.getText()));
            obj.setVectorEstatura(t, Integer.parseInt(TxtEstatura.getText()));
            t++;
        }
        else
        {
            TxtSalida.setText("Vector Lleno");
        }
        TxtNombre.setText("");
        TxtCedula.setText("");
        TxtEdad.setText("");
        TxtEstatura.setText("");
    }//GEN-LAST:event_BtDatosActionPerformed

    private void BtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMostrarActionPerformed
        // TODO add your handling code here:
        TxtSalida.setText(obj.Mostrar());
    }//GEN-LAST:event_BtMostrarActionPerformed

    private void BtBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBurbujaActionPerformed
        // TODO add your handling code here:
        obj.OrdenarBurbuja1();
        TxtSalida.setText(obj.Mostrar());
    }//GEN-LAST:event_BtBurbujaActionPerformed

    private void BtBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBorrarActionPerformed
        // TODO add your handling code here:
        TxtSalida.setText("");
    }//GEN-LAST:event_BtBorrarActionPerformed

    private void TxtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNombreKeyReleased
        // TODO add your handling code here:
        HabilitarBoton();
    }//GEN-LAST:event_TxtNombreKeyReleased

    private void TxtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCedulaKeyReleased
        // TODO add your handling code here:
        HabilitarBoton();
    }//GEN-LAST:event_TxtCedulaKeyReleased

    private void TxtEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEdadKeyReleased
        // TODO add your handling code here:
        HabilitarBoton();
    }//GEN-LAST:event_TxtEdadKeyReleased

    private void TxtEstaturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEstaturaKeyReleased
        // TODO add your handling code here:
        HabilitarBoton();
    }//GEN-LAST:event_TxtEstaturaKeyReleased

    private void BtMergesortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMergesortActionPerformed
        // TODO add your handling code here:
        obj.Mergesort1();
        TxtSalida.setText(obj.Mostrar());
    }//GEN-LAST:event_BtMergesortActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBorrar;
    private javax.swing.JButton BtBurbuja;
    private javax.swing.JButton BtDatos;
    private javax.swing.JButton BtEdad;
    private javax.swing.JButton BtEstatura;
    private javax.swing.JButton BtMergesort;
    private javax.swing.JButton BtMostrar;
    private javax.swing.JButton BtVector;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtDimension;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtEstatura;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextArea TxtSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}