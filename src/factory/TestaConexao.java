/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Luiz
 */
public class TestaConexao {

    public static void main(String[] args) throws SQLException, IOException {
        try (Connection connection = new ConnectionFactory().getConnection()) {
            System.out.println("Conexão aberta!");

            connection.close();
        } catch (Exception ex) {
            System.out.println("Nao foi possivel conectar!!");
        }
    }
}
