package br.com.fabricaeltro.liquidificadroDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fabricaeltro.modules.Liquidificador;


public class LiquiDAO {
	
	private Connection con;

	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public LiquiDAO() {
	}
	public LiquiDAO(Connection con) {
		setCon(con);
	}
	
	
	public String inserir(Liquidificador liqui) {
		String sql = "insert into liquidificador(quantidadeHeliceNovais, marcaNovais, modeloNovais, pesoNovais, quantidadePecasNovais) values (?,?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, liqui.getQuantidadeHeliceNovais());
			ps.setString(2, liqui.getMarcaNovais());
			ps.setString(3, liqui.getModeloNovais());
			ps.setDouble(4, liqui.getPesoNovais());
			ps.setInt(5, liqui.getQuantidadePecasNovais());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String deltarSemWhere() {
		String sql = "delete from liquidificador";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String deltarcomWhere(Liquidificador liqui) {
		String sql = "delete from liquidificador where quantidadePecasNovais like (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, liqui.getQuantidadePecasNovais());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String modificarLiquidificadorComWhere(Liquidificador liqui) {
		String sql = "update liquidificador set marcaNovais = (?) where modeloNovais = (?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, liqui.getMarcaNovais());
			ps.setString(2, liqui.getModeloNovais());
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro ao altera";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String modificarLiquidificadorSemWhere(Liquidificador liqui) {
		String sql = "update liquidificador set quantidadePecasNovais = (?)";
		try 
		{
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, liqui.getQuantidadePecasNovais());
			if (ps.executeUpdate() > 0) {
				return "Altearado com sucesso";
			} else {
				return "Erro ao altera";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public ArrayList<Liquidificador> retomarDadosLiquidificador() {
		String sql = "select * from liquidificador";
		ArrayList<Liquidificador> retornarLiquidificador = new ArrayList<Liquidificador>();
		
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs != null){
				while(rs.next())
				{
					Liquidificador liqui = new Liquidificador();
					
					liqui.setModeloNovais(rs.getNString(1));
					liqui.setMarcaNovais(rs.getNString(2));
					liqui.setPesoNovais(rs.getDouble(3));
					liqui.setQuantidadeHeliceNovais(rs.getInt(4));
					liqui.setQuantidadePecasNovais(rs.getInt(5));
				}
				return retornarLiquidificador;
			
			} else {
				return null;
				
		} catch (SQLException e) {
			return null;
		}
	
	
		
}
	

	
