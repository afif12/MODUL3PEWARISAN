/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author asus
 */
public class Jurusan extends Sekolah {
    int jurusan = 0;
    int guru = 0;
    
    void cetakJurusan (int JumlahJurusan)
    {
        jurusan = JumlahJurusan;
        System.out.println("jumlah Jurusan : " + jurusan);
    }
    
    void cetakGuru(int JumlahGuru)
    {
        guru = JumlahGuru;
        System.out.println("Jumlah Guru :" +guru);
    }
}
