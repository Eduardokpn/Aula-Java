package br.com.fabricaeltro.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mainPessoa {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub

		System.out.println("Oi");
		Connection conexao = null;
		// Na linha abaixo, estou armazenando o caminho do BD na vari�vel url
		String url = "jdbc:mysql://localhost:3307/aula";
		conexao = DriverManager.getConnection(url, "root", "*123456HAS*");
		System.out.println("Abriu a conex�o.");
		conexao.close();
		
	}

}
