
package centromedicoant;

public class Principal extends javax.swing.JFrame {
    
    static VerIMCS tabla;
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        tabla = new VerIMCS(this, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        foto_Label = new javax.swing.JLabel();
        menu_MenuBar = new javax.swing.JMenuBar();
        menu1_Menu = new javax.swing.JMenu();
        calcular_MenuItem = new javax.swing.JMenuItem();
        verRegistros_MenuItem = new javax.swing.JMenuItem();
        borrarRegistros_MenuItem = new javax.swing.JMenuItem();
        salir_MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        foto_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/centromedico.png"))); // NOI18N
        foto_Label.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foto_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foto_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu1_Menu.setText("Ir a...");

        calcular_MenuItem.setText("Calcular IMC");
        calcular_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_MenuItemActionPerformed(evt);
            }
        });
        menu1_Menu.add(calcular_MenuItem);

        verRegistros_MenuItem.setText("Ver registros guardados");
        verRegistros_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verRegistros_MenuItemActionPerformed(evt);
            }
        });
        menu1_Menu.add(verRegistros_MenuItem);

        borrarRegistros_MenuItem.setText("Borrar registros guardados");
        borrarRegistros_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarRegistros_MenuItemActionPerformed(evt);
            }
        });
        menu1_Menu.add(borrarRegistros_MenuItem);

        salir_MenuItem.setText("Salir");
        salir_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_MenuItemActionPerformed(evt);
            }
        });
        menu1_Menu.add(salir_MenuItem);

        menu_MenuBar.add(menu1_Menu);

        setJMenuBar(menu_MenuBar);

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

    private void verRegistros_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verRegistros_MenuItemActionPerformed
        tabla.setVisible(true);
        tabla.refrescar();
    }//GEN-LAST:event_verRegistros_MenuItemActionPerformed

    private void salir_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_MenuItemActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_salir_MenuItemActionPerformed

    private void calcular_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular_MenuItemActionPerformed
       new CalcularIMC(this, true);
    }//GEN-LAST:event_calcular_MenuItemActionPerformed

    private void borrarRegistros_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarRegistros_MenuItemActionPerformed
        tabla.borrarRegistros();
    }//GEN-LAST:event_borrarRegistros_MenuItemActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem borrarRegistros_MenuItem;
    private javax.swing.JMenuItem calcular_MenuItem;
    private javax.swing.JLabel foto_Label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu1_Menu;
    private javax.swing.JMenuBar menu_MenuBar;
    private javax.swing.JMenuItem salir_MenuItem;
    private javax.swing.JMenuItem verRegistros_MenuItem;
    // End of variables declaration//GEN-END:variables
}
