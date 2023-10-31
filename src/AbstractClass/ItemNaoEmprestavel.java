package AbstractClass;
import java.util.Date;

public abstract class ItemNaoEmprestavel {
    private String nome;
    private String autor;
    private Date dataCadastro;
    private int quantidade = 0;

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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataAtual) {
        this.dataCadastro = dataAtual;
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
    public abstract String cadastrarItemNaoEmprestavel();
    public abstract String editarItem();

}
