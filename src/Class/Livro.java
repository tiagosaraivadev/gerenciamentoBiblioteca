package Class;
import AbstractClass.ItemEmprestavel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Livro extends ItemEmprestavel {
    public ArrayList<Livro> listaDeLivros = new ArrayList<>();

    public Livro() {
    }

    public Livro(String nome, String autor) {

    }

    Scanner s = new Scanner(System.in);

    @Override
    public String ordemAlfabetica() {
        return null;
    }

    @Override
    public boolean verificarData() {
        return false;
    }

    @Override
    public boolean verificarEmprestado() {
        return false;
    }

    @Override
    public String pesquisaAno() {
        return null;
    }

    @Override
        public String cadastrarItemEmprestavel() {

        while (true) {
            System.out.println("Digite o nome do livro (ou 0 para parar): ");
            String nomeLivro = s.nextLine();

            if ("0".equals(nomeLivro)) {
                System.out.println("Fim do cadastro!");
                break;
            }

            System.out.println("Digite o autor do livro: ");
            String autorLivro = s.nextLine();

            setNome(nomeLivro);
            setAutor(autorLivro);
            setEmprestado(true);
            setQuantidade(getQuantidade() + 1);
            Date dataCadastro = new Date();
            setDataCadastro(dataCadastro);
            listaDeLivros.add(this);

            System.out.println("Livro cadastrado com sucesso!");
        }
            return "Cadastro de livros concluído!";
        }

    @Override
    public String pesquisaAutor() {
        String autorPesquisa;
        boolean encontrado = false;

        System.out.println("Digite o Autor do livro: ");
        autorPesquisa = s.nextLine();

        for (Livro livro : listaDeLivros) {
            if (livro.getAutor().equalsIgnoreCase(autorPesquisa)) {
                System.out.println("Nome: " + livro.getNome());
                System.out.println("Autor: " + livro.getAutor());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro do autor " + autorPesquisa + " encontrado.");
        }
        return null;
    }

    @Override
    public String editarItem() {

        System.out.println("Digite o nome do livro que você deseja editar: ");
        String nomeLivroEditar = s.nextLine();

        boolean encontrado = false;

        for (Livro livro : listaDeLivros) {
            if (livro.getNome().equalsIgnoreCase(nomeLivroEditar)) {
                System.out.println("Livro encontrado. Digite os novos dados:");

                System.out.println("Digite o novo nome do livro: ");
                String novoNome = s.nextLine();
                livro.setNome(novoNome);

                System.out.println("Digite o novo autor do livro: ");
                String novoAutor = s.nextLine();
                livro.setAutor(novoAutor);

                // Outras informações que você deseja editar

                encontrado = true;
                System.out.println("Livro editado com sucesso!");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum livro com o nome " + nomeLivroEditar + " encontrado.");
        }
        return null;
    }

    @Override
    public String pesquisaItem() {

        String nomePesquisa;
        boolean encontrado = false;

        System.out.println("Digite o Nome do livro: ");
        nomePesquisa = s.nextLine();

        for (Livro livro : listaDeLivros) {
            if (livro.getNome().equalsIgnoreCase(nomePesquisa)) {
                System.out.println("Nome: " + livro.getNome());
                System.out.println("Autor: " + livro.getAutor());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro com o nome " + nomePesquisa + " encontrado.");
        }

        return "encontrado!";
    }

    @Override
    public String pesquisaTitulo(){
        String nomePesquisa;
        boolean encontrado = false;

        System.out.println("Digite o Título do livro: ");
        nomePesquisa = s.nextLine();

        for (Livro livro : listaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(nomePesquisa)) {
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("Nome: " + livro.getNome());
                System.out.println("Autor: " + livro.getAutor());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro com o titulo " + nomePesquisa + " encontrado.");
        }
        return null;
    }
}
