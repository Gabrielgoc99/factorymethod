package model;

import factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTourTest {

    @Test
    void deveExecutarReservaTour() {
        IReserva reserva = ServicoFactory.obterReserva("Tour");
        assertEquals("Reserva do Tour pela cidade confirmada!", reserva.confirmar());
    }

    @Test
    void deveCancelarReservaTour() {
        IReserva reserva = ServicoFactory.obterReserva("Tour");
        assertEquals("Reserva do Tour pela cidade cancelada!", reserva.cancelar());
    }
}