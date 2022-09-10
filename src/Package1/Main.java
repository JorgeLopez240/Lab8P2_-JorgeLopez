
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
        pb_cargar = new javax.swing.JProgressBar();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombre_buscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_id_buscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cb_mod_serVivo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        tf_mod_ser_nom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_mod_ser_id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_mod_ser_poder = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_mod_ser_years = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_mod_ser_raza = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cb_mod_serVivo_universo = new javax.swing.JComboBox<>();
        bt_mod_serVivo = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        cb_mod_universo = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        tf_mod_universo = new javax.swing.JTextField();
        bt_mod_universo = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        cb_delete_serVivo = new javax.swing.JComboBox<>();
        bt_del_serVivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

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
                .addContainerGap(606, Short.MAX_VALUE))
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
                .addContainerGap(274, Short.MAX_VALUE))
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
                .addContainerGap(341, Short.MAX_VALUE))
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
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar Ser Vivo", jPanel3);

        bt_cargar_universos.setText("Cargar Universos y Seres Vivos");
        bt_cargar_universos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cargar_universosMouseClicked(evt);
            }
        });

        pb_cargar.setForeground(new java.awt.Color(255, 0, 102));
        pb_cargar.setStringPainted(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pb_cargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cargar_universos, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                .addContainerGap(481, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pb_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bt_cargar_universos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cargar", jPanel4);

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
                .addContainerGap(606, Short.MAX_VALUE))
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
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Busqueda", jPanel6);

        cb_mod_serVivo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_mod_serVivoItemStateChanged(evt);
            }
        });

        jLabel10.setText("Nombre");

        jLabel11.setText("Id");

        jLabel12.setText("Poder");

        jLabel13.setText("Años");

        jLabel14.setText("Raza");

        jLabel15.setText("Universo");

        bt_mod_serVivo.setText("Modificar");
        bt_mod_serVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mod_serVivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(cb_mod_serVivo, 0, 171, Short.MAX_VALUE)
                    .addComponent(tf_mod_ser_nom)
                    .addComponent(tf_mod_ser_id)
                    .addComponent(tf_mod_ser_poder)
                    .addComponent(tf_mod_ser_years)
                    .addComponent(tf_mod_ser_raza))
                .addGap(104, 104, 104)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addComponent(cb_mod_serVivo_universo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_mod_serVivo, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(cb_mod_serVivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_mod_ser_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_mod_serVivo_universo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_mod_ser_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_mod_ser_poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_mod_serVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_mod_ser_years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_mod_ser_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modifcar Ser Vivo", jPanel5);

        jLabel16.setText("Nombre");

        tf_mod_universo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_mod_universoActionPerformed(evt);
            }
        });

        bt_mod_universo.setText("Modificar");
        bt_mod_universo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_mod_universoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_mod_universo, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cb_mod_universo, 0, 160, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addComponent(tf_mod_universo)))
                .addContainerGap(596, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cb_mod_universo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_mod_universo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(bt_mod_universo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar Universo", jPanel7);

        bt_del_serVivo.setText("Eliminar");
        bt_del_serVivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_del_serVivoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_del_serVivo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(cb_delete_serVivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(586, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(cb_delete_serVivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_del_serVivo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar Ser Vivo", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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
        int max;
        max = max();
        pb_cargar.setMaximum(max);
        cb_universos.setModel(new DefaultComboBoxModel());
        cb_mod_universo.setModel(new DefaultComboBoxModel());
        cb_mod_serVivo_universo.setModel(new DefaultComboBoxModel());
        cb_mod_serVivo.setModel(new DefaultComboBoxModel());
        cb_delete_serVivo.setModel(new DefaultComboBoxModel());
        au.cargarArchivo();
        as.cargarArchivo();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel)cb_universos.getModel();
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel)cb_mod_serVivo.getModel();
        for (Universo u : au.getListaUniversos()) {
            modelo.addElement(u);
        }
        
        for (SerVivo s : as.getListaSeres()) {
            modelo2.addElement(s);
        }
        cb_delete_serVivo.setModel(modelo2);
        cb_universos.setModel(modelo);
        cb_mod_universo.setModel(modelo);
        cb_mod_serVivo_universo.setModel(modelo);
        cb_mod_serVivo.setModel(modelo2);
        boolean flag = true;
        Hilo_cargar hc  = new Hilo_cargar(pb_cargar, flag, max);
        hc.start();
        if(hc.getBarra().getValue()==max){
            hc.setFlag(false);
            hc.stop();
        }
        
        
        if(!(hc.isAlive())){
            pb_cargar.setValue(0);
            pb_cargar.setString(0+"%");
            JOptionPane.showMessageDialog(this, "Datos Cargados");
        }
        
        
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

    private void bt_mod_serVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mod_serVivoMouseClicked
        as.cargarArchivo();
       
        String nombre, id, raza;
        int poder, years;
        Universo u;
        nombre = tf_mod_ser_nom.getText();
        id = tf_mod_ser_id.getText();
        raza = tf_mod_ser_raza.getText();
        poder = Integer.parseInt(tf_mod_ser_poder.getText());
        years = Integer.parseInt(tf_mod_ser_years.getText());
        u=(Universo) cb_mod_serVivo_universo.getSelectedItem();
        as.cargarArchivo();
        for (SerVivo s : as.getListaSeres()) {
            if(s == x){
                s.setNombre(nombre);
                s.setId(id);
                s.setPoder(poder);
                s.setRaza(raza);
                s.setUniverso(u);
                s.setYears(years);
            }
        }
        
        as.escribirArchivo();
        JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
    }//GEN-LAST:event_bt_mod_serVivoMouseClicked

    private void cb_mod_serVivoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_mod_serVivoItemStateChanged
        if(evt.getStateChange()==1){
             x=(SerVivo) cb_mod_serVivo.getSelectedItem();
            SerVivo sv = (SerVivo) cb_mod_serVivo.getSelectedItem();
            tf_mod_ser_id.setText(sv.getId());
            tf_mod_ser_nom.setText(sv.getNombre());
            String p="";
            p+=sv.getPoder();
            tf_mod_ser_poder.setText(p);
            tf_mod_ser_raza.setText(sv.getRaza());
            String a = "";
            a+= sv.getYears();
            tf_mod_ser_years.setText(a);
            cb_mod_serVivo_universo.setSelectedItem((Universo)sv.getUniverso());
        }
    }//GEN-LAST:event_cb_mod_serVivoItemStateChanged

    private void bt_del_serVivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_del_serVivoMouseClicked
        as.cargarArchivo();
        SerVivo v = (SerVivo) cb_delete_serVivo.getSelectedItem();
        as.getListaSeres().remove(v);
        JOptionPane.showMessageDialog(this, "borrado!");
        as.escribirArchivo();
    }//GEN-LAST:event_bt_del_serVivoMouseClicked

    private void tf_mod_universoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_mod_universoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_mod_universoActionPerformed

    private void bt_mod_universoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_mod_universoMouseClicked
        Universo u = (Universo) cb_mod_universo.getSelectedItem();
        au.getListaUniversos().remove(u);
        au.escribirArchivo();
        JOptionPane.showMessageDialog(this, "borrado!");
    }//GEN-LAST:event_bt_mod_universoMouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if(jTabbedPane1.getSelectedIndex()!=4){
            pb_cargar.setValue(0);
            pb_cargar.setString(0+"&");
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

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

    
    public int max (){
        au.cargarArchivo();
        as.cargarArchivo();
        int u = au.getListaUniversos().size();
        int s = as.getListaSeres().size();
        int max = u+s;
        return max;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cargar_universos;
    private javax.swing.JButton bt_del_serVivo;
    private javax.swing.JButton bt_guardar_serVivo;
    private javax.swing.JButton bt_guardar_universo;
    private javax.swing.JButton bt_mod_serVivo;
    private javax.swing.JButton bt_mod_universo;
    private javax.swing.JComboBox<String> cb_delete_serVivo;
    private javax.swing.JComboBox<String> cb_mod_serVivo;
    private javax.swing.JComboBox<String> cb_mod_serVivo_universo;
    private javax.swing.JComboBox<String> cb_mod_universo;
    private javax.swing.JComboBox<String> cb_universos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JProgressBar pb_cargar;
    private javax.swing.JTextField tf_id_buscar;
    private javax.swing.JTextField tf_id_serVivo;
    private javax.swing.JTextField tf_mod_ser_id;
    private javax.swing.JTextField tf_mod_ser_nom;
    private javax.swing.JTextField tf_mod_ser_poder;
    private javax.swing.JTextField tf_mod_ser_raza;
    private javax.swing.JTextField tf_mod_ser_years;
    private javax.swing.JTextField tf_mod_universo;
    private javax.swing.JTextField tf_nombre_buscar;
    private javax.swing.JTextField tf_nombre_serVivo;
    private javax.swing.JTextField tf_nombre_universo;
    private javax.swing.JTextField tf_poder_serVivo;
    private javax.swing.JTextField tf_raza_serVivo;
    private javax.swing.JTextField tf_years_serVivo;
    // End of variables declaration//GEN-END:variables

    AdminUniverso au = new AdminUniverso("./General/allUniversos.cbm");
    AdminSerVivo as = new AdminSerVivo("./General/allSeresVivos.cbm");
    SerVivo x;
}
