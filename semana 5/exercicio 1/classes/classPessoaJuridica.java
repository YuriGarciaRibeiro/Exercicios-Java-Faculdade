package classes;

public class classPessoaJuridica extends classPessoa {
    // Atributos
    String cnpj;
    String inscricaoEstadual;
    String inscricaoMunicipal;

    // Construtor
    public classPessoaJuridica(String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String inscricaoMunicipal) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    //Getters and Setters
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
}
