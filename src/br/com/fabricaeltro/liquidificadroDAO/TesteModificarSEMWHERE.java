package br.com.fabricaeltro.liquidificadroDAO;

import java.sql.Connection;

import br.com.fabricaeltro.conexao.conexaoAtiva;
import br.com.fabricaeltro.modules.Liquidificador;

public class TesteModificarSEMWHERE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = conexaoAtiva.abrirConexao();
		
		Liquidificador Liqui = new Liquidificador();
		LiquiDAO liquisDAO = new LiquiDAO(con);
		
		Liqui.setQuantidadePecasNovais(23);

				
		System.out.println(liquisDAO.modificarLiquidificadorSemWhere(Liqui));
		
		conexaoAtiva.fecharConexao(con);

	}

}
