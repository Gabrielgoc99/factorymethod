package factory;

import org.junit.jupiter.api.Test;
import model.IReserva;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IReserva servico = ServicoFactory.obterReserva("ReservaAlimentação");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Reserva inexistente! Tente Novamente!", e.getMessage());
        }
    }

}

