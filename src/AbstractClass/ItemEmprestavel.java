package AbstractClass;
import java.util.Date;

public abstract class ItemEmprestavel {
    private String nome;
    private String autor;
    private Date dataAtual;
    private int quantidade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getData() {
        return dataAtual;
    }

    public void setData(Date data) {
        this.dataAtual = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public abstract String ordemAlfabetica();
    public abstract String pesquisaTitulo();
    public abstract String pesquisaAutor();
    public abstract String pesquisaAno();
    public abstract String pesquisaItem();
    public abstract boolean verificarData();
    public abstract boolean verificarEmprestado();
}
