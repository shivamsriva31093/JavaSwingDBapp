/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectivity.forms;

import databaseconnectivity.DbCon;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author sHIVAM
 */
public class CRUD_form extends javax.swing.JFrame {

          /**
           * Creates new form CRUD_form
           */
          public CRUD_form() {
                    
                    dbCon = new DbCon();
                    displayPopUp();
          }

          /**
           * This method is called from within the constructor to initialize the
           * form. WARNING: Do NOT modify this code. The content of this method
           * is always regenerated by the Form Editor.
           */
          @SuppressWarnings("unchecked")
          // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
          private void initComponents() {

                    buttonGroup1 = new javax.swing.ButtonGroup();
                    jPanel1 = new javax.swing.JPanel();
                    jSeparator1 = new javax.swing.JSeparator();
                    ActionTabs = new javax.swing.JTabbedPane();
                    jInternalFrame1 = new javax.swing.JInternalFrame();
                    jInternalFrame2 = new javax.swing.JInternalFrame();
                    jSeparator2 = new javax.swing.JSeparator();
                    jScrollPane1 = new javax.swing.JScrollPane();
                    jTextArea1 = new javax.swing.JTextArea();
                    jLabel3 = new javax.swing.JLabel();
                    jButton1 = new javax.swing.JButton();
                    jScrollPane2 = new javax.swing.JScrollPane();
                    jTable1 = new javax.swing.JTable();
                    jLabel1 = new javax.swing.JLabel();
                    jLabel2 = new javax.swing.JLabel();
                    dbComboBox = new javax.swing.JComboBox<>();
                    tbComboBox = new javax.swing.JComboBox<>();
                    jScrollPane3 = new javax.swing.JScrollPane();
                    log = new javax.swing.JTextArea();
                    jLabel4 = new javax.swing.JLabel();
                    jPanel2 = new javax.swing.JPanel();
                    select = new javax.swing.JRadioButton();
                    insert = new javax.swing.JRadioButton();
                    update = new javax.swing.JRadioButton();
                    delete = new javax.swing.JRadioButton();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                    jPanel1.setBackground(new java.awt.Color(204, 204, 204));

                    jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

                    jInternalFrame1.setVisible(true);

                    javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
                    jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
                    jInternalFrame1Layout.setHorizontalGroup(
                              jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGap(0, 683, Short.MAX_VALUE)
                    );
                    jInternalFrame1Layout.setVerticalGroup(
                              jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGap(0, 601, Short.MAX_VALUE)
                    );

                    ActionTabs.addTab("Selected Action", jInternalFrame1);

                    jInternalFrame2.setVisible(true);

                    jTextArea1.setColumns(20);
                    jTextArea1.setRows(5);
                    jScrollPane1.setViewportView(jTextArea1);

                    jLabel3.setText("Enter a SQL query");

                    jButton1.setText("Execute");
                    jButton1.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton1ActionPerformed(evt);
                              }
                    });

                    jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                    jScrollPane2.setViewportView(jTable1);

                    javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
                    jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
                    jInternalFrame2Layout.setHorizontalGroup(
                              jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                                                  .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                  .addComponent(jScrollPane1)
                                                  .addComponent(jSeparator2)
                                                  .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                                            .addGap(0, 0, Short.MAX_VALUE)
                                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap())
                    );
                    jInternalFrame2Layout.setVerticalGroup(
                              jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );

                    ActionTabs.addTab("Custom Query", jInternalFrame2);

                    jLabel1.setText("Database");

                    jLabel2.setText("Table");

                    dbComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(populateDbComboBox()));
                    dbComboBox.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        dbComboBoxActionPerformed(evt);
                              }
                    });

                    tbComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
                    tbComboBox.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        tbComboBoxActionPerformed(evt);
                              }
                    });

                    log.setColumns(20);
                    log.setRows(5);
                    jScrollPane3.setViewportView(log);

                    jLabel4.setText("Log");

                    buttonGroup1.add(select);
                    select.setText("Select Record");
                    select.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        selectActionPerformed(evt);
                              }
                    });

                    buttonGroup1.add(insert);
                    insert.setText("Insert Record");
                    insert.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        insertActionPerformed(evt);
                              }
                    });

                    buttonGroup1.add(update);
                    update.setText("Modify Record");
                    update.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        updateActionPerformed(evt);
                              }
                    });

                    buttonGroup1.add(delete);
                    delete.setText("Delete Record");
                    delete.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        deleteActionPerformed(evt);
                              }
                    });

                    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                    jPanel2.setLayout(jPanel2Layout);
                    jPanel2Layout.setHorizontalGroup(
                              jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(select)
                                                  .addComponent(delete)
                                                  .addComponent(insert)
                                                  .addComponent(update))
                                        .addGap(47, 47, 47))
                    );
                    jPanel2Layout.setVerticalGroup(
                              jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(select)
                                        .addGap(20, 20, 20)
                                        .addComponent(insert)
                                        .addGap(23, 23, 23)
                                        .addComponent(update)
                                        .addGap(18, 18, 18)
                                        .addComponent(delete)
                                        .addContainerGap(25, Short.MAX_VALUE))
                    );

                    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                    jPanel1.setLayout(jPanel1Layout);
                    jPanel1Layout.setHorizontalGroup(
                              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGap(16, 16, 16)
                                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18))
                                                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                      .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(16, 16, 16)
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                      .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                                .addGap(25, 25, 25)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                    .addComponent(jLabel2)
                                                                                                    .addGap(40, 40, 40)
                                                                                                    .addComponent(tbComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                    .addComponent(jLabel1)
                                                                                                    .addGap(18, 18, 18)
                                                                                                    .addComponent(dbComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                            .addGap(23, 23, 23)))
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ActionTabs)
                                        .addContainerGap())
                    );
                    jPanel1Layout.setVerticalGroup(
                              jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(ActionTabs, javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addContainerGap())
                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                      .addComponent(jLabel1)
                                                                      .addComponent(dbComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                      .addComponent(jLabel2)
                                                                      .addComponent(tbComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(109, 109, 109)
                                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel4)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(14, 14, 14))))
                    );

                    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                    getContentPane().setLayout(layout);
                    layout.setHorizontalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                    );
                    layout.setVerticalGroup(
                              layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())
                    );

                    pack();
          }// </editor-fold>//GEN-END:initComponents

          private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                    // TODO add your handling code here:
          }//GEN-LAST:event_jButton1ActionPerformed

          private void dbComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbComboBoxActionPerformed
                    // TODO add your handling code here:
                    String db = (String)dbComboBox.getSelectedItem();
                    Connection conn = dbCon.getConnection(db, uname, pwd);
                    if(conn == null) return;
                    log.setText("Connection Successful");
                    try {
                              DatabaseMetaData dbMeta = conn.getMetaData();
                              ResultSet rs = dbMeta.getTables(null, null, "%", null);
                              int k=0;
                              while(rs.next()) {
                                        k++;
                              }
                              rs.first();
                              String[] tb = new String[k--];
                              k=0;
                              
                              while(rs.next()) {
                                        tb[k++] = rs.getString(3);
                              }
                              tbComboBox.setModel(new DefaultComboBoxModel<>(tb));
                              log.setText(log.getText()+"\n"+"Select table from below.");
                              
                    } catch (SQLException ex) {
                              Logger.getLogger(CRUD_form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
          }//GEN-LAST:event_dbComboBoxActionPerformed

          private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
                    // TODO add your handling code here:
                    setTabTitle(select.getText());
                    
          }//GEN-LAST:event_selectActionPerformed

          private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
                    // TODO add your handling code here:
                    setTabTitle(insert.getText());
          }//GEN-LAST:event_insertActionPerformed

          private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
                    // TODO add your handling code here:
                    setTabTitle(update.getText());
          }//GEN-LAST:event_updateActionPerformed

          private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
                    // TODO add your handling code here:
                    setTabTitle(delete.getText());
          }//GEN-LAST:event_deleteActionPerformed

          private void tbComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbComboBoxActionPerformed
                    // TODO add your handling code here:
                    
          }//GEN-LAST:event_tbComboBoxActionPerformed

          
          private String[] populateDbComboBox() {
                    
                    Connection conn = dbCon.getConnection("test", uname, pwd);
                    if(conn == null) return new String[] {};
                    
                    try {
                              DatabaseMetaData meta = conn.getMetaData();
                              ResultSet rs = meta.getCatalogs();
                              int k=0;
                              while(rs.next()) {k++;}
                              String[] db = new String[--k];
                              k=0;
                              rs.first();
                              
                              while(rs.next()) {
                                        db[k++] = rs.getString("TABLE_CAT");
                              }
                              log.setText("Connection Successful+"+"\n"+"Databases populated");
                              rs.close();
                              conn.close();
                              return db;
                              
                    } catch (SQLException ex) {
                              Logger.getLogger(CRUD_form.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                    return new String[]{"a", "b"};
          }
          
          private String getTableName() {
                    return tbComboBox.getSelectedItem().toString();
          }
          
          
          /**
           * @param args the command line arguments
           */
          public static void main(String args[]) {
                    /* Set the Nimbus look and feel */
                    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
                    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                     */
                    try {
                              for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                        if ("Nimbus".equals(info.getName())) {
                                                  javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                                  break;
                                        }
                              }
                    } catch (ClassNotFoundException ex) {
                              java.util.logging.Logger.getLogger(CRUD_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                              java.util.logging.Logger.getLogger(CRUD_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                              java.util.logging.Logger.getLogger(CRUD_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                              java.util.logging.Logger.getLogger(CRUD_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                              public void run() {
                                        new CRUD_form().setVisible(true);
                              }
                    });
          }

          // Variables declaration - do not modify//GEN-BEGIN:variables
          private javax.swing.JTabbedPane ActionTabs;
          private javax.swing.ButtonGroup buttonGroup1;
          private javax.swing.JComboBox<String> dbComboBox;
          private javax.swing.JRadioButton delete;
          private javax.swing.JRadioButton insert;
          private javax.swing.JButton jButton1;
          private javax.swing.JInternalFrame jInternalFrame1;
          private javax.swing.JInternalFrame jInternalFrame2;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel4;
          private javax.swing.JPanel jPanel1;
          private javax.swing.JPanel jPanel2;
          private javax.swing.JScrollPane jScrollPane1;
          private javax.swing.JScrollPane jScrollPane2;
          private javax.swing.JScrollPane jScrollPane3;
          private javax.swing.JSeparator jSeparator1;
          private javax.swing.JSeparator jSeparator2;
          private javax.swing.JTable jTable1;
          private javax.swing.JTextArea jTextArea1;
          private javax.swing.JTextArea log;
          private javax.swing.JRadioButton select;
          private javax.swing.JComboBox<String> tbComboBox;
          private javax.swing.JRadioButton update;
          // End of variables declaration//GEN-END:variables
          private String uname;
          private String pwd;
          private DbCon dbCon;
          private void setTabTitle(String text) {
                    String tb = getTableName();
                    ActionTabs.setTitleAt(0, text);
          }

          private void displayPopUp() {
                    JLabel heading = new JLabel("To access database, please fill the required details:");
                    JTextField field1 = new JTextField("");
                    JTextField field2 = new JTextField("");
                    Button button = new Button("Test connection");
                    button.addActionListener(new ActionListener() {
                              @Override
                              public void actionPerformed(ActionEvent e) {
                                       checkConnectivity(field1.getText(), field2.getText());
                              }
                    });
                    
                    JPanel panel = new JPanel(new GridLayout(0, 1));
                    panel.add(heading);
                    panel.add(new JLabel("Username"));
                    panel.add(field1);
                    panel.add(new JLabel("Password"));
                    panel.add(field2);
                    panel.add(button);
                    
                    int result = JOptionPane.showConfirmDialog(null, panel, "Test",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    switch(result) {
                              case JOptionPane.OK_OPTION:
                                        handleOkResponse(field1.getText(), field2.getText());
                                        break;
                              case JOptionPane.CANCEL_OPTION:
                                        System.exit(0);
                                        break;
                    }
          }

          private void handleOkResponse(String uname, String pwd) {
                    if(uname.isEmpty()) {
                              JOptionPane.showMessageDialog(null, "username can't be blank!");
                              displayPopUp();
                              
                    } else {
                              if(checkConnectivity(uname, pwd)) {
                                        this.uname = uname;
                                        this.pwd = pwd;
                                        initComponents();
                              } else {
                                        displayPopUp();
                              }
                    }
          }

          private boolean checkConnectivity(String uname, String pwd) {
                    Connection conn = dbCon.getConnection("test", uname, pwd);
                    if(conn != null) {
                              JOptionPane.showMessageDialog(null, "Connection successful");
                              return true;
                    }
                    return false;
          }
}
