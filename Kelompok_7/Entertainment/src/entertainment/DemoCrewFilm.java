/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entertainment;
/**
 *
 * @author LAB-316-8
 */
public class DemoCrewFilm {
    public static void main(String[] args) {
        
        System.out.println("ACTOR");
        Actor a1 = new Actor("Kevin Julio", 30, "Aktor",
                "Pemain Film Antagonis");
        System.out.println("Nama Aktor: " + a1.getNama());
        System.out.println("Umur: " + a1.getUmur() + " tahun");
        System.out.println("Pekerjaan: " + a1.getPekerjaan());
        System.out.println("Peran: " + a1.getPeran());
        
        System.out.println(" ");
        System.out.println("DIRECTOR");
        Director d1 = new Director("Steven Allan Spielberg", 56, "Director",
                "Film Spiderman");
        System.out.println("Nama Sutradara: " + d1.getNama());
        System.out.println("Umur: " + d1.getUmur() + " tahun");
        System.out.println("Pekerjaan: " + d1.getPekerjaan());
        System.out.println("Memonitor: " + d1.getMemonitor());
        
        System.out.println(" ");
        System.out.println("OPERATOR CAMERA");
        OperatorCamera o1 = new OperatorCamera("Nurhasikin", 19, "Cameraman",
                "Fujifilm X-Pro2");
        System.out.println("Nama Operator Kamera: " + o1.getNama());
        System.out.println("Umur: " + o1.getUmur() + " tahun");
        System.out.println("Pekerjaan: " + o1.getPekerjaan());
        System.out.println("Jenis Kameara: " + o1.getJenisKamera());
        
        System.out.println(" ");
        System.out.println("STUNTMAN");
        Stuntman s1 = new Stuntman("David Puji", 26, "Stuntman",
                "Panjat Tebing");
        System.out.println("Nama Pemeran Pengganti: " + s1.getNama());
        System.out.println("Umur: " + s1.getUmur() + " tahun");
        System.out.println("Pekerjaan: " + s1.getPekerjaan());
        System.out.println("Aksi yang dilakukan: " + s1.getAksi());
    }
    
}
