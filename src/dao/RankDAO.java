/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Rank;
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
public class RankDAO {
        private Connection connection;

    public RankDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public LinkedList<Rank> pesquisaRank() {
        Statement st;
        ResultSet rs;

        LinkedList<Rank> listaRank = new <Rank>LinkedList();    
        
        try {
            String sql = "SELECT L.APELIDO, L.USUARIO, J.PONTUACAO, J.HEROI FROM LOGIN L INNER JOIN JOGADOR J ON L.ID_LOGIN = J.ID_LOGIN ORDER BY PONTUACAO DESC";

            st = connection.createStatement();
            rs = st.executeQuery(sql);
            
            while (rs.next()) {
                String apelido = rs.getString("APELIDO");
                String usuario = rs.getString("USUARIO");
                int pontuacao = rs.getInt("PONTUACAO");
                String heroi = rs.getString("HEROI");
                Rank rank = new Rank(apelido, usuario, pontuacao, heroi);
                listaRank.add(rank);
            }

            st.close();
            rs.close();

        } catch (SQLException ex) {

        }
        
        return listaRank;
    }
}
