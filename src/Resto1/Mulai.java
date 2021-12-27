package Resto1;
import javax.swing.JOptionPane;
public class Mulai extends javax.swing.JFrame {

    /**
     * Creates new form Mulai
     */
    public Mulai() {
        initComponents();
        JOptionPane.showMessageDialog(null, "Welcome To Chicken Let It Go Restaurant ! Please Choose Your Menu");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Neworder = new javax.swing.JButton();
        Batal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menuJawara = new javax.swing.JButton();
        menuFrozen = new javax.swing.JButton();
        menuMenanti = new javax.swing.JButton();
        menuPhyton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        onama1 = new javax.swing.JTextField();
        onama2 = new javax.swing.JTextField();
        onama3 = new javax.swing.JTextField();
        onama4 = new javax.swing.JTextField();
        oharga1 = new javax.swing.JTextField();
        oharga2 = new javax.swing.JTextField();
        oharga3 = new javax.swing.JTextField();
        oharga4 = new javax.swing.JTextField();
        jmlps1 = new javax.swing.JTextField();
        jmlps2 = new javax.swing.JTextField();
        jmlps3 = new javax.swing.JTextField();
        jmlps4 = new javax.swing.JTextField();
        total1 = new javax.swing.JTextField();
        total2 = new javax.swing.JTextField();
        total3 = new javax.swing.JTextField();
        total4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        totalbiaya = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        kembali = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        Transaksi = new javax.swing.JButton();
        Order = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Neworder.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Neworder.setText("New Order");
        Neworder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeworderActionPerformed(evt);
            }
        });

        Batal.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Batal.setText("Batal");
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni Bd BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Chicken Let It Go Restaurant");

        jLabel2.setFont(new java.awt.Font("Bodoni Bd BT", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Daftar Menu Restaurant");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\OneDrive\\Gambar\\OOP\\1.jpg")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\OneDrive\\Gambar\\OOP\\3.jpg")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\OneDrive\\Gambar\\OOP\\9.jpg")); // NOI18N

        menuJawara.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        menuJawara.setText("Chicken Jawara");
        menuJawara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuJawaraActionPerformed(evt);
            }
        });

        menuFrozen.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        menuFrozen.setText("Chicken Frozen");
        menuFrozen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFrozenActionPerformed(evt);
            }
        });

        menuMenanti.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        menuMenanti.setText("Chicken Menanti");
        menuMenanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMenantiActionPerformed(evt);
            }
        });

        menuPhyton.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        menuPhyton.setText("Chicken Phyton");
        menuPhyton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPhytonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bodoni Bd BT", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Daftar Menu Yang Dipesan");

        oharga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oharga2ActionPerformed(evt);
            }
        });

        oharga3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oharga3ActionPerformed(evt);
            }
        });

        oharga4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oharga4ActionPerformed(evt);
            }
        });

        jmlps4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlps4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Total (Rp)  ");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Bayar (Rp)  ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Kembali (Rp)");

        hitung.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        Transaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Transaksi.setText("Proses Transaksi");
        Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiActionPerformed(evt);
            }
        });

        Order.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        Order.setForeground(new java.awt.Color(0, 0, 153));
        Order.setText("ORDER");
        Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Harga (Rp)");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Nama");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Banyak");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Total");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\OneDrive\\Gambar\\OOP\\6.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Order)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Neworder)
                        .addGap(18, 18, 18)
                        .addComponent(Batal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(294, 294, 294)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(menuJawara, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(menuFrozen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(menuMenanti, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(menuPhyton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(onama3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(onama2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(onama1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 8, Short.MAX_VALUE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(oharga2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(oharga1)
                                            .addComponent(oharga3)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jmlps2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(total2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jmlps3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(total3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jmlps1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(onama4)
                                        .addGap(18, 18, 18)
                                        .addComponent(oharga4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jmlps4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(total4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(totalbiaya)
                                    .addComponent(bayar)
                                    .addComponent(kembali)
                                    .addComponent(hitung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Neworder)
                        .addComponent(Batal))
                    .addComponent(jLabel1))
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(menuJawara)
                            .addComponent(menuFrozen)
                            .addComponent(menuMenanti)
                            .addComponent(menuPhyton)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Transaksi)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oharga1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmlps1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(totalbiaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onama2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oharga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmlps2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onama3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oharga3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmlps3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitung))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onama4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oharga4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmlps4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Order)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oharga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oharga2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oharga2ActionPerformed

    private void oharga3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oharga3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oharga3ActionPerformed

    private void oharga4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oharga4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oharga4ActionPerformed

    private void jmlps4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlps4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmlps4ActionPerformed

    private void TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiActionPerformed
        // TODO add your handling code here:
        int a1 = Integer.parseInt(oharga1.getText());
        int b1 = Integer.parseInt(jmlps1.getText());
        int t1 = a1*b1;
        total1.setText(""+t1);
        
        int a2 = Integer.parseInt(oharga2.getText());
        int b2 = Integer.parseInt(jmlps2.getText());
        int t2 = a2*b2;
        total2.setText(""+t2);
        
        int a3 = Integer.parseInt(oharga3.getText());
        int b3 = Integer.parseInt(jmlps3.getText());
        int t3 = a3*b3;
        total3.setText(""+t3);
        
        int a4 = Integer.parseInt(oharga4.getText());
        int b4 = Integer.parseInt(jmlps4.getText());
        int t4 = a4*b4;
        total4.setText(""+t4);
        
        int c1 = Integer.parseInt(total1.getText());
        int c2 = Integer.parseInt(total2.getText());
        int c3 = Integer.parseInt(total3.getText());
        int c4 = Integer.parseInt(total4.getText());
        
        int hasil = c1+c2+c3+c4;
        totalbiaya.setText(""+hasil);
    }//GEN-LAST:event_TransaksiActionPerformed

    private void NeworderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeworderActionPerformed
        // TODO add your handling code here:
        onama1.setText("");
        onama2.setText("");
        onama3.setText("");
        onama3.setText("");
        
        oharga1.setText("");
        oharga2.setText("");
        oharga3.setText("");
        oharga4.setText("");
        
        jmlps1.setText("");
        jmlps2.setText("");
        jmlps3.setText("");
        jmlps4.setText("");
        
        total1.setText("");
        total2.setText("");
        total3.setText("");
        total4.setText("");
        
        totalbiaya.setText("");
        bayar.setText("");
        kembali.setText("");
    }//GEN-LAST:event_NeworderActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        int a1 = Integer.parseInt(totalbiaya.getText());
        int a2 = Integer.parseInt(bayar.getText());
        int hasil = a2-a1;
        kembali.setText(""+hasil);
    }//GEN-LAST:event_hitungActionPerformed

    private void menuJawaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuJawaraActionPerformed
        // TODO add your handling code here:
        onama1.setText("Chicken Cajun Lada  Hitam");
        oharga1.setText("60000");
        
        onama2.setText("Chicken Sangat Vegan");
        oharga2.setText("60000");
        
        onama3.setText("Soda Dispenser");
        oharga3.setText("35000");
        
        onama4.setText("Chicken Peternakan Rempah");
        oharga4.setText("60000");
    }//GEN-LAST:event_menuJawaraActionPerformed

    private void menuFrozenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFrozenActionPerformed
        // TODO add your handling code here:
        onama1.setText("Chicken Burger Poll");
        oharga1.setText("60000");
        
        onama2.setText("Chicken Favorit Petani");
        oharga2.setText("65000");
        
        onama3.setText("Jus Buah Fiesta");
        oharga3.setText("35000");
        
        onama4.setText("Chicken Kripik");
        oharga4.setText("45000");
    }//GEN-LAST:event_menuFrozenActionPerformed

    private void menuMenantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMenantiActionPerformed
        // TODO add your handling code here:
        onama1.setText("Ayam Goreng Pedas");
        oharga1.setText("60000");
        
        onama2.setText("Chicken Ceker Lada Hitam");
        oharga2.setText("60000");
        
        onama3.setText("Jus Musim Kemarau");
        oharga3.setText("35000");
        
        onama4.setText("Ayam Goreng & Kentang");
        oharga4.setText("35000");
    }//GEN-LAST:event_menuMenantiActionPerformed

    private void menuPhytonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPhytonActionPerformed
        // TODO add your handling code here
        onama1.setText("Chicken Black Programming");
        oharga1.setText("90000");
        
        onama2.setText("Chicken Keju C++");
        oharga2.setText("80000");
        
        onama3.setText("Coffe Pascal");
        oharga3.setText("50000");
        
        onama4.setText("Krispi Java");
        oharga4.setText("35000");
    }//GEN-LAST:event_menuPhytonActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "Yakin Nih Nggak Jadi Pesan?", "ya Udah OO aja", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {System.exit(0);}
    }//GEN-LAST:event_BatalActionPerformed

    private void OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderActionPerformed
        // TODO add your handling code here:
        new DataPelanggan().setVisible(true);
    }//GEN-LAST:event_OrderActionPerformed

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
            java.util.logging.Logger.getLogger(Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mulai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mulai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batal;
    private javax.swing.JButton Neworder;
    private javax.swing.JButton Order;
    private javax.swing.JButton Transaksi;
    private javax.swing.JTextField bayar;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jmlps1;
    private javax.swing.JTextField jmlps2;
    private javax.swing.JTextField jmlps3;
    private javax.swing.JTextField jmlps4;
    private javax.swing.JTextField kembali;
    private javax.swing.JButton menuFrozen;
    private javax.swing.JButton menuJawara;
    private javax.swing.JButton menuMenanti;
    private javax.swing.JButton menuPhyton;
    private javax.swing.JTextField oharga1;
    private javax.swing.JTextField oharga2;
    private javax.swing.JTextField oharga3;
    private javax.swing.JTextField oharga4;
    private javax.swing.JTextField onama1;
    private javax.swing.JTextField onama2;
    private javax.swing.JTextField onama3;
    private javax.swing.JTextField onama4;
    private javax.swing.JTextField total1;
    private javax.swing.JTextField total2;
    private javax.swing.JTextField total3;
    private javax.swing.JTextField total4;
    private javax.swing.JTextField totalbiaya;
    // End of variables declaration//GEN-END:variables
}
