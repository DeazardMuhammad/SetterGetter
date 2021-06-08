/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterdangeter;

/**
 *
 * @author MOKLET-2
 */
public class SetterdanGeter {

    public static void main(String[] args) {
        User dian = new User();

// menggunakan method setter
dian.setNama("Deazard Muhammad");
dian.setKelas("XRPL 2");

// menggunakan method getter
System.out.println("Nama: " + dian.getNama());
System.out.println("Kelas: " + dian.getKelas()); 
    }
    
}
