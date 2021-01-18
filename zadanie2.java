import java.util.Scanner;

class zadanie2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Prosze wpisac zdanie: ");
        String a = sc.nextLine();
        System.out.println("Tekst ma dlugosc "+a.length()+" znakow");
    }
}
