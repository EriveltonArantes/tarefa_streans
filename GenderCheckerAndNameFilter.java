import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenderCheckerAndNameFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<String> generos = new ArrayList<>();

        System.out.println("Digite seu nome: ");

        while (true) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Gênero (M/F): ");
            String genero = scanner.nextLine();
            if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F")) {
                nomes.add(nome);
                generos.add(genero);
            } else {
                System.out.println("Gênero inválido. Use 'M' para masculino ou 'F' para feminino.");
            }

            System.out.print("Digite 'continuar' para inserir outro nome ou 'parar' para encerrar: ");
            String opcao = scanner.nextLine();
            if (opcao.equalsIgnoreCase("parar")) {
                break;
            }
        }

        // Filtrar apenas os nomes femininos
        List<String> nomesFemininos = new ArrayList<>();
        for (int i = 0; i < nomes.size(); i++) {
            if (generos.get(i).equalsIgnoreCase("F")) {
                nomesFemininos.add(nomes.get(i));
            }
        }

        System.out.println("Nomes femininos digitados:");
        for (String nomeFeminino : nomesFemininos) {
            System.out.println(nomeFeminino);
        }

        int quantidadeMulheres = nomesFemininos.size();
        System.out.println("Quantidade de mulheres: " + quantidadeMulheres);
    }
}
