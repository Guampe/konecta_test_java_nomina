package domain;

import java.time.LocalDate;

public class FechaPago {

    private LocalDate fecha;

    public FechaPago(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
