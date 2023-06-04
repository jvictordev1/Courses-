public class estruturascondicionais {
    public static void main(String[] args){
        int grade=90;
        String res;

        if(grade<0){
            res="";
        }
        else{
            if(grade>=80){
                res="A";
            }
            else{
                if(grade<80 && grade>=70){
                    res="B";
                }
                else{
                    if(grade<70 && grade>=60){
                        res="C";
                    }
                    else{
                        res="D";
                    }
                }
            }
        }
        
        switch(res){
            case "A":
            case "B":
                System.out.println("you are approved!");
                break;
            case "C":
            case "D":
                System.out.println("you are not approved!");
                break;
            default:
                System.out.println("invalid grade, try again.");
                break;
        }
    }
}
