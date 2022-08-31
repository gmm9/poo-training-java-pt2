package aula08;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Construtor
    public Pessoa(String no,int id, String se){
        setNome(no);
        setIdade(id);
        setSexo(se);
    }

    // Métodos especiais 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    // Métodos abstratos/publicos
    public void fazerAniver() {
        setIdade(getIdade() + 1);
        System.out.println("Parabéns é aniversário do " + getNome() + " Esta fazendo " + getIdade() + " anos de idade");
    }
    
}
