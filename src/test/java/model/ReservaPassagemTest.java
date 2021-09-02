package model;

import factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaPassagemTest {

    @Test
    void deveExecutarReservaPassagem() {
        IReserva reserva = ServicoFactory.obterReserva("Passagem");
        assertEquals("Reserva da Passagem confirmada!", reserva.confirmar());
    }

    @Test
    void deveCancelarReservaPassagem() {
        IReserva reserva = ServicoFactory.obterReserva("Passagem");
        assertEquals("Reserva da Passagem cancelada!", reserva.cancelar());
    }
}