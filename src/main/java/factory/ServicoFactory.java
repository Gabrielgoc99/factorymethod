package factory;

import model.IReserva;
public class ServicoFactory {

    public static IReserva obterReserva (String reserva) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("model.Reserva" + reserva);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Reserva inexistente! Tente Novamente!");
        }
        if (!(objeto instanceof IReserva)) {
            throw new IllegalArgumentException("Reserva inválido! Tente Novamente!");
        }
        return (IReserva) objeto;
    }
}