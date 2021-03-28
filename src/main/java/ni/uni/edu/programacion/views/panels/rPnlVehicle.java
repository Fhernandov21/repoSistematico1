/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.views.panels;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author fherv
 */
public class rPnlVehicle extends javax.swing.JPanel {

    /**
     * Creates new form rPnlVehicle
     */
    public rPnlVehicle() {
        initComponents();
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public JButton getBtnGetAll() {
        return btnGetAll;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public JTable getTableVehicles() {
        return tableVehicles;
    }

    public void setTableVehicles(JTable tableVehicles) {
        this.tableVehicles = tableVehicles;
    }

    public JTextField getTxtSearch() {
        return txtSearch;
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
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVehicles = new javax.swing.JTable();
        btnGetAll = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        txtSearch.setPreferredSize(new java.awt.Dimension(250, 19));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        jPanel1.add(txtSearch);

        btnSearch.setText("Buscar");
        jPanel1.add(btnSearch);

        btnDelete.setText("Borrar");
        jPanel1.add(btnDelete);

        btnUpdate.setText("Actualizar");
        jPanel1.add(btnUpdate);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        tableVehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "StockNumber", "Year", "Make", "Model", "Style", "VIN", "Exterior Color", "Interior Color", "Miles", "Price", "Transmission", "Engine", "Image (Path)", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableVehicles);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        btnGetAll.setBackground(new java.awt.Color(255, 255, 255));
        btnGetAll.setForeground(new java.awt.Color(51, 0, 255));
        btnGetAll.setText("Mostrar todo");
        btnGetAll.setPreferredSize(new java.awt.Dimension(91, 100));
        jPanel2.add(btnGetAll, java.awt.BorderLayout.PAGE_END);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetAll;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVehicles;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
