public class Produto {
    private int id;
    private String nome;
    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public String getNome(String lazanha) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
