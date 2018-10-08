/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Transaksi;

/**
 *
 * @author user only
 */
public class Test3 {
    public static void main(String[] args) {  
        // keluarannya
        // barang : buku
        // exception : Nama Barang lebih dari 25 karakter
        try {
            Transaksi trans1 = new Transaksi();
            trans1.setNamaBarang("buku");
            System.out.println("barang : "+trans1.getNamaBarang());
            Transaksi trans2 = new Transaksi();
            trans1.setNamaBarang("buku tulis kotak-kotak cap burung gelatik");
            System.out.println("barang : "+trans1.getNamaBarang());
            
        } catch (Exception ex) {
            System.out.println("exception : "+ex.getMessage());
        }
        
    }
}
