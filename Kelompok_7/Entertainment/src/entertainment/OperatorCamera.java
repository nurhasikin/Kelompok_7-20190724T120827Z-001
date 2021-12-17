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
public class OperatorCamera extends CrewFilm{
    private String jenisKamera;
    
    public OperatorCamera(String n, int u, String p, String jK){
        super(n,u,p);
        jenisKamera = jK ;
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
    
    public String getJenisKamera(){
        return jenisKamera;
    }
}
