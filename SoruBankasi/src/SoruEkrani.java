
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casper
 */
public class SoruEkrani extends javax.swing.JDialog {

   DefaultTableModel  model;
   
   SoruIslemleri islemler = new SoruIslemleri();
    
    
    public SoruEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
        model = (DefaultTableModel)soru_tablosu.getModel();
        soruGoruntule(); // acılır acılmaz tablonun dolmasını sagladık
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        soru_tablosu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sik4 = new javax.swing.JTextField();
        sik1 = new javax.swing.JTextField();
        sik2 = new javax.swing.JTextField();
        sik3 = new javax.swing.JTextField();
        cevap = new javax.swing.JTextField();
        soru = new javax.swing.JTextField();
        mesaj_alani = new javax.swing.JLabel();
        soruEkle = new javax.swing.JButton();
        soruGuncelle = new javax.swing.JButton();
        soruListele = new javax.swing.JButton();
        soruSil = new javax.swing.JButton();
        temizle = new javax.swing.JButton();
        geri = new javax.swing.JButton();
        soruTipi = new javax.swing.JComboBox<>();
        ders_adi = new javax.swing.JComboBox<>();
        puan = new javax.swing.JComboBox<>();
        zorluk_derecesi = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        soru_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Soru Tipi", "Ders Adı", "Soru", "Şık 1", "Şık 2", "Şık 3", "Şık 4", "Cevap", "Puan", "Zorluk Derecesi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        soru_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soru_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(soru_tablosu);
        if (soru_tablosu.getColumnModel().getColumnCount() > 0) {
            soru_tablosu.getColumnModel().getColumn(0).setResizable(false);
            soru_tablosu.getColumnModel().getColumn(1).setResizable(false);
            soru_tablosu.getColumnModel().getColumn(2).setResizable(false);
            soru_tablosu.getColumnModel().getColumn(3).setResizable(false);
            soru_tablosu.getColumnModel().getColumn(4).setResizable(false);
            soru_tablosu.getColumnModel().getColumn(5).setResizable(false);
            soru_tablosu.getColumnModel().getColumn(6).setResizable(false);
            soru_tablosu.getColumnModel().getColumn(7).setResizable(false);
            soru_tablosu.getColumnModel().getColumn(8).setResizable(false);
            soru_tablosu.getColumnModel().getColumn(9).setResizable(false);
            soru_tablosu.getColumnModel().getColumn(10).setResizable(false);
        }

        jLabel1.setText("Soru Tipi");

        jLabel2.setText("Ders Adı");

        jLabel3.setText("Soru");

        jLabel4.setText("Şık 1");

        jLabel5.setText("Şık 2");

        jLabel6.setText("Şık 3");

        jLabel7.setText("Şık 4");

        jLabel8.setText("Cevap");

        jLabel9.setText("Puan");

        jLabel10.setText("Zorluk Derecesi");

        mesaj_alani.setForeground(new java.awt.Color(255, 51, 51));

        soruEkle.setText("Yeni Soru EKLE");
        soruEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soruEkleActionPerformed(evt);
            }
        });

        soruGuncelle.setText("Soru GÜNCELLE");
        soruGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soruGuncelleActionPerformed(evt);
            }
        });

        soruListele.setText("Soru LİSTELE");
        soruListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soruListeleActionPerformed(evt);
            }
        });

        soruSil.setText("Soru SİL");
        soruSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soruSilActionPerformed(evt);
            }
        });

        temizle.setText("TEMİZLE");
        temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizleActionPerformed(evt);
            }
        });

        geri.setText("Geri DÖN");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        soruTipi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Çoktan Seçmeli", "Klasik", "Doğru / Yanlış" }));

        ders_adi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Türkçe", "Matematik", "Genel Kültür" }));

        puan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        zorluk_derecesi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(soru, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(304, 304, 304))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(ders_adi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(soruTipi, 0, 208, Short.MAX_VALUE))
                                            .addGap(250, 250, 250)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cevap, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soruSil, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(soruListele, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(soruGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(soruEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(temizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sik3)
                                        .addComponent(sik4, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
                                .addComponent(jLabel2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3))
                                            .addGap(36, 36, 36))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sik1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sik2)))))
                        .addGap(0, 157, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(zorluk_derecesi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(puan, 0, 237, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mesaj_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(geri)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(soruTipi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(ders_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(soruEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(soru, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(soruGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(sik1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sik2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(sik3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sik4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cevap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(puan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soruSil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soruListele, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(temizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(zorluk_derecesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(mesaj_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(geri))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soruEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soruEkleActionPerformed
  // soru ekleye basınca olacaklar....
      
  mesaj_alani.setText(" ");
  
  String SoruTipi =soruTipi.getSelectedItem().toString();
  String DersAdi =ders_adi.getSelectedItem().toString();
  String Soru =soru.getText();
  String Sik1 =sik1.getText();
  String Sik2 =sik2.getText();
  String Sik3 =sik3.getText();
  String Sik4 =sik4.getText();
  String Cevap =cevap.getText();
  String Puan = puan.getSelectedItem().toString();
  String ZorlukDerecesi = zorluk_derecesi.getSelectedItem().toString();
  
  islemler.soruEkle(SoruTipi,DersAdi,Soru,Sik1,Sik2,Sik3,Sik4,Cevap,Puan,ZorlukDerecesi);
  
  soruGoruntule();
  
  mesaj_alani.setText("Yeni soru başarıyla eklendi...");
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_soruEkleActionPerformed

    private void soruListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soruListeleActionPerformed
        // Soru Listele butonuna basılınca olacaklar
        
        
        mesaj_alani.setText(" ");
        soruGoruntule();
        mesaj_alani.setText("Sorular başarıyla listelendi...");
        
        
        
        
        
    }//GEN-LAST:event_soruListeleActionPerformed

    private void soruSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soruSilActionPerformed

     //soru sil butonuna basılınca olacaklar...
     
      mesaj_alani.setText(" ");
      
      int selectedrow=soru_tablosu.getSelectedRow();
     
      
      if(selectedrow == -1 ){
          if(model.getRowCount()==0){
               mesaj_alani.setText("soru tablosu şuanda boş...");
          }
          else{
              mesaj_alani.setText("lütfen silinecek bir soru seçiniz...");
          }
      }
      else{
          int id=(int)model.getValueAt(selectedrow, 0);
          
          islemler.soruSil(id);
          
          soruGoruntule();
          mesaj_alani.setText("soru başarıyla silindi...");
          
      }
     
     
     
     
    }//GEN-LAST:event_soruSilActionPerformed

    private void soru_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soru_tablosuMouseClicked

 //tabloya tıklayınca verileri text alanlarına aktarılmasını sağladık...
 int selectedrow = soru_tablosu.getSelectedRow();
 
 soruTipi.setSelectedItem(model.getValueAt(selectedrow, 1).toString());
  ders_adi.setSelectedItem(model.getValueAt(selectedrow, 2).toString());
   soru.setText(model.getValueAt(selectedrow, 3).toString());
    sik1.setText(model.getValueAt(selectedrow, 4).toString());
     sik2.setText(model.getValueAt(selectedrow, 5).toString());
      sik3.setText(model.getValueAt(selectedrow, 6).toString());
       sik4.setText(model.getValueAt(selectedrow, 7).toString());
        cevap.setText(model.getValueAt(selectedrow, 8).toString());
         puan.setSelectedItem(model.getValueAt(selectedrow, 9).toString());
          zorluk_derecesi.setSelectedItem(model.getValueAt(selectedrow, 10).toString());


    }//GEN-LAST:event_soru_tablosuMouseClicked

    private void soruGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soruGuncelleActionPerformed

        //soru güncelle butonuna basinca olacaklar
        // sol taraftaki değişken adlarını değiştirdim çünkü sağ ile aynı olmuyor!
        String _soruTipi = soruTipi.getSelectedItem().toString();
        String dersAdi=ders_adi.getSelectedItem().toString();                 
        String _soru=soru.getText();
        String _sik1=sik1.getText();
        String _sik2=sik2.getText();
        String _sik3=sik3.getText();
        String _sik4=sik4.getText();
        String _cevap=cevap.getText();
        String _puan=puan.getSelectedItem().toString();
        String zorlukDerecesi=zorluk_derecesi.getSelectedItem().toString();
       
        int selectedrow=soru_tablosu.getSelectedRow();
        
        if(selectedrow == -1){   // tıkladığımız yerde veri olmayabilir diye kontrol ediyoruz 
            if(model.getRowCount()==0){  // tablo boş mu kontrol ediyoruz
                mesaj_alani.setText("Sorular tablosu şuanda boştur..");
            }
            else{  // tabloda veri vardır ancak bir yere tıklanmamış olabilir
                mesaj_alani.setText("Lütfen güncellenecek bir soru seçiniz...");
            }
        }
        else { // bir soru secilmiştir..
            int id=(int)model.getValueAt(selectedrow, 0);  // secilen sorunun id değerini aldık ki başka soru ile karışmasın
            
            
            
            islemler.soruGuncelle(id,_soruTipi,dersAdi,_soru,_sik1,_sik2,_sik3,_sik4,_cevap,_puan,zorlukDerecesi);
            
            
            soruGoruntule();
            mesaj_alani.setText("Soru başarıyla güncellendi...");
            
            
        }




      
    }//GEN-LAST:event_soruGuncelleActionPerformed

    private void temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizleActionPerformed
        // TODO add your handling code here:
        
    // soru_tipi.setText("");
   //  ders_adi1.setText("");
     soru.setText("");
     sik1.setText("");
     sik2.setText("");
     sik3.setText("");
     sik4.setText("");
     cevap.setText("");
  //   _puan.setText("");
   //  _zorluk_derecesi.setText("");
     
     mesaj_alani.setText("temizleme işlemi başarıyla gerçekleşti...");
        
        
        
    }//GEN-LAST:event_temizleActionPerformed

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed

       GirisEkrani girisEkranı = new GirisEkrani();
       
       setVisible(false);
       
       girisEkranı.setVisible(true);
       


        // TODO add your handling code here:
    }//GEN-LAST:event_geriActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public void soruGoruntule(){
        
        model.setRowCount(0); // her zaman once bosaltıyoruz.
        
        ArrayList<Soru> sorular = new ArrayList<Soru>();
        
        sorular = islemler.sorulariGetir();
        
        if(sorular != null){
        
        for(Soru soru : sorular){
            Object[] eklenecek ={soru.getId(),soru.getSoru_tipi(),soru.getDers_adi(),soru.getSoru(),
                soru.getSik1(), soru.getSik2(), soru.getSik3(), soru.getSik4(),soru.getCevap(),
                soru.getPuan(),soru.getZorluk_derecesi()};
            
            
            model.addRow(eklenecek);
        }
        
        }    
        
    }
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
            java.util.logging.Logger.getLogger(SoruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SoruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SoruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SoruEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SoruEkrani dialog = new SoruEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cevap;
    private javax.swing.JComboBox<String> ders_adi;
    private javax.swing.JButton geri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_alani;
    private javax.swing.JComboBox<String> puan;
    private javax.swing.JTextField sik1;
    private javax.swing.JTextField sik2;
    private javax.swing.JTextField sik3;
    private javax.swing.JTextField sik4;
    private javax.swing.JTextField soru;
    private javax.swing.JButton soruEkle;
    private javax.swing.JButton soruGuncelle;
    private javax.swing.JButton soruListele;
    private javax.swing.JButton soruSil;
    private javax.swing.JComboBox<String> soruTipi;
    private javax.swing.JTable soru_tablosu;
    private javax.swing.JButton temizle;
    private javax.swing.JComboBox<String> zorluk_derecesi;
    // End of variables declaration//GEN-END:variables
}