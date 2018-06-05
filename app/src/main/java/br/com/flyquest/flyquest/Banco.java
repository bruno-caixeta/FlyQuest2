package br.com.flyquest.flyquest;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.ConsoleHandler;

public class Banco {

    private Connection conn = null;
    private Statement st;
    private ResultSet rs;
    private String sql;

    public void conectarMySQL(String host, String porta, String banco, String usuario, String senha){

        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://flyquest-instance.cwjyqhv5cxrp.us-east-2.rds.amazonaws.com/flyquest",
                    "flyquest","flyquest");
            Log.i("MYSQL", "Conectado.");

        } catch(Exception erro){
            Log.e("MYSQL","Erro: "+erro);
        }
    }

    public void desconectarMySQL(){
        try{
            conn.close();
            Log.i("MYSQL","Desconectado.");
        } catch(Exception erro){
            Log.e("MYSQL","Erro: "+erro);
        }
    }

    public ResultSet queryMySQL(String qry){
        try{
            st = conn.createStatement();
            sql = qry;
            rs = st.executeQuery(sql);
            rs.first();
            return rs;
        } catch(Exception erro){
            Log.e("MYSQL","Erro: "+erro);
            return null;
        }
    }

    public void comandoMySQL(String comando){
        try{
            st = conn.createStatement();
            st.execute(comando);
        } catch(Exception erro){
            Log.e("MYSQL","Erro: "+erro);
        }
    }

}
