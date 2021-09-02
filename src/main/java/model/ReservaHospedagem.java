package model;

public class ReservaHospedagem implements IReserva {

    public String confirmar() {
        return "Hospedagem confirmada!";
    }

    public String cancelar() {
        return "Hospedagem cancelada!";
    }
}