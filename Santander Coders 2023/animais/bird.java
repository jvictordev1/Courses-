package animais;

public class bird extends animals {
    static int birdAmount;

    public bird(String nome,double peso,double altura,String cor){
        this.name=nome;
        this.weight=peso;
        this.height=altura;
        this.color=cor;

        birdAmount++;
    }

    public String nomeDoPet(){
        return this.name;
    }
    public int amount(){
        return birdAmount;
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
        return "Bra Bra!";
    }
}
