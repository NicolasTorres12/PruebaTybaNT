package co.com.pruebatyba.utils.enums;

public enum RestServices {

    DESVINCULAR_PAA("/WSFacPAARest/rest/rest/desvincularPAA"),
    CONSULTAR_SALDO_PAA("/WSFacPAARest/rest/rest/consultarSaldoPAA");


    private final String uri;

    RestServices(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }

}
