import java.util.Scanner;

class zadanie3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("======Prosty kalkulator BMI======");
        System.out.print("\nProsze podac imie: ");
        String imie = sc.next();
        System.out.print("\nProsze podac nazwisko: ");
        String nazwisko = sc.next();
        System.out.print("\nProsze podac wzrost: ");
        Float wzrost = sc.nextFloat();
        System.out.print("\nProsze podac wage: ");
        Float waga = sc.nextFloat();
        Float bmi = waga/(wzrost*wzrost)*10000;
        System.out.print(bmi);
        if(bmi<18.5){
            System.out.print("\nNiedowaga");
        }else if((18.5<=bmi) && (bmi<=24.9)){
            System.out.print("\nWaga prawidlowa");
        }else if((25<=bmi) && (bmi<=29.9)){
            System.out.print("\nNadwaga");
        }else{
            System.out.print("\nOtylosc");
        }
    }
}
