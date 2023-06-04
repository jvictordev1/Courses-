public class bool{
    public static void main(String[] args){
        boolean weekend=true;
        boolean sunny=true;
        boolean goToBeach=weekend && sunny;
        String message=goToBeach ? "yes, we are going to the beach today." : "no, we arent going to the beach today.";

        System.out.println(goToBeach);
        System.out.println("are we going to the beach today? " + message);
    }
}