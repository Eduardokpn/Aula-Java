package br.com.fabricaeltro.liquidificadroDAO;

import java.sql.Connection;

import br.com.fabricaeltro.conexao.conexaoAtiva;
import br.com.fabricaeltro.modules.Liquidificador;

public class TesteAdicionarDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Connection con = conexaoAtiva.abrirConexao();
		
		Liquidificador Liqui = new Liquidificador();
		LiquiDAO liquisDAO = new LiquiDAO(con);
		
		Liqui.setModeloNovais("ARNO");
		Liqui.setMarcaNovais("ARNO28");
		Liqui.setPesoNovais(30.6);
		Liqui.setQuantidadeHeliceNovais(3);
		Liqui.setQuantidadePecasNovais(12);

				
		System.out.println(liquisDAO.inserir(Liqui));
		
		conexaoAtiva.fecharConexao(con);

	}

}
