package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ValidacionSeguroTest {

    private ValidacionSeguro validacionSeguro;

   @BeforeEach
    public void prepararPruebas(){this.validacionSeguro = new ValidacionSeguro();}

    @Test
    public  void validarNombreAseguradoCorrecto(){
       String nombrePrueba = "Natalia";
       Boolean resultado = Assertions.assertDoesNotThrow(()-> this.validacionSeguro.validarNombreAsegurado(nombrePrueba));
       Assertions.assertTrue(resultado);
    }

    @Test
    public void  validarNombreAseguradoIncorrectoPorTipoCaracter(){

        String nombrePrueba = "1235nata";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarNombreAsegurado(nombrePrueba));
        Assertions.assertEquals(Mensajes.NOMBRE_FORMATO.getMensaje(), resultado.getMessage());
    }

    @Test
    public  void validarNombreAseguradoIncorrectoPorLongitud(){

        String nombrePrueba = "nasikdjfsghdfhgdsoidksdcjhsbdfsldcfkjskdfgsodi;fkjskdhufpsdohsgdfidhfiopiofdhgfififofofofofofof";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarNombreAsegurado(nombrePrueba));
        Assertions.assertEquals(Mensajes.LONGITUD_NOMBRE.getMensaje(), resultado.getMessage());
    }

    @Test
    public void validarEdadCorrecta(){

        Integer edadPrueba = 50;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarEdadAsegurado(edadPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarEdadIncorrectaNegativa(){

        Integer edadPrueba = -50;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarEdadAsegurado(edadPrueba));
        Assertions.assertEquals(Mensajes.NUMERO_NEGATIVA.getMensaje(),resultado.getMessage());
    }
    @Test
    public void validarEdadIncorrectaPorLongitud(){

        Integer edadPrueba = 92;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarEdadAsegurado(edadPrueba));
        Assertions.assertEquals(Mensajes.LONGITUD_EDAD.getMensaje(),resultado.getMessage());
    }

    @Test
    public void validarMontoCoberturaCorrecta(){

        Integer montoPrueba = 50;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarMontoCobertura(montoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarMontoCoberturaIncorrectaNegativa(){

        Integer montoPrueba = -50;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarMontoCobertura(montoPrueba));
        Assertions.assertEquals(Mensajes.NUMERO_NEGATIVA.getMensaje(),resultado.getMessage());
    }
    @Test
    public void validarMontoCoberturaIncorrectaPorLongitud(){

        Integer montoPrueba = 1600;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarMontoCobertura(montoPrueba));
        Assertions.assertEquals(Mensajes.LONGITUD_MONTO.getMensaje(),resultado.getMessage());
    }
    @Test
    public  void validarBeneficiarioCorrecto(){
        String nombrePrueba = "Natalia";
        Boolean resultado = Assertions.assertDoesNotThrow(()-> this.validacionSeguro.validarBeneficiario(nombrePrueba));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void  validarBeneficiarioIncorrectoPorTipoCaracter(){

        String nombrePrueba = "1235natajshhs";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarBeneficiario(nombrePrueba));
        Assertions.assertEquals(Mensajes.FORMATO_BENEFICIARIO.getMensaje(), resultado.getMessage());
    }

    @Test
    public  void validarBeneficiarioIncorrectoPorLongitud(){

        String nombrePrueba = "nasikdjfsghdfhgdsoidksdcjhsbdfsldcfkjskdfgsodi;fkjskdhufpsdohsgdfidhfiopiofdhgfififofofofofofof";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarBeneficiario(nombrePrueba));
        Assertions.assertEquals(Mensajes.LONGITUD_BENEFICIARIO.getMensaje(), resultado.getMessage());
    }
    @Test
    public  void validarFechaCorrecta(){
        String fecha = "05/02/1995";
        Boolean resultado = Assertions.assertDoesNotThrow(()-> this.validacionSeguro.validarFechaInicioCobertura(fecha));
        Assertions.assertTrue(resultado);
    }

    @Test
    public void  validarFechaIncorrectoPorTipoFormato(){

        String fecha = "000/00/222";
        Exception resultado = Assertions.assertThrows(Exception.class, ()-> this.validacionSeguro.validarFechaInicioCobertura(fecha));
        Assertions.assertEquals(Mensajes.FORMATO_FECHA.getMensaje(), resultado.getMessage());
    }

  
}