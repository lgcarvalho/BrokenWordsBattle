/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luiz
 */
public class ConnectionFactory {

    private Connection conn;

    public Connection getConnection() {

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "";
            String usuario = "";
            String senha = "";
            
            conn = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Classe do driver não encontrada");
        } 

        return conn;
    }
}
