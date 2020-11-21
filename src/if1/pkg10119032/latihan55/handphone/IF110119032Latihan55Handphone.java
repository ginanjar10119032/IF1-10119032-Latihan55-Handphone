/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan55.handphone;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program deskripsi handphone
 * menggunakan konsep objek dan inheritance
 */
public class IF110119032Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android samsung = new Android("Samsung", "Android", "Grand", 3000000);
        samsung.setKeyStore("234ibfd3840fo");
        samsung.displayProduct();
        System.out.println("Android Key Stone : ".concat(samsung.getKeyStore() + "\n"));
        
        BlackBerry bb = new BlackBerry("BlackBerry", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : ".concat(bb.getPinBB() + "\n"));
        
        WindowsPhone nokia = new WindowsPhone("Nokia", "Win 8", "Lumia ", 1000000);
        nokia.setWpKeyStore("UUUQIJWORJ");
        nokia.displayProduct();
        System.out.println("WP Key Store : ".concat(nokia.getWpKeyStore() + "\n"));
    }
    
}