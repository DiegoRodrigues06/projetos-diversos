import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        System.out.println("Que nota você tirou no teste? ");
        int nota = sc.nextInt();

        VerificarAprovacao verificarAprovacao = new VerificarAprovacao(nota);
        String resultado = verificarAprovacao.verificarNota();

        if (idade >= 18) {
            System.out.println("Resultado: " + resultado + ", e você é maior de idade");
        } else {
            System.out.println("Resultado: " + resultado + ", e você não é maior de idade");
        }

        System.out.println("Digite o código do produto (1 para eletronicos, 2 para alimento): ");
        int codigoProduto = sc.nextInt();

        EscolherMetodo categoriaProduto = new EscolherMetodo();
        String tipo = categoriaProduto.escolherCategoria(codigoProduto);
        System.out.println("Categoria do produto: " + tipo);
        sc.close();
    }
}
