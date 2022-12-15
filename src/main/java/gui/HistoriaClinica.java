package gui;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.Consulta;
import logica.Usuario;

public class HistoriaClinica extends javax.swing.JFrame {

    Consulta paciente;
    List<Consulta> historiaClinica;
    String nombrePaciente;
    Usuario usuarioMedico;

    public HistoriaClinica(List<Consulta> historiaClinica, Consulta paciente, Usuario usuarioMedico) {
        this.historiaClinica = historiaClinica;
        this.nombrePaciente = paciente.getPaciente().getNombre() + " " + paciente.getPaciente().getApellido();

        this.usuarioMedico = usuarioMedico;
        initComponents();
        labelPaciente.setText("Paciente: " + nombrePaciente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDiagnostico = new javax.swing.JButton();
        labelPaciente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistoriaClinica = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnDiagnostico.setText("Escribir Diagnóstico");
        btnDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosticoActionPerformed(evt);
            }
        });

        labelPaciente.setText("Paciente:");

        tablaHistoriaClinica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaHistoriaClinica);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(labelPaciente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDiagnostico))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDiagnostico)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
        labelPaciente.setText("Paciente: " + nombrePaciente);
    }//GEN-LAST:event_formWindowOpened

    private void btnDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosticoActionPerformed
        // Cuando escribo diagnóstico y lo guardo recargar la tabla
        if (tablaHistoriaClinica.getRowCount() > 0) {
            if (tablaHistoriaClinica.getSelectedRow() != -1) {
                /*
                this.dniPaciente = Integer.parseInt(
                        String.valueOf(tablaHistoriaClinica.getValueAt(
                                tablaHistoriaClinica.getSelectedRow(), 0)));
                ctrlPacientes.getHistoriaClinica(dniPaciente);*/

                Diagnostico vistaDiagnostico = new Diagnostico(paciente, usuarioMedico);
                vistaDiagnostico.setVisible(true);
                vistaDiagnostico.setLocationRelativeTo(null);
            }
        }
        cargarTabla();
    }//GEN-LAST:event_btnDiagnosticoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnostico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelPaciente;
    private javax.swing.JTable tablaHistoriaClinica;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            //Definimos que en nuestro modelo de tabla las filas y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        //Establecemos los nombres de las columnas
        String titulos[] = {"dni", "Nombre", "Apellido", "Edad", "Fecha Consulta", "Diagnóstico"};
        modeloTabla.setColumnIdentifiers(titulos);

        //Carga de los datos desde la base de datos
        //Recorremos la lista y mostramos cada elemento
        if (historiaClinica != null) {
            for (Consulta consulta : historiaClinica) {
                if (consulta != null) {
                    Object[] objeto = {consulta.getPaciente().getDni(),
                        consulta.getPaciente().getNombre(),
                        consulta.getPaciente().getApellido(),
                        consulta.getPaciente().getFechaNacimiento(),
                        consulta.getDiaConsulta(),
                        consulta.getDiagnostico()
                    };
                    modeloTabla.addRow(objeto);

                }
            }
        }
        //Asigno los valores en la tabla:
        tablaHistoriaClinica.setModel(modeloTabla);
    }
}
