import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompras {
    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public void realizarPagamento() {
        double total = calcularTotal();
        System.out.println("Total a pagar: R$ " + total);
        System.out.println("Pagamento realizado com sucesso!");
    }
}