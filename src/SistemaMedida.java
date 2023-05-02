import java.util.Scanner;

public class SistemaMedida {

    public static void main(String[] args) {
        
        String plano;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o plano: ");
        plano = sc.next();

       switch(plano){
        case "T":
        System.out.println("5Gb Youtube"); 
        case "M":
        System.out.println("Whats e Instagram grátis");
        case "B":
            System.out.println("100 minutos de ligação");
            break;
            default:
            System.out.println("NÃO EXISTE O PLANO");
        }

    }
    
}
