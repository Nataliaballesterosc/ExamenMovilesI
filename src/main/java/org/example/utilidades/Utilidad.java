package org.example.utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidad {

    public boolean buscarCoincidencia(String expresionregular, String cadenaTexto){
        Pattern patron = Pattern.compile(expresionregular);
        Matcher coincidencia = patron.matcher(cadenaTexto);
        if (coincidencia.matches()){
            return  true;
        }else {
            return false;
        }
    }

    public LocalDate convertDate (String inputDate){
        DateTimeFormatter inputFormater = DateTimeFormatter.ofPattern("dd/mm/yyyy");

        LocalDate date = LocalDate.parse(inputDate, inputFormater);

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        String formattedDate = date.format(outputFormatter);

        return  LocalDate.parse(formattedDate);
    }
}
