package aula08;

public class aula08 {

    public static void main(String[] args) {
        
        Pessoa p1 =  new Pessoa("Gabriel",25,"Masculino");

        Livro l1 = new Livro("MobyDick","Abrahan Lincon",300,p1);

        l1.detalhes();
    }
}
