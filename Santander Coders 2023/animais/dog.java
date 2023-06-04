package animais;

public class dog extends animals {
    static int dogAmount;
    public dog(String nome,double peso,double altura,String cor){
        this.name=nome;
        this.weight=peso;
        this.height=altura;
        this.color=cor;

        dogAmount++;
    }

    public String nomeDoPet(){
        return this.name;
    }
    public int amount(){
        return dogAmount;
    }
    public String corDoPet(){
        return this.color;
    }
    public double pesoDoPet(){
        return this.weight;
    }
    public double alturaDoPet(){
        return this.height;
    }

    @Override
    protected void play() {
    }
    @Override
    protected void eat() {
    }
    @Override
    protected void sleep() {
    }
    @Override
    protected String sound() {
        return "Bark Bark!";
    }
}