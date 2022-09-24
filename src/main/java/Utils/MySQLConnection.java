package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public Connection connect(){
        try{
            final String DBNAME = "curpex",
                    USERNAME = "root",
                    PASSWORD = "osmich05",
                    TIMEZONE = "America/Mexico_City",
                    USESSL = "false",
                    PUBLICKEY = "true";
            String dataSource = String.format("jdbc:mysql://localhost:3306/%s?user=%s" +
                            "&password=%s&serverTimezone=%s&useSSL=%s&allowPublicKeyRetrieval=%s",
                    DBNAME, USERNAME, PASSWORD, TIMEZONE, USESSL, PUBLICKEY);
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            return DriverManager.getConnection(dataSource);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    ////Estrada hernádez Andrea Michelle 4°A
    public static void main(String[] args) throws SQLException {
        Connection conn = new MySQLConnection().connect();
        if (conn != null){
            System.out.println("Conexion exitosa");
            conn.close();
        }else{
            System.out.println("Connexion fallida");
        }
    }
}
