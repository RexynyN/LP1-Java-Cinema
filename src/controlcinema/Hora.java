
package controlcinema;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

//Classe para criar um timer que indique qual o horário atual
public class Hora {
    Calendar data = Calendar.getInstance();

//Criação do timer
    public String getHora() {
        String data = "dd/MM/yyyy";
        String hora = "HH:mm";
        String data1, hora1;
        
        Date agora = new Date();
        SimpleDateFormat formata = new SimpleDateFormat(data);
        
        data1 = formata.format(agora);
        formata = new SimpleDateFormat(hora);
        hora1 = formata.format(agora);

        return hora1;
    }
}
