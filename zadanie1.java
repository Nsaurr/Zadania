import java.util.Scanner;

class zadanie1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String haslo = "haslo123";
        System.out.print("Prosze wpisac haslo: ");
        String tekst = sc.next();
        if(tekst.equals(haslo)){
            System.out.println("Haslo jest poprawne");
        }else{
            System.out.println("Haslo nie jest poprawne");
        }
    }
}