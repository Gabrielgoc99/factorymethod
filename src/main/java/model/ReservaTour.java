package model;

public class ReservaTour implements IReserva {

    public String confirmar() {
        return "Reserva do Tour pela cidade confirmada!";
    }

    public String cancelar() {
        return "Reserva do Tour pela cidade cancelada!";
    }
}