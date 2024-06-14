package ports;

import java.time.LocalDate;

public interface FechaPagoRepository {
    boolean esNoHabil(LocalDate fecha);
}
