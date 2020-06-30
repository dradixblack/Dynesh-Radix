package pert4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author DEWANET
 */
public class ReadFile extends javax.swing.JFrame {

    public String line = null;
    public File pilihFile = null;
    public File pilihFoto = null;
    public String path,linkfoto ;
    
    public ReadFile() {
        initComponents();
        this.setTitle("Edit Biodata");
        this.setLocationRelativeTo(this);
        fillname.setEnabled(false);
        fillgender.setEnabled(false);
        filldatebirth.setEnabled(false);
        filladdress.setEnabled(false);
        fillmotto.setEnabled(false);
        filluniv.setEnabled(false);
        fillfaculty.setEnabled(false);
        fillmotto.setEnabled(false);
        fillbachelor.setEnabled(false);
        fillclass.setEnabled(false);
        fillnim.setEnabled(false);
        fillphone.setEnabled(false);
        fillwa.setEnabled(false);
        fillfb.setEnabled(false);
        fillemail.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        puttxt = new javax.swing.JButton();
        addpath = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fillname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fillgender = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        filladdress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        filldatebirth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fillmotto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        fillphone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fillwa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fillfb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        fillemail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        fillfaculty = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fillbachelor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fillclass = new javax.swing.JTextField();
        filluniv = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fillnim = new javax.swing.JTextField();
        saving = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        fillfoto = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        foto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gisha", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FILEREADER");
        jLabel1.setToolTipText("");

        jLabel2.setText("Input txt");

