package aula08;

public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String ti,String au,int to,Pessoa le) {
        this.setTitulo(ti);
        this.setAutor(au);
        this.setTotPaginas(to);
        this.setLeitor(le);

        this.setPagAtual(1);
        this.setAberto(false);
    }

    // Métodos especiais
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Método abstratos

    public void detalhes() {
        System.out.println("O nome do livro é: " + this.getTitulo());
        System.out.println("O nome do autor é: " + this.getAutor());
        System.out.println("Total de páginas é: " + this.getTotPaginas());
        System.out.println("O livro está aberto: " + this.getAberto());
        System.out.println("Quem está lendo é: " + this.leitor.getNome());
    }
    @Override
    public void abrir() {
        if(!this.getAberto()){
            this.setAberto(true);
            System.out.println("Seu livro foi aberto");
        }else {
            System.out.println("Seu livro já estava aberto.");
        }
        
        
    }
    @Override
    public void fechar() {
        if(this.getAberto()) {
            this.setAberto(false);
            System.out.println("Seu livro foi fechado com sucesso.");
        } else {
            System.out.println("Seu livro ja se encontrava fechado.");
        }
        
    }
    @Override
    public void folhear() {
        System.out.println("Seu livro possui " + this.getTotPaginas() + " E você esta na pagina" + this.getPagAtual());
        
    }
    @Override
    public void avancarPag() {
        if(this.getAberto()){
            if(this.getPagAtual() <= this.getTotPaginas() && this.getPagAtual() > 0) {
                this.setPagAtual(getPagAtual() + 1);
                System.out.println("Sua pagina atual é: " + this.getPagAtual());
            }
        } else {
            System.out.println("Abra seu livro antes de mudar a página.");
        }
        
    }
    @Override
    public void voltarPag() {
        if(this.getAberto()){
            if(this.getPagAtual() <= this.getTotPaginas() && this.getPagAtual() > 0) {
                this.setPagAtual(this.getPagAtual() - 1);
                System.out.println("Sua pagina atual é: " + this.getPagAtual());
            }
        } else {
            System.out.println("Abra seu livro antes de mudar a página.");
        }
        
    }
}
