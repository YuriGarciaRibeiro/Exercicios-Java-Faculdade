package classes;

public class classCD extends classMidia {
    
    // Atributos
    int nMusicas;

    // Construtor
    public classCD(int codigo, String titulo, double preco, int nMusicas) {
        super(codigo, titulo, preco);
        this.nMusicas = nMusicas;
    }

    // Getters
    public int getnMusicas() {
        return nMusicas;
    }

    public String getTipo() {
        return "CD";
    }

    public String getDetalhes() {
        return super.getDetalhes() + "\nNúmero de músicas: " + nMusicas;
    }

    // Setters

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }

    // Métodos

    public void printDados() {
        super.printDados();
        System.out.println("Número de músicas: " + nMusicas);
    }

    public void inserirDados(String titulo, double preco, int codigo, int nMusicas) {
        super.inserirDados(titulo, preco, codigo);
        this.nMusicas = nMusicas;
    }
}
