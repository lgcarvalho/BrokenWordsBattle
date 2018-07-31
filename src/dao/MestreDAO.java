/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Mestre;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Luiz
 */
public class MestreDAO {

    private Connection connection;

    public MestreDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public LinkedList<Mestre> pesquisaMestre() {
        Statement st;
        ResultSet rs;

        LinkedList<Mestre> listaMestre = new <Mestre>LinkedList();    
        
        try {
            String sql = "SELECT * FROM MESTRE";

            st = connection.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                String nome = rs.getString("NOME");
                String imagem = rs.getString("IMAGEM");
                Mestre mestre = new Mestre(nome, imagem);
                listaMestre.add(mestre);
            }

            st.close();
            rs.close();

        } catch (SQLException ex) {

        }
        
        return listaMestre;
    }
}
