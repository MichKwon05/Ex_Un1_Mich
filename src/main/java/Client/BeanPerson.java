package Client;

import Utils.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BeanPerson {
    public BeanPerson(){
    }

    private long id;
    private String nombre;
    private String pAp;
    private String sAp;
    private String sexo;

    private String estado;
    private int fNac;
    private String curp;


    public BeanPerson(long id, String nombre, String pAp, String sAp, String sexo,String estado, int fNac, String curp) {
        this.id = id;
        this.nombre = nombre;
        this.pAp = pAp;
        this.sAp = sAp;
        this.sexo = sexo;
        this.estado= estado;
        this.fNac = fNac;
        this.curp = curp;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpAp() {
        return pAp;
    }

    public void setpAp(String pAp) {
        this.pAp = pAp;
    }

    public String getsAp() {
        return sAp;
    }

    public void setsAp(String sAp) {
        this.sAp = sAp;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getfNac() {
        return fNac;
    }

    public void setfNac(int fNac) {
        this.fNac = fNac;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
}
