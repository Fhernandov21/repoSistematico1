/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.uni.edu.programacion.Controllers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ni.edu.uni.programacion.backend.dao.implementation.JsonVehicleDaoImpl;
import ni.edu.uni.programacion.backend.pojo.Vehicle;
import ni.edu.uni.programacion.backend.pojo.VehicleSubModel;
import ni.uni.edu.programacion.views.panels.rPnlVehicle;

/**
 *
 * @author fherv
 */
public class rPnlVehicleController {
    private rPnlVehicle rpnlVehicle;
    private JsonVehicleDaoImpl jvdao;
    private DefaultTableModel dtm;  
    List<Vehicle> v = new ArrayList<Vehicle>();
    public rPnlVehicleController(rPnlVehicle rpnlVehicle) throws FileNotFoundException {
        this.rpnlVehicle = rpnlVehicle;
        initComponent();
    }
    
    public void initComponent() throws FileNotFoundException{
        dtm = (DefaultTableModel) rpnlVehicle.getTableVehicles().getModel();
        jvdao = new JsonVehicleDaoImpl();
        rpnlVehicle.getBtnGetAll().addActionListener((e)->{
            try {
                btnViewActionListener(e);
            } catch (IOException ex) {
                Logger.getLogger(rPnlVehicleController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
//        rpnlVehicle.getBtnDelete().addActionListener((e)->{
//            try {
//                btnDeleteActionListener(e);
//            } catch (IOException ex) {
//                Logger.getLogger(rPnlVehicleController.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        });
        
    } 
    

    private void btnDeleteActionListener(ActionEvent e) throws IOException{
//        Vehicle v = new Vehicle();
//        int id;
//        id = rpnlVehicle.getTableVehicles().getSelectedRow()+1;
//        v = jvdao.findById(id);
//
//        if(v!=null){
//          jvdao.delete(v);  
//          dtm.removeRow(id);
//            JOptionPane.showMessageDialog(null, "Eliminado exitosamente");
//
//            return;
//        }
//        
//        JOptionPane.showMessageDialog(null, "No es posible eliminar");
//        
//        
    }
    private void btnViewActionListener(ActionEvent e) throws IOException {                                        
        v = (List<Vehicle>) jvdao.getAll();
        
        for(int i=0; i<v.size(); i++){
            
            
            
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getStockNumber(), i, 0);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getYear(), i, 1);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getMake(), i, 2);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getModel(), i, 3);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getStyle(), i, 4);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getVin(), i, 5);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getExteriorColor(), i, 6);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getInteriorColor(), i, 7);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getMiles(), i, 8);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getPrice(), i, 9);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getTransmission().toString(), i, 10);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getEngine(), i, 11);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getImage(), i, 12);
            rpnlVehicle.getTableVehicles().setValueAt(null, i, 13);
            
            
        }
        rpnlVehicle.getBtnGetAll().setText("Mostrar todo");
    }
}
