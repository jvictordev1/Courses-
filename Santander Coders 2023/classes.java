import animais.bird;
import animais.cat;
import animais.dog;
import java.util.Scanner;

public class classes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int code,codeIf;

        dog cachorro1, cachorro2;
        cat gato1,gato2;
        bird passaro1;

        cachorro1=new dog("Daniel", 4.45, 35.6, "Black");
        cachorro2=new dog("Rufus",5.54,41.6,"White");

        gato1=new cat("Safira", 1.5, 20.4, "Grey");
        gato2=new cat("Frajola", 0.7, 15.2, "Black");

        passaro1=new bird("Nero", 0.2, 0.5, "Yellow");

        System.out.printf("Dog amount: %d%n",gato1.amount());
        System.out.printf("Cat amount: %d%n",cachorro1.amount());
        System.out.printf("Bird amount: %d%n",passaro1.amount());

        System.out.println();

        System.out.printf("%s says: %s%n",gato1.nomeDoPet(),gato1.sound());
        System.out.printf("%s says: %s%n",gato2.nomeDoPet(),gato2.sound());
        System.out.printf("%s says: %s%n",passaro1.nomeDoPet(),passaro1.sound());
    }
}