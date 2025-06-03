/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.control;

import fatec.poo.model.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author eros
 */
public class DaoProjeto {
    private Connection conn;

    public DaoProjeto(Connection conn) {
        this.conn = conn;
    }
    
    public Projeto consultar (int codigo) {
        Projeto objProj = null;
        
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * FROM tblProjeto WHERE codigo_proj = ?");
            ps.setInt(1, codigo);
            
            ResultSet rs = ps.executeQuery(); // Envia a instruçao, recebe a solicitaçao
            
            if(rs.next()) {
                objProj = new Projeto(codigo, rs.getString("descricao_proj"));
                objProj.setDtInicio(rs.getString("dtinicio_proj"));
                objProj.setDtTermino(rs.getString("dttermino_proj"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return objProj;
    }
    
    public void inserir (Projeto objProj) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT INTO tblProjeto VALUES(?,?,?,?)");
            ps.setInt(1, objProj.getCodigo());
            ps.setString(2, objProj.getDescricao());
            ps.setString(3, objProj.getDtInicio());
            ps.setString(4, objProj.getDtTermino());
            
            ps.execute(); // Envia a instruçao
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void alterar (Projeto objProj) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblProjeto SET descricao_proj = ?,"+
                                                            "dtinicio_proj = ?,"+
                                                            "dttermino_proj = ?"+
                                        "WHERE codigo_proj = ?");
            
            ps.execute(); // Envia a instruçao
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void excluir (Projeto objProj) {
        PreparedStatement ps;
        try {
          ps = conn.prepareStatement("DELETE FROM tblProjeto WHERE codigo_proj = ?");
          ps.setInt(1, objProj.getCodigo());
          
          ps.execute(); // Envia a instruçao
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
