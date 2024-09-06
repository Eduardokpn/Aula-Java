package br.com.fabricaeltro.liquidificadroDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fabricaeltro.modules.Liquidificador;

public class LiquidificadorDAO {
		
	private Connection con;

	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public LiquidificadorDAO() {
	}
	public LiquidificadorDAO(Connection con) {
		setCon(con);
	}
	
	
	public String inserir(Liquidificador liqui) {
		String sql = "insert into Liquidificador(modeloNovais, marcaNovais,quan) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getEndereco());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}


}
