/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Color;

/**
 *
 * @author ACER
 */
public class AdminHome extends javax.swing.JFrame {

    public AdminHome() {
        initComponents();
    }
    int MousepX, MousepY;
    private int x, y;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headBar = new javax.swing.JPanel();
        label_nameAdmin = new javax.swing.JLabel();
        label_cancel = new javax.swing.JLabel();
        label_avatar = new javax.swing.JLabel();
        label_brand = new javax.swing.JLabel();
        label_title = new javax.swing.JLabel();
        label_lotus = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        panel_product = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel_category = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel_order = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panel_customer = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel_user = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        panel_static = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(762, 538));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headBar.setBackground(new java.awt.Color(255, 255, 255));
        headBar.setPreferredSize(new java.awt.Dimension(762, 75));
        headBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headBarMouseDragged(evt);
            }
        });
        headBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headBarMousePressed(evt);
            }
        });

        label_nameAdmin.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        label_nameAdmin.setText("ADMIN1");

        label_cancel.setBackground(new java.awt.Color(255, 102, 51));
        label_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Close.png"))); // NOI18N
        label_cancel.setOpaque(true);
        label_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_cancelMouseClicked(evt);
            }
        });

        label_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Administrator Male_1.png"))); // NOI18N

        label_brand.setFont(new java.awt.Font("Serif", 1, 8)); // NOI18N
        label_brand.setText(" HANDCRAFTED LEATHER");

        label_title.setFont(new java.awt.Font("Segoe UI Light", 0, 30)); // NOI18N
        label_title.setText("Trang chủ");

        label_lotus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lotus26px.png"))); // NOI18N

        javax.swing.GroupLayout headBarLayout = new javax.swing.GroupLayout(headBar);
        headBar.setLayout(headBarLayout);
        headBarLayout.setHorizontalGroup(
            headBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_brand)
                    .addGroup(headBarLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(label_lotus)))
                .addGap(209, 209, 209)
                .addComponent(label_title)
                .addGap(162, 162, 162)
                .addComponent(label_avatar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_nameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(label_cancel)
                .addContainerGap())
        );
        headBarLayout.setVerticalGroup(
            headBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headBarLayout.createSequentialGroup()
                .addGroup(headBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label_nameAdmin)
                        .addComponent(label_avatar)
                        .addComponent(label_cancel))
                    .addComponent(label_title))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_lotus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_brand)
                .addGap(33, 33, 33))
        );

        jPanel1.add(headBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 60));

        content.setBackground(new java.awt.Color(234, 252, 252));
        content.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 70, 45));

        panel_product.setBackground(new java.awt.Color(255, 255, 255));
        panel_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToProductFrame(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enteredProduct(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedProduct(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setText("SẢN PHẨM");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pỏduct.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout panel_productLayout = new javax.swing.GroupLayout(panel_product);
        panel_product.setLayout(panel_productLayout);
        panel_productLayout.setHorizontalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_productLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_productLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_productLayout.setVerticalGroup(
            panel_productLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_productLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        content.add(panel_product);

        panel_category.setBackground(new java.awt.Color(255, 255, 255));
        panel_category.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_categoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enteredCategory(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedCategory(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setText("LOẠI");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/category.png"))); // NOI18N
        jLabel7.setText("jLabel6");

        javax.swing.GroupLayout panel_categoryLayout = new javax.swing.GroupLayout(panel_category);
        panel_category.setLayout(panel_categoryLayout);
        panel_categoryLayout.setHorizontalGroup(
            panel_categoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_categoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(panel_categoryLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel_categoryLayout.setVerticalGroup(
            panel_categoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_categoryLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        content.add(panel_category);

        panel_order.setBackground(new java.awt.Color(255, 255, 255));
        panel_order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToOrder(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enteredOrder(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedOrder(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setText("ĐƠN HÀNG");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/order.png"))); // NOI18N
        jLabel13.setText("jLabel6");

        javax.swing.GroupLayout panel_orderLayout = new javax.swing.GroupLayout(panel_order);
        panel_order.setLayout(panel_orderLayout);
        panel_orderLayout.setHorizontalGroup(
            panel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_orderLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(panel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        panel_orderLayout.setVerticalGroup(
            panel_orderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_orderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        content.add(panel_order);

        panel_customer.setBackground(new java.awt.Color(255, 255, 255));
        panel_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToCustomer(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enteredCustomer(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedCustomer(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("KHÁCH HÀNG");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer.png"))); // NOI18N
        jLabel8.setText("jLabel6");

        javax.swing.GroupLayout panel_customerLayout = new javax.swing.GroupLayout(panel_customer);
        panel_customer.setLayout(panel_customerLayout);
        panel_customerLayout.setHorizontalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_customerLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panel_customerLayout.setVerticalGroup(
            panel_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_customerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        content.add(panel_customer);

        panel_user.setBackground(new java.awt.Color(255, 255, 255));
        panel_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goToUser(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enteredUser(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedUser(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel16.setText("NGƯỜI DÙNG");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-100.png"))); // NOI18N
        jLabel18.setText("jLabel6");

        javax.swing.GroupLayout panel_userLayout = new javax.swing.GroupLayout(panel_user);
        panel_user.setLayout(panel_userLayout);
        panel_userLayout.setHorizontalGroup(
            panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_userLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panel_userLayout.setVerticalGroup(
            panel_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_userLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        content.add(panel_user);

        panel_static.setBackground(new java.awt.Color(255, 255, 255));
        panel_static.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToAdminStatistic(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enteredStatic(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitedStatic(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("THỐNG KÊ");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/statistic.png"))); // NOI18N
        jLabel14.setText("jLabel6");

        javax.swing.GroupLayout panel_staticLayout = new javax.swing.GroupLayout(panel_static);
        panel_static.setLayout(panel_staticLayout);
        panel_staticLayout.setHorizontalGroup(
            panel_staticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_staticLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(panel_staticLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panel_staticLayout.setVerticalGroup(
            panel_staticLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_staticLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        content.add(panel_static);

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 850, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_cancelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_label_cancelMouseClicked

    private void goToProductFrame(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToProductFrame
        AdminProduct a = new AdminProduct();
        a.setVisible(true);
        x = this.getX();
        y = this.getY();
        a.setPositionForWin(x,y);
        a.showData();
        dispose();
    }//GEN-LAST:event_goToProductFrame

    private void panel_categoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_categoryMouseClicked
        AdminCategory a = new AdminCategory();
        a.setVisible(true);
        x = this.getX();
        y = this.getY();
        a.setPositionForWin(x,y);
        a.showData();
        dispose();
    }//GEN-LAST:event_panel_categoryMouseClicked

    private void goToOrder(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToOrder
        AdminOrder a = new AdminOrder();
        a.setVisible(true);
        x = this.getX();
        y = this.getY();
        a.setPositionForWin(x,y);
        a.showData();
        dispose();
    }//GEN-LAST:event_goToOrder

    private void goToCustomer(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToCustomer
        AdminCustomer a = new AdminCustomer();
        a.setVisible(true);
        x = this.getX();
        y = this.getY();
        a.setPositionForWin(x,y);
        a.showData();
        dispose();
    }//GEN-LAST:event_goToCustomer

    private void goToUser(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goToUser
        AdminUser a = new AdminUser();
        a.setVisible(true);
        x = this.getX();
        y = this.getY();
        a.setPositionForWin(x,y);
        a.showData();
        dispose();
    }//GEN-LAST:event_goToUser

    private void enteredProduct(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enteredProduct
        panel_product.setBackground(new Color(238, 238, 238));
    }//GEN-LAST:event_enteredProduct

    private void exitedProduct(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedProduct
        panel_product.setBackground(Color.white);
    }//GEN-LAST:event_exitedProduct

    private void enteredCategory(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enteredCategory
        panel_category.setBackground(new Color(238, 238, 238));
    }//GEN-LAST:event_enteredCategory

    private void exitedCategory(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedCategory
        panel_category.setBackground(Color.white);
    }//GEN-LAST:event_exitedCategory

    private void enteredOrder(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enteredOrder
        panel_order.setBackground(new Color(238, 238, 238));
    }//GEN-LAST:event_enteredOrder

    private void exitedOrder(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedOrder
        panel_order.setBackground(Color.white);
    }//GEN-LAST:event_exitedOrder

    private void enteredCustomer(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enteredCustomer
        panel_customer.setBackground(new Color(238, 238, 238));
    }//GEN-LAST:event_enteredCustomer

    private void exitedCustomer(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedCustomer
        panel_customer.setBackground(Color.white);
    }//GEN-LAST:event_exitedCustomer

    private void enteredUser(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enteredUser
        panel_user.setBackground(new Color(238, 238, 238));
    }//GEN-LAST:event_enteredUser

    private void exitedUser(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedUser
        panel_user.setBackground(Color.white);
    }//GEN-LAST:event_exitedUser

    private void enteredStatic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enteredStatic
        panel_static.setBackground(new Color(238, 238, 238));
    }//GEN-LAST:event_enteredStatic

    private void exitedStatic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitedStatic
        panel_static.setBackground(Color.white);
    }//GEN-LAST:event_exitedStatic

    private void headBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headBarMouseDragged
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        
        this.setLocation(x-MousepX, y-MousepY);
    }//GEN-LAST:event_headBarMouseDragged
    
    public void setPositionForWin(int x, int y) {                                            
        this.setLocation(x, y);
    }
    
    private void headBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headBarMousePressed
        MousepX = evt.getX();
        MousepY = evt.getY();
    }//GEN-LAST:event_headBarMousePressed

    private void GoToAdminStatistic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToAdminStatistic
        AdminStatistic a = new AdminStatistic();
        a.setVisible(true);
        x = this.getX();
        y = this.getY();
        a.setPositionForWin(x,y);
        dispose();
    }//GEN-LAST:event_GoToAdminStatistic

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JPanel headBar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_avatar;
    private javax.swing.JLabel label_brand;
    private javax.swing.JLabel label_cancel;
    private javax.swing.JLabel label_lotus;
    private javax.swing.JLabel label_nameAdmin;
    private javax.swing.JLabel label_title;
    private javax.swing.JPanel panel_category;
    private javax.swing.JPanel panel_customer;
    private javax.swing.JPanel panel_order;
    private javax.swing.JPanel panel_product;
    private javax.swing.JPanel panel_static;
    private javax.swing.JPanel panel_user;
    // End of variables declaration//GEN-END:variables
}
