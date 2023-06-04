public class laços {
    public static void main(String[] args) {
        int t1,t2;

        for(t1=1;t1<=10;t1++){
            System.out.printf("Tabuada do número %d.%n%n",t1);
            for(t2=1;t2<=10;t2++){
                System.out.printf("%d * %d = %d %n",t1,t2,t1*t2);
            }
            System.out.println();
        }
    }
}