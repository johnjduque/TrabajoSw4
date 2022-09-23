package com.uco.myproject.dominio.validarobligatorio;

public class ValidarNumero {

    public ValidarNumero() {
    }
    public static void validarCalificacion(int valor, String mensaje) {
        if (validarNumeroNulo(valor)) {
            throw new IllegalArgumentException(mensaje);
        }
        if(validarNumeroMenorQueCero(valor)){
            throw new NumberFormatException(mensaje);
        }
        if(valor < 1 || valor > 5){
            throw new IllegalArgumentException(mensaje);
        }
    }
    public static void validarObligatorioNumero(float valor, String mensaje) {
        if (validarNumeroNulo(valor)) {
            throw new IllegalArgumentException(mensaje);
        }
        if(validarNumeroMenorQueCero(valor)){
            throw new NumberFormatException(mensaje);
        }
    }
    public static void validarObligatorioNumero(Long valor, String mensaje) {
        if (validarNumeroNulo(valor)) {
            throw new IllegalArgumentException(mensaje);
        }
        if(validarNumeroMenorQueCero(valor)){
            throw new NumberFormatException(mensaje);
        }
    }
    private static boolean validarNumeroNulo(float valor) {
        return esNulo(valor);
    }
    private static boolean validarNumeroNulo(int valor) {
        return esNulo(valor);
    }
    private static boolean validarNumeroNulo(Long valor) {
        return esNulo(valor);
    }
    private static boolean validarNumeroMenorQueCero(float valor){
        return valor < 0;
    }
    private static boolean validarNumeroMenorQueCero(int valor){
        return valor < 0;
    }
    private static boolean validarNumeroMenorQueCero(Long valor){
        return valor < 0;
    }
    private static <T> boolean esNulo(T objeto){
        return objeto == null;
    }
}
