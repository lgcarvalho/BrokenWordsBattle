/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Jogador;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Luiz
 */
public class JogadorDAO {

    private Connection connection;

    public JogadorDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionaJogador(int idLogin) {
        PreparedStatement ps;

        try {
            String sql = "INSERT INTO JOGADOR(ID_JOGADOR, ID_LOGIN) VALUES(JOGADOR_SEQ.NEXTVAL, ?)";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, idLogin);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {

        }

    }

    public Jogador pesquisaJogador(String usuario) {
        PreparedStatement ps;
        ResultSet rs;

        Jogador jogador = null;

        try {
            String sql = "SELECT * FROM JOGADOR J INNER JOIN LOGIN L ON J.ID_LOGIN = L.ID_LOGIN WHERE L.USUARIO = ?";

            ps = connection.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            while (rs.next()) {
                jogador = new Jogador();
                jogador.setIdJogador(rs.getInt("ID_JOGADOR"));
                jogador.setCarteira(rs.getInt("CARTEIRA"));
                jogador.setPontuacao(rs.getInt("PONTUACAO"));
                jogador.setAguaMineral(rs.getInt("AGUA_MINERAL"));
                jogador.setGarrafaCafe(rs.getInt("GARRAFA_CAFE"));
                jogador.setVitamina(rs.getInt("VITAMINA"));
                jogador.setAprendiz(rs.getInt("APRENDIZ"));
                jogador.setCiborg(rs.getInt("CIBORG"));
                jogador.setAndroid(rs.getInt("ANDROID"));
                jogador.setPyro(rs.getInt("PYRO"));
                jogador.setViking(rs.getInt("VIKING"));
                jogador.setHeroiSelecionado(rs.getString("HEROI"));
            }

        } catch (Exception e) {

        }

        return jogador;
    }

    public void atualizaAgua(int quantidade, int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET AGUA_MINERAL = AGUA_MINERAL + ? WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, quantidade);
            ps.setInt(2, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void atualizaGarrafa(int quantidade, int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET GARRAFA_CAFE = GARRAFA_CAFE + ? WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, quantidade);
            ps.setInt(2, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void atualizaVitamina(int quantidade, int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET VITAMINA = VITAMINA + ? WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, quantidade);
            ps.setInt(2, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void removeAgua(int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET AGUA_MINERAL = AGUA_MINERAL - 1 WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void removeGarrafa(int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET GARRAFA_CAFE = GARRAFA_CAFE - 1 WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void removeVitamina(int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET VITAMINA = VITAMINA - 1 WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void atualizaJogador(int moedas, int pontuacao, int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET CARTEIRA = CARTEIRA + ?, PONTUACAO = PONTUACAO + ? WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, moedas);
            ps.setInt(2, pontuacao);
            ps.setInt(3, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void atualizaCarteira(int valor, int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET CARTEIRA = CARTEIRA - ? WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, valor);
            ps.setInt(2, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void atualizaCiborg(int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET CIBORG = 1 WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void atualizaAndroid(int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET ANDROID = 1 WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void atualizaPyro(int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET PYRO = 1 WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void atualizaViking(int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET VIKING = 1 WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setInt(1, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }

    public void atualizaHeroi(String nomeHeroi, int idJogador) {
        PreparedStatement ps;

        try {
            String sql = "UPDATE JOGADOR SET HEROI = ? WHERE ID_JOGADOR = ?";

            ps = connection.prepareStatement(sql);
            ps.setString(1, nomeHeroi);
            ps.setInt(2, idJogador);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {

        }
    }
}
