package animais;

public class cat extends animals{
    static int catAmount;

    public cat(String nome,double peso,double altura,String cor){
        this.name=nome;
        this.weight=peso;
        this.height=altura;
        this.color=cor;

        catAmount++;
    }

    public String nomeDoPet(){
        return this.name;
    }
    public int amount(){
        return catAmount;
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
    public String sound() {
        return "Meow Meow!";
    }
}
