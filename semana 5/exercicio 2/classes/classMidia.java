package classes;

public class classMidia {
    
    // Atributos
    int codigo;
    String titulo;
    double preco;

    // Construtor
    public classMidia(int codigo, String titulo, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.preco = preco;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Codigo: " + codigo + "\nTitulo: " + titulo + "\nPreco: " + preco;
    }

    // Setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Métodos
    public void printDados() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Título: " + this.titulo);
        System.out.println("Preço: " + this.preco);
    }

    public void inserirDados(String titulo, double preco, int codigo) {
        this.titulo = titulo;
        this.preco = preco;
        this.codigo = codigo;
    }
}
