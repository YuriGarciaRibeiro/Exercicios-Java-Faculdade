package classes;

public class classDVD extends classMidia {
    
    // Atributos
    int nFaixas;

    // Construtor
    public classDVD(int codigo, String titulo, double preco, int nFaixas) {
        super(codigo, titulo, preco);
        this.nFaixas = nFaixas;
    }

    // Getters
    public int getnFaixas() {
        return nFaixas;
    }

    public String getTipo() {
        return "DVD";
    }

    public String getDetalhes() {
        return super.getDetalhes() + "\nNúmero de faixas: " + nFaixas;
    }

    // Setters

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    // Métodos

    public void printDados() {
        super.printDados();
        System.out.println("Número de faixas: " + nFaixas);
    }

    public void inserirDados(String titulo, double preco, int codigo, int nFaixas) {
        super.inserirDados(titulo, preco, codigo);
        this.nFaixas = nFaixas;
    }
}