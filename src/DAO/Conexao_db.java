/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Fabio
 */
public class Conexao_db {

    static Connection conn = null;

    public static final String DB = "db_plataforma";
    public static final String IPDB = "DESKTOP-T6B03MD\\SQLEXPRESS";
    public static final String USER = "sa";
    public static final String PASSWORD = "alpha3507";

    public static Connection getConnection() throws SQLException {
        try {
            String url = String.format("jdbc:sqlserver://%s;databasename=%s", IPDB, DB);
            conn = DriverManager.getConnection(url, USER, PASSWORD);
            System.out.println("CONEXÃO REALIZADA COM SUCESSO");
        } catch (SQLException e) {
            System.out.println("Erro ao abrir conexao - " + e.getMessage());
        }
        return conn;
    }
}
