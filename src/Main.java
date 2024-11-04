import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.criarProduto("Carne moida a vacuo 1kg", 25.99);

        Produto produto2 = new Produto();
        produto2.criarProduto("Frango desfiado 1kg", 18.99);

        System.out.println(produto1.getNome() + produto1.getPreco());
        System.out.println(produto2.getNome() + produto2.getPreco());

        Item item1 = new Item();
        item1.criarItem(3, produto1);

        Item item2 = new Item();
        item2.criarItem(2, produto2);

        Item item3 = new Item();
        item3.criarItem(1, produto1);

        Item item4 = new Item();
        item4.criarItem(3, produto2);

        List<Item> items1 = new ArrayList<>();
        items1.add(item1);
        items1.add(item2);

        List<Item> items2 = new ArrayList<>();
        items2.add(item3);
        items2.add(item4);

        Compra compra1 = new Compra();
        compra1.criarCompra(items1);

        Compra compra2 = new Compra();
        compra2.criarCompra(items2);

        List<Compra> compras1 = new ArrayList<>();
        compras1.add(compra1);

        List<Compra> compras2 = new ArrayList<>();
        compras2.add(compra2);

        Cliente cliente1 = new Cliente();
        cliente1.criarCliente("Adrieli", compras1);

        Cliente cliente2 = new Cliente();
        cliente2.criarCliente("Estela", compras2);

        Double obter = cliente1.obterValorFinal();
        Double obter2 = cliente2.obterValorFinal();
        System.out.println("O valor gasto por " + cliente1.getNome() + " é " + obter);
        System.out.println("O valor gasto por " + cliente2.getNome() + " é " + obter2);

    }
}
