/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Nota;
import model.Transaksi;

/**
 *
 * @author basisa03
 */
public class PembelianDialog extends JDialog implements ActionListener {

    private Nota nota;
    private JComboBox daftarBarang;
    private JTextField fieldHarga;
    private JTextField fieldJumlah;
    private JTextField fieldNama;
    private JTextField fieldTotal;
    private JLabel jlabel1;
    private JLabel jlabel2;
    private JLabel jlabel3;
    private JLabel jlabel4;
    private JLabel jlabel5;
    private JLabel jlabel6;
    private JPanel jPanel1;
    private JButton tombolSelesai;
    private JButton tombolTambah;

    public PembelianDialog() {
        setSize(400, 300);
        initComponents();
    }



    public PembelianDialog(Frame parent, boolean modal) {
        super(parent, modal);
        setSize(400, 300);
        initComponents();
    }

    public void initComponents() {
        this.setLayout(null);
        jlabel1 = new JLabel("Transaksi Pembelian");
        jlabel1.setBounds(120, 30, 250, 35);
        jlabel2 = new JLabel("Nama");
        jlabel2.setBounds(20, 60, 120, 25);
        jlabel3 = new JLabel("Barang");
        jlabel3.setBounds(20, 90, 120, 25);
        jlabel4 = new JLabel("Harga");
        jlabel4.setBounds(20, 120, 120, 25);
        jlabel5 = new JLabel("Jumlah");
        jlabel5.setBounds(20, 150, 120, 25);
        jlabel6 = new JLabel("Total");
        jlabel6.setBounds(20, 180, 120, 25);

        fieldNama = new JTextField();
        fieldNama.setBounds(120, 60, 180, 25);
        daftarBarang = new JComboBox();
        daftarBarang.setBounds(120, 90, 180, 25);
        fieldHarga = new JTextField();
        fieldHarga.setBounds(120, 120, 180, 25);
        fieldJumlah = new JTextField();
        fieldJumlah.setBounds(120, 150, 180, 25);
        fieldTotal = new JTextField();
        fieldTotal.setBounds(120, 180, 180, 25);

        tombolTambah = new JButton("Tambah");
        tombolTambah.setBounds(80, 220, 120, 30);

        tombolSelesai = new JButton("Selesai");
        tombolSelesai.setBounds(230, 220, 120, 30);

        this.add(jlabel1);
        this.add(jlabel2);
        this.add(jlabel3);
        this.add(jlabel4);
        this.add(jlabel5);
        this.add(jlabel6);
        this.add(fieldNama);
        this.add(daftarBarang);
        daftarBarang.addItem("-pilih-");
        daftarBarang.addItem("Buku");
        daftarBarang.addItem("Pensil");
        daftarBarang.addItem("Penggaris");
        this.add(fieldHarga);
        this.add(fieldJumlah);
        this.add(fieldTotal);
    this.add(tombolTambah);
    this.add(tombolSelesai);
    
    tombolTambah.addActionListener(this);
    tombolSelesai.addActionListener(this);
    }

      @Override
    public void actionPerformed(ActionEvent ae) {
          if (ae.getSource()== tombolSelesai) {
              this.dispose();
          }
          if (ae.getSource() == tombolTambah) {
              
          }
         
          
    }
   
   
            
        public static void main(String[] args) {
        PembelianDialog test = new PembelianDialog();
        test.setSize(400,400);
        test.setVisible(true);

}

  

   
   
}