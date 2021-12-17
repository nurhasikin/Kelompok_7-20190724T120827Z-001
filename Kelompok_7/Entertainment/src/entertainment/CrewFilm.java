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
public abstract class CrewFilm{
    
    protected String nama;
    protected int umur;
    protected String pekerjaan;
    
    public CrewFilm(String n, int u, String p){
        nama = n;
        umur = u;
        pekerjaan = p;
    }
    
    public abstract String getNama();
    public abstract int getUmur();
    public abstract String getPekerjaan();
}
