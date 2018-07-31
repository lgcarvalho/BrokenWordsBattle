/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Login;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Luiz
 */
public class LoginDAO {

    private Connection connection;

    public LoginDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adicionaLogin(Login login) {
        PreparedStatement ps;
        ResultSet rs;

        try {
            String sqlId = "SELECT LOGIN_SEQ.NEXTVAL FROM DUAL";
            String sql = "INSERT INTO LOGIN(ID_LOGIN, APELIDO, USUARIO, SENHA) VALUES(?, ?, ?, ?)";

            ps = connection.prepareStatement(sqlId);

            rs = ps.executeQuery();
            while (rs.next()) {
                login.setIdLogin(rs.getInt("NEXTVAL"));
            }

            ps = connection.prepareStatement(sql);
            ps.setInt(1, login.getIdLogin());
            ps.setString(2, login.getApelido());
            ps.setString(3, login.getUsuario());
            ps.setString(4, login.getSenha());
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {

        }
    }

    public boolean pesquisaLogin(Login login) {
        boolean pesquisa = false;

        PreparedStatement ps;
        ResultSet rs;

        try {
            String sql = "SELECT * FROM LOGIN WHERE USUARIO = ? AND SENHA = ?";

            ps = connection.prepareStatement(sql);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getSenha());
            rs = ps.executeQuery();

            if (!rs.isBeforeFirst()) {
                pesquisa = false;
            } else {
                while (rs.next()) {
                    login.setIdLogin(rs.getInt("ID_LOGIN"));
                    login.setApelido(rs.getString("APELIDO"));
                    login.setUsuario(rs.getString("USUARIO"));
                    login.setSenha(rs.getString("SENHA"));
                }

                pesquisa = true;
            }

            ps.close();

        } catch (SQLException ex) {

        }

        return pesquisa;

    }
}
