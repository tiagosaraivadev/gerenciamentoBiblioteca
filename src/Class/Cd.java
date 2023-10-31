package Class;

import AbstractClass.ItemEmprestavel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cd extends ItemEmprestavel {

    ArrayList<Cd> listaDeCds = new ArrayList<>();
    public Cd() {
    }

    public Cd (String nome, String autor) {

    }

    Scanner s = new Scanner(System.in);
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
    public String editarItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do CD que você deseja editar: ");
        String nomeCdEditar = scanner.nextLine();

        boolean encontrado = false;

        for (Cd cd : listaDeCds) {
            if (cd.getNome().equalsIgnoreCase(nomeCdEditar)) {
                System.out.println("Cd encontrado. Digite os novos dados:");

                System.out.println("Digite o novo nome do Cd: ");
                String novoNome = scanner.nextLine();
                cd.setNome(novoNome);

                System.out.println("Digite o novo autor do Cd: ");
                String novoAutor = scanner.nextLine();
                cd.setAutor(novoAutor);

                encontrado = true;
                System.out.println("Livro editado com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum livro com o nome " + nomeCdEditar + " encontrado.");
        }
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
    public String cadastrarItemEmprestavel() {

        while (true) {
            System.out.println("Digite o nome do Cd (ou 0 para parar): ");
            String nomeCd = s.nextLine();

            if ("0".equals(nomeCd)) {
                System.out.println("Fim do cadastro!");
                break;
            }

            System.out.println("Digite o autor do Cd: ");
            String autorCd = s.nextLine();

            setNome(nomeCd);
            setAutor(autorCd);
            setEmprestado(true);
            setQuantidade(getQuantidade() + 1);
            Date dataCadastro = new Date();
            setDataCadastro(dataCadastro);
            listaDeCds.add(this);

            System.out.println("CD cadastrado com sucesso!");
        }
        return "Cadastro de Cds concluído!";
    }

    @Override
    public String pesquisaItem() {
        String nomePesquisa;
        boolean encontrado = false;

        System.out.println("Digite o Nome do Cd: ");
        nomePesquisa = s.nextLine();

        for (Cd cd : listaDeCds) {
            if (cd.getNome().equalsIgnoreCase(nomePesquisa)) {
                System.out.println("Nome: " + cd.getNome());
                System.out.println("Autor: " + cd.getAutor());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum cd com o nome " + nomePesquisa + " encontrado.");
        }

        return "encontrado!";
    }
}
