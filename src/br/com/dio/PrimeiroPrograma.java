package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato();
		gato.setNome("Tuca");
		gato.setCor("Branco");
		gato.setIdade(54);
		System.out.println(gato);
		System.out.println("O nome do gato é "+gato.getNome());
	}

}
