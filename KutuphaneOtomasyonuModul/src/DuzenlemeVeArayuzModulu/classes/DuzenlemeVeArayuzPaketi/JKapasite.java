
package DuzenlemeVeArayuzPaketi;

import PersonelPaketi.Yonetici;
import KitapIslemleriPaketi.KitapStok;
import javax.swing.JOptionPane;


public class JKapasite extends javax.swing.JFrame {
    int personel_id;
    
    
    public JKapasite() {
        initComponents();
        txt_kitapKapasitesi.setText(String.valueOf(KitapStok.getKutuphaneKitapKapasitesi()));
        txt_personelKapasitesi.setText(String.valueOf(Yonetici.maxCalisanSayisiDondur()));
        
    }
    
    public JKapasite (int personel_id){ // constructor
        initComponents();
        txt_kitapKapasitesi.setText(String.valueOf(KitapStok.getKutuphaneKitapKapasitesi()));
        txt_personelKapasitesi.setText(String.valueOf(Yonetici.maxCalisanSayisiDondur()));
        
        this.personel_id = personel_id;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_kitapKapasitesi = new javax.swing.JTextField();
        txt_personelKapasitesi = new javax.swing.JTextField();
        btn_kapat = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kapasite Düzenleme");
        setBounds(new java.awt.Rectangle(650, 250, 0, 0));
        setResizable(false);

        jLabel1.setText("Kitap Kapasitesi :");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 25));

        jLabel2.setText("Personel Kapasitesi :");

        btn_kapat.setText("Kapat");
        btn_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kapatActionPerformed(evt);
            }
        });

        btn_guncelle.setText("Güncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_guncelle))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_personelKapasitesi, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txt_kitapKapasitesi))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kitapKapasitesi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_personelKapasitesi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kapatActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btn_kapatActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        
        JOptionPane jOptionPane = new JOptionPane();
        
        int calisanSayisi = Yonetici.calisanSayisiDondur();
        int personelKapasitesi = Yonetici.maxCalisanSayisiDondur();
        
        int kutuphaneKapasitesi = KitapStok.getKutuphaneKitapKapasitesi();
        
        int girilenPersonelKapasitesi = Integer.parseInt(txt_personelKapasitesi.getText());
        int girilenKitapKapasitesi = Integer.parseInt(txt_kitapKapasitesi.getText());
        
        
        
        KitapStok.setKutuphaneKitapKapasitesi(girilenKitapKapasitesi);
        
        if(!KitapStok.kutuphaneKapasitesiKontrol() || girilenPersonelKapasitesi < calisanSayisi){
            if(!KitapStok.kutuphaneKapasitesiKontrol() && girilenPersonelKapasitesi < calisanSayisi){
                jOptionPane.showMessageDialog(this, "Mevcut Kitap ve Personel sayılarından daha düşük değerler girdiniz.", "Uyarı", 2);
                KitapStok.setKutuphaneKitapKapasitesi(kutuphaneKapasitesi);
            }
            else if(!KitapStok.kutuphaneKapasitesiKontrol()){
                jOptionPane.showMessageDialog(this, "Mevcut Kitap sayısından daha düşük değerler girdiniz.", "Uyarı", 2);
                KitapStok.setKutuphaneKitapKapasitesi(kutuphaneKapasitesi);
            }
            else{
                jOptionPane.showMessageDialog(this, "Mevcut çalışan sayısından daha az bir değer girdiniz.", "Uyarı", 2);
                KitapStok.setKutuphaneKitapKapasitesi(kutuphaneKapasitesi);
            }
        }
        else{
            Yonetici.maxCalisanSayisiDegistir(girilenPersonelKapasitesi);
            jOptionPane.showMessageDialog(this, "Kapasite değiştirme işlemi başarılı.", "Uyarı", 1);
        }
        
        
        txt_personelKapasitesi.setText(String.valueOf(Yonetici.maxCalisanSayisiDondur()));
        txt_kitapKapasitesi.setText(String.valueOf(KitapStok.getKutuphaneKitapKapasitesi()));
    }//GEN-LAST:event_btn_guncelleActionPerformed

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
            java.util.logging.Logger.getLogger(JKapasite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JKapasite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JKapasite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JKapasite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JKapasite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_kapat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_kitapKapasitesi;
    private javax.swing.JTextField txt_personelKapasitesi;
    // End of variables declaration//GEN-END:variables
}
