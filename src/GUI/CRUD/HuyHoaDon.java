// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
//  */
// package GUI.CRUD;

// import BUS.BUS_ChiTietCauHinh;
// import BUS.BUS_ChiTietPhieuXuat;
// import BUS.BUS_ChiTietSanPham;
// import BUS.BUS_NhanVien;
// import DAO.DAO_ChiTietPhieuXuat;
// import DAO.DAO_HuyHoaDon;
// import DAO.DAO_NhanVien;
// import DAO.DAO_PhieuXuat;
// import DTO.DTO_ChiTietPhieuXuat;
// import DTO.DTO_HuyPhieuXuat;
// import DTO.DTO_NhanVien;
// import com.toedter.calendar.JDateChooser;
// import java.text.SimpleDateFormat;
// import java.util.ArrayList;
// import java.util.Date;
// import javax.swing.JOptionPane;

// /**
//  *
//  * @author KIET
//  */
// public class HuyHoaDon extends javax.swing.JDialog {

//     public BUS_NhanVien busnv = new BUS_NhanVien();
//     GUI.Menu.NhanVien ap;
//     int manv;
    
    

//     /**
//      * Creates new form ThemNhanVienDialog
//      */
//     int mahoadon;
//     public HuyHoaDon(java.awt.Frame parent, boolean modal, int mahoadon, int manv) {
//         super(parent, modal);
//         this.mahoadon = mahoadon;
//         this.ap = ap;
//         this.manv = manv;
//         initComponents();
//         jTextField1.setText(String.valueOf(mahoadon));
//         jTextField1.setEditable(false);
//     }

//     /**
//      * This method is called from within the constructor to initialize the form.
//      * WARNING: Do NOT modify this code. The content of this method is always
//      * regenerated by the Form Editor.
//      */
//     @SuppressWarnings("unchecked")
//     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//     private void initComponents() {

//         jPanel1 = new javax.swing.JPanel();
//         buttonGroup1 = new javax.swing.ButtonGroup();
//         buttonGroup2 = new javax.swing.ButtonGroup();
//         buttonGroup3 = new javax.swing.ButtonGroup();
//         buttonGroup4 = new javax.swing.ButtonGroup();
//         buttonGroup5 = new javax.swing.ButtonGroup();
//         buttonGroup6 = new javax.swing.ButtonGroup();
//         buttonGroup7 = new javax.swing.ButtonGroup();
//         jPanel2 = new javax.swing.JPanel();
//         jTextField1 = new javax.swing.JTextField();
//         jTextField2 = new javax.swing.JTextField();
//         jLabel7 = new javax.swing.JLabel();
//         jLabel1 = new javax.swing.JLabel();
//         jLabel2 = new javax.swing.JLabel();
//         jButton1 = new javax.swing.JButton();

//         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//         jPanel1.setLayout(jPanel1Layout);
//         jPanel1Layout.setHorizontalGroup(
//             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGap(0, 100, Short.MAX_VALUE)
//         );
//         jPanel1Layout.setVerticalGroup(
//             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGap(0, 100, Short.MAX_VALUE)
//         );

//         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

//         jPanel2.setBackground(new java.awt.Color(255, 255, 255));

//         jTextField1.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 jTextField1ActionPerformed(evt);
//             }
//         });

//         jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
//         jLabel7.setForeground(new java.awt.Color(0, 204, 255));
//         jLabel7.setText("HỦY HÓA ĐƠN");

//         jLabel1.setBackground(new java.awt.Color(0, 0, 0));
//         jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
//         jLabel1.setText("Mã hóa đơn");

//         jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
//         jLabel2.setText("Lý do hủy");

//         jButton1.setBackground(new java.awt.Color(204, 204, 255));
//         jButton1.setText("HỦY HÓA ĐƠN");
//         jButton1.addActionListener(new java.awt.event.ActionListener() {
//             public void actionPerformed(java.awt.event.ActionEvent evt) {
//                 jButton1ActionPerformed(evt);
//             }
//         });

//         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
//         jPanel2.setLayout(jPanel2Layout);
//         jPanel2Layout.setHorizontalGroup(
//             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(jPanel2Layout.createSequentialGroup()
//                 .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                     .addGroup(jPanel2Layout.createSequentialGroup()
//                         .addGap(99, 99, 99)
//                         .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                             .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
//                             .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                     .addGroup(jPanel2Layout.createSequentialGroup()
//                         .addGap(101, 101, 101)
//                         .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                 .addContainerGap(100, Short.MAX_VALUE))
//             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
//                 .addGap(0, 0, Short.MAX_VALUE)
//                 .addComponent(jLabel7)
//                 .addGap(174, 174, 174))
//         );
//         jPanel2Layout.setVerticalGroup(
//             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(jPanel2Layout.createSequentialGroup()
//                 .addGap(33, 33, 33)
//                 .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addComponent(jLabel1)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                 .addComponent(jLabel2)
//                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
//                 .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(40, 40, 40)
//                 .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addGap(30, 30, 30))
//         );

//         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//         getContentPane().setLayout(layout);
//         layout.setHorizontalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                 .addGap(0, 0, Short.MAX_VALUE)
//                 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//         );
//         layout.setVerticalGroup(
//             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                 .addContainerGap())
//         );

//         pack();
//     }// </editor-fold>//GEN-END:initComponents

//     private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
//         // TODO add your handling code here:
//     }//GEN-LAST:event_jTextField1ActionPerformed

