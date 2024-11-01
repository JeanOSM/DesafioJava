import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setId(1);
        produto1.setNome("Lasanha");
        produto1.setPreco(7.99);

        Produto produto2 = new Produto();
        produto2.setId(2);
        produto2.setNome("Batata palha");
        produto2.setPreco(3.99);


        Item item1 = new Item();
        item1.setId(1);
        item1.setQuantidade(3);
        item1.setProduto(produto1);

        Item item2 = new Item();
        item2.setId(2);
        item2.setQuantidade(2);
        item2.setProduto(produto2);

        Item item3 = new Item();
        item3.setId(3);
        item3.setQuantidade(1);
        item3.setProduto(produto1);

        Item item4 = new Item();
        item4.setId(4);
        item4.setQuantidade(3);
        item4.setProduto(produto2);

        List<Item> items1= new ArrayList<>();
        items1.add(item1);
        items1.add(item2);

        List<Item> items2= new ArrayList<>();
        items2.add(item3);
        items2.add(item4);

        Compra compra1 = new Compra();
        compra1.setId(1);
        compra1.setItens(items1);

        Compra compra2 = new Compra();
        compra2.setId(2);
        compra2.setItens(items2);

        List<Compra> compras1 = new ArrayList<>();
        compras1.add(compra1);

        List<Compra> compras2 = new ArrayList<>();
        compras2.add(compra2);

        Cliente cliente1 = new Cliente();
        cliente1.setId(1);
        cliente1.setNome("Adrieli");
        cliente1.setCompras(compras1);

        Cliente cliente2 = new Cliente();
        cliente2.setId(2);
        cliente2.setNome("Estela");
        cliente2.setCompras(compras2);

        Double obter = cliente1.obterValorFinal();
        Double obter2 = cliente2.obterValorFinal();
        System.out.println("O valor gasto por "+ cliente1.getNome()+ " é "+ obter);
        System.out.println("O valor gasto por "+ cliente2.getNome()+ " é "+ obter2);

    }
}