        puttxt.setText("Ambil");
        puttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puttxtActionPerformed(evt);
            }
        });

        addpath.setText("...");
        addpath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpathActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Identitas Diri"));
        jPanel1.setToolTipText("");

        jLabel3.setText("Nama");

        fillname.setText("....");
        fillname.setToolTipText("Silahkan edit datanya disini");
        fillname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillnameActionPerformed(evt);
            }
        });

        jLabel4.setText("Jenis Kelamin");

        fillgender.setText("....");
        fillgender.setToolTipText("Silahkan edit datanya disini");
        fillgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillgenderActionPerformed(evt);
            }
        });

        jLabel5.setText("Alamat");

        filladdress.setText("....");
        filladdress.setToolTipText("Silahkan edit datanya disini");
        filladdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filladdressActionPerformed(evt);
            }
        });

        jLabel6.setText("TTL");

        filldatebirth.setText("....");
        filldatebirth.setToolTipText("Silahkan edit datanya disini");
        filldatebirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filldatebirthActionPerformed(evt);
            }
        });

        jLabel7.setText("Motto");

        fillmotto.setText("....");
        fillmotto.setToolTipText("Silahkan edit datanya disini");
        fillmotto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillmottoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillname, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillgender, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(filladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(filldatebirth, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillmotto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fillname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fillgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(filldatebirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(filladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(fillmotto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Kontak"));
        jPanel2.setToolTipText("");

        jLabel8.setText("Telp/Hp.");

        fillphone.setText("....");
        fillphone.setToolTipText("Silahkan edit datanya disini");
        fillphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillphoneActionPerformed(evt);
            }
        });

        jLabel9.setText("No. WA");

        fillwa.setText("....");
        fillwa.setToolTipText("Silahkan edit datanya disini");
        fillwa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillwaActionPerformed(evt);
            }
        });

        jLabel11.setText("Facebook");

        fillfb.setText("....");
        fillfb.setToolTipText("Silahkan edit datanya disini");
        fillfb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillfbActionPerformed(evt);
            }
        });

        jLabel12.setText("Email");

        fillemail.setText("....");
        fillemail.setToolTipText("Silahkan edit datanya disini");
        fillemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillemailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillemail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillphone, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillwa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillfb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fillphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(fillwa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(fillfb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(fillemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Pendidikan"));
        jPanel3.setToolTipText("");

        jLabel13.setText("Fakultas");

        fillfaculty.setText("....");
        fillfaculty.setToolTipText("Silahkan edit datanya disini");
        fillfaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillfacultyActionPerformed(evt);
            }
        });

        jLabel14.setText("Program Studi");

        fillbachelor.setText("....");
        fillbachelor.setToolTipText("Silahkan edit datanya disini");
        fillbachelor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillbachelorActionPerformed(evt);
            }
        });

        jLabel15.setText("Kelas");

        fillclass.setText("....");
        fillclass.setToolTipText("Silahkan edit datanya disini");
        fillclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillclassActionPerformed(evt);
            }
        });

        filluniv.setText("....");
        filluniv.setToolTipText("Silahkan edit datanya disini");
        filluniv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillunivActionPerformed(evt);
            }
        });

        jLabel16.setText("Universitas");

        jLabel17.setText("NIM");

        fillnim.setText("....");
        fillnim.setToolTipText("Silahkan edit datanya disini");
        fillnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillnimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillfaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillbachelor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillclass, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(filluniv, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(fillnim, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(filluniv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(fillfaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fillbachelor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(fillclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(fillnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saving.setText("Simpan");
        saving.setToolTipText("Simpan lagi data hasil editannya");
        saving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingActionPerformed(evt);
            }
        });

        jLabel10.setText("Simpan Data");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        fillfoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fillfoto.setText("Foto");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fillfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fillfoto, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel18.setText("Pilih Foto");

        foto.setText("Pilih");
        foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addpath, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(puttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saving))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addpath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puttxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saving)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void puttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puttxtActionPerformed
        
        JFileChooser pilihan = new JFileChooser(".");
        int opentxt = pilihan.showOpenDialog(ReadFile.this);
        if (opentxt == JFileChooser.APPROVE_OPTION){
            pilihFile = pilihan.getSelectedFile();
            path = pilihFile.getPath();
            
            addpath.setText(path);
        }
        
        FileReader baca = null;
        try {
            baca = new FileReader(pilihFile); 
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
        
        BufferedReader ambil =
                new BufferedReader(baca); 
        try {
            int jumlahbaris = 0;
            while ((line=ambil.readLine()) != null) {
                System.out.println(line);
                if (jumlahbaris==0){
                    fillname.setText(line);
                    fillname.setEnabled(true);
                }else if (jumlahbaris==1){
                    fillgender.setText(line);
                    fillgender.setEnabled(true);
                }else if (jumlahbaris==2){
                    filldatebirth.setText(line);
                    filldatebirth.setEnabled(true);
                }else if (jumlahbaris==3){
                    filladdress.setText(line);
                    filladdress.setEnabled(true);
                }else if (jumlahbaris==4){
                    fillmotto.setText(line);
                    fillmotto.setEnabled(true);
                }else if (jumlahbaris==5){
                    filluniv.setText(line);
                    filluniv.setEnabled(true);
                }else if (jumlahbaris==6){
                    fillfaculty.setText(line);
                    fillfaculty.setEnabled(true);
                }else if (jumlahbaris==7){
                    fillbachelor.setText(line);
                    fillbachelor.setEnabled(true);
                }else if (jumlahbaris==8){
                    fillclass.setText(line);
                    fillclass.setEnabled(true);
                }else if (jumlahbaris==9){
                    fillnim.setText(line);
                    fillnim.setEnabled(true);
                }else if (jumlahbaris==10){
                    fillphone.setText(line);
                    fillphone.setEnabled(true);
                }else if (jumlahbaris==11){
                    fillwa.setText(line);
                    fillwa.setEnabled(true);
                }else if (jumlahbaris==12){
                    fillfb.setText(line);
                    fillfb.setEnabled(true);
                }else if (jumlahbaris==13){
                    fillemail.setText(line);
                    fillemail.setEnabled(true);
                }else if (jumlahbaris==14){
                    fillfoto.setText(line);
                    fillfoto.setEnabled(true);
                
            }
            
            jumlahbaris++;
            }
            ambil.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
        
    }//GEN-LAST:event_puttxtActionPerformed

    private void fillnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillnameActionPerformed

    private void fillgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillgenderActionPerformed

    private void filladdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filladdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filladdressActionPerformed

    private void filldatebirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filldatebirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filldatebirthActionPerformed

    private void fillmottoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillmottoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillmottoActionPerformed

    private void fillphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillphoneActionPerformed

    private void fillwaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillwaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillwaActionPerformed

    private void fillfbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillfbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillfbActionPerformed

    private void fillfacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillfacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillfacultyActionPerformed

    private void fillbachelorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillbachelorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillbachelorActionPerformed

    private void fillclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillclassActionPerformed

    private void fillunivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillunivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillunivActionPerformed

    private void fillnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillnimActionPerformed

    private void fillemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fillemailActionPerformed

    private void addpathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addpathActionPerformed

    private void savingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingActionPerformed

        try {
            File file = new File (path);
            file.delete();
            FileWriter tulis;
            tulis = new FileWriter (path, true);
        
            try (BufferedWriter bw = new BufferedWriter (tulis)) {
                bw.write(fillname.getText());
                bw.newLine();
                bw.write(fillgender.getText());
                bw.newLine();
                bw.write(filldatebirth.getText());
                bw.newLine();
                bw.write(filladdress.getText());
                bw.newLine();
                bw.write(fillmotto.getText());
                bw.newLine();
                bw.write(filluniv.getText());
                bw.newLine();
                bw.write(fillfaculty.getText());
                bw.newLine();
                bw.write(fillbachelor.getText());
                bw.newLine();
                bw.write(fillclass.getText());
                bw.newLine();
                bw.write(fillnim.getText());
                bw.newLine();
                bw.write(fillphone.getText());
                bw.newLine();
                bw.write(fillwa.getText());
                bw.newLine();
                bw.write(fillfb.getText());
                bw.newLine();
                bw.write(fillemail.getText());
                bw.newLine();
            }
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
    }//GEN-LAST:event_savingActionPerformed

    private void fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoActionPerformed
        JFileChooser fotoe = new JFileChooser(".");
        int openfoto = fotoe.showOpenDialog(ReadFile.this);
        if (openfoto == JFileChooser.APPROVE_OPTION){
            linkfoto = fotoe.getSelectedFile().getPath();  
        }
        ImageIcon ikon = new ImageIcon(linkfoto);
        fillfoto.setText("");
        fillfoto.setIcon(ikon);
    }//GEN-LAST:event_fotoActionPerformed

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
            java.util.logging.Logger.getLogger(ReadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addpath;
    private javax.swing.JTextField filladdress;
    private javax.swing.JTextField fillbachelor;
    private javax.swing.JTextField fillclass;
    private javax.swing.JTextField filldatebirth;
    private javax.swing.JTextField fillemail;
    private javax.swing.JTextField fillfaculty;
    private javax.swing.JTextField fillfb;
    private javax.swing.JLabel fillfoto;
    private javax.swing.JTextField fillgender;
    private javax.swing.JTextField fillmotto;
    private javax.swing.JTextField fillname;
    private javax.swing.JTextField fillnim;
    private javax.swing.JTextField fillphone;
    private javax.swing.JTextField filluniv;
    private javax.swing.JTextField fillwa;
    private javax.swing.JButton foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton puttxt;
    private javax.swing.JButton saving;
    // End of variables declaration//GEN-END:variables
}
