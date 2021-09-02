package model;

import factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaHospedagemTest {

    @Test
    void deveExecutarReservaHospedagem() {
        IReserva reserva = ServicoFactory.obterReserva("Hospedagem");
        assertEquals("Hospedagem confirmada!", reserva.confirmar());
    }

    @Test
    void deveCancelarReservaHospedagem() {
        IReserva reserva = ServicoFactory.obterReserva("Hospedagem");
        assertEquals("Hospedagem cancelada!", reserva.cancelar());
    }

}
