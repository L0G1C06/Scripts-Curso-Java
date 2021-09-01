import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Manipulando datas 

// Exibir a data atual
public class data {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();  // Cria um objeto data
        System.out.println("A data atual é: " + myObj);  // Mostra a data
    }
}


// Exibindo a hora atual
class hour_atual {
    public static void main(String[] args) {
        LocalTime newObj = LocalTime.now();
        System.out.println("A hora atual é: " + newObj);
    }
}

// Exibindo a data e horas atuais
class date_and_time_atual {
    public static void main(String[] args) {
        LocalDateTime NewObj = LocalDateTime.now();
        System.out.println("A hora e dia atual é: " + NewObj);
    }
}

// Formatando a data e hora
class format {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Antes da formatação: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
