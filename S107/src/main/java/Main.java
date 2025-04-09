import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando alguns produtos
        Produto produto1 = new Produto("Camiseta", 49.99);
        Produto produto2 = new Produto("Calça", 79.99);
        Produto produto3 = new Produto("Tênis", 199.99);

        // Lista de produtos disponíveis
        Produto[] produtosDisponiveis = {produto1, produto2, produto3};

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("Bem-vindo à loja! Escolha os produtos para adicionar ao carrinho:");

        while (true) {
            System.out.println("\nProdutos disponíveis:");
            for (int i = 0; i < produtosDisponiveis.length; i++) {
                System.out.println((i + 1) + ". " + produtosDisponiveis[i].getNome() + " - R$ " + produtosDisponiveis[i].getPreco());
            }
            System.out.println("0. Finalizar compra");

            System.out.print("Digite o número do produto que deseja adicionar: ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            } else if (escolha > 0 && escolha <= produtosDisponiveis.length) {
                carrinho.adicionarProduto(produtosDisponiveis[escolha - 1]);
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        System.out.println("\nFinalizando a compra...");
        carrinho.realizarPagamento();
        scanner.close();
    }
}