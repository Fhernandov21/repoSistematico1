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
    
    List<Vehicle> v = new ArrayList<Vehicle>();
    public rPnlVehicleController(rPnlVehicle rpnlVehicle) throws FileNotFoundException {
        this.rpnlVehicle = rpnlVehicle;
        initComponent();
    }
    
    public void initComponent() throws FileNotFoundException{
        jvdao = new JsonVehicleDaoImpl();
        rpnlVehicle.getBtnGetAll().addActionListener((e)->{
            try {
                btnViewActionListener(e);
            } catch (IOException ex) {
                Logger.getLogger(rPnlVehicleController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        rpnlVehicle.getBtnGetAll().setText("Mostrar todo (DATOS DISPONIBLES)");

    } 
    

    
    private void btnViewActionListener(ActionEvent e) throws IOException {                                        
        v = (List<Vehicle>) jvdao.getAll();
        
        for(int i=0; i<v.size(); i++){
            
            
            rpnlVehicle.getTableVehicles().setValueAt((i+1),i,0);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getStockNumber(), i, 1);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getYear(), i, 2);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getMake(), i, 3);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getModel(), i, 4);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getStyle(), i, 5);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getVin(), i, 6);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getExteriorColor(), i, 7);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getInteriorColor(), i, 8);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getMiles(), i, 9);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getPrice(), i, 10);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getTransmission().toString(), i, 11);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getEngine(), i, 12);
            rpnlVehicle.getTableVehicles().setValueAt(v.get(i).getImage(), i, 13);
            rpnlVehicle.getTableVehicles().setValueAt(null, i, 14);
            
            
        }
        rpnlVehicle.getBtnGetAll().setText("Mostrar todo");
    }
}
