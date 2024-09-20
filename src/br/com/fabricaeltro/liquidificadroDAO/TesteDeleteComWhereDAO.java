package br.com.fabricaeltro.liquidificadroDAO;

import java.sql.Connection;

import br.com.fabricaeltro.conexao.conexaoAtiva;
import br.com.fabricaeltro.modules.Liquidificador;


public class TesteDeleteComWhereDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = conexaoAtiva.abrirConexao();
		
		Liquidificador Liqui = new Liquidificador();
		LiquiDAO liquisDAO = new LiquiDAO(con);
		
		Liqui.setQuantidadePecasNovais(12);
		
		
		
		
		System.out.println(liquisDAO.deltarcomWhere(Liqui));
		
		conexaoAtiva.fecharConexao(con);


	}

}
