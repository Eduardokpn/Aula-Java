package br.com.fabricaeltro.main;

import javax.swing.JOptionPane;

import br.com.fabricaeltro.modules.Liquidificador;

public class TesteLiquidificador {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Liquidificador liqui = new Liquidificador();
		
		liqui.setMarcaNovais(JOptionPane.showInputDialog("Marca do Liquidificador: "));
		liqui.setModeloNovais(JOptionPane.showInputDialog("Modelo do Liquidificador: "));
		liqui.setQuantidadePecasNovais(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de peças do Liquidificador: ")));
		liqui.setQuantidadeHeliceNovais(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de helices do Liquidificador: ")));
		liqui.setPesoNovais(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do Liquidificador: ")));
		
		System.out.println("O peso é: " + liqui.caucularPesoTotalNovais(Double.parseDouble((JOptionPane.showInputDialog("Digite seu peso: ")))));
		
		liqui.retornarValoresAtributosNovais();

		
	}

}
