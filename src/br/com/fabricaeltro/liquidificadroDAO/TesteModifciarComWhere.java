package br.com.fabricaeltro.liquidificadroDAO;

import java.sql.Connection;

import br.com.fabricaeltro.conexao.conexaoAtiva;
import br.com.fabricaeltro.modules.Liquidificador;

public class TesteModifciarComWhere {

	public static void main(String[] args) {
		
		Connection con = conexaoAtiva.abrirConexao();
		
		Liquidificador Liqui = new Liquidificador();
		LiquiDAO liquisDAO = new LiquiDAO(con);
		
		Liqui.setModeloNovais("ARNO23");
		Liqui.setMarcaNovais("ARNO");

				
		System.out.println(liquisDAO.modificarLiquidificadorComWhere(Liqui));
		
		conexaoAtiva.fecharConexao(con);
		
		
		
		// TODO Auto-generated method stub

	}

}
