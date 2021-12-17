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
public class Actor extends CrewFilm{
    private String peran;
    
    public Actor(String n, int u, String p, String peran){
        super(n,u,p);
        this.peran = peran;
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
    
    public String getPeran(){
        return peran;
    }
    
}
