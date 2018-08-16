/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import static DAO.Conexao_db.getConnection;
import Telas.Principal;
import Telas.Login;
import java.sql.SQLException;

/**
 *
 * @author Fabio
 */
public class Aplication {
    public static void main(String[] args) {
        Login t = new Login();
        t.setVisible(true);
        System.out.println("Teste janelas");
        try{
        getConnection();
        }catch(SQLException e){
            System.out.println("ERRO");
        }
    }
}
