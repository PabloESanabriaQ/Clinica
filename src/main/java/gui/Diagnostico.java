package gui;

import controladores.ControladorConsulta;
import java.awt.Component;
import javax.swing.JOptionPane;
import logica.Consulta;
import logica.Usuario;

public class Diagnostico extends javax.swing.JFrame {

    String nombrePaciente;
    Consulta consultaActual;
    ControladorConsulta ctrlConsulta = null;
    Usuario usuarioMedico;

    public Diagnostico(Consulta consulta, Usuario usuarioMedico) {
        this.nombrePaciente = consulta.getPaciente().getNombre() + " " + consulta.getPaciente().getApellido();
        this.consultaActual = consulta;
        System.out.println(consultaActual.toString());
        this.usuarioMedico = usuarioMedico;
        this.ctrlConsulta = new ControladorConsulta();
        initComponents();
        labelPaciente.setText("Paciente: " + nombrePaciente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        labelPaciente = new javax.swing.JLabel();
        btnDiagnostico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelPaciente.setText("Paciente: ");

        btnDiagnostico.setText("Guardar Diagnóstico");
        btnDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosticoActionPerformed(evt);
            }
        });

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane2.setViewportView(txtDiagnostico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDiagnostico))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPaciente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPaciente)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnDiagnostico)
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

    private void btnDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosticoActionPerformed
        consultaActual.setDiagnostico(txtDiagnostico.getText());
        ctrlConsulta.setDiagnostico(consultaActual);
        JOptionPane.showMessageDialog((Component) null, "Diagnóstico guardado correctamente");

        Medico vistaMedico = new Medico(usuarioMedico);
        vistaMedico.setVisible(true);
        vistaMedico.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDiagnosticoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnostico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelPaciente;
    private javax.swing.JTextArea txtDiagnostico;
    // End of variables declaration//GEN-END:variables
}
