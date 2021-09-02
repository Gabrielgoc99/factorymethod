package model;

public class ReservaPassagem implements IReserva {

    public String confirmar() {
        return "Reserva da Passagem confirmada!";
    }

    public String cancelar() {
        return "Reserva da Passagem cancelada!";
    }
}