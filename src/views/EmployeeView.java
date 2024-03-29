/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.DepartmentController;
import controllers.EmployeeController;
import controllers.JobController;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Employee;

/**
 *
 * @author DELL
 */
public class EmployeeView extends javax.swing.JInternalFrame {

    /**
     * Creates new form EmployeeView
     */
    EmployeeController employeeController = new EmployeeController();
    JobController jobController = new JobController();
    DepartmentController departmentController = new DepartmentController();

    public EmployeeView() {
        initComponents();
        bindingTabel();
        cmbManager();
        cmbDepartment();
        cmbJob();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtComm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbManager = new javax.swing.JComboBox<>();
        cmbDepartmen = new javax.swing.JComboBox<>();
        cmbJob = new javax.swing.JComboBox<>();
        txtHire = new com.toedter.calendar.JDateChooser();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 204, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Employee");

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblEmployeeMousePressed(evt);
            }
        });
        tblEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblEmployeeKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N

        jLabel1.setText("ID");

        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMouseClicked(evt);
            }
        });

        jLabel2.setText("First Name");

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name");

        jLabel4.setText("Email");

        jLabel5.setText("Phone Number");

        jLabel6.setText("Hire Date");

        jLabel7.setText("Job Id");

        jLabel8.setText("Salary");

        jLabel9.setText("Commission PCT");

        jLabel10.setText("Manager ");

        jLabel11.setText("Department");

        cmbManager.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Choose--" }));
        cmbManager.setToolTipText("");
        cmbManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbManagerActionPerformed(evt);
            }
        });

        cmbDepartmen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Choose--" }));

        cmbJob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Choose--" }));
        cmbJob.setToolTipText("");
        cmbJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJobActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComm)
                    .addComponent(cmbJob, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHire, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txtLName)
                    .addComponent(cmbDepartmen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSalary)
                            .addComponent(txtPhone)
                            .addComponent(cmbManager, 0, 139, Short.MAX_VALUE))))
                .addGap(88, 88, 88))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addGap(73, 73, 73))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtHire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(cmbJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cmbManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbDepartmen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        EmployeeController employeeController = new EmployeeController();
        String key = txtSearch.getText();
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(
                new String[]{
                    "ID", "First Name", "Last Name", "Email", "Phone Number",
                    "Hire Date", "Job Name", "Slary", "Commission_pct",
                    "Manager Name", "Department Name"
                }
        );
        for (Employee r : employeeController.search(key)) {
            Object[] os = new Object[11];
            os[0] = r.getId();
            os[1] = r.getFirstname();
            os[2] = r.getLastname();
            os[3] = r.getEmail();
            os[4] = r.getPhone();
            os[5] = r.getHire();
            os[6] = r.getJob().getTitle();
            os[7] = r.getSalary();
            os[8] = r.getCommission();
            os[9] = r.getManager().getFirstname();
            os[10] = r.getDepartment().getName();

            tableModel.addRow(os);

        }
        tblEmployee.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblEmployee.setModel(tableModel);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
        String firstName = txtFName.getText();
        String lastName = txtLName.getText();
        String email = txtEmail.getText();
        String phone = txtPhone.getText();
        String jenis = "yyyy-MM-dd";
            SimpleDateFormat dm =new SimpleDateFormat(jenis);
            String tgl = String.valueOf(dm.format(txtHire.getDate()));
        JOptionPane.showMessageDialog(this,tgl);
        String jobId = jobController.selectByName(cmbJob.getSelectedItem().toString()).getId();
        String salary = txtSalary.getText();
        String commision = txtComm.getText();
        String man_name = cmbManager.getSelectedItem().toString();
        int manId = employeeController.selectByName(man_name).getId();

        String dep_name = cmbDepartmen.getSelectedItem().toString();

        int manDep = departmentController.selectByName(dep_name).getId();

        int a = employeeController.selectById(id).getId();

        if (Integer.parseInt(id) == a) {
            try {
                JOptionPane.showMessageDialog(this, employeeController.update(id, firstName, lastName, email, phone, tgl, jobId, salary, commision, Integer.toString(manId), Integer.toString(manDep)));
                reset();
            } catch (ParseException ex) {
                Logger.getLogger(EmployeeView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            try {
                JOptionPane.showMessageDialog(this, employeeController.create(id, firstName, lastName, email, phone, tgl, salary, commision, Integer.toString(manId), jobId, Integer.toString(manDep)));
                reset();
            } catch (ParseException ex) {
                Logger.getLogger(EmployeeView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        bindingTabel();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmployeeKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tblEmployeeKeyPressed
    private static Date getTanggal(JTable table, int kolom) {
        JTable tabel = table;
        String tgl = String.valueOf(table.getValueAt(tabel.getSelectedRow(), kolom));
        Date tanggal = null;
        try {
            tanggal = new SimpleDateFormat("yyyy-MM-dd").parse(tgl);
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tanggal;
    }
    private void tblEmployeeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMousePressed
        if (evt.getClickCount() == 1) {
            txtHire.setDate(getTanggal(tblEmployee, 5));
        }
        int row = tblEmployee.getSelectedRow();
        txtId.setText((String) tblEmployee.getValueAt(row, 0).toString());
        txtFName.setText((String) tblEmployee.getValueAt(row, 1));
        txtLName.setText((String) tblEmployee.getValueAt(row, 2));
        txtEmail.setText((String) tblEmployee.getValueAt(row, 3));
        txtPhone.setText((String) tblEmployee.getValueAt(row, 4));
        cmbJob.setSelectedItem((String) tblEmployee.getValueAt(row, 6).toString());
        txtSalary.setText((String) tblEmployee.getValueAt(row, 7).toString());
        txtComm.setText((String) tblEmployee.getValueAt(row, 8).toString());
        cmbManager.setSelectedItem((String) tblEmployee.getValueAt(row, 9).toString());
        cmbDepartmen.setSelectedItem((String) tblEmployee.getValueAt(row, 10).toString());
        txtId.setEnabled(false);


    }//GEN-LAST:event_tblEmployeeMousePressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, "Delete Data?", "Confirmation",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            String id = txtId.getText();
            JOptionPane.showMessageDialog(this, employeeController
                    .delete(id));
            reset();
            bindingTabel();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbManagerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbManagerActionPerformed

    private void cmbJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJobActionPerformed

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
        // TODO add your handling code here:

        txtId.setEnabled(true);
    }//GEN-LAST:event_txtIdMouseClicked
    void cmbManager() {
        for (models.Employee e : employeeController.getAll()) {
            cmbManager.addItem(e.getFirstname());

        }

    }

    void cmbDepartment() {
        for (models.Department d : departmentController.getAll()) {
            cmbDepartmen.addItem(d.getName());

        }
    }

    void cmbJob() {
        for (models.Job j : jobController.getAll()) {
            cmbJob.addItem(j.getTitle());

        }
    }

    private void bindingTabel() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(
                new String[]{
                    "ID", "First Name", "Last Name", "Email", "Phone Number",
                    "Hire Date", "Job Name", "Slary", "Commission_pct",
                    "Manager Name", "Department Name"
                }
        );
        for (Employee r : employeeController.getAll()) {
            Object[] os = new Object[11];
            os[0] = r.getId();
            os[1] = r.getFirstname();
            os[2] = r.getLastname();
            os[3] = r.getEmail();
            os[4] = r.getPhone();
            os[5] = r.getHire();
            os[6] = r.getJob().getTitle();
            os[7] = r.getSalary();
            os[8] = r.getCommission();
            os[9] = r.getManager().getFirstname();
            os[10] = r.getDepartment().getName();

            tableModel.addRow(os);

        }
        tblEmployee.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblEmployee.setModel(tableModel);
    }

    void reset() {
        txtId.setText("");
        txtFName.setText("");
        txtLName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtHire.setDate(null);
        cmbJob.setSelectedItem("");
        txtSalary.setText("");
        txtComm.setText("");
        cmbManager.setSelectedItem("");
        cmbDepartmen.setSelectedItem("");
//        lbl3.setText("");
//        lbl4.setText("");
//        lbl5.setText("");
//        lbl6.setText("");
//        lbl7.setText("");
//        lbl8.setText("");
//        lbl9.setText("");
//        lbl10.setText("");
//        lbl11.setText("");
//        lbl12.setText("");
//        lbl13.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbDepartmen;
    private javax.swing.JComboBox<String> cmbJob;
    private javax.swing.JComboBox<String> cmbManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private com.toedter.calendar.JDateChooser txtHire;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
