package gerador4;
import java.util.Random;

public class Arma extends Objeto {
    
    private String tipo;
    private boolean magico;
    private EncantamentoArma encantamento;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public EncantamentoArma getEncantamento() {
        return encantamento;
    }

    public void setEncantamento(EncantamentoArma encantamento) {
        this.encantamento = encantamento;
    }

    public boolean isMagico() {
        return magico;
    }

    public void setMagico(boolean magico) {
        this.magico = magico;
    }                                               
    
    public void criarArma(Integer id, String tipoArma[]){
        Random al = new Random(); //Objeto aleatório
        
        this.setId(id); //Seta ID
        this.setRaridade(al.nextInt(4)); //Seta Raridade
        this.setTipo(tipoArma[al.nextInt(tipoArma.length)]); //Seta Tipo
        this.setMagico(al.nextBoolean()); //Seta se é mágico ou não
    }
}