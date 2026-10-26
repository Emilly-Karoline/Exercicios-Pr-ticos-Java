package pratica6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainCarro {
    @Test
    public void testarEstadoInicial() {
        Motor motor = new Motor(150);
        Carro carro = new Carro("Civic", motor);

        assertFalse(carro.estaLigado());
        assertFalse(motor.estaLigado());}

    @Test
    public void testarLigarCarro() {
        Motor motor = new Motor(150);
        Carro carro = new Carro("Civic", motor);

        carro.ligar();

        assertTrue(carro.estaLigado());
        assertTrue(motor.estaLigado());}

    @Test
    public void testarDesligarCarro() {
        Motor motor = new Motor(150);
        Carro carro = new Carro("Civic", motor);

        carro.ligar();
        carro.desligar();

        assertFalse(carro.estaLigado());
        assertFalse(motor.estaLigado());}

    @Test
    public void testarAcelerarDesligado() {
        Motor motor = new Motor(150);
        Carro carro = new Carro("Civic", motor);

        assertFalse(carro.acelerar());
        assertFalse(motor.estaLigado());}

    @Test
    public void testarAcelerarLigado() {
        Motor motor = new Motor(150);
        Carro carro = new Carro("Civic", motor);

        carro.ligar();

        assertTrue(carro.acelerar());
        assertTrue(motor.estaLigado());}

    @Test
    public void testarLigarDuasVezes() {
        Motor motor = new Motor(150);
        Carro carro = new Carro("Civic", motor);

        carro.ligar();
        carro.ligar();

        assertTrue(motor.estaLigado());}
    @Test
    public void testarDesligarDuasVezes() {
        Motor motor = new Motor(150);
        Carro carro = new Carro("Civic", motor);

        carro.ligar();
        carro.desligar();
        carro.desligar();

        assertFalse(motor.estaLigado());}
}
