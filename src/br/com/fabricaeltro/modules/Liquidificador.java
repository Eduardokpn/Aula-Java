package br.com.fabricaeltro.modules;

import javax.swing.JOptionPane;

public class Liquidificador extends Eletrodomestico{
	
	private int quantidadeHeliceNovais;
	
	public int getQuantidadeHeliceNovais() {
		return quantidadeHeliceNovais;
	}

	public void setQuantidadeHeliceNovais(int quantidadeHeliceNovais) {
		this.quantidadeHeliceNovais = quantidadeHeliceNovais;
	}
	

	
	public double caucularPesoTotalNovais(double pesoIincialNovais)
	{
		
		double result = pesoIincialNovais + this.getPesoNovais();
		return result;
		
		
	}
	
	public void retornarValoresAtributosNovais()
	{
		System.out.println(" Modelo do Liquidificador: " + getModeloNovais() + "\n"
	+ " Marca do Liquidificador: " + getMarcaNovais() 
	+ "\n" + " Quantidade de Peças do Liquidificador: " + getQuantidadePecasNovais() + "\n" + " Quantidade de Helices do Liquidificador: " + getQuantidadeHeliceNovais() + "\n"  );
		
	}


}
