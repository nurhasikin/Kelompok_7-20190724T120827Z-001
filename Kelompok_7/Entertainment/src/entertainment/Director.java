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
public class Director extends CrewFilm{
    private String memonitor;
    
    public Director(String n, int u, String p, String m){
        super(n,u,p);
        memonitor = m ;
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
    
    public String getMemonitor(){
        return memonitor;
    }
}
