import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private List<Compra> compras;

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Double obterValorFinal(){
        Double total = 0.0;
        for (Compra compra :compras){
            for (Item item: compra.getItens()){
                total += item.getQuantidade() * item.getProduto().getPreco();

            }
        }
        return total ;
    }
}
