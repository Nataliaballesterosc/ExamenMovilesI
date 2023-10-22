package org.example.validaciones;

import org.example.modelos.Seguro;
import org.example.utilidades.Mensajes;
import org.example.utilidades.Utilidad;

public class ValidacionSeguro {

    Utilidad utilidad = new Utilidad();  //Inyeccion de dependencias

    public ValidacionSeguro() {
    }

    public Boolean validarNombreAsegurado(String nombreAsegurado) throws Exception{

        if (nombreAsegurado.length() < 0 || nombreAsegurado.length() > 20){
            throw new Exception(Mensajes.LONGITUD_NOMBRE.getMensaje());
        }

        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,nombreAsegurado)){
            throw new Exception(Mensajes.NOMBRE_FORMATO.getMensaje());
        }
        return true;
    }

    public Boolean validarEdadAsegurado(Integer edadAsegurado) throws Exception {

        if (edadAsegurado < 0 ) {
            throw new Exception(Mensajes.NUMERO_NEGATIVA.getMensaje());
        }
        if (edadAsegurado > 90 ) {
            throw new Exception(Mensajes.LONGITUD_EDAD.getMensaje());
        }
        return true;
    }

    public Boolean validarMontoCobertura(Integer montoCobertura) throws Exception {

        if (montoCobertura < 0 ) {
            throw new Exception(Mensajes.NUMERO_NEGATIVA.getMensaje());
        }
        if (montoCobertura > 1500 ) {
            throw new Exception(Mensajes.LONGITUD_MONTO.getMensaje());
        }
        return true;
    }

    public Boolean validarBeneficiario(String beneficiario) throws Exception{

        if (beneficiario.length() < 0 || beneficiario.length() > 50){
            throw new Exception(Mensajes.LONGITUD_BENEFICIARIO.getMensaje());
        }

        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,beneficiario)){
            throw new Exception(Mensajes.FORMATO_BENEFICIARIO.getMensaje());
        }
        return true;
    }
    public Boolean validarFechaInicioCobertura(String fechaInicioCobertura) throws Exception{


        String expresionRegular = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        if (!this.utilidad.buscarCoincidencia(expresionRegular,fechaInicioCobertura)){
            throw new Exception(Mensajes.FORMATO_FECHA.getMensaje());
        }
        return true;
    }



}
