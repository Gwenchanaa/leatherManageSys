/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.*;
import java.net.URL;
import model.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class AdminUser extends javax.swing.JFrame {

    int mousexP, mouseyP;
    public AdminUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        HeadBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        UserID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        UserPassword = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        UserName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        MinusButton = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JLabel();
        AddButton = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(234, 252, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(198, 249, 249));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-menu-33.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addContainerGap(437, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 490));

        HeadBar.setBackground(new java.awt.Color(255, 255, 255));
        HeadBar.setPreferredSize(new java.awt.Dimension(762, 75));
        HeadBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeadBarMouseDragged(evt);
            }
        });
        HeadBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeadBarMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel2.setText("ADMIN1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Administrator Male_1.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Serif", 1, 8)); // NOI18N
        jLabel15.setText(" HANDCRAFTED LEATHER");

        jLabel17.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        jLabel17.setText("Quản lí người dùng");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lotus26px.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 102, 51));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.png"))); // NOI18N
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeadBarLayout = new javax.swing.GroupLayout(HeadBar);
        HeadBar.setLayout(HeadBarLayout);
        HeadBarLayout.setHorizontalGroup(
            HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(HeadBarLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)))
                .addGap(167, 167, 167)
                .addComponent(jLabel17)
                .addGap(91, 91, 91)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jLabel10)
                .addGap(94, 94, 94))
        );
        HeadBarLayout.setVerticalGroup(
            HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(33, 33, 33))
            .addGroup(HeadBarLayout.createSequentialGroup()
                .addGroup(HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel10)
                    .addGroup(HeadBarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(HeadBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(HeadBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 60));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel9.setText("Mã đăng nhập");

        UserID.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        UserID.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel13.setText("Mật khẩu");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        UserPassword.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        UserPassword.setBorder(null);

        jLabel14.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        jLabel14.setText("Tên người đăng nhập");

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        UserName.setFont(new java.awt.Font("Segoe UI Light", 2, 14)); // NOI18N
        UserName.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 220, 290));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "Mật khẩu", "Họ Và Tên"
            }
        ));
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 430, 320));

        jPanel8.setBackground(new java.awt.Color(234, 252, 252));

        MinusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalMinus.png"))); // NOI18N
        MinusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinusButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinusButtonminusEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinusButtonminusNormal(evt);
            }
        });

        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalUpdate.png"))); // NOI18N
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateButtonupdateEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateButtonupdateNormal(evt);
            }
        });

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BarTool_NormalAdd.png"))); // NOI18N
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButtonplusEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButtonplusNormal(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(UpdateButton)
                .addGap(48, 48, 48)
                .addComponent(MinusButton))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AddButton)
                        .addComponent(MinusButton))
                    .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void home(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home
        AdminHome a = new AdminHome();
        a.setVisible(true);
        int x1 = this.getX(), y1 = this.getY();
        a.setPositionForWin(x1, y1);
        dispose();
    }//GEN-LAST:event_home

    private void MinusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusButtonMouseClicked
        String id = UserID.getText();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Do not leave id blank !!!", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else {
            User c1 = new User(id);
            UserDAO.getInstance().delete(c1);
        }
        showData();
    }//GEN-LAST:event_MinusButtonMouseClicked

    private void MinusButtonminusEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusButtonminusEnter
        URL iconURL = getClass().getResource("/icon/BarTool_EnterMinus.png");
        ImageIcon img = new ImageIcon(iconURL);
        MinusButton.setIcon(img);
    }//GEN-LAST:event_MinusButtonminusEnter

    private void MinusButtonminusNormal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinusButtonminusNormal
        URL iconURL = getClass().getResource("/icon/BarTool_NormalMinus.png");
        ImageIcon img = new ImageIcon(iconURL);
        MinusButton.setIcon(img);
    }//GEN-LAST:event_MinusButtonminusNormal

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
        String id = UserID.getText();
        String password = UserPassword.getText();
        String name = UserName.getText();

        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Do not leave id blank !!!", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else {
            User c1 = new User(id,password,name);
            UserDAO.getInstance().update(c1);
        }
        showData();
    }//GEN-LAST:event_UpdateButtonMouseClicked

    private void UpdateButtonupdateEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonupdateEnter
        URL iconURL = getClass().getResource("/icon/BarTool_EnterUpdate.png");
        ImageIcon img = new ImageIcon(iconURL);
        UpdateButton.setIcon(img);
    }//GEN-LAST:event_UpdateButtonupdateEnter

    private void UpdateButtonupdateNormal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonupdateNormal
        URL iconURL = getClass().getResource("/icon/BarTool_NormalUpdate.png");
        ImageIcon img = new ImageIcon(iconURL);
        UpdateButton.setIcon(img);
    }//GEN-LAST:event_UpdateButtonupdateNormal

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        String id = UserID.getText();
        String password = UserPassword.getText();
        String name = UserName.getText();
        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Do not leave id blank !!!", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Do not leave password blank !!!", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        } else if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Do not leave user name blank !!!", "WRONG INPUT", JOptionPane.WARNING_MESSAGE);
        }
        else {
            User c1 = new User(id,password,name);
            UserDAO.getInstance().add(c1);
        }
        showData();
    }//GEN-LAST:event_AddButtonMouseClicked

    private void AddButtonplusEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonplusEnter
        URL iconURL = getClass().getResource("/icon/BarTool_EnterAdd.png");
        ImageIcon img = new ImageIcon(iconURL);
        AddButton.setIcon(img);
    }//GEN-LAST:event_AddButtonplusEnter

    private void AddButtonplusNormal(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonplusNormal
        URL iconURL = getClass().getResource("/icon/BarTool_NormalAdd.png");
        ImageIcon img = new ImageIcon(iconURL);
        AddButton.setIcon(img);
    }//GEN-LAST:event_AddButtonplusNormal

    private void HeadBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadBarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-mousexP, y-mouseyP);
    }//GEN-LAST:event_HeadBarMouseDragged

    private void HeadBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadBarMousePressed
        mousexP = evt.getX();
        mouseyP = evt.getY();
    }//GEN-LAST:event_HeadBarMousePressed
    public void showData(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rows = model.getRowCount();
        
        for( int i =  rows - 1; i >= 0; i--){
            model.removeRow(i);
        }
        UserDAO.getInstance().selectAll(jTable1);
    }
    public void setPositionForWin(int x, int y) {                                            
        this.setLocation(x, y);
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminUser a = new AdminUser();
                a.setVisible(true);
                a.showData();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddButton;
    private javax.swing.JPanel HeadBar;
    private javax.swing.JLabel MinusButton;
    private javax.swing.JLabel UpdateButton;
    private javax.swing.JTextField UserID;
    private javax.swing.JTextField UserName;
    private javax.swing.JTextField UserPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
