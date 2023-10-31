import java.util.Scanner;
import Class.Livro;
import Class.Cd;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro = new Livro();
        Cd cd = new Cd();

        livro.cadastrarItemEmprestavel();
        livro.pesquisaItem();

        cd.cadastrarItemEmprestavel();
        cd.pesquisaItem();

        scanner.close();
    }
}
