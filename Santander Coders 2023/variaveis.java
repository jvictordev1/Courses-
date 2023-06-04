class hellofriend{
    public static void main(String[] args){
        String name; //declaração de variavel
        name="José"; //atribuição de valor a variavel

        System.out.println("Olá, " + name);

        //soma de dois valores
        int a,b,soma,sub,mult,div;
        float div2;
        a=5;
        b=6;

        soma=a+b;
        sub=a-b;
        mult=a*b;
        div=a/b; //a divisao entre dois inteiros retorna um numero inteiro
        div2=(float)a/b;

        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(div2);
    }
}