package Client;
import Utils.MySQLConnection;

import java.sql.*;
import java.util.LinkedList;

import java.lang.reflect.Method;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoPerson {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    private final String SHOW = "SELECT * FROM reCurp;";
    private final String showw = "INSERT INTO reCurp(id, nombre, pAp, sAp,sexo, estado,fNac,curp) VALUES (?, ?, ?, ?,?,?,?,?);";



    public List<BeanPerson> show (){
        List<BeanPerson> operationList = new LinkedList<>();
        BeanPerson rCurp = new BeanPerson();

        try {
            conn = new MySQLConnection().connect();
            String query = SHOW;
            pstm = conn.prepareStatement(query);
            rs = pstm.executeQuery();
            while (rs.next()){
                rCurp = new BeanPerson();
                rCurp.setId(rs.getLong("id"));
                rCurp.setNombre(rs.getString("nombre"));
                rCurp.setpAp(rs.getString("pAp"));
                rCurp.setsAp(rs.getString("sAp"));
                rCurp.setSexo(rs.getString("sexo"));
                rCurp.setEstado(rs.getString("estado"));
                rCurp.setfNac(rs.getInt("fNac"));
                rCurp.setCurp(rs.getString("curp"));
                operationList.add(rCurp);
            }
        }catch (SQLException e){
            Logger.getLogger(DaoPerson.class.getName()).log(Level.SEVERE, "Error en showAdmins -> ", e);
        }finally {
            closeConnections();
        }

        return operationList;
    }


    public boolean saveAOperacion(BeanPerson perCURP){
        try{
            conn = new MySQLConnection().connect();
            pstm = conn.prepareStatement(showw);
            pstm.setLong(1, perCURP.getId());
            pstm.setString(2,perCURP.getNombre());
            pstm.setString(3, perCURP.getpAp());
            pstm.setString(4, perCURP.getsAp());
            pstm.setString(5, perCURP.getSexo());
            pstm.setString(6, perCURP.getEstado());
            pstm.setInt(7, perCURP.getfNac());
            pstm.setString(8,perCURP.getCurp());
            return pstm.executeUpdate() == 1;
        }catch (SQLException e){
            Logger.getLogger(DaoPerson.class.getName()).log(Level.SEVERE, "Error saveOperation", e);
        }finally {
            closeConnections();
        }
        return false;
    }


    public void closeConnections(){
        try {
            if (conn!=null){
                conn.close();
            }
            if (pstm!=null){
                pstm.close();
            }
            if (rs!=null){
                rs.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}