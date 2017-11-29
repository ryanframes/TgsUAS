/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgsUas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MOZART-PC
 */
public class laporan_Inventory extends javax.swing.JInternalFrame {
    clsMainFunction cls = new clsMainFunction();
    clsConnection oConn = new clsConnection();
    /**
     * Creates new form laporanInventory
     */
    public laporan_Inventory() {
        initComponents();
        Date date=new Date();
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-M-dd");
        txtDari.setText(parser.format(date));
        txtSampai.setText(parser.format(date));
        cmdDisplay.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cmdDisplay = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDari = new javax.swing.JFormattedTextField();
        txtSampai = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmdClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaporan = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        bg.setBackground(new java.awt.Color(27, 161, 226));

        jPanel4.setBackground(new java.awt.Color(27, 161, 226));
        jPanel4.setPreferredSize(new java.awt.Dimension(639, 100));

        cmdDisplay.setBackground(new java.awt.Color(255, 255, 255));
        cmdDisplay.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cmdDisplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tgsUas/Img/search.png"))); // NOI18N
        cmdDisplay.setText("Tampilkan Data");
        cmdDisplay.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        cmdDisplay.setContentAreaFilled(false);
        cmdDisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmdDisplay.setMaximumSize(new java.awt.Dimension(87, 21));
        cmdDisplay.setMinimumSize(new java.awt.Dimension(87, 21));
        cmdDisplay.setOpaque(true);
        cmdDisplay.setPreferredSize(new java.awt.Dimension(87, 21));
        cmdDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmdDisplayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmdDisplayMouseExited(evt);
            }
        });
        cmdDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDisplayActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Cari Laporan berdasarkan periode. Format tanggal yyyy-mm-dd. Contoh : 2017-01-31");

        try {
            txtDari.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDari.setToolTipText("");
        txtDari.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        try {
            txtSampai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSampai.setText("");
        txtSampai.setToolTipText("");
        txtSampai.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jLabel2.setText("Dari");

        jLabel3.setText("Sampai");

        jLabel8.setBackground(new java.awt.Color(27, 161, 226));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Laporan Inventory");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(13, 13, 13)
                                .addComponent(txtDari, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSampai, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(0, 350, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(803, 50));

        cmdClose.setBackground(new java.awt.Color(255, 255, 255));
        cmdClose.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tgsUas/Img/Close_16.png"))); // NOI18N
        cmdClose.setText("Keluar");
        cmdClose.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        cmdClose.setContentAreaFilled(false);
        cmdClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmdClose.setMaximumSize(new java.awt.Dimension(87, 27));
        cmdClose.setMinimumSize(new java.awt.Dimension(87, 27));
        cmdClose.setPreferredSize(new java.awt.Dimension(87, 27));
        cmdClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmdCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmdCloseMouseExited(evt);
            }
        });
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblLaporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblLaporan);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdDisplayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdDisplayMouseEntered
        // TODO add your handling code here:
        cmdDisplay.setBackground(new Color(183, 207, 247));
    }//GEN-LAST:event_cmdDisplayMouseEntered

    private void cmdDisplayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdDisplayMouseExited
        // TODO add your handling code here:
        cmdDisplay.setBackground(Color.white);
    }//GEN-LAST:event_cmdDisplayMouseExited

    
    private void cmdDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDisplayActionPerformed
        try {
            
            // TODO add your handling code here:
            String str="select barang_kode as 'Kode Barang', barang_nama as 'Nama Barang', "
                    + "no_rak as 'No. Rak', beg as 'Qty Awal', in_qty as 'Qty Masuk', out_qty as 'Qty Keluar', "
                    + "ifnull(beg,0) + ifnull(in_qty,0) + ifnull(out_qty,0) as 'Qty Akhir' from t_barang brg left join "
                    + "(select barang_kode as kode, sum(inv_qty) as beg from t_inventory "
                    + "where inv_tgl < '"+ txtDari.getText() +" 00:00:00') beg on barang_kode = kode "
                    + "LEFT JOIN (select barang_kode as kode, sum(inv_qty) as in_qty from t_inventory where "
                    + "inv_tgl between '"+ txtDari.getText() +" 00:00:00' and '"+ txtSampai.getText() +" 00:00:00' "
                    + "and inv_qty > 0) inv_in on barang_kode = inv_in.kode LEFT JOIN ("
                    + "select barang_kode as kode, sum(inv_qty) as out_qty from t_inventory where "
                    + "inv_tgl between '"+ txtDari.getText() +" 00:00:00' and '"+ txtSampai.getText() +" 00:00:00' and inv_qty < 0"
                    + ") inv_out on barang_kode = inv_in.kode";
            cls.showTblGrid(tblLaporan, str);
            tblLaporan.setEditingColumn(0);
            tblLaporan.setEditingRow(0);
        } catch (SQLException ex) {
            cls.showMsg(ex.getMessage(), "Error", 0);
        }
    }//GEN-LAST:event_cmdDisplayActionPerformed

    private void cmdCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdCloseMouseEntered
        // TODO add your handling code here:
        cls.HoverButton(cmdClose);
    }//GEN-LAST:event_cmdCloseMouseEntered

    private void cmdCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdCloseMouseExited
        // TODO add your handling code here:
        cls.ExitButton(cmdClose);
    }//GEN-LAST:event_cmdCloseMouseExited

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmdCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdDisplay;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLaporan;
    private javax.swing.JFormattedTextField txtDari;
    private javax.swing.JFormattedTextField txtSampai;
    // End of variables declaration//GEN-END:variables
}
