package gerador4;

import java.util.List;
import java.util.Random;

import gerador4.Gerador4.tipoEncantamento;

public class EncantamentoArma {
	
    private tipoEncantamento tipoEncantamento; //Isso é um Enum, construído no gerador4
    private List<Integer> melhoriaEncantamento;
    
	public tipoEncantamento getTipoEncantamento() {
		return tipoEncantamento;
	}
	public void setTipoEncantamento(tipoEncantamento tipoEncantamento) {
		this.tipoEncantamento = tipoEncantamento;
	}
	public List<Integer> getMelhoriaEncantamento() {
		return melhoriaEncantamento;
	}
	public void setMelhoriaEncantamento(List<Integer> melhoriaEncantamento) {
		this.melhoriaEncantamento = melhoriaEncantamento;
	}
	
	public void criarEncantamentoArma(tipoEncantamento tipoEncantamento, List<Integer> melhoriaEncantamento){
		Random al = new Random();
		
		this.setTipoEncantamento(tipoEncantamento); //Seta tipo do encantamento
		this.setMelhoriaEncantamento(melhoriaEncantamento); //Seta melhoria do encantamento
		/*
		 * O certo era passar todos métodos de aleatoriedade aqui dentro*/
		
	}
      
}
