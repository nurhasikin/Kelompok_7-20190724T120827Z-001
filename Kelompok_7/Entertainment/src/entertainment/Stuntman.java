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
public class Stuntman extends CrewFilm{
    private String aksi;
    
    public Stuntman(String n, int u, String p, String a){
        super(n,u,p);
        aksi = a;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public int getUmur() {
        return umur;
    }

    @Override
    public String getPekerjaan() {
        return pekerjaan;
    }
    
    public String getAksi(){
        return aksi;
    }
}
