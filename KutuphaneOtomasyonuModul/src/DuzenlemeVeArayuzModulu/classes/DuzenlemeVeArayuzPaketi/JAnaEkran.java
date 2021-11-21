
package DuzenlemeVeArayuzPaketi;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import KitapIslemleriPaketi.KitapStok;
import java.sql.*;

import PersonelPaketi.Yonetici;

public class JAnaEkran extends javax.swing.JFrame {
    
    DefaultTableModel tablo = new DefaultTableModel(){
      public boolean isCellEditable(int row, int column){ // tablo mouse ile değişmeyecek
          return false;
      }
    };
    KitapStok kitapStok = new KitapStok();
    
    
    
    public JAnaEkran() { // consructor
        initComponents();
        tbl_kitaplar.setModel(tablo);   // tabloyu ekrana yazdırıyoruz
        
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

        jLabel1 = new javax.swing.JLabel();
        btn_girisYap = new javax.swing.JButton();
        btn_kayitOl = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_kitaplar = new javax.swing.JTable();
        btn_cikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ana Ekran");
        setBounds(new java.awt.Rectangle(650, 250, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Kütüphanemizdeki Kitaplar");

        btn_girisYap.setText("Giriş Yap");
        btn_girisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_girisYapActionPerformed(evt);
            }
        });

        btn_kayitOl.setText("Kayıt Ol");
        btn_kayitOl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kayitOlActionPerformed(evt);
            }
        });

        tbl_kitaplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_kitaplar);

        btn_cikis.setText("Çıkış Yap");
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_girisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_kayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_kayitOl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_girisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
        JOptionPane.showMessageDialog(this, "Kitap almak için giriş yapmalısınız.", "Uyarı",2); // Ana ekran açıldığında bilgiyi verecek
        
    }//GEN-LAST:event_formWindowOpened

    private void btn_girisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_girisYapActionPerformed
        // TODO add your handling code here:
        JGirisYap jGirisYap = new JGirisYap();
        jGirisYap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_girisYapActionPerformed

    private void btn_kayitOlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kayitOlActionPerformed
        // TODO add your handling code here:
        JKayıtOl jKayıtOl = new JKayıtOl();
        jKayıtOl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_kayitOlActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        // TODO add your handling code here:
        Yonetici yonetici = new Yonetici();
        JOptionPane jOptionPane = new JOptionPane();
        jOptionPane.showMessageDialog(this, "Program kapatılıyor.", "Uyarı", 1);
        yonetici.programiKapa();
        
    }//GEN-LAST:event_btn_cikisActionPerformed

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
            java.util.logging.Logger.getLogger(JAnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAnaEkran().setVisible(true);
                
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_girisYap;
    private javax.swing.JButton btn_kayitOl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_kitaplar;
    // End of variables declaration//GEN-END:variables
}
