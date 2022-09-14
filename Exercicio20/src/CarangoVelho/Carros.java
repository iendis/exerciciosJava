package CarangoVelho;

public class Carros {

    String nome;
    int ano;
    float preco;
    
    public float calcularDesconto(){
        if(ano <= 2000){
            preco = preco - (preco * 0.12f);
            return preco;
        } else {
            preco = preco - (preco * 0.07f);
            return preco;
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }



    
}
