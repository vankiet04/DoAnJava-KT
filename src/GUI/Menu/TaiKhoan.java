/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Menu;

import BUS.BUS_ChucNangNhomQuyen;
import BUS.BUS_NhanVien;
import BUS.BUS_NhomQuyen;
import BUS.BUS_PhieuNhap;
import BUS.BUS_TaiKhoan;
import DTO.DTO_ChucNangNhomQuyen;
import DTO.DTO_NhanVien;
import DTO.DTO_PhieuNhap;
import DTO.DTO_TaiKhoan;
import GUI.CRUD.SuaTaiKhoan;
import GUI.CRUD.ThemNhanVienDialog;
import GUI.CRUD.ThemTaiKhoan;
import GUI.CRUD.XemTaiKhoan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.DocumentEvent;
/**
 *
 * @author KIET
 */
public class TaiKhoan extends javax.swing.JPanel {
    public BUS_TaiKhoan bustk = new BUS_TaiKhoan();
   public BUS_NhanVien busNV= new BUS_NhanVien();
   public ArrayList<DTO_TaiKhoan> listtk = bustk.getAllData();
   DefaultTableModel modelNV;
    int currentIDselected = -1;
    
    /**
     * Creates new form NhanVien
     */
    
     GUI.MainProgram main;
    DTO_TaiKhoan user;
     BUS_ChucNangNhomQuyen busNQ = new BUS_ChucNangNhomQuyen();
     ArrayList<DTO_ChucNangNhomQuyen> listNQ = new ArrayList<>();
    BUS_PhieuNhap busPN = new BUS_PhieuNhap();

    public TaiKhoan(GUI.MainProgram main, DTO_TaiKhoan user) {
        this.main = main;
        this.user = user;
        initComponents();
        loadTable(listtk);
        jTable1.setDefaultEditor(Object.class, null);
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = jTable1.getSelectedRow();
                    if (selectedRow != -1) {
                        currentIDselected = Integer.parseInt(jTable1.getValueAt(selectedRow, 0).toString());
                    }
                }
            }
        });
        jButton4.setEnabled(false);
        jLabel1NCC.setEnabled(false);
        jButton2.setEnabled(false);
        jLabel2NCC.setEnabled(false);
        jButton3.setEnabled(false);
        jLabel3NCC.setEnabled(false);
        jButton5.setEnabled(false);
        jLabel4NCC.setEnabled(false);
        loadChucNangNhomQuyen();

    }
    public void loadChucNangNhomQuyen() {
        listNQ = busNQ.selectAllChucNangNQ(user.getManhomquyen());

        for (DTO_ChucNangNhomQuyen iNQ : listNQ) {
            if (iNQ.getMachucnang().equals("taikhoan") && iNQ.getHanhdong().equals("create")) {
                jButton4.setEnabled(true);
                jLabel1NCC.setEnabled(true);
            } 
            if (iNQ.getMachucnang().equals("taikhoan") && iNQ.getHanhdong().equals("update")) {
                jButton2.setEnabled(true);
                jLabel2NCC.setEnabled(true);
            } 
            if (iNQ.getMachucnang().equals("taikhoan") && iNQ.getHanhdong().equals("delete")) {
                jButton3.setEnabled(true);
                jLabel3NCC.setEnabled(true);
            } 
            if (iNQ.getMachucnang().equals("taikhoan") && iNQ.getHanhdong().equals("view")) {
                jButton5.setEnabled(true);
                jLabel4NCC.setEnabled(true);
            }
        }
    }

    public void loadTable(ArrayList<DTO_TaiKhoan> list) {
        modelNV = (DefaultTableModel) jTable1.getModel();
        modelNV.setRowCount(0);
        for (DTO_TaiKhoan nv : list) {
            String tenNhomQuyen = busNQ.getTenNhomQuyenById(nv.getManhomquyen());
            modelNV.addRow(new Object[]{nv.getManv(), busNV.getNameById(nv.getManv()), nv.getTendangnhap(), tenNhomQuyen, nv.getTrangthai()});
        }
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < modelNV.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    public void search() {
        String search = txtSearchNCC11.getText().toLowerCase(); 
        ArrayList<DTO_TaiKhoan> listSearch = new ArrayList<>();

        for (DTO_TaiKhoan nv : listtk) {
            String manvString = String.valueOf(nv.getManv());

            if (manvString.contains(search) 
                    || busNV.getNameById(nv.getManv()).toLowerCase().contains(search)
                    || nv.getTendangnhap().toLowerCase().contains(search)) {
                listSearch.add(nv);
            }
        }
        loadTable(listSearch);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        txtSearchNCC11 = new com.raven.suportSwing.TextField();
        myButton1NCC11 = new com.raven.suportSwing.MyButton();
        jPanel10 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2NCC = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel3NCC = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel4NCC = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel1NCC = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel7.setBackground(new java.awt.Color(255, 204, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        txtSearchNCC11.setLabelText("Tìm theo tên or mã");
        txtSearchNCC11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                
            }
        });
        txtSearchNCC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNCC11ActionPerformed(evt);
            }
        });
        txtSearchNCC11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchNCC11KeyReleased(evt);
            }
        });


        txtSearchNCC11.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        search();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        search();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        search();
    }
});

        myButton1NCC11.setBackground(new java.awt.Color(204, 255, 255));
        myButton1NCC11.setText("Làm mới");
        myButton1NCC11.setBorderColor(new java.awt.Color(153, 255, 255));
        myButton1NCC11.setRadius(20);
        myButton1NCC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1NCC11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchNCC11, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(myButton1NCC11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchNCC11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myButton1NCC11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, java.awt.BorderLayout.PAGE_END);

        jLabel2NCC.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-edit-75.png"))); // NOI18N
        jLabel2NCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2NCCMousePressed(evt);
            }
        });
        jPanel3.add(jLabel2NCC, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delete-85.png"))); // NOI18N
        jLabel3NCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3NCCMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setText("Xem");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-view-75.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4NCC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setText("Thêm");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1NCC.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-75.png"))); // NOI18N
        jLabel1NCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1NCCMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1NCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addComponent(jLabel1NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel7.add(jPanel33, java.awt.BorderLayout.PAGE_START);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên đăng nhập", "Tài khoản", "Nhóm quyền", "Trạng thái"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        add(jPanel7, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchNCC11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNCC11FocusGained
        
    }//GEN-LAST:event_txtSearchNCC11FocusGained

    private void txtSearchNCC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNCC11ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtSearchNCC11ActionPerformed

    private void txtSearchNCC11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchNCC11KeyReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtSearchNCC11KeyReleased

    private void myButton1NCC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1NCC11ActionPerformed
        //reset
        txtSearchNCC11.setText("");
        loadTable(bustk.getAllData());
    }//GEN-LAST:event_myButton1NCC11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// sua
if (currentIDselected == -1) {
    JOptionPane.showMessageDialog(null, "Vui lòng chọn tài khoản để chỉnh sửa", "Cảnh báo!",
            JOptionPane.WARNING_MESSAGE);
    return;
}
        // khong cho sua tai khoan admin
        if (currentIDselected == 1) {
            JOptionPane.showMessageDialog(null, "Không thể chỉnh sửa tài khoản admin", "Cảnh báo!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        SuaTaiKhoan sua = new SuaTaiKhoan(null, true, currentIDselected, this);
        sua.setLocationRelativeTo(null);
        sua.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel2NCCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2NCCMousePressed
        // Thêm sự kiện lắng nghe sự kiện chọn hàng của JTable
        //        if (currentIDselected == -1) {
        //            JOptionPane.showMessageDialog(parent, "Vui lòng chọn sản phẩm để chỉnh sửa", "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
        //            return;
        //        }
        //        EditProduct add = new EditProduct(parent, true, currentIDselected);
        //        add.setLocationRelativeTo(null);
        //        add.setVisible(true);
    }//GEN-LAST:event_jLabel2NCCMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: Xoa
        if (currentIDselected == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn tài khoản để xóa", "Cảnh báo!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        //khong xoa tai khoan admin
        if (currentIDselected == 1) {
            JOptionPane.showMessageDialog(null, "Không thể xóa tài khoản admin", "Cảnh báo!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        //khong the xoa tai khoan neu tai khoan do da duoc su dung trong phieu nhap
        ArrayList<DTO_PhieuNhap> listPN = busPN.getAll();
        for (DTO_PhieuNhap pn : listPN) {
            if (pn.getManguoitao() == currentIDselected) {
                JOptionPane.showMessageDialog(null, "Không thể xóa tài khoản này vì đã được sử dụng trong phiếu nhập", "Cảnh báo!",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa tài khoản này không?", "Cảnh báo!", JOptionPane.YES_NO_OPTION);
        if (option != JOptionPane.YES_OPTION) {
            return;
        }
        int res = bustk.delete(currentIDselected);
        if (res == 1) {
            JOptionPane.showMessageDialog(null, "Xóa tài khoản thành công", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
            loadTable(bustk.getAllData());
        } else {
            JOptionPane.showMessageDialog(null, "Xóa tài khoản thất bại", "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel3NCCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3NCCMousePressed
        // this func to delete product
        //        if (currentIDselected == -1) {
        //            JOptionPane.showMessageDialog(parent, "Vui lòng chọn sản phẩm để xóa", "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
        //            return;
        //        }
        //        productBUS.delete(currentIDselected);
        //        JOptionPane.showMessageDialog(parent, "Xóa sản phẩm thành công", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        //        FillTable(productBUS.getAllData());showMessageDialog
    }//GEN-LAST:event_jLabel3NCCMousePressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here: xem
        if (currentIDselected == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn tài khoản để xem", "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // khong cho xoa tai khoan admin
        if (currentIDselected == 1) {
            JOptionPane.showMessageDialog(null, "Không thể xem tài khoản admin", "Cảnh báo!",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        XemTaiKhoan xem = new XemTaiKhoan(new javax.swing.JFrame(), true, currentIDselected);
        xem.setLocationRelativeTo(null);
        xem.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //them 
        ThemTaiKhoan them = new ThemTaiKhoan(null, true, this);
        them.setLocationRelativeTo(null);
        them.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel1NCCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1NCCMousePressed
        // TODO add your handling code here:
        //        AddProducts add = new AddProducts(parent, true, this);
        //        add.setLocationRelativeTo(null);
        //        add.setVisible(true);
    }//GEN-LAST:event_jLabel1NCCMousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        // TODO add your handling code here: them tai khoan
    }//GEN-LAST:event_jButton4MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1NCC;
    private javax.swing.JLabel jLabel2NCC;
    private javax.swing.JLabel jLabel3NCC;
    private javax.swing.JLabel jLabel4NCC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private com.raven.suportSwing.MyButton myButton1NCC11;
    private com.raven.suportSwing.TextField txtSearchNCC11;
    // End of variables declaration//GEN-END:variables
}
