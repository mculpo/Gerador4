package gerador4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.sun.tools.javac.code.Attribute.Array;

public class Gerador4 {
	
	public enum tipoEncantamento{
		FOGO, GELO, RAIO;
		
		public static tipoEncantamento tipoEncantamentoRandom() {
			Random al = new Random();
			return values()[al.nextInt(values().length)];
		}
	}
	
    public static void main(String[] args) {
        
        //Dados
        String[] tipoArma = {"adaga", "machado", "espada"};
        
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> c = new ArrayList<Integer>();
        
        a.add(1); a.add(2);
        b.add(2); b.add(3);
        c.add(1); c.add(2); c.add(3);
        
        HashMap<tipoEncantamento, List<Integer>> tabela = new HashMap<tipoEncantamento, List<Integer>>();
        tabela.put(tipoEncantamento.FOGO, Array.asList(1,2));
        tabela.put(tipoEncantamento.GELO, b);
        tabela.put(tipoEncantamento.RAIO, c);
        
        EncantamentoArma a1 = new EncantamentoArma();
        a1.criarEncantamentoArma(tipoEncantamento.tipoEncantamentoRandom(), a);
        System.out.println(a1.getTipoEncantamento() + "" + a1.getMelhoriaEncantamento());
        
        
    }
            
}
