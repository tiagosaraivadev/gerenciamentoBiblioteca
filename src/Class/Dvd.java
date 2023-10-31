package Class;
import AbstractClass.ItemEmprestavel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Dvd extends ItemEmprestavel {

    ArrayList<Dvd> listaDeDvds = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public Dvd() {

    }

    public Dvd(String nome, String autor) {

    }

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

        System.out.println("Digite o Nome do Dvd: ");
        nomePesquisa = s.nextLine();

        for (Dvd dvd : listaDeDvds) {
            if (dvd.getNome().equalsIgnoreCase(nomePesquisa)) {
                System.out.println("Nome: " + dvd.getNome());
                System.out.println("Autor: " + dvd.getAutor());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum dvd com o nome " + nomePesquisa + " encontrado.");
        }

        return "encontrado!";
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
            System.out.println("Digite o nome do dvd (ou 0 para parar): ");
            String nomeDvd = s.nextLine();

            if ("0".equals(nomeDvd)) {
                System.out.println("Fim do cadastro!");
                break;
            }

            System.out.println("Digite o autor do Dvd: ");
            String autorDvd = s.nextLine();

            setNome(nomeDvd);
            setAutor(autorDvd);
            setEmprestado(true);
            setQuantidade(getQuantidade() + 1);
            Date dataCadastro = new Date();
            setDataCadastro(dataCadastro);
            listaDeDvds.add(this);

            System.out.println("Dvd cadastrado com sucesso!");
        }
        return "Cadastro de Dvds concluído!";
    }

    @Override
    public String editarItem() {
        System.out.println("Digite o nome do dvd que você deseja editar: ");
        String nomeDvdEditar = s.nextLine();

        boolean encontrado = false;

        for (Dvd dvd : listaDeDvds) {
            if (dvd.getNome().equalsIgnoreCase(nomeDvdEditar)) {
                System.out.println("Dvd encontrado. Digite os novos dados:");

                System.out.println("Digite o novo nome do Dvd: ");
                String novoNome = s.nextLine();
                dvd.setNome(novoNome);

                System.out.println("Digite o novo autor do Dvd: ");
                String novoAutor = s.nextLine();
                dvd.setAutor(novoAutor);

                encontrado = true;
                System.out.println("Dvd editado com sucesso!");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum livro com o nome " + nomeDvdEditar + " encontrado.");
        }
        return null;
    }
}
