
package Package1;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_nombre_universo = new javax.swing.JTextField();
        bt_guardar_universo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre_serVivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_id_serVivo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_poder_serVivo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_years_serVivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_raza_serVivo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_universos = new javax.swing.JComboBox<>();
        bt_guardar_serVivo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        bt_cargar_universos = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombre_buscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_id_buscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nombre:");

        bt_guardar_universo.setText("Guardar");
        bt_guardar_universo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guardar_universoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombre_universo)
                    .addComponent(bt_guardar_universo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_nombre_universo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_guardar_universo)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Universo", jPanel2);

        jLabel2.setText("Nombre:");

        jLabel3.setText("Id:");

        jLabel4.setText("Poder:");

        jLabel5.setText("Años:");

        jLabel6.setText("Raza:");

        jLabel7.setText("Universo:");

        bt_guardar_serVivo.setText("Guardar");
        bt_guardar_serVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_guardar_serVivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre_serVivo)
                    .addComponent(jLabel3)
                    .addComponent(tf_id_serVivo)
                    .addComponent(jLabel4)
                    .addComponent(tf_poder_serVivo)
                    .addComponent(jLabel5)
                    .addComponent(tf_years_serVivo)
                    .addComponent(jLabel6)
                    .addComponent(tf_raza_serVivo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(cb_universos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_guardar_serVivo, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre_serVivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_universos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_id_serVivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_guardar_serVivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_poder_serVivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_years_serVivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_raza_serVivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Ser Vivo", jPanel3);

        bt_cargar_universos.setText("Cargar Universos y Seres Vivos");
        bt_cargar_universos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cargar_universosMouseClicked(evt);
            }
        });

        jProgressBar1.setForeground(new java.awt.Color(255, 0, 102));
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cargar_universos, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bt_cargar_universos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cargar", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Modifcar Ser Vivo", jPanel5);

        jLabel8.setText("Nombre del Ser Vivo:");

        jLabel9.setText("Id del Ser Vivo:");

        jButton1.setText("Buscar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombre_buscar)
                    .addComponent(jLabel9)
                    .addComponent(tf_id_buscar)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_nombre_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Busqueda", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void bt_guardar_universoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guardar_universoMouseClicked
        // Escribir universo
        if(tf_nombre_universo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre.");
        } else{
            Universo u = new Universo(tf_nombre_universo.getText());
            String r = tf_nombre_universo.getText()+".cbm";
            String [] arr = {"Universos","General"};
            String [] arr2 = {r,"allUniversos.cbm"};
            for (int i = 0; i < 2; i++) {
                AdminUniverso au2 =new AdminUniverso("./"+arr[i]+"/"+arr2[i]);
                au2.cargarArchivo();
                au2.setUniverso(u);
                au2.escribirArchivo();
            }
            JOptionPane.showMessageDialog(this,"Universo agregado exitosamente!");
            tf_nombre_universo.setText("");
        }
    }//GEN-LAST:event_bt_guardar_universoMouseClicked

    private void bt_guardar_serVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_guardar_serVivoMouseClicked
        if(au.getListaUniversos().isEmpty()){
            JOptionPane.showMessageDialog(this,"Debe agregar un universo primero.");
        } else{
            if(tf_nombre_serVivo.getText().equals("") || tf_id_serVivo.getText().equals("") 
                    || tf_poder_serVivo.getText().equals("") || tf_years_serVivo.getText().equals("") 
                    || tf_raza_serVivo.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.");
            } else{
                //Escribir ser vivo
                String nombre, id, raza;
                int poder, years;
                Universo u;
                nombre = tf_nombre_serVivo.getText();
                id=tf_id_serVivo.getText();
                raza = tf_raza_serVivo.getText();
                poder = Integer.parseInt(tf_poder_serVivo.getText());
                years = Integer.parseInt(tf_years_serVivo.getText());
                u=(Universo)cb_universos.getSelectedItem();
                SerVivo sv = new SerVivo(nombre, id, poder, years, u, raza);
                String r = tf_nombre_serVivo.getText()+".cbm";
                String [] arr = {"SeresVivos","General"};
                String [] arr2 = {r,"allSeresVivos.cbm"};
                for (int i = 0; i < 2; i++) {
                    AdminSerVivo au2 =new AdminSerVivo("./"+arr[i]+"/"+arr2[i]);
                    au2.cargarArchivo();
                    au2.setSerVivo(sv);
                    au2.escribirArchivo();
                }
                JOptionPane.showMessageDialog(this,"Ser Vivo agregado exitosamente!");
                tf_nombre_serVivo.setText("");
                tf_id_serVivo.setText("");
                tf_poder_serVivo.setText("");
                tf_years_serVivo.setText("");
                tf_raza_serVivo.setText("");
            }
        }
    }//GEN-LAST:event_bt_guardar_serVivoMouseClicked

    private void bt_cargar_universosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cargar_universosMouseClicked
        cb_universos.setModel(new DefaultComboBoxModel());
        au.cargarArchivo();
        as.cargarArchivo();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cb_universos.getModel();
        for (Universo u : au.getListaUniversos()) {
            modelo.addElement(u);
        }
        cb_universos.setModel(modelo);
        JOptionPane.showMessageDialog(this, "Datos cargados");
    }//GEN-LAST:event_bt_cargar_universosMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // Buscar ser vivo
        as.cargarArchivo();
        String nombre = tf_nombre_buscar.getText();
        String id = tf_id_buscar.getText();
        boolean flag=false;
        for (SerVivo s : as.getListaSeres()) {
            if(s.getNombre().equals(nombre) && s.getId().equals(id)){
                flag=true;
            }
        }
        if(flag==true){
            JOptionPane.showMessageDialog(this, "Ser vivo encontrado.");
        } else{
            JOptionPane.showMessageDialog(this, "Ser vivo no se encuentra en el sistema.");
        }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cargar_universos;
    private javax.swing.JButton bt_guardar_serVivo;
    private javax.swing.JButton bt_guardar_universo;
    private javax.swing.JComboBox<String> cb_universos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField tf_id_buscar;
    private javax.swing.JTextField tf_id_serVivo;
    private javax.swing.JTextField tf_nombre_buscar;
    private javax.swing.JTextField tf_nombre_serVivo;
    private javax.swing.JTextField tf_nombre_universo;
    private javax.swing.JTextField tf_poder_serVivo;
    private javax.swing.JTextField tf_raza_serVivo;
    private javax.swing.JTextField tf_years_serVivo;
    // End of variables declaration//GEN-END:variables

    AdminUniverso au = new AdminUniverso("./General/allUniversos.cbm");
    AdminSerVivo as = new AdminSerVivo("./General/allSeresVivos.cbm");
    
}
