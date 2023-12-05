import br.edu.uninassau.Endereco;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class Maintest {
    @Test
    @DisplayName("Tudo ok.")
    public void cepDeveConterOitoNumeros(){
        Endereco enderecoTest = new Endereco();
        enderecoTest.setCep("53030010");

        int tamanhoEsperado = 8;
        int tamanhoReal = enderecoTest.getCep().length();

        Assertions.assertEquals(tamanhoEsperado, tamanhoReal, "O tamanho do CEP não está correto.");
    }

    @Test
    @DisplayName("CEP não deve estar vazio.")
    public void cepNaoDeveEstarVazio() {
        Endereco enderecoTest = new Endereco();
        enderecoTest.setCep("53030020");

        Assertions.assertFalse(enderecoTest.getCep().isEmpty(), "O CEP não deve estar vazio.");
    }

    @Test
    @DisplayName("CEP deve conter apenas números.")
    public void cepDeveConterApenasNumeros() {
        Endereco enderecoTest = new Endereco();
        enderecoTest.setCep("5303030");

        Assertions.assertTrue(enderecoTest.getCep().matches("[0-9]+"), "O CEP deve conter apenas números.");
    }

    @Test
    @DisplayName("CEP não pode conter menos de 8 números.")
    public void cepNaoPodeConterMenosDeOitoNumeros() {
        Endereco enderecoTest = new Endereco();
        enderecoTest.setCep("53030020");

        Assertions.assertTrue(enderecoTest.getCep().length() >= 8, "O CEP não pode conter menos de 8 números.");
    }

    @Test
    @DisplayName("CEP não pode ter todos os números iguais.")
    public void cepNaoPodeTerTodosNumerosIguais() {
        Endereco enderecoTest = new Endereco();
        enderecoTest.setCep("53140100");

        Assertions.assertFalse(enderecoTest.getCep().matches("(\\d)\\1{7}"), "O CEP não pode ter todos os números iguais.");
    }

    @Test
    @DisplayName("CEP não pode conter caracteres especiais.")
    public void cepNaoPodeConterCaracteresEspeciais() {
        Endereco enderecoTest = new Endereco();
        enderecoTest.setCep("53140200");

        Assertions.assertTrue(enderecoTest.getCep().matches("[0-9]+"), "O CEP não pode conter caracteres especiais.");
    }

    @Test
    @DisplayName("CEP não pode ter mais de 8 números.")
    public void cepNaoPodeTerMaisDeOitoNumeros() {
        Endereco enderecoTest = new Endereco();
        enderecoTest.setCep("53030100");

        Assertions.assertTrue(enderecoTest.getCep().length() <= 8, "O CEP não pode ter mais de 8 números.");
    }
}
