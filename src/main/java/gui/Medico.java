package gui;

import controladores.ControladorConsulta;
import controladores.ControladorPersona;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Consulta;
import logica.Usuario;

public class Medico extends javax.swing.JFrame {

    ControladorPersona ctrlPacientes = null;
    ControladorConsulta ctrlConsultas = null;
    List<Consulta> listaPacientes;
    Usuario usuarioMedico;
    ArrayList<Consulta> consultasMedico;
    ArrayList<Consulta> historiaClinica;

    public Medico(Usuario usuarioMedico) {
        ctrlPacientes = new ControladorPersona();
        ctrlConsultas = new ControladorConsulta();
        this.usuarioMedico = usuarioMedico;
        listaPacientes = ctrlConsultas.getConsultas();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHistoriaClinica = new javax.swing.JButton();
        btnDiagnostico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnHistoriaClinica.setText("Ver Historia Clínica");
        btnHistoriaClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoriaClinicaActionPerformed(evt);
            }
        });

        btnDiagnostico.setText("Escribir Diagnóstico");
        btnDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagnosticoActionPerformed(evt);
            }
        });

        jLabel1.setText("Pacientes");

        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPacientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHistoriaClinica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDiagnostico))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHistoriaClinica)
                    .addComponent(btnDiagnostico))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel6.setText("CLÍNICA DE LOS COMECHINGONES");

        btnSalir.setText("SALIR");
        btnSalir.setPreferredSize(new java.awt.Dimension(125, 70));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistoriaClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoriaClinicaActionPerformed
        // TODO add your handling code here:
        if (tablaPacientes.getSelectedRow() != -1) {
            Consulta consultaActual = null;
            historiaClinica = new ArrayList<Consulta>();
            if (listaPacientes != null) {
                for (Consulta consultaPaciente : listaPacientes) {
                    if (consultaPaciente.getMedico().getDni() == usuarioMedico.getPersona().getDni()
                            && consultaPaciente.getDiagnostico() != null) {
                        consultaActual = consultaPaciente;
                        historiaClinica.add(consultaPaciente);
                        Object[] objeto = {consultaPaciente.getPaciente().getDni(),
                            consultaPaciente.getPaciente().getNombre(),
                            consultaPaciente.getPaciente().getApellido(),
                            consultaPaciente.getPaciente().getFechaNacimiento(),
                            consultaPaciente.getDiaConsulta(),
                            consultaPaciente.getHorarioConsulta()
                        };
                    } else {
                        consultaActual = consultaPaciente;
                    }
                }
                if (historiaClinica != null) {
                    HistoriaClinica vistaHistoriaClinica = new HistoriaClinica(historiaClinica, consultaActual, usuarioMedico);
                    vistaHistoriaClinica.setVisible(true);
                    vistaHistoriaClinica.setLocationRelativeTo(null);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog((Component) null, "Aún no se ha atendido a este paciente");
                }
            }
        } else {
            JOptionPane.showMessageDialog((Component) null, "Seleccione un paciente por favor");
        }
    }//GEN-LAST:event_btnHistoriaClinicaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        Login vistaLogin = new Login();
        vistaLogin.setVisible(true);
        vistaLogin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagnosticoActionPerformed
        // Cuando escribo diagnóstico y lo guardo recargar la tabla
        if (tablaPacientes.getRowCount() > 0) {
            if (tablaPacientes.getSelectedRow() != -1) {
                Consulta consultaActual = consultasMedico.get(tablaPacientes.getSelectedRow());
                /*
                dniPaciente = Integer.parseInt(
                        String.valueOf(tablaPacientes.getValueAt(
                                tablaPacientes.getSelectedRow(), 0)));
                ctrlPacientes.getHistoriaClinica(dniPaciente);
                nombrePaciente = String.valueOf(tablaPacientes.getValueAt(
                                tablaPacientes.getSelectedRow(), 1)) + " " +
                        String.valueOf(tablaPacientes.getValueAt(
                                tablaPacientes.getSelectedRow(), 2));
                 */

                Diagnostico vistaDiagnostico = new Diagnostico(consultaActual, usuarioMedico);
                vistaDiagnostico.setVisible(true);
                vistaDiagnostico.setLocationRelativeTo(null);
                this.dispose();
            }
        }
        cargarTabla();
    }//GEN-LAST:event_btnDiagnosticoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiagnostico;
    private javax.swing.JButton btnHistoriaClinica;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPacientes;
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
        String titulos[] = {"dni", "Nombre", "Apellido", "Fecha de Nacimiento", "Fecha Consulta", "Horario"};
        modeloTabla.setColumnIdentifiers(titulos);

        //Carga de los datos desde la base de datos
        //Acá tengo que buscar los pacientes que tengan consulta sin diagnóstico
        //Recorremos la lista y mostramos cada elemento
        if (listaPacientes != null) {
            consultasMedico = new ArrayList<Consulta>();
            for (Consulta consultaPaciente : listaPacientes) {
                if (consultaPaciente.getMedico().getDni() == usuarioMedico.getPersona().getDni()
                        && consultaPaciente.getDiagnostico() == null) {
                    consultasMedico.add(consultaPaciente);
                    Object[] objeto = {consultaPaciente.getPaciente().getDni(),
                        consultaPaciente.getPaciente().getNombre(),
                        consultaPaciente.getPaciente().getApellido(),
                        consultaPaciente.getPaciente().getFechaNacimiento(),
                        consultaPaciente.getDiaConsulta(),
                        consultaPaciente.getHorarioConsulta()
                    };
                    modeloTabla.addRow(objeto);
                }
            }
        }
        //Asigno los valores en la tabla:
        tablaPacientes.setModel(modeloTabla);
    }
}
