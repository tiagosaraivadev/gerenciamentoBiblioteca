package Class;

import AbstractClass.ItemEmprestavel;
import AbstractClass.ItemNaoEmprestavel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Revista extends ItemNaoEmprestavel {
    ArrayList<Revista> listaDeRevistas = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public Revista() {}
    public Revista(String nome, String autor) {}

    @Override
    public String ordemAlfabetica() {
        return null;
    }

    @Override
    public String pesquisaTitulo() {
        return null;
    }

    @Override
    public String pesquisaAutor() {
        return null;
    }

    @Override
    public String pesquisaAno() {
        return null;
    }

    @Override
    public String pesquisaItem() {
        String nomePesquisa;
        boolean encontrado = false;

        System.out.println("Digite o Nome da revista: ");
        nomePesquisa = s.nextLine();

        for (Revista revista : listaDeRevistas) {
            if (revista.getNome().equalsIgnoreCase(nomePesquisa)) {
                System.out.println("Nome: " + revista.getNome());
                System.out.println("Autor: " + revista.getAutor());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhuma revista com o nome " + nomePesquisa + " encontrada.");
        }

        return "encontrada!";
    }

    @Override
    public String cadastrarItemNaoEmprestavel() {
        while (true) {
            System.out.println("Digite o nome da revista (ou 0 para parar): ");
            String nomeRevista = s.nextLine();

            if ("0".equals(nomeRevista)) {
                System.out.println("Fim do cadastro!");
                break;
            }

            System.out.println("Digite o autor da revista: ");
            String autorLivro = s.nextLine();

            setNome(nomeRevista);
            setAutor(autorLivro);
            setQuantidade(getQuantidade() + 1);
            Date dataCadastro = new Date();
            setDataCadastro(dataCadastro);
            listaDeRevistas.add(this);

            System.out.println("Revista cadastrada com sucesso!");
        }
        return "Cadastro de revistas concluído!";
    }

    @Override
    public String editarItem() {
        System.out.println("Digite o nome da revista que você deseja editar: ");
        String nomeRevistaEditar = s.nextLine();

        boolean encontrado = false;

        for (Revista revista : listaDeRevistas) {
            if (revista.getNome().equalsIgnoreCase(nomeRevistaEditar)) {
                System.out.println("Revista encontrada. Digite os novos dados:");

                System.out.println("Digite o novo nome da revista: ");
                String novoNome = s.nextLine();
                revista.setNome(novoNome);

                System.out.println("Digite o novo autor da revista: ");
                String novoAutor = s.nextLine();
                revista.setAutor(novoAutor);


                encontrado = true;
                System.out.println("Revista editada com sucesso!");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhuma revista com o nome " + nomeRevistaEditar + " encontrada.");
        }
        return null;
    }
}
