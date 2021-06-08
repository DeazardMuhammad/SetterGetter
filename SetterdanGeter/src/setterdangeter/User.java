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
class User {
private String Nama;
    private String Kelas;

    // ini method setter
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setKelas(String Kelas){
        this.Kelas = Kelas;
    }

    // ini method getter
    public String getNama(){
        return this.Nama;
    }

    public String getKelas(){
        return this.Kelas;
    }
}    

