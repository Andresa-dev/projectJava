// Arquivo Main.java
public class main {
    public static void Main(String[] args) {
        Pessoa pessoa = new Pessoa("Pedro", 40, "Rua A, nº 321");
        pessoa.exibirInformacoes();

        pessoa.setNome("Ana");
        pessoa.setIdade(38);
        pessoa.setEndereco("Avenida B, nº 654");
        pessoa.exibirInformacoes();
    }
}
