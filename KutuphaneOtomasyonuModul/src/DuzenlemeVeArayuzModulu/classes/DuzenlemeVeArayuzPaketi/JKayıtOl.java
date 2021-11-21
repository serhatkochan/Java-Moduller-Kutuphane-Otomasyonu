
package DuzenlemeVeArayuzPaketi;

import javax.swing.JOptionPane;
import PersonelPaketi.Ogrenci;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JKayıtOl extends javax.swing.JFrame {

    /**
     * Creates new form JKayıtOl
     */
    public JKayıtOl() {
        initComponents();
        btn_calisan.setEnabled(false);
        btn_ogrenci.setSelected(true);
        btn_ogrenci.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cinsiyet = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_soyad = new javax.swing.JTextField();
        txt_tel = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        txt_ad = new javax.swing.JTextField();
        txt_kullaniciAdi = new javax.swing.JTextField();
        txt_sifre = new javax.swing.JPasswordField();
        btn_geri = new javax.swing.JButton();
        btn_erkek = new javax.swing.JRadioButton();
        btn_kadin = new javax.swing.JRadioButton();
        btn_ogrenci = new javax.swing.JCheckBox();
        btn_calisan = new javax.swing.JCheckBox();
        btn_diger = new javax.swing.JRadioButton();
        btn_kayitOl = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_adres = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kayıt Ol");
        setBounds(new java.awt.Rectangle(650, 250, 0, 0));
        setResizable(false);

        jLabel1.setText("Soyadınız:");

        jLabel2.setText("Adınız:");

        jLabel3.setText("Telefon No:");

        jLabel5.setText("Adresiniz:");

        jLabel10.setText("Tc Kimlik No:");

        jLabel11.setText("Cinsiyet:");

        jLabel4.setText("Görev:");

        jLabel6.setText("Kullanıcı Şifre:");

        jLabel7.setText("Kullanıcı Adı:");

        btn_geri.setText("Geri");
        btn_geri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        btn_cinsiyet.add(btn_erkek);
        btn_erkek.setText("Erkek");
        btn_erkek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_cinsiyet.add(btn_kadin);
        btn_kadin.setText("Kadın");
        btn_kadin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_ogrenci.setText("Öğrenci");
        btn_ogrenci.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_calisan.setText("Çalışan");
        btn_calisan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_cinsiyet.add(btn_diger);
        btn_diger.setText("Diğer");
        btn_diger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn_kayitOl.setText("Kayıt Ol");
        btn_kayitOl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayitOlActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txt_adres);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tc)
                            .addComponent(txt_tel)
                            .addComponent(jScrollPane2))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_ogrenci, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(btn_calisan, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_sifre)
                            .addComponent(txt_kullaniciAdi)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_erkek)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_kadin)
                                .addGap(30, 30, 30)
                                .addComponent(btn_diger))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn_kayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_kullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ogrenci)
                    .addComponent(btn_calisan))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kadin)
                    .addComponent(btn_erkek)
                    .addComponent(btn_diger))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_kayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed
        // TODO add your handling code here:
        JAnaEkran jAnaEkran = new JAnaEkran();
        jAnaEkran.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_geriActionPerformed

    private void btn_kayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayitOlActionPerformed
        
        Boolean kontrol = true;
        
        String ad = txt_ad.getText().trim();
        String soyad = txt_soyad.getText().trim();
        String tel = txt_tel.getText().trim();
        String tc = txt_tc.getText().trim();
        String adres = txt_adres.getText().trim();
        String kullaniciAdi = txt_kullaniciAdi.getText().trim();
        String sifre = String.valueOf(txt_sifre.getPassword()).trim();
        
        String cinsiyet = "";         
        
        
        if(btn_erkek.isSelected()){
            cinsiyet = "Erkek";
        }
        else if(btn_kadin.isSelected()){
            cinsiyet = "Kadın";
        }
        else if(btn_diger.isSelected()){
            cinsiyet = "Diğer";
        }
        
        
        if(ad.equals("") || soyad.equals("") || tel.equals("") || tc.equals("") || adres.equals("") || kullaniciAdi.equals("") || sifre.equals("") || cinsiyet.equals("")){
            
           JOptionPane jOptionPane = new JOptionPane();
           jOptionPane.showMessageDialog(this, "Lütfen boşta alan kalmasın.", "Hata", 2);
        }
        else{
            
            Ogrenci ogrenci = new Ogrenci();
            
            ResultSet resultSet = ogrenci.ara(tc);
            
            try {
                while(resultSet.next()){
                    if(resultSet.getString("tcno").equals(tc)){
                        kontrol = false;
                    }
                        
                }
            } catch (SQLException ex) {
                Logger.getLogger(JKayıtOl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(kontrol == true){
                
                ad = ad.substring(0,1).toUpperCase() + ad.substring(1).toLowerCase();
                soyad = soyad.toUpperCase();
                
                ogrenci.ekleme(ad, soyad, tel, tc, adres, kullaniciAdi, sifre, cinsiyet);
                
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.showMessageDialog(this, "Kayıt İşlemi Başarılı!", "Kayıt Başarılı",1);

                JAnaEkran jAnaEkran = new JAnaEkran();
                jAnaEkran.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.showMessageDialog(this, "Bu Tc'ye sahip bir personel var.", "Uyarı",2);
            }
            
        }
        
    }//GEN-LAST:event_btn_kayitOlActionPerformed

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
            java.util.logging.Logger.getLogger(JKayıtOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JKayıtOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JKayıtOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JKayıtOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JKayıtOl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btn_calisan;
    private javax.swing.ButtonGroup btn_cinsiyet;
    private javax.swing.JRadioButton btn_diger;
    private javax.swing.JRadioButton btn_erkek;
    private javax.swing.JButton btn_geri;
    private javax.swing.JRadioButton btn_kadin;
    private javax.swing.JButton btn_kayitOl;
    private javax.swing.JCheckBox btn_ogrenci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextPane txt_adres;
    private javax.swing.JTextField txt_kullaniciAdi;
    private javax.swing.JPasswordField txt_sifre;
    private javax.swing.JTextField txt_soyad;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_tel;
    // End of variables declaration//GEN-END:variables
}
