package org.example.utilidades;

public enum Mensajes {


    LONGITUD_NOMBRE("El nombre debe tener maximo 20 caracteres"),
    NOMBRE_FORMATO("revise el formato del nombre"),

    NUMERO_NEGATIVA("La edad no puede ser negativa"),
    LONGITUD_EDAD("La longitud de la edad no es valida"),
    LONGITUD_MONTO("El monto se ha excedido de 1500 millones"),
    LONGITUD_BENEFICIARIO("La longitud  maxima es de 50 caracteres"),
    FORMATO_BENEFICIARIO("El formato no es valido"),
    FORMATO_FECHA("No coincide con el formato fecha requqrido");
    private String Mensaje;

    Mensajes(String mensaje){Mensaje = mensaje;}

    public String getMensaje(){return Mensaje;}

    public void setMensaje(String mensaje){Mensaje = mensaje;}
}
