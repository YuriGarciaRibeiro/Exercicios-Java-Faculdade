import classes.classPessoaFisica;
import classes.classPessoaJuridica;

public class main {
    public static void main(String[] args) {
        classPessoaFisica pessoaFisica1 = new classPessoaFisica("João", "Rua das Flores", "123456789", "12345678901", "12345678901", "01/01/2000");
        classPessoaJuridica pessoaJuridica1 = new classPessoaJuridica("Empresa", "Rua das Flores", "123456789", "12345678901", "12345678901", "12345678901");

        // retornando valores pelos getters(pessoa fisica)
        System.out.println("===================== Pessoa Física =====================");
        System.out.println("Nome: " + pessoaFisica1.getNome());
        System.out.println("Endereço: " + pessoaFisica1.getEndereco());
        System.out.println("Telefone: " + pessoaFisica1.getTelefone());
        System.out.println("CPF: " + pessoaFisica1.getCpf());
        System.out.println("RG: " + pessoaFisica1.getRG());
        System.out.println("Data de Nascimento: " + pessoaFisica1.getDataNascimento());
        System.out.println("===========================================================");


        // retornando valores pelos getters(Pessoa Juridica)
        System.out.println("===================== Pessoa Jurídica =====================");
        System.out.println("Nome: " + pessoaJuridica1.getNome());
        System.out.println("Endereço: " + pessoaJuridica1.getEndereco());
        System.out.println("Telefone: " + pessoaJuridica1.getTelefone());
        System.out.println("CNPJ: " + pessoaJuridica1.getCnpj());
        System.out.println("Inscrição Estadual: " + pessoaJuridica1.getInscricaoEstadual());
        System.out.println("Inscrição Municipal: " + pessoaJuridica1.getInscricaoMunicipal());
        System.out.println("===========================================================");

        // alterando valores pelos setters(pessoafisica)
        pessoaFisica1.setNome("Maria");
        pessoaFisica1.setEndereco("Rua das Arvores");
        pessoaFisica1.setTelefone("987654321");
        pessoaFisica1.setCpf("98765432101");
        pessoaFisica1.setRG("98765432101");
        pessoaFisica1.setDataNascimento("01/01/2020");

        // alterando valores pelos setters(pessoa juridica)
        pessoaJuridica1.setNome("Empresa3");
        pessoaJuridica1.setEndereco("Rua das Arvores");
        pessoaJuridica1.setTelefone("987654321");
        pessoaJuridica1.setCnpj("98765432101");
        pessoaJuridica1.setInscricaoEstadual("98765432101");
        pessoaJuridica1.setInscricaoMunicipal("98765432101");

        // retornando valores pelos getters apos alteração(pessoa fisica)
        System.out.println("===================== Pessoa Física =====================");
        System.out.println("Nome: " + pessoaFisica1.getNome());
        System.out.println("Endereço: " + pessoaFisica1.getEndereco());
        System.out.println("Telefone: " + pessoaFisica1.getTelefone());
        System.out.println("CPF: " + pessoaFisica1.getCpf());
        System.out.println("RG: " + pessoaFisica1.getRG());
        System.out.println("Data de Nascimento: " + pessoaFisica1.getDataNascimento());
        System.out.println("===========================================================");


        // retornando valores pelos getters apos alteração(Pessoa Juridica)
        System.out.println("===================== Pessoa Jurídica =====================");
        System.out.println("Nome: " + pessoaJuridica1.getNome());
        System.out.println("Endereço: " + pessoaJuridica1.getEndereco());
        System.out.println("Telefone: " + pessoaJuridica1.getTelefone());
        System.out.println("CNPJ: " + pessoaJuridica1.getCnpj());
        System.out.println("Inscrição Estadual: " + pessoaJuridica1.getInscricaoEstadual());
        System.out.println("Inscrição Municipal: " + pessoaJuridica1.getInscricaoMunicipal());
        System.out.println("===========================================================");







    }
    
    
    


}
