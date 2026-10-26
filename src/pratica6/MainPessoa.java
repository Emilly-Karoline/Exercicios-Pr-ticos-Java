package pratica6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainPessoa {

    @Test
    public void testarFormatacaoEndereco() {
        Endereco endereco = new Endereco(
                "Rua das Flores", 120, "Centro", "Campina Grande");

        assertEquals(
                "Rua das Flores, 120 - Centro - Campina Grande",
                endereco.formatar());}

    @Test
    public void testarApresentacaoPessoa() {
        Endereco endereco = new Endereco(
                "Rua das Flores", 120, "Centro", "Campina Grande");
        Pessoa ana = new Pessoa("Ana", endereco);

        assertEquals(
                "Ana | Rua das Flores, 120 - Centro - Campina Grande",
                ana.apresentar());}

    @Test
    public void testarAtualizacaoEndereco() {
        Endereco endereco = new Endereco(
                "Rua das Flores", 120, "Centro", "Campina Grande");
        Pessoa ana = new Pessoa("Ana", endereco);

        Endereco novoEndereco = new Endereco(
                "Rua do Sol", 45, "Prata", "Campina Grande");
        ana.atualizarEndereco(novoEndereco);

        assertEquals(
                "Ana | Rua do Sol, 45 - Prata - Campina Grande",
                ana.apresentar());}

    @Test
    public void testarIndependenciaEntrePessoas() {
        Pessoa ana = new Pessoa(
                "Ana",
                new Endereco("Rua das Flores", 120, "Centro", "Campina Grande"));

        Pessoa carlos = new Pessoa(
                "Carlos",
                new Endereco("Rua A", 10, "Bodocongo", "Campina Grande"));

        String apresentacaoCarlosAntes = carlos.apresentar();

        ana.atualizarEndereco(
                new Endereco("Rua do Sol", 45, "Prata", "Campina Grande"));

        assertEquals(apresentacaoCarlosAntes, carlos.apresentar());}
}