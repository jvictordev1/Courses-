import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class stringsEdatas {
    public static void main(String[] args){
        String name="José";

        LocalDate today=LocalDate.now();
        Locale bra=Locale.getDefault();

        String dayOfWeek=today.getDayOfWeek().getDisplayName(TextStyle.FULL, bra);
        LocalDateTime now=LocalDateTime.now();

        String greeting;

        if(now.getHour()>=5 && now.getHour()<12){
            greeting="Good morning";
        }
        else{
            if(now.getHour()>=12 && now.getHour()<18){
                greeting="Good afternoon";
            }
            else{
                greeting="Good night";
            }
        }

        System.out.printf("Hello %s, %s. Today is %s. What are we up today?%n", name, greeting, dayOfWeek);
    }
    
}