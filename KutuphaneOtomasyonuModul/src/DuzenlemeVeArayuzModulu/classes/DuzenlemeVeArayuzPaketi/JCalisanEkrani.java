
package DuzenlemeVeArayuzPaketi;

import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import KitapIslemleriPaketi.KitapStok;
import javax.swing.JOptionPane;
import PersonelPaketi.Ogrenci;
import PersonelPaketi.Yonetici;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import KitapIslemleriPaketi.KitapPersonel;



public class JCalisanEkrani extends javax.swing.JFrame {
    DefaultTableModel tablo = new DefaultTableModel(){
      public boolean isCellEditable(int row, int column){ // tabloyu mouse ile değişemiyrouz
          return false;
      }
    };
    
    KitapStok kitapStok = new  KitapStok();
    
    int personel_id = 0;

    
    public JCalisanEkrani(){
        initComponents();
        this.personel_id = personel_id;
        panel_personel.setVisible(false);
        btn_kitaplar.setEnabled(false);
    }
    public JCalisanEkrani(int personel_id) { // constructor kitapları yazdırıyoruz
        initComponents();
        panel_personel.setVisible(false);
        panel_kitap.setVisible(true);
        
        cb_gorevi.setEnabled(false);
        
        
        
        this.personel_id = personel_id;
        
        btn_kitaplar.setEnabled(false);
        
        
        
        tbl_tablo.setModel(tablo);
        
        ResultSet resultSet = kitapStok.listeleme();
        tablo.setColumnIdentifiers(new String[]{"Kitap ID","Kitap İsmi", "Yazarı", "Yayınevi", "Konusu", "Adet", "Sayfa Sayısı"});
       
        
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

        btn_cinsiyet = new javax.swing.ButtonGroup();
        btn_kitaplar = new javax.swing.JButton();
        btn_ogrenciler = new javax.swing.JButton();
        btn_calisanlar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tablo = new javax.swing.JTable();
        panel_kitap = new javax.swing.JPanel();
        txt_yayinevi = new javax.swing.JTextField();
        lbl_yayinevi = new javax.swing.JLabel();
        lbl_yazari = new javax.swing.JLabel();
        lbl_kitapIsmi = new javax.swing.JLabel();
        txt_kitapIsmi = new javax.swing.JTextField();
        txt_yazari = new javax.swing.JTextField();
        txt_konusu = new javax.swing.JTextField();
        lbl_adeti = new javax.swing.JLabel();
        lbl_sayfaSayisi = new javax.swing.JLabel();
        lbl_konusu = new javax.swing.JLabel();
        txt_adeti = new javax.swing.JTextField();
        txt_sayfaSayisi = new javax.swing.JTextField();
        btn_kitapGuncelle = new javax.swing.JButton();
        btn_kitapEkle = new javax.swing.JButton();
        btn_kitapSil = new javax.swing.JButton();
        panel_personel = new javax.swing.JPanel();
        lbl_kitapIsmi1 = new javax.swing.JLabel();
        lbl_yazari1 = new javax.swing.JLabel();
        lbl_yayinevi1 = new javax.swing.JLabel();
        txt_personelTel = new javax.swing.JTextField();
        txt_personelSoyadi = new javax.swing.JTextField();
        txt_personelAdi = new javax.swing.JTextField();
        lbl_kitapIsmi2 = new javax.swing.JLabel();
        lbl_yazari2 = new javax.swing.JLabel();
        lbl_yayinevi2 = new javax.swing.JLabel();
        txt_personelAdres = new javax.swing.JTextField();
        txt_personelTc = new javax.swing.JTextField();
        lbl_kitapIsmi3 = new javax.swing.JLabel();
        lbl_yazari3 = new javax.swing.JLabel();
        lbl_yayinevi3 = new javax.swing.JLabel();
        txt_personelSifre = new javax.swing.JTextField();
        txt_personelKullaniciAdi = new javax.swing.JTextField();
        btn_personelEkle = new javax.swing.JButton();
        btn_personelSil = new javax.swing.JButton();
        btn_personelGuncelle = new javax.swing.JButton();
        cb_gorevi = new javax.swing.JComboBox<>();
        btn_erkek = new javax.swing.JRadioButton();
        btn_kadin = new javax.swing.JRadioButton();
        btn_diger = new javax.swing.JRadioButton();
        btn_cikisYap = new javax.swing.JButton();
        btn_kapasite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Çalışan Ekrani");
        setBounds(new java.awt.Rectangle(650, 250, 0, 0));
        setResizable(false);

        btn_kitaplar.setText("Kitaplar");
        btn_kitaplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kitaplarActionPerformed(evt);
            }
        });

        btn_ogrenciler.setText("Öğrenciler");
        btn_ogrenciler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ogrencilerActionPerformed(evt);
            }
        });

        btn_calisanlar.setText("Çalışanlar");
        btn_calisanlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calisanlarActionPerformed(evt);
            }
        });

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

        lbl_yayinevi.setText("Yayınevi");

        lbl_yazari.setText("Yazarı:");

        lbl_kitapIsmi.setText("Kitap İsmi:");

        lbl_adeti.setText("Adeti:");

        lbl_sayfaSayisi.setText("Sayfa Sayısı:");

        lbl_konusu.setText("Konusu:");

        btn_kitapGuncelle.setText("Güncelle");
        btn_kitapGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kitapGuncelleActionPerformed(evt);
            }
        });

        btn_kitapEkle.setText("Ekle");
        btn_kitapEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kitapEkleActionPerformed(evt);
            }
        });

        btn_kitapSil.setText("Sil");
        btn_kitapSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kitapSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_kitapLayout = new javax.swing.GroupLayout(panel_kitap);
        panel_kitap.setLayout(panel_kitapLayout);
        panel_kitapLayout.setHorizontalGroup(
            panel_kitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_kitapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_kitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_kitapIsmi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_yazari, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_kitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_yazari, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kitapIsmi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_kitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_kitapLayout.createSequentialGroup()
                        .addComponent(lbl_yayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_yayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_kitapLayout.createSequentialGroup()
                        .addComponent(lbl_konusu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_konusu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_sayfaSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_sayfaSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_kitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_kitapSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kitapEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kitapGuncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        panel_kitapLayout.setVerticalGroup(
            panel_kitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_kitapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_kitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_kitapIsmi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_kitapIsmi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_adeti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_yayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_yayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_kitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_yazari, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_kitapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_yazari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_konusu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_konusu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_sayfaSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_sayfaSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(panel_kitapLayout.createSequentialGroup()
                .addComponent(btn_kitapEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btn_kitapSil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_kitapGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_personel.setPreferredSize(new java.awt.Dimension(900, 200));

        lbl_kitapIsmi1.setText("Adı:");

        lbl_yazari1.setText("Soyadı:");

        lbl_yayinevi1.setText("Tel No:");

        lbl_kitapIsmi2.setText("TC No:");

        lbl_yazari2.setText("Adres:");

        lbl_yayinevi2.setText("Görevi:");

        lbl_kitapIsmi3.setText("Kullanıcı Adı:");

        lbl_yazari3.setText("Şifre:");

        lbl_yayinevi3.setText("Cinsiyet:");

        btn_personelEkle.setText("Ekle");
        btn_personelEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personelEkleActionPerformed(evt);
            }
        });

        btn_personelSil.setText("Sil");
        btn_personelSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personelSilActionPerformed(evt);
            }
        });

        btn_personelGuncelle.setText("Güncelle");
        btn_personelGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personelGuncelleActionPerformed(evt);
            }
        });

        cb_gorevi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Öğrenci", "Çalışan" }));
        cb_gorevi.setPreferredSize(new java.awt.Dimension(120, 30));

        btn_cinsiyet.add(btn_erkek);
        btn_erkek.setText("Erkek");
        btn_erkek.setPreferredSize(new java.awt.Dimension(53, 30));

        btn_cinsiyet.add(btn_kadin);
        btn_kadin.setText("Kadın");
        btn_kadin.setPreferredSize(new java.awt.Dimension(53, 30));

        btn_cinsiyet.add(btn_diger);
        btn_diger.setText("Diğer");
        btn_diger.setPreferredSize(new java.awt.Dimension(53, 30));

        javax.swing.GroupLayout panel_personelLayout = new javax.swing.GroupLayout(panel_personel);
        panel_personel.setLayout(panel_personelLayout);
        panel_personelLayout.setHorizontalGroup(
            panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_personelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_personelLayout.createSequentialGroup()
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_kitapIsmi1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_yazari1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_personelSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_personelAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_personelLayout.createSequentialGroup()
                        .addComponent(lbl_yayinevi1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_personelTel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_kitapIsmi2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_yazari2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_yayinevi2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_gorevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_personelAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_personelTc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_kitapIsmi3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_yazari3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_yayinevi3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_personelLayout.createSequentialGroup()
                        .addComponent(txt_personelKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_personelEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_personelLayout.createSequentialGroup()
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_personelLayout.createSequentialGroup()
                                .addComponent(btn_erkek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_kadin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_diger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_personelSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_personelSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_personelGuncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45))
        );
        panel_personelLayout.setVerticalGroup(
            panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_personelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_personelLayout.createSequentialGroup()
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_kitapIsmi3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_personelKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_personelEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_yazari3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_personelSil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_personelSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_personelGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_personelLayout.createSequentialGroup()
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_kitapIsmi2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_personelTc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_yazari2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_personelAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_yayinevi2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_gorevi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_yayinevi3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_erkek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kadin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_diger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_personelLayout.createSequentialGroup()
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_kitapIsmi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_personelAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_yazari1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_personelSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_personelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_yayinevi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_personelTel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btn_cikisYap.setText("Çıkış Yap");
        btn_cikisYap.setPreferredSize(new java.awt.Dimension(130, 37));
        btn_cikisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisYapActionPerformed(evt);
            }
        });

        btn_kapasite.setText("Kapasite Değiştir");
        btn_kapasite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kapasiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btn_kitaplar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ogrenciler, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_calisanlar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cikisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_personel, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
                    .addComponent(panel_kitap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calisanlar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ogrenciler, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kitaplar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cikisYap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_personel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_kitap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kitaplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kitaplarActionPerformed
        // kitap listelemesi, düzenlenmesi vb.
        
        panel_personel.setVisible(false);
        panel_kitap.setVisible(true);
        
        btn_kitaplar.setEnabled(false);
        btn_ogrenciler.setEnabled(true);
        btn_calisanlar.setEnabled(true);
        
        
        tbl_tablo.setModel(tablo);
        
        tablo.getDataVector().removeAllElements(); // tablo temizleme
        
        ResultSet resultSet = kitapStok.listeleme();
        tablo.setColumnIdentifiers(new String[]{"Kitap ID","Kitap İsmi", "Yazarı", "Yayınevi", "Konusu", "Adet", "Sayfa Sayısı"});
       
        
        try {
            while(resultSet.next()){

                int kitap_id = resultSet.getInt("kitap_id");
                String ismi = resultSet.getString("ismi").toString();
                String yazari = resultSet.getString("yazari").toString();
                String yayinevi = resultSet.getString("yayinevi").toString();
                String konusu = resultSet.getString("konusu").toString();
                int sayisi = resultSet.getInt("sayisi");
                int sayfasi = resultSet.getInt("sayfasi");

                tablo.addRow(new Object []{kitap_id,ismi, yazari, yayinevi, konusu, sayisi, sayfasi});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
    }//GEN-LAST:event_btn_kitaplarActionPerformed

    private void btn_ogrencilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ogrencilerActionPerformed
        
        panel_kitap.setVisible(false);
        panel_personel.setVisible(true);
        
        btn_ogrenciler.setEnabled(false);
        btn_kitaplar.setEnabled(true);
        btn_calisanlar.setEnabled(true);
        
        cb_gorevi.setSelectedItem("Öğrenci");
        
        
        tablo.getDataVector().removeAllElements(); // tablo temizleme
        tablo.setColumnIdentifiers(new String[]{"Personel ID", "Adı", "Soyadı", "Tel No", "TC No", "Görevi", "Adresi", "Kullanıcı Adı", "Kullanıcı Şifre", "cinsiyet"});
        
        Ogrenci ogrenci = new Ogrenci();
        ResultSet resultSet = ogrenci.listeleme();
        
        try {
            while(resultSet.next()){
                if(resultSet.getString("gorevi").equals("Öğrenci")){
                    int personel_id2 = resultSet.getInt("personel_id");
                    String adi = resultSet.getString("adi");
                    String soyadi = resultSet.getString("soyadi");
                    String telno = resultSet.getString("telno");
                    String tcno = resultSet.getString("tcno");
                    String gorevi = resultSet.getString("gorevi");
                    String adresi = resultSet.getString("adresi");
                    String kullaniciadi = resultSet.getString("kullaniciadi");
                    String kullanicisifre = resultSet.getString("kullanicisifre");
                    String cinsiyet = resultSet.getString("cinsiyet");

                    tablo.addRow(new Object []{personel_id2, adi, soyadi, telno, tcno, gorevi, adresi, kullaniciadi, kullanicisifre, cinsiyet});
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(JCalisanEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_ogrencilerActionPerformed

    private void btn_calisanlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calisanlarActionPerformed
        
        panel_kitap.setVisible(false);
        panel_personel.setVisible(true);
        
        btn_calisanlar.setEnabled(false);
        btn_ogrenciler.setEnabled(true);
        btn_kitaplar.setEnabled(true);
        
        
        cb_gorevi.setSelectedItem("Çalışan");
        
        
        tablo.getDataVector().removeAllElements(); // tablo temizleme
        tablo.setColumnIdentifiers(new String[]{"Personel ID", "Adı", "Soyadı", "Tel No", "TC No", "Görevi", "Adresi", "Kullanıcı Adı", "Kullanıcı Şifre", "cinsiyet"});
        
        Yonetici yonetici = new Yonetici();
        ResultSet resultSet = yonetici.listeleme();
        //String calisan_sayimiz = String.valueOf(yonetici.calisanSayisiDondur());
        
        try {
            while(resultSet.next()){
                int personel_id2 = resultSet.getInt("personel_id");
                String adi = resultSet.getString("adi");
                String soyadi = resultSet.getString("soyadi");
                String telno = resultSet.getString("telno");
                String tcno = resultSet.getString("tcno");
                String gorevi = resultSet.getString("gorevi");
                String adresi = resultSet.getString("adresi");
                String kullaniciadi = resultSet.getString("kullaniciadi");
                String kullanicisifre = resultSet.getString("kullanicisifre");
                String cinsiyet = resultSet.getString("cinsiyet");
                
                tablo.addRow(new Object []{personel_id2, adi, soyadi, telno, tcno, gorevi, adresi, kullaniciadi, kullanicisifre, cinsiyet});
            }
        } catch (SQLException ex) {
            Logger.getLogger(JCalisanEkrani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_calisanlarActionPerformed

    private void btn_cikisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisYapActionPerformed
        // ana ekrana dönüyor
        JAnaEkran jAnaEkran = new JAnaEkran();
        jAnaEkran.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cikisYapActionPerformed

    private void tbl_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tabloMouseClicked
        // mouse ile tıklandığında veri alıyoruz txtlere yazıyoruz
        
        DefaultTableModel model = (DefaultTableModel) tbl_tablo.getModel();
        
        
        
        int secili_row = tbl_tablo.getSelectedRow();
        if(!btn_kitaplar.isEnabled()){
            txt_kitapIsmi.setText(model.getValueAt(secili_row, 1).toString());
            txt_yazari.setText(model.getValueAt(secili_row, 2).toString());
            txt_yayinevi.setText(model.getValueAt(secili_row, 3).toString());
            txt_konusu.setText(model.getValueAt(secili_row, 4).toString());
            txt_adeti.setText(model.getValueAt(secili_row, 5).toString());
            txt_sayfaSayisi.setText(model.getValueAt(secili_row, 6).toString());
        }
        else{
            txt_personelAdi.setText(model.getValueAt(secili_row, 1).toString());
            txt_personelSoyadi.setText(model.getValueAt(secili_row, 2).toString());
            txt_personelTel.setText(model.getValueAt(secili_row, 3).toString());
            txt_personelTc.setText(model.getValueAt(secili_row, 4).toString());
            txt_personelAdres.setText(model.getValueAt(secili_row, 6).toString());
            txt_personelKullaniciAdi.setText(model.getValueAt(secili_row, 7).toString());
            txt_personelSifre.setText(model.getValueAt(secili_row, 8).toString());
            if(model.getValueAt(secili_row, 9).equals("Erkek")){
                btn_erkek.setSelected(true);
            }
            else if(model.getValueAt(secili_row, 9).equals("Kadın")){
                btn_kadin.setSelected(true);
            }
            else{
                btn_diger.setSelected(true);
            }
        }
        
        
        
    }//GEN-LAST:event_tbl_tabloMouseClicked

    private void btn_kitapEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kitapEkleActionPerformed
        // kitap ekleme
        // "ID", "Kitap İsmi", "Yazarı", "Yayınevi", "Konusu", "Adet", "Sayfa Sayısı"
        JOptionPane jOptionPane = new JOptionPane();
        
        //DefaultTableModel model = (DefaultTableModel) tbl_tablo.getModel();
        
        int secili_row = tbl_tablo.getSelectedRow();
        
        String kitap_ismi = txt_kitapIsmi.getText().trim();
        String yazari = txt_yazari.getText().trim();
        String yayinevi = txt_yayinevi.getText().trim();
        String konusu = txt_konusu.getText().trim();
        String adet = txt_adeti.getText().trim();
        String sayfa_sayisi = txt_sayfaSayisi.getText().trim();
        
        if(kitap_ismi.equals("") || yazari.equals("") || yayinevi.equals("") || konusu.equals("") || adet.equals("") || sayfa_sayisi.equals("") ){
            
            jOptionPane.showMessageDialog(this, "Lütfen boşta alan kalmasın.", "Hata", 2);
        }
        else{
            
            if(KitapStok.kutuphaneKapasitesiKontrol()){
                kitapStok.ekleme(kitap_ismi, yazari, yayinevi, konusu, Integer.parseInt(adet), Integer.parseInt(sayfa_sayisi));

                tbl_tablo.setModel(tablo);

                tablo.getDataVector().removeAllElements(); // tablo temizleme

                ResultSet resultSet = kitapStok.listeleme();
                tablo.setColumnIdentifiers(new String[]{"Kitap ID","Kitap İsmi", "Yazarı", "Yayınevi", "Konusu", "Adet", "Sayfa Sayısı"});


                try {
                    while(resultSet.next()){

                        int kitap_id = resultSet.getInt("kitap_id");
                        String ismi = resultSet.getString("ismi").toString();
                        yazari = resultSet.getString("yazari").toString();
                        yayinevi = resultSet.getString("yayinevi").toString();
                        konusu = resultSet.getString("konusu").toString();
                        int sayisi = resultSet.getInt("sayisi");
                        int sayfasi = resultSet.getInt("sayfasi");

                        tablo.addRow(new Object []{kitap_id,ismi, yazari, yayinevi, konusu, sayisi, sayfasi});

                        txt_kitapIsmi.setText("");
                        txt_yazari.setText("");
                        txt_yayinevi.setText("");
                        txt_konusu.setText("");
                        txt_adeti.setText("");
                        txt_sayfaSayisi.setText("");

                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            else{
                jOptionPane.showMessageDialog(this, "Kitap kapasitesi yetersiz.", "Uyarı", 2);
                txt_kitapIsmi.setText("");
                txt_yazari.setText("");
                txt_yayinevi.setText("");
                txt_konusu.setText("");
                txt_adeti.setText("");
                txt_sayfaSayisi.setText("");
            }
            
        }
        
    }//GEN-LAST:event_btn_kitapEkleActionPerformed

    private void btn_kitapSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kitapSilActionPerformed
        // kitabı silme kısmı
        int secili_row = tbl_tablo.getSelectedRow();
        if(secili_row == -1){
            JOptionPane jOptionPane = new JOptionPane();
            if(tbl_tablo.getRowCount() == 0){
                jOptionPane.showMessageDialog(this, "Tablo Boş.", "Uyarı", 2);
            }
            else{
                jOptionPane.showMessageDialog(this, "Lütfen silinecek bir kitap seçin.", "Uyarı", 1);
            }
        }
        else{
            int kitap_id = Integer.parseInt(tablo.getValueAt(secili_row, 0).toString());
            
            KitapPersonel kitapPersonel = new KitapPersonel();
            kitapPersonel.silme(kitap_id, true);
            kitapStok.silme(kitap_id);
            tablo.removeRow(secili_row);
            
            txt_kitapIsmi.setText("");
            txt_yazari.setText("");
            txt_yayinevi.setText("");
            txt_konusu.setText("");
            txt_adeti.setText("");
            txt_sayfaSayisi.setText("");
        }
    }//GEN-LAST:event_btn_kitapSilActionPerformed

    private void btn_kitapGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kitapGuncelleActionPerformed
        // kitap guncelleme işlemleri
        int secili_row = tbl_tablo.getSelectedRow();
        if(secili_row == -1){
            JOptionPane jOptionPane = new JOptionPane();
            if(tbl_tablo.getRowCount() == 0){
                jOptionPane.showMessageDialog(this, "Tablo Boş.", "Uyarı", 2);
            }
            else{
                jOptionPane.showMessageDialog(this, "Lütfen silinecek bir kitap seçin.", "Uyarı", 1);
            }
        }
        else{
            String kitap_ismi = txt_kitapIsmi.getText().trim();
            String yazari = txt_yazari.getText().trim();
            String yayinevi = txt_yayinevi.getText().trim();
            String konusu = txt_konusu.getText().trim();
            String adet = txt_adeti.getText().trim();
            String sayfa_sayisi = txt_sayfaSayisi.getText().trim();
            int kitap_id = Integer.parseInt(tablo.getValueAt(secili_row, 0).toString());

            if(kitap_ismi.equals("") || yazari.equals("") || yayinevi.equals("") || konusu.equals("") || adet.equals("") || sayfa_sayisi.equals("") ){
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.showMessageDialog(this, "Lütfen boşta alan kalmasın.", "Hata", 2);
            }
            else{
                kitapStok.guncelle(kitap_id, kitap_ismi, yazari, yayinevi, konusu, Integer.parseInt(adet), Integer.parseInt(sayfa_sayisi));
                tablo.setValueAt(kitap_id, secili_row, 0);
                tablo.setValueAt(kitap_ismi, secili_row, 1);
                tablo.setValueAt(yazari, secili_row, 2);
                tablo.setValueAt(yayinevi, secili_row, 3);
                tablo.setValueAt(konusu, secili_row, 4);
                tablo.setValueAt(Integer.parseInt(adet), secili_row, 5);
                tablo.setValueAt(Integer.parseInt(sayfa_sayisi), secili_row, 6);
                
                txt_kitapIsmi.setText("");
                txt_yazari.setText("");
                txt_yayinevi.setText("");
                txt_konusu.setText("");
                txt_adeti.setText("");
                txt_sayfaSayisi.setText("");
            }  
        }
    }//GEN-LAST:event_btn_kitapGuncelleActionPerformed

    private void btn_personelEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personelEkleActionPerformed
        // Personel ekleme kısmı
            String adi = txt_personelAdi.getText().trim();
            String soyadi = txt_personelSoyadi.getText().trim();
            String telno = txt_personelTel.getText().trim();
            String tcno = txt_personelTc.getText().trim();
            String adresi = txt_personelAdres.getText().trim();
            String kullaniciadi = txt_personelKullaniciAdi.getText().trim();
            String kullanicisifre = txt_personelSifre.getText().trim();
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
        if(cb_gorevi.getSelectedItem().equals("Öğrenci")){
            

            if(adi.equals("") || soyadi.equals("") || telno.equals("") || tcno.equals("") || adresi.equals("") || kullaniciadi.equals("") || kullanicisifre.equals("") || cinsiyet.equals("")){
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.showMessageDialog(this, "Lütfen boşta alan kalmasın.", "Hata", 2);
            }
            else{
                Ogrenci ogrenci = new Ogrenci();
                
                adi = adi.substring(0,1).toUpperCase() + adi.substring(1).toLowerCase();
                soyadi = soyadi.toUpperCase();
                
                ogrenci.ekleme(adi, soyadi, telno, tcno, adresi, kullaniciadi, kullanicisifre, cinsiyet);
                
                tablo.getDataVector().removeAllElements(); // tablo temizleme
                tablo.setColumnIdentifiers(new String[]{"Personel ID", "Adı", "Soyadı", "Tel No", "TC No", "Görevi", "Adresi", "Kullanıcı Adı", "Kullanıcı Şifre", "cinsiyet"});

                //Yonetici yonetici = new Yonetici();
                ResultSet resultSet = ogrenci.listeleme();

                try {
                    while(resultSet.next()){
                        if(resultSet.getString("gorevi").equals("Öğrenci")){
                            int personel_id = resultSet.getInt("personel_id");
                            adi = resultSet.getString("adi");
                            soyadi = resultSet.getString("soyadi");
                            telno = resultSet.getString("telno");
                            tcno = resultSet.getString("tcno");
                            String gorevi = resultSet.getString("gorevi");
                            adresi = resultSet.getString("adresi");
                            kullaniciadi = resultSet.getString("kullaniciadi");
                            kullanicisifre = resultSet.getString("kullanicisifre");
                            cinsiyet = resultSet.getString("cinsiyet");

                            tablo.addRow(new Object []{personel_id, adi, soyadi, telno, tcno, gorevi, adresi, kullaniciadi, kullanicisifre, cinsiyet});
                        }
                        
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JCalisanEkrani.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
            
        }// öğrenci bitişi
        else{
            
            if(Yonetici.maxCalisanSayisiDondur() > Yonetici.calisanSayisiDondur()){
                    if(adi.equals("") || soyadi.equals("") || telno.equals("") || tcno.equals("") || adresi.equals("") || kullaniciadi.equals("") || kullanicisifre.equals("") || cinsiyet.equals("")){
                    JOptionPane jOptionPane = new JOptionPane();
                    jOptionPane.showMessageDialog(this, "Lütfen boşta alan kalmasın.", "Hata", 2);
                    }
                    else{
                        Yonetici yonetici = new Yonetici();

                        adi = adi.substring(0,1).toUpperCase() + adi.substring(1).toLowerCase();
                        soyadi = soyadi.toUpperCase();

                        yonetici.ekleme(adi, soyadi, telno, tcno, adresi, kullaniciadi, kullanicisifre, cinsiyet);

                        tablo.getDataVector().removeAllElements(); // tablo temizleme
                        tablo.setColumnIdentifiers(new String[]{"Personel ID", "Adı", "Soyadı", "Tel No", "TC No", "Görevi", "Adresi", "Kullanıcı Adı", "Kullanıcı Şifre", "cinsiyet"});

                        ResultSet resultSet = yonetici.listeleme();

                        try {
                            while(resultSet.next()){
                                int personel_id = resultSet.getInt("personel_id");
                                adi = resultSet.getString("adi");
                                soyadi = resultSet.getString("soyadi");
                                telno = resultSet.getString("telno");
                                tcno = resultSet.getString("tcno");
                                String gorevi = resultSet.getString("gorevi");
                                adresi = resultSet.getString("adresi");
                                kullaniciadi = resultSet.getString("kullaniciadi");
                                kullanicisifre = resultSet.getString("kullanicisifre");
                                cinsiyet = resultSet.getString("cinsiyet");

                                tablo.addRow(new Object []{personel_id, adi, soyadi, telno, tcno, gorevi, adresi, kullaniciadi, kullanicisifre, cinsiyet});
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(JCalisanEkrani.class.getName()).log(Level.SEVERE, null, ex);
                        } 
                    }
            }
            else{
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.showMessageDialog(this, "Çalışan kapasitesi yetersiz.", "Uyarı", 2);
            }
            
            
        }
                txt_personelAdi.setText("");
                txt_personelSoyadi.setText("");
                txt_personelTel.setText("");
                txt_personelTc.setText("");
                txt_personelAdres.setText("");
                txt_personelKullaniciAdi.setText("");
                txt_personelSifre.setText("");
                btn_cinsiyet.clearSelection();
        
        
    }//GEN-LAST:event_btn_personelEkleActionPerformed

    private void btn_kapasiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kapasiteActionPerformed
        
        JKapasite jKapasite = new JKapasite(personel_id);
        jKapasite.setVisible(true);
        
        
    }//GEN-LAST:event_btn_kapasiteActionPerformed

    private void btn_personelSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personelSilActionPerformed
        // personel silme yeri
        
        int secili_row = tbl_tablo.getSelectedRow();
        if(secili_row == -1){
            JOptionPane jOptionPane = new JOptionPane();
            if(tbl_tablo.getRowCount() == 0){
                jOptionPane.showMessageDialog(this, "Tablo Boş.", "Uyarı", 2);
            }
            else{
                jOptionPane.showMessageDialog(this, "Lütfen silinecek bir kitap seçin.", "Uyarı", 1);
            }
        }
        else{
            int personel_id = Integer.parseInt(tablo.getValueAt(secili_row, 0).toString());
            
            if(tablo.getValueAt(secili_row, 5).toString().equals("Öğrenci")){
                    KitapPersonel kitapPersonel = new KitapPersonel();
                    kitapPersonel.silme(personel_id);
                    Ogrenci ogrenci = new Ogrenci();
                    ogrenci.silme(personel_id);
            }
            else{
                Yonetici yonetici = new Yonetici();
                yonetici.silme(personel_id);
            }
            tablo.removeRow(secili_row);
            
        }
        
    }//GEN-LAST:event_btn_personelSilActionPerformed

    private void btn_personelGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personelGuncelleActionPerformed
        // personel güncelleme
        
        int secili_row = tbl_tablo.getSelectedRow();
        if(secili_row == -1){
            JOptionPane jOptionPane = new JOptionPane();
            if(tbl_tablo.getRowCount() == 0){
                jOptionPane.showMessageDialog(this, "Tablo Boş.", "Uyarı", 2);
            }
            else{
                jOptionPane.showMessageDialog(this, "Lütfen güncellenecek bir personel seçin.", "Uyarı", 1);
            }
        }
        else{
            
            String adi = txt_personelAdi.getText().trim();
            String soyadi = txt_personelSoyadi.getText().trim();
            String telno = txt_personelTel.getText().trim();
            String tcno = txt_personelTc.getText().trim();
            String adresi = txt_personelAdres.getText().trim();
            String kullaniciadi = txt_personelKullaniciAdi.getText().trim();
            String kullanicisifre = txt_personelSifre.getText().trim();
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
            String gorevi = cb_gorevi.getSelectedItem().toString();
            
            int personel_id = Integer.parseInt(tablo.getValueAt(secili_row, 0).toString());

            if(adi.equals("") || soyadi.equals("") || telno.equals("") || tcno.equals("") || adresi.equals("") || kullaniciadi.equals("") || kullanicisifre.equals("") || cinsiyet.equals("") ){
                JOptionPane jOptionPane = new JOptionPane();
                jOptionPane.showMessageDialog(this, "Lütfen boşta alan kalmasın.", "Hata", 2);
            }
            else{
                Ogrenci ogrenci = new Ogrenci();
                ogrenci.guncelleme(personel_id, adi, soyadi, telno, tcno, adresi, kullaniciadi, kullanicisifre, cinsiyet);
                tablo.setValueAt(personel_id, secili_row, 0);
                tablo.setValueAt(adi, secili_row, 1);
                tablo.setValueAt(soyadi, secili_row, 2);
                tablo.setValueAt(telno, secili_row, 3);
                tablo.setValueAt(tcno, secili_row, 4);
                tablo.setValueAt(gorevi, secili_row, 5);
                tablo.setValueAt(adresi, secili_row, 6);
                tablo.setValueAt(kullaniciadi, secili_row, 7);
                tablo.setValueAt(kullanicisifre, secili_row, 8);
                tablo.setValueAt(cinsiyet, secili_row, 9);
                
                txt_personelAdi.setText("");
                txt_personelSoyadi.setText("");
                txt_personelTel.setText("");
                txt_personelTc.setText("");
                txt_personelAdres.setText("");
                txt_personelKullaniciAdi.setText("");
                txt_personelSifre.setText("");
                btn_cinsiyet.clearSelection();
                
            }  
        }
        
        
    }//GEN-LAST:event_btn_personelGuncelleActionPerformed

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
            java.util.logging.Logger.getLogger(JCalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCalisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCalisanEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calisanlar;
    private javax.swing.JButton btn_cikisYap;
    private javax.swing.ButtonGroup btn_cinsiyet;
    private javax.swing.JRadioButton btn_diger;
    private javax.swing.JRadioButton btn_erkek;
    private javax.swing.JRadioButton btn_kadin;
    private javax.swing.JButton btn_kapasite;
    private javax.swing.JButton btn_kitapEkle;
    private javax.swing.JButton btn_kitapGuncelle;
    private javax.swing.JButton btn_kitapSil;
    private javax.swing.JButton btn_kitaplar;
    private javax.swing.JButton btn_ogrenciler;
    private javax.swing.JButton btn_personelEkle;
    private javax.swing.JButton btn_personelGuncelle;
    private javax.swing.JButton btn_personelSil;
    private javax.swing.JComboBox<String> cb_gorevi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_adeti;
    private javax.swing.JLabel lbl_kitapIsmi;
    private javax.swing.JLabel lbl_kitapIsmi1;
    private javax.swing.JLabel lbl_kitapIsmi2;
    private javax.swing.JLabel lbl_kitapIsmi3;
    private javax.swing.JLabel lbl_konusu;
    private javax.swing.JLabel lbl_sayfaSayisi;
    private javax.swing.JLabel lbl_yayinevi;
    private javax.swing.JLabel lbl_yayinevi1;
    private javax.swing.JLabel lbl_yayinevi2;
    private javax.swing.JLabel lbl_yayinevi3;
    private javax.swing.JLabel lbl_yazari;
    private javax.swing.JLabel lbl_yazari1;
    private javax.swing.JLabel lbl_yazari2;
    private javax.swing.JLabel lbl_yazari3;
    private javax.swing.JPanel panel_kitap;
    private javax.swing.JPanel panel_personel;
    private javax.swing.JTable tbl_tablo;
    private javax.swing.JTextField txt_adeti;
    private javax.swing.JTextField txt_kitapIsmi;
    private javax.swing.JTextField txt_konusu;
    private javax.swing.JTextField txt_personelAdi;
    private javax.swing.JTextField txt_personelAdres;
    private javax.swing.JTextField txt_personelKullaniciAdi;
    private javax.swing.JTextField txt_personelSifre;
    private javax.swing.JTextField txt_personelSoyadi;
    private javax.swing.JTextField txt_personelTc;
    private javax.swing.JTextField txt_personelTel;
    private javax.swing.JTextField txt_sayfaSayisi;
    private javax.swing.JTextField txt_yayinevi;
    private javax.swing.JTextField txt_yazari;
    // End of variables declaration//GEN-END:variables
}
