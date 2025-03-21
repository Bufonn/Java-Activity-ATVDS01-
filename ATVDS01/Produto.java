public class Produto {
    private String nome;
    private String preco;
    private int estoque;
    private int vendidos;
    private int id;

    public Produto(String nome, String preco, int estoque, int vendidos, int id) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.vendidos = vendidos; 
        this.id = id;
    }

    public Produto(String nome, String preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(int estoque, int vendidos, int id) {
        this.estoque = estoque;
        this.vendidos = vendidos;
        this.id = id;
    }

    //Get
    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getVendidos() {
        return vendidos;
    }

    public int getId() {
        return id;
    }

    //Set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String toString() {
        return "\n--- Produto ---\n" + "ID: " + id + "\n" + "Nome: " + nome + "\n" + "Preço: " + preco + "\n" + "E Estoque: " + estoque + "\n" +"Foram Vendidos: " + vendidos + "\n";
    }
}
