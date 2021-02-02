/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpohon;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
    // Class : Pohon
    public class Pohon {
    String nama;
    double tinggi;
    
    void pohon(){
    }
    
    void setNama() {
    Scanner hy = new Scanner(System.in);
    System.out.println("Masukkan Nama Pohon : ");
    nama = hy.nextLine();    
    }
    
    void setTinggi() {
    Scanner hy = new Scanner(System.in); 
    System.out.println("Masukkan Tinggi Pohon : ");
    tinggi = hy.nextDouble();
    }
    
    void getNama() {
    System.out.println("Nama Pohon : "+nama);    
    }
    
    void getTinggi() {
    System.out.println("Tinggi Pohon : "+tinggi);
    }
    }

