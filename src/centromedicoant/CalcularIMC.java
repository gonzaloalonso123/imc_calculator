/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package centromedicoant;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CalcularIMC extends javax.swing.JDialog {

    Principal padre;
    int contador;
    private double IMC;
    private String genero = null;
    private String estado;
    private Component[] componentes;
    private JLabel[] labels;
    boolean cambio;
    
    public CalcularIMC(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        padre = (Principal)parent;
        initComponents();
        crearArrayComponentes();
        crearListeners();
        guardar_Button.setEnabled(false);
        setLocationRelativeTo(null);
        setVisible(true);   
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nombre_Label = new javax.swing.JLabel();
        nombre_Field = new javax.swing.JTextField();
        genero_Label = new javax.swing.JLabel();
        hombre_RadioButton = new javax.swing.JRadioButton();
        mujer_RadioButton = new javax.swing.JRadioButton();
        edad_Label = new javax.swing.JLabel();
        edad_Field = new javax.swing.JTextField();
        peso_Label = new javax.swing.JLabel();
        peso_Field = new javax.swing.JTextField();
        altura_Label = new javax.swing.JLabel();
        altura_Field = new javax.swing.JTextField();
        mostrarFoto_Label = new javax.swing.JLabel();
        mostrarFoto_CheckBox = new javax.swing.JCheckBox();
        guardar_Button = new javax.swing.JButton();
        volver_Button = new javax.swing.JButton();
        calcular_Button = new javax.swing.JButton();
        imcResult_Label = new javax.swing.JLabel();
        pesoResult_Label = new javax.swing.JLabel();
        info_Label = new javax.swing.JLabel();
        foto_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre_Label.setText("Nombre");
        getContentPane().add(nombre_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 40));
        getContentPane().add(nombre_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 30));

        genero_Label.setText("Genero");
        getContentPane().add(genero_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 50, 20));

        buttonGroup1.add(hombre_RadioButton);
        hombre_RadioButton.setText("Hombre");
        getContentPane().add(hombre_RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 95, 20));

        buttonGroup1.add(mujer_RadioButton);
        mujer_RadioButton.setText("Mujer");
        getContentPane().add(mujer_RadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 80, 20));

        edad_Label.setText("Edad");
        getContentPane().add(edad_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 30, 20));
        getContentPane().add(edad_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 95, 30));

        peso_Label.setText("Peso");
        getContentPane().add(peso_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 30, 20));
        getContentPane().add(peso_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 95, 30));

        altura_Label.setText("Altura (cm)");
        getContentPane().add(altura_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 20));
        getContentPane().add(altura_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 95, 30));

        mostrarFoto_Label.setText("Mostrar foto");
        getContentPane().add(mostrarFoto_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, 20));

        mostrarFoto_CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarFoto_CheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(mostrarFoto_CheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 30, 20));

        guardar_Button.setText("Guardar");
        guardar_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(guardar_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 95, -1));

        volver_Button.setText("Volver");
        volver_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(volver_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 95, 30));

        calcular_Button.setText("Calcular");
        calcular_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcular_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(calcular_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, 30));

        imcResult_Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(imcResult_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 100, 20));

        pesoResult_Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(pesoResult_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 100, 20));

        info_Label.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(info_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, 20));

        foto_Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foto_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                foto_LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                foto_LabelMouseExited(evt);
            }
        });
        getContentPane().add(foto_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volver_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_ButtonActionPerformed
        dispose();
    }//GEN-LAST:event_volver_ButtonActionPerformed

    
    private String calcularEstado(double IMC)
    {
        String estado = "";     
        if(IMC <18.5)
            estado = "Delgadez";
        else if(IMC < 25)
            estado = "Normal";
        else if(IMC < 30)
            estado = "Sobrepeso";
        else
            estado = "Obesidad";        
        return estado;
    }
    
    private void calcular_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcular_ButtonActionPerformed
       
        String peso = peso_Field.getText();
        String altura = altura_Field.getText();
        String edad = edad_Field.getText();
        String nombre = nombre_Field.getText();
        
        String error = "";
        Component componenteError = null;
     
        if(!comprobarNombre(nombre_Field.getText())){
                if(!comprobarNumero(edad_Field.getText(), 3, 110)){
                    if(!comprobarNumero(peso_Field.getText(), 20, 200)){
                        if(!comprobarNumero(altura_Field.getText(), 50, 300)){
                           if(!comprobarGenero()){
                                this.IMC = calcularIMC(Double.parseDouble(peso), Double.parseDouble(altura));
                                this.estado = calcularEstado(IMC);
                                this.pesoResult_Label.setText(estado);
                                this.imcResult_Label.setText("" + IMC);
                                this.guardar_Button.setEnabled(true);
                                this.cambio = false;
                                setImagen(estado);
                           }
                        }else{
                            error = "La altura debe ser un numero entre 50 y 300";
                            componenteError = altura_Field;
                        }
                    }else{
                        error = "El peso debe ser un numero entre 20 y 200";
                        componenteError = peso_Field;
                    }
                }else{
                    error = "La edad debe ser un numero entre 3 y 110";
                    componenteError = edad_Field;
                }
        }else{
            error = "El nombre debe contener entre 2 y 31 caracteres alfabeticos";
            componenteError = nombre_Field;
        }
        if (!error.equals("")){
            new ERROR(padre, true, error);
            componenteError.requestFocus();
        }
    }//GEN-LAST:event_calcular_ButtonActionPerformed

    public boolean comprobarGenero()
    {
        boolean error = false;
        for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) 
                genero = button.getText();
        }
        if(genero == null)
        {
            int result = JOptionPane.showConfirmDialog(padre,"Quieres dejar el género en blanco?", "Confirmar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                genero = "Desconocido";
            }else if (result == JOptionPane.NO_OPTION){    
                hombre_RadioButton.requestFocus();
                error = true;
            }
        }      
        return error;
    }
    
    public boolean comprobarNumero(String numero, int min, int max)
    {
        boolean error = false;
        Double num = 0.0;
        try{
            num = Double.parseDouble(numero);
        }catch(Exception e){
            error = true;
        }
        if(num < min || num > max){
            error = true;
        }
        return error;
    }
    
    public boolean comprobarNombre(String nombre)
    {
        return (!nombre_Field.getText().matches("[\\p{L}\\s]{2,31}"));         
    }
        
    private void guardar_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_ButtonActionPerformed
        
        if(!cambio)
        {
            Cliente nuevoRegistro = new Cliente(nombre_Field.getText(),genero,estado,fechaHora(),Integer.parseInt(peso_Field.getText()),Integer.parseInt(altura_Field.getText()),this.IMC,this.estado);     
            Principal.tabla.registros.add(nuevoRegistro);
            new CONFIRMACION(padre,true);
            limpiar();
        }
        else
        {
            new ERROR(padre, true, "Se ha cambiado el valor de un campo. Volver a calcular");
            guardar_Button.setEnabled(false);             
        }      
    }//GEN-LAST:event_guardar_ButtonActionPerformed

    private void limpiar()
    {
        nombre_Field.setText("");
        altura_Field.setText("");
        edad_Field.setText("");
        peso_Field.setText("");
        info_Label.setText("");
        pesoResult_Label.setText("");
        imcResult_Label.setText("");
        IMC = 0;
        estado = "";
        genero = null;
        mostrarFoto_CheckBox.setSelected(false);
        hombre_RadioButton.setSelected(false);
        mujer_RadioButton.setSelected(false);
        guardar_Button.setEnabled(false);
        foto_Label.setIcon(null);
       
    }
    
    private void crearListeners()    
    {
        for(int i = 0; i < componentes.length; i++)
        {
            componentes[i].addKeyListener(new java.awt.event.KeyListener() {
                public void keyTyped(KeyEvent e) {
                    cambio = true;                    
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    cambio = true;
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    
                }
            });
            System.out.println(i);
        }
    }

    private void crearArrayComponentes()
    {
        componentes = new Component[6];
        componentes[0] = nombre_Field;
        componentes[1] = hombre_RadioButton;
        componentes[2] = mujer_RadioButton;
        componentes[3] = edad_Field;
        componentes[4] = peso_Field;
        componentes[5] = altura_Field;        
    }
           
    
    private void mostrarFoto_CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarFoto_CheckBoxActionPerformed
        foto_Label.setVisible(mostrarFoto_CheckBox.isSelected());
    }//GEN-LAST:event_mostrarFoto_CheckBoxActionPerformed

    private void foto_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto_LabelMouseEntered
              
        switch(estado)
        {
            case "Delgadez":
                info_Label.setText("Tu IMC es criticamente bajo."); break;
            case "Normal":
                info_Label.setText("Tu IMC es adecuado."); break;
            case "Sobrepeso":
                info_Label.setText("Tu IMC es moderadamente alto."); break;
            case "Obesidad":
                info_Label.setText("Tu IMC es criticamente alto."); break;
        }
        
    }//GEN-LAST:event_foto_LabelMouseEntered

    private void foto_LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foto_LabelMouseExited
        info_Label.setText("");
    }//GEN-LAST:event_foto_LabelMouseExited

    private void setImagen(String estado)
    {
        String imagen = "";
        
        switch(estado)
        {
            case "Delgadez":
                imagen = "/Images/flaco.png"; break;
            case "Normal":
                imagen = "/Images/normal.png"; break;
            case "Sobrepeso":
                imagen = "/Images/gordo.png"; break;
            case "Obesidad":
                imagen = "/Images/obeso.png"; break;
        }
        
        foto_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagen)));
        foto_Label.setVisible(mostrarFoto_CheckBox.isSelected());
    }
    
    private String calcularGrupoEdad(int edad)
    {
        String grupoEdad = "";
    
        if(edad < 16)
            grupoEdad = "Nino";
        else if(edad < 26)
            grupoEdad = "Joven";
        else if(edad < 66)
            grupoEdad = "Adulto";
        else 
            grupoEdad = "Mayor"; 
        
        
        return grupoEdad;
    }
    
    public String fechaHora()
    {
        LocalDateTime now = LocalDateTime.now();    
        return now.toString();
    }
    
    private double calcularIMC(double peso, double altura)
    {
        return Math.round(peso/Math.pow((altura/100),2)* 100.0)/100.0;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura_Field;
    private javax.swing.JLabel altura_Label;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcular_Button;
    private javax.swing.JTextField edad_Field;
    private javax.swing.JLabel edad_Label;
    private javax.swing.JLabel foto_Label;
    private javax.swing.JLabel genero_Label;
    private javax.swing.JButton guardar_Button;
    private javax.swing.JRadioButton hombre_RadioButton;
    private javax.swing.JLabel imcResult_Label;
    private javax.swing.JLabel info_Label;
    private javax.swing.JCheckBox mostrarFoto_CheckBox;
    private javax.swing.JLabel mostrarFoto_Label;
    private javax.swing.JRadioButton mujer_RadioButton;
    private javax.swing.JTextField nombre_Field;
    private javax.swing.JLabel nombre_Label;
    private javax.swing.JLabel pesoResult_Label;
    private javax.swing.JTextField peso_Field;
    private javax.swing.JLabel peso_Label;
    private javax.swing.JButton volver_Button;
    // End of variables declaration//GEN-END:variables
}