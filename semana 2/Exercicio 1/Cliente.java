package exercicio0703;

public class Cliente {
    private String nome;
    private String idade;
    private String id;
    private String telefone;


    public Cliente(String nome, String idade, String id, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void showDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Id: " + this.id);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("-----------------------------------------------------");

}
}