/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI.CRUD;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import BUS.BUS_ChucNangNhomQuyen;
import BUS.BUS_NhanVien;
import BUS.BUS_NhomQuyen;
import BUS.BUS_TaiKhoan;

import DTO.DTO_NhanVien;
import DTO.DTO_NhomQuyen;
import DTO.DTO_TaiKhoan;

/**
 *
 * @author Kiet
 */
public class SuaTaiKhoan extends javax.swing.JDialog {

    /**
     * Creates new form ThemTaiKhoan
     */
    int currentIDnhanvien;
    BUS_NhomQuyen busNhomQuyen = new BUS_NhomQuyen();
    BUS_NhanVien busNhanVien = new BUS_NhanVien();
    BUS_TaiKhoan busTaiKhoan = new BUS_TaiKhoan();
    BUS_ChucNangNhomQuyen busChucNangNhomQuyen = new BUS_ChucNangNhomQuyen();
    GUI.Menu.TaiKhoan tk;
    String tendangnhapmacdinh;
    public SuaTaiKhoan(java.awt.Frame parent, boolean modal, int idNhanVien, GUI.Menu.TaiKhoan tk) {
        super(parent, modal);
        this.currentIDnhanvien = idNhanVien;
        this.tk = tk;
        initComponents();
        tendangnhapmacdinh = busTaiKhoan.getTenDangNhapByIdNhanVien(idNhanVien);
        loadComboboxcurrentNV(currentIDnhanvien);
        loadcomboboxnhomquyen(currentIDnhanvien);
        loadtkmk(currentIDnhanvien);
        jComboBox1.setEnabled(false);
    }

    public void loadcomboboxnhomquyen(int currentIDnhanvien) {
        // load combobox nhom quyen
        jComboBox2.removeAllItems();
        ArrayList<DTO_NhomQuyen> listnq = busNhomQuyen.getAllData();
        ArrayList<DTO_TaiKhoan> listtk = busTaiKhoan.getAllData();
        for (DTO_TaiKhoan x : listtk) {
            if (x.getManv() == currentIDnhanvien) {
                for (DTO_NhomQuyen y : listnq) {
                    jComboBox2.addItem(y.getManhomquyen() + " - " + y.getTennhomquyen());
                    if (y.getManhomquyen()== x.getManhomquyen()) {
                        jComboBox2.setSelectedItem(y.getManhomquyen() + " - " + y.getTennhomquyen());
                    }
                }
            }
        }
    }

    public void loadComboboxcurrentNV(int idnv) {

        jComboBox1.removeAllItems();
        ArrayList<DTO_NhanVien> listnv = busNhanVien.getAllData();
        String currentNV;
        for (DTO_NhanVien x : listnv) {
            jComboBox1.addItem(x.getManv() + " - " + x.getHoten());
            if (x.getManv() == idnv) {
                jComboBox1.setSelectedItem(x.getManv() + " - " + x.getHoten());
            }
        }
        // disabled combobox
    }

    public void loadtkmk(int idnv) {
        ArrayList<DTO_TaiKhoan> listtk = busTaiKhoan.getAllData();
        for (DTO_TaiKhoan x : listtk) {
            if (x.getManv() == idnv) {
                jTextField1.setText(x.getTendangnhap());
                jPasswordField1.setText(x.getMatkhau());
            }
        }
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
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Chọn nhân viên");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Tài khoản");

        jLabel3.setText("Mật khẩu");

        jButton1.setText("Sửa");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jLabel4.setText("Chọn nhóm quyền");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("SỬA TÀI KHOẢN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(200, 200, 200))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, 0, 242, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // Lấy thông tin từ các thành phần giao diện
    String username = jTextField1.getText();
    String password = jPasswordField1.getText();
    int manhomquyen = Integer.parseInt(jComboBox2.getSelectedItem().toString().split(" - ")[0]);
    int currentmanv = currentIDnhanvien;

    // Validate input
    if (!validateInput(username, password)) {
        return; // Nếu validate không thành công, thoát hàm
    }

    // Cập nhật tài khoản
    int result = busTaiKhoan.updatetk(currentmanv, currentmanv, username, password, manhomquyen);
    if (result != -1) {
        JOptionPane.showMessageDialog(null, "Sửa tài khoản thành công");
        tk.loadTable(tk.bustk.getAllData());
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Sửa tài khoản thất bại");
    }
    
    }//GEN-LAST:event_jButton1MousePressed
    public boolean validateInput(String username, String password) {
    // Kiểm tra tài khoản và mật khẩu không được để trống
    if (username.trim().equals("") || password.trim().equals("")) {
        JOptionPane.showMessageDialog(null, "Không được để trống tài khoản hoặc mật khẩu");
        return false;
    }

    // Kiểm tra độ dài mật khẩu
    if (password.length() < 6) {
        JOptionPane.showMessageDialog(null, "Mật khẩu phải có ít nhất 6 ký tự");
        return false;
    }

    // Kiểm tra tài khoản đã tồn tại
    if (!tendangnhapmacdinh.equals(username)) {
        ArrayList<DTO_TaiKhoan> listtk = busTaiKhoan.getAllData();
        for (DTO_TaiKhoan x : listtk) {
            if (x.getTendangnhap().equals(username)) {
                JOptionPane.showMessageDialog(null, "Tên tài khoản đã tồn tại");
                jTextField1.setText(tendangnhapmacdinh);
                return false;
            }
        }
    }
    return true; // Nếu tất cả kiểm tra thành công
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
            java.util.logging.Logger.getLogger(SuaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaTaiKhoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
