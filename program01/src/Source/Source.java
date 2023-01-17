package Source;
import java.util.*;
public class Source {
    static int validateHexCode(String s){
        if((s.charAt(0)=='#') && (s.length()-1)==6){
        if(s.matches("[#A-F0-9]*")){
            return 1;
        }
        else{
            return -1;
        }
    }
    return -1;
}
static int validateDecimalCode(String s){
    if(s.startsWith("rgb(")  && s.endsWith(")")){
        s=s.replace("rgb(","");
        s=s.replace(")","");
        String[] stringArray=s.split(",");
        for(String str:stringArray){
            if(str.matches("\\d+")&&Integer.parseInt(str)>=0&&Integer.parseInt(str)<=255){
                return 1;
            }
            else{
                return -1;
            }
        }
    }
    return -1;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s= sc.next();
    switch(n){
        case 1:
            if(validateHexCode(s)==1){
                System.out.print("Valid code");
            }
            else{
                System.out.print("Invalid code");
            }
            break;
            case 2:
                if(validateDecimalCode(s)==1){
                    System.out.print("Valid code");
                }
                else
                System.out.print("Invalid code");
                break;
                default:
                System.out.println("Invalid code");
    }
}
}
