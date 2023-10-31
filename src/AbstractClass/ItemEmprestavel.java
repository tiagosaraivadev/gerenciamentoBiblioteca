package AbstractClass;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Class.Livro;

public abstract class ItemEmprestavel {
    private String nome;

    private String titulo;
    private String autor;
    private Date dataCadastro;
    private int quantidade = 0;
    private boolean emprestado = false;
    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date data) {
        this.dataCadastro = data;
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
    public abstract String cadastrarItemEmprestavel();
    public abstract String editarItem();

}
