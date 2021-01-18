import java.util.Scanner;

class zadanie4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("======Prosty kalkulator======");
        System.out.print("\nProsze podac pierwsza liczbe: ");
        int l1 = sc.nextInt();
        System.out.print("\nProsze podac druga liczbe: ");
        int l2 = sc.nextInt();
        System.out.print("\nProsze wybrac dzialanie *mnozenie -odejmowanie /dzielenie +dodawanie:");
        String dzialanie = sc.next();
        if(dzialanie.equals("*")){
            System.out.print("\nWynik twojego dzialania to: "+l1*l2);
        }else if(dzialanie.equals("-")){
            System.out.print("\nWynik twojego dzialania to: "+(l1-l2));
        }else if(dzialanie.equals("/")){
            System.out.print("\nWynik twojego dzialania to: "+(l1/l2));
        }else if(dzialanie.equals("+")){
            System.out.print("\nWynik twojego dzialania to: "+(l1+l2));
        }else{
            System.out.print("Nie ma takiego dzialania");
        }
    }
}