//     public boolean validateNhanVien(String ten, String email, String soDienThoai, String ngaySinh, boolean isRadioButton1Selected, boolean isRadioButton2Selected) {
//         if (ten.length() < 3) {
//             JOptionPane.showMessageDialog(null, "Tên nhân viên phải có ít nhất 3 ký tự");
//             return false;
//         }
//         if (!email.matches(".+@.+\\..+")) {
//             JOptionPane.showMessageDialog(null, "Email nhân viên phải chứa @ và một ký tự trước @ và một dấu . sau @");
//             return false;
//         }
//         if (!soDienThoai.matches("\\d{8,10}")) {
//             JOptionPane.showMessageDialog(null, "Số điện thoại nhân viên phải là số và có từ 8 đến 10 chữ số");
//             return false;
//         }
//         if (!ngaySinh.matches("\\d{2}/\\d{2}/\\d{4}")) {
//             JOptionPane.showMessageDialog(null, "Ngày sinh nhân viên phải theo định dạng dd/MM/yyyy");
//             return false;
//         }
//         if (!isRadioButton1Selected && !isRadioButton2Selected) {
//             JOptionPane.showMessageDialog(null, "Vui lòng chọn giới tính");
//             return false;
//         }
//         return true;
//     }
//     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//         // TODO add your handling code here:
//         // TODO add your handling code here:
//         String lydo = jTextField2.getText();
//         if (lydo.equals("")) {
//             JOptionPane.showMessageDialog(null, "Vui lòng nhập lý do hủy hóa đơn");
//             return;
//         }
//         // kiểm tra xem trang thai cua hoa don co phai la 1 hay khong
//         DAO_PhieuXuat zzzz = new DAO_PhieuXuat();
//         int trangthai = zzzz.getTrangThaiPhieuXuat(mahoadon);
//         if (trangthai == 0) {
//             JOptionPane.showMessageDialog(null, "Hóa đơn đã được hủy trước đó");
//             return;
//         }
//         DAO_HuyHoaDon dao = new DAO_HuyHoaDon();
//         DTO_HuyPhieuXuat dto = new DTO_HuyPhieuXuat(mahoadon, manv, lydo, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
//         int res = dao.insert(dto);
//         if (res > 0) {
//             // update so luong phien ban san pham
//             DAO_ChiTietPhieuXuat  daopx =  new DAO_ChiTietPhieuXuat();
//             ArrayList<DTO_ChiTietPhieuXuat> list = daopx.getPhieuXuatTheoID(mahoadon);
//             BUS_ChiTietPhieuXuat bus = new BUS_ChiTietPhieuXuat();
//             int ressult = bus.updatesoluongtonkhihuy(list);
//             if (ressult > 0) {
//                 // set trang thai hoa don = 0;
//                 DAO_PhieuXuat daopxx = new DAO_PhieuXuat();
//                 int resss = daopxx.updateTrangThaiPhieuXuat(mahoadon);
//                 if (resss > 0) {
//                     // set maphieuxuat = null theo maphienban trong chitietsanpham
//                     BUS_ChiTietSanPham ctz = new BUS_ChiTietSanPham();
//                     int ressss = ctz.setmaphieuxuatnull(mahoadon);
//                 } else {
//                     JOptionPane.showMessageDialog(null, "Hủy hóa đơn thất bại, Cập nhật trạng thái hóa đơn thất bại");
//                 }
//             } else {
//                 JOptionPane.showMessageDialog(null, "Hủy hóa đơn thất bại, Cập nhật số lượng tồn thất bại");
//             }
//             this.dispose();
//         } else {
//             JOptionPane.showMessageDialog(null, "Hủy hóa đơn thất bại");
//         }
//     }//GEN-LAST:event_jButton1ActionPerformed

//     /**
//      * @param args the command line arguments
//      */
//     public static void main(String args[]) {
//         /* Set the Nimbus look and feel */
//         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//         /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//          * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//          */
//         try {
//             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                 if ("Nimbus".equals(info.getName())) {
//                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                     break;
//                 }
//             }
//         } catch (ClassNotFoundException ex) {
//             java.util.logging.Logger.getLogger(HuyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (InstantiationException ex) {
//             java.util.logging.Logger.getLogger(HuyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (IllegalAccessException ex) {
//             java.util.logging.Logger.getLogger(HuyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//             java.util.logging.Logger.getLogger(HuyHoaDon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//         }
//         //</editor-fold>
//         //</editor-fold>

//     }

//     // Variables declaration - do not modify//GEN-BEGIN:variables
//     private javax.swing.ButtonGroup buttonGroup1;
//     private javax.swing.ButtonGroup buttonGroup2;
//     private javax.swing.ButtonGroup buttonGroup3;
//     private javax.swing.ButtonGroup buttonGroup4;
//     private javax.swing.ButtonGroup buttonGroup5;
//     private javax.swing.ButtonGroup buttonGroup6;
//     private javax.swing.ButtonGroup buttonGroup7;
//     private javax.swing.JButton jButton1;
//     private javax.swing.JLabel jLabel1;
//     private javax.swing.JLabel jLabel2;
//     private javax.swing.JLabel jLabel7;
//     private javax.swing.JPanel jPanel1;
//     private javax.swing.JPanel jPanel2;
//     private javax.swing.JTextField jTextField1;
//     private javax.swing.JTextField jTextField2;
//     // End of variables declaration//GEN-END:variables
// }