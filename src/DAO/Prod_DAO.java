/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import App.Produtos;
import java.sql.PreparedStatement;

/**
 *
 * @author Fabioinsert into db_plataforma values ('PARAFUSO','suspecao',3,123.80,1)
 */
public class Prod_DAO {
    Conexao_db conection; 
    public boolean incluir (Produtos objPro) throws Exception {
       conection = new Conexao_db();
        String SQL_INSERT  = "INSERT INTO db_plataforma VALUES(?,?,3,5,1)";
        PreparedStatement ps = Conexao_db.getConnection().prepareStatement(SQL_INSERT);
        ps.setString(1,objPro.getNome() );
        ps.setString(2, objPro.getDesc());
        
        if(ps.executeUpdate()>0){
            return true;
        }else{
            return false;
        }
       
    }
    
}
