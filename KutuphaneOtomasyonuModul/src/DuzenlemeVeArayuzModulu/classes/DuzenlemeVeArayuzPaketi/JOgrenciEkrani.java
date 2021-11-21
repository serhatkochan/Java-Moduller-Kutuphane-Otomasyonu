
package DuzenlemeVeArayuzPaketi;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

import KitapIslemleriPaketi.KitapStok;
import KitapIslemleriPaketi.KitapPersonel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class JOgrenciEkrani extends javax.swing.JFrame {
    DefaultTableModel tablo = new DefaultTableModel(){
      public boolean isCellEditable(int row, int column){ // tabloyu mouse ile değişemiyoruz
          return false;
      }
    };
    KitapStok kitapStok = new KitapStok();
    int personel_id = 0;
    
    public JOgrenciEkrani(){
        initComponents();
    }
    
    public JOgrenciEkrani(int personel_id) { // constructor
        initComponents();
        btn_kitapListesi.setEnabled(false);
        btn_iadeEt.setEnabled(false);
        
        this.personel_id = personel_id;
        
        tbl_tablo.setModel(tablo); // başlangıç olarak kütüphanedeki kitapları listeliyoruz.
        
        ResultSet resultSet = kitapStok.listeleme();
        tablo.setColumnIdentifiers(new String[]{"ID", "Kitap İsmi", "Yazarı", "Yayınevi", "Konusu", "Adet", "Sayfa Sayısı"});
       
        
        try {
            while(resultSet.next()){

                int kitap_id = resultSet.getInt("kitap_id");
                String ismi = resultSet.getString("ismi").toString();
                String yazari = resultSet.getString("yazari").toString();
                String yayinevi = resultSet.getString("yayinevi").toString();
                String konusu = resultSet.getString("konusu").toString();
                int sayisi = resultSet.getInt("sayisi");
                int sayfasi = resultSet.getInt("sayfasi");

                tablo.addRow(new Object []{kitap_id, ismi, yazari, yayinevi, konusu, sayisi, sayfasi});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cikis = new javax.swing.JButton();
        btn_oduncListesi = new javax.swing.JButton();
        btn_iadeEt = new javax.swing.JButton();
        lbl_baslik = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tablo = new javax.swing.JTable();
        btn_kitapListesi = new javax.swing.JButton();
        btn_oduncAl = new javax.swing.JButton();
        txt_ara = new javax.swing.JTextField();
        btn_kitapAra = new javax.swing.JButton();
        lbl_kitapAdi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Öğrenci Ekranı");
        setBounds(new java.awt.Rectangle(650, 250, 0, 0));
        setResizable(false);

        btn_cikis.setText("Çıkış Yap");
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        btn_oduncListesi.setText("Ödünç Aldıklarım");
        btn_oduncListesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oduncListesiActionPerformed(evt);
            }
        });

        btn_iadeEt.setText("İadet Et");
        btn_iadeEt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iadeEtActionPerformed(evt);
            }
        });

        lbl_baslik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_baslik.setText("Kütüphane  Kitapları");

        tbl_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_tablo);

        btn_kitapListesi.setText("Kütüphane Kitapları");
        btn_kitapListesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kitapListesiActionPerformed(evt);
            }
        });

        btn_oduncAl.setText("Ödünç Al");
        btn_oduncAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oduncAlActionPerformed(evt);
            }
        });

        btn_kitapAra.setText("Kitap Ara");
        btn_kitapAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kitapAraActionPerformed(evt);
            }
        });

        lbl_kitapAdi.setText("Kitap Adı:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_kitapAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_kitapAra, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cikis))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_kitapListesi, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_oduncListesi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_oduncAl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_iadeEt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_baslik, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_kitapListesi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_iadeEt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_oduncListesi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_oduncAl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_baslik, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_kitapAra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_kitapAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_oduncAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oduncAlActionPerformed
        // kitap ödünç alma
        int secili_row = tbl_tablo.getSelectedRow();
        if(secili_row == -1){
            JOptionPane jOptionPane = new JOptionPane();
            if(tbl_tablo.getRowCount() == 0){
                jOptionPane.showMessageDialog(this, "Tablo Boş.", "Uyarı", 2);
            }
            else{
                jOptionPane.showMessageDialog(this, "Lütfen bir kitap seçin.", "Uyarı", 1);
            }
        }
        else{
            int kitap_id_bilgisi =Integer.parseInt(tablo.getValueAt(secili_row, 0).toString());

            KitapStok kitapStok = new KitapStok();

            ResultSet resultSet = kitapStok.ara(kitap_id_bilgisi);

            try {
                while(resultSet.next()){
                    if(resultSet.getInt("sayisi") > 0){
                        KitapPersonel kitapPersonel = new KitapPersonel(kitap_id_bilgisi, personel_id);
                        kitapPersonel.ekleme();

                        kitapStok.guncelle(kitap_id_bilgisi,(resultSet.getInt("sayisi")-1) );
                        
                        // model.setValueAt(tf_fiyat.getText(), secili_row, 2);
                        tablo.setValueAt((resultSet.getInt("sayisi")-1), secili_row, 5);
                        JOptionPane jOptionPane = new JOptionPane();
                        jOptionPane.showMessageDialog(this, kitapPersonel.personelOduncAldi(), "Bilgi", 1);
                    }
                    else{
                        JOptionPane jOptionPane = new JOptionPane();
                        jOptionPane.showMessageDialog(this, "Stok sayısı yetersiz.", "Stok Hatası", 2);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(JOgrenciEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btn_oduncAlActionPerformed

    private void btn_oduncListesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oduncListesiActionPerformed
        // Ödünç Aldıklarım butonu
        btn_kitapListesi.setEnabled(true);
        btn_iadeEt.setEnabled(true);
        btn_oduncListesi.setEnabled(false);
        btn_oduncAl.setEnabled(false);
        
        lbl_baslik.setText("Ödünç Aldığım Kitaplar");
        
        lbl_kitapAdi.setVisible(false);
        txt_ara.setVisible(false);
        btn_kitapAra.setVisible(false);
        
        KitapPersonel kitapPersonel =  new KitapPersonel();
        
        tablo.getDataVector().removeAllElements();
        
        tablo.setColumnIdentifiers(new String[]{"ID", "Kitap İsmi", "Yazarı", "Yayınevi", "Konusu", "Sayfa Sayısı"});
        
        
        ResultSet resultSet = kitapPersonel.listeleme();     
        try {
            while(resultSet.next()){
                int kitap_id = resultSet.getInt("kitap_id");
                int control_id = resultSet.getInt("personel_id");
                if(control_id == personel_id){
                    ResultSet kitapBilgileri = kitapStok.ara(kitap_id);
                                try {
                        while(kitapBilgileri.next()){

                            kitap_id = kitapBilgileri.getInt("kitap_id");
                            String ismi = kitapBilgileri.getString("ismi").toString();
                            String yazari = kitapBilgileri.getString("yazari").toString();
                            String yayinevi = kitapBilgileri.getString("yayinevi").toString();
                            String konusu = kitapBilgileri.getString("konusu").toString();
                            int sayfasi = kitapBilgileri.getInt("sayfasi");

                            tablo.addRow(new Object []{kitap_id, ismi, yazari, yayinevi, konusu,sayfasi});
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JOgrenciEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }//GEN-LAST:event_btn_oduncListesiActionPerformed

    private void btn_kitapListesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kitapListesiActionPerformed
        // kütüphane kitapları butonu tekrar kütüphane kitaplarını listeliyor
        btn_kitapListesi.setEnabled(false);
        btn_iadeEt.setEnabled(false);
        btn_oduncListesi.setEnabled(true);
        btn_oduncAl.setEnabled(true);
        
        lbl_baslik.setText("Kütüphane Kitapları");
        
        lbl_kitapAdi.setVisible(true);
        txt_ara.setVisible(true);
        btn_kitapAra.setVisible(true);
        
        //tbl_tablo.setModel(tablo);
        tablo.getDataVector().removeAllElements();
        
        ResultSet resultSet = kitapStok.listeleme();
        tablo.setColumnIdentifiers(new String[]{"ID", "Kitap İsmi", "Yazarı", "Yayınevi", "Konusu", "Adet", "Sayfa Sayısı"});
       
        
        try {
            while(resultSet.next()){

                int kitap_id = resultSet.getInt("kitap_id");
                String ismi = resultSet.getString("ismi").toString();
                String yazari = resultSet.getString("yazari").toString();
                String yayinevi = resultSet.getString("yayinevi").toString();
                String konusu = resultSet.getString("konusu").toString();
                int sayisi = resultSet.getInt("sayisi");
                int sayfasi = resultSet.getInt("sayfasi");

                tablo.addRow(new Object []{kitap_id, ismi, yazari, yayinevi, konusu, sayisi, sayfasi});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
    }//GEN-LAST:event_btn_kitapListesiActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        // çıkış butonu
        JAnaEkran jAnaEkran = new JAnaEkran();
        jAnaEkran.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void btn_iadeEtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iadeEtActionPerformed
        // ödünç alınan kitapları iade edecez.
        int secili_row = tbl_tablo.getSelectedRow();
        if(secili_row == -1){
            JOptionPane jOptionPane = new JOptionPane();
            if(tbl_tablo.getRowCount() == 0){
                jOptionPane.showMessageDialog(this, "Tablo Boş.", "Uyarı", 2);
            }
            else{
                jOptionPane.showMessageDialog(this, "Lütfen iade edilecek bir kitap seçin.", "Uyarı", 1);
            }
        }
        else{
            int kitap_id_bilgisi = Integer.parseInt(tablo.getValueAt(secili_row, 0).toString());

            KitapStok kitapStok = new KitapStok();

            ResultSet resultSet = kitapStok.ara(kitap_id_bilgisi);
            
            System.out.println("Kitap id: " + kitap_id_bilgisi + " personel id: " + personel_id);
            
            try {
                while(resultSet.next()){
                    
                    KitapPersonel kitapPersonel = new KitapPersonel(kitap_id_bilgisi, personel_id);
                    kitapPersonel.silme();

                    kitapStok.guncelle(kitap_id_bilgisi,(resultSet.getInt("sayisi")+1) );
                        
                    // model.setValueAt(tf_fiyat.getText(), secili_row, 2);
                    tablo.removeRow(secili_row);
                    JOptionPane jOptionPane = new JOptionPane();
                    jOptionPane.showMessageDialog(this, "İade başarılı.", "Bilgi", 1);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(JOgrenciEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }//GEN-LAST:event_btn_iadeEtActionPerformed

    private void btn_kitapAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kitapAraActionPerformed
        // kitap arama kısmı
        String aranan = txt_ara.getText();
        
        KitapStok kitapStok = new KitapStok();
        ResultSet resultSet = kitapStok.ara(aranan);
        if(aranan.equals("")){
            tablo.getDataVector().removeAllElements();
            
            ResultSet rs = kitapStok.listeleme();
            tablo.setColumnIdentifiers(new String[]{"ID", "Kitap İsmi", "Yazarı", "Yayınevi", "Konusu", "Adet", "Sayfa Sayısı"});

            try {
                while(rs.next()){

                    int kitap_id = rs.getInt("kitap_id");
                    String ismi = rs.getString("ismi").toString();
                    String yazari = rs.getString("yazari").toString();
                    String yayinevi = rs.getString("yayinevi").toString();
                    String konusu = rs.getString("konusu").toString();
                    int sayisi = rs.getInt("sayisi");
                    int sayfasi = rs.getInt("sayfasi");

                    tablo.addRow(new Object []{kitap_id, ismi, yazari, yayinevi, konusu, sayisi, sayfasi});
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else{
            tablo.getDataVector().removeAllElements();
            tablo.setColumnIdentifiers(new String[]{"ID", "Kitap İsmi", "Yazarı", "Yayınevi", "Konusu", "Adet", "Sayfa Sayısı"});
            
            try {
                while(resultSet.next()){
                    
                    int kitap_id = resultSet.getInt("kitap_id");
                    String ismi = resultSet.getString("ismi").toString();
                    String yazari = resultSet.getString("yazari").toString();
                    String yayinevi = resultSet.getString("yayinevi").toString();
                    String konusu = resultSet.getString("konusu").toString();
                    int sayisi = resultSet.getInt("sayisi");
                    int sayfasi = resultSet.getInt("sayfasi");
                    
                    tablo.addRow(new Object []{kitap_id, ismi, yazari, yayinevi, konusu, sayisi, sayfasi});
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            if(tablo.getRowCount() == 0){
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.showMessageDialog(this, "Böyle bir kitap yok.", "Uyarı", 2);
            }
            
        }
        
    }//GEN-LAST:event_btn_kitapAraActionPerformed

    private void tbl_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tabloMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_tabloMouseClicked

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
            java.util.logging.Logger.getLogger(JOgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JOgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JOgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JOgrenciEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JOgrenciEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_iadeEt;
    private javax.swing.JButton btn_kitapAra;
    private javax.swing.JButton btn_kitapListesi;
    private javax.swing.JButton btn_oduncAl;
    private javax.swing.JButton btn_oduncListesi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_baslik;
    private javax.swing.JLabel lbl_kitapAdi;
    private javax.swing.JTable tbl_tablo;
    private javax.swing.JTextField txt_ara;
    // End of variables declaration//GEN-END:variables
}
