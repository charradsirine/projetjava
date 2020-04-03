/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author ASUS
 */
public class inscription_club {
    private int id ;
    private int iduser;
    private int idclub;
    private  String stat;

    public inscription_club() {
    }

    public inscription_club(int iduser, int idclub, String stat) {
        this.iduser = iduser;
        this.idclub = idclub;
        this.stat = stat;
    }
    
            

    public inscription_club(int id, int iduser, int idclub, String stat) {
        this.id = id;
        this.iduser = iduser;
        this.idclub = idclub;
        this.stat = stat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdclub() {
        return idclub;
    }

    public void setIdclub(int idclub) {
        this.idclub = idclub;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "inscription_club{" + "id=" + id + ", iduser=" + iduser + ", idclub=" + idclub + ", stat=" + stat + '}';
    }
    
    
}
