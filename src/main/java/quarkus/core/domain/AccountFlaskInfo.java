package quarkus.core.domain;

import java.util.Date;

public class AccountFlaskInfo {
    private int cantidad_deuda;
    private Date fecha_registro;
    private String rfc;

    public int getCantidad_deuda() {
        return cantidad_deuda;
    }

    public void setCantidad_deuda(int cantidad_deuda) {
        this.cantidad_deuda = cantidad_deuda;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        return "AccountFlaskInfo{" +
                "cantidad_deuda=" + cantidad_deuda +
                ", fecha_registro=" + fecha_registro +
                ", rfc='" + rfc + '\'' +
                '}';
    }
}
