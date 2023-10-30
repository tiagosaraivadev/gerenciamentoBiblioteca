package AbstractClass;
import java.util.Date;

public abstract class ItemNaoEmprestavel {
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

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
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

}
