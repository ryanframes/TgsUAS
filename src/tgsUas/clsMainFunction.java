/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsUas;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZSOFT_DEV
 */
public class clsMainFunction {
    
    public void showMsg(String msg, String msgTitle, int msgType) {
        /*0=Error, 1=Info msg, 2 = exclamation, 3=question*/
        JOptionPane.showMessageDialog(null, msg, msgTitle, msgType);
    }
    
    public void HoverButton2(JButton obj) {
        obj.setBackground(new Color(183, 207, 247));
    }
    
    public void ExitButton2(JButton obj) {
        obj.setBackground(Color.white);
    }
    public void HoverButton(JButton obj) {
        obj.setBackground(new Color(234, 236, 239));
        obj.setOpaque(true);
    }
    
    public void ExitButton(JButton obj) {
        obj.setOpaque(false);
    }
    
    public void showCombo(JComboBox cmb,String sql) {
        //fill combo box with col index = 1
        clsConnection oConn = new clsConnection();
        try {
            cmb.removeAllItems();
            cmb.addItem("-Pilih-");
            ResultSet rs=oConn.getData(sql);
            while (rs.next()) {
                cmb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsMainFunction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public void showTblGrid(JTable obj, String sql) throws SQLException {
        clsConnection oConn = new clsConnection();
        DefaultTableModel modTbl = new DefaultTableModel();
        
        ResultSet rs=oConn.getData(sql);
        ResultSetMetaData metaData=rs.getMetaData();
        
        // names of columns
        Vector<String> colNames = new Vector<String>();
        int colCount = metaData.getColumnCount();
        for (int i = 1; i <= colCount; i++) {
            colNames.add(metaData.getColumnLabel(i));
        }
        modTbl.setColumnIdentifiers(colNames);
        
        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> rowData = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= colCount; columnIndex++) {
                rowData.add(rs.getObject(columnIndex));
            }
            modTbl.addRow(rowData);
        }
        obj.setModel(modTbl);
    }
}
