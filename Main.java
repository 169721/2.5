//wyznaczyć max liczbę z 3 wprowadzonych
//trak2023z@gmail.com
//2.6 zestawienie remperatur *C -*F krok 20* <0-300>
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int num1, num2, num3, max;
    Scanner sc = new Scanner(System.in);
    System.out.println("podaj liczbę 1: ");
    num1 = sc.nextInt();
    System.out.println("podaj liczbę 2: ");
    num2 = sc.nextInt();
    System.out.println("podaj liczbę 3: ");
    num3 = sc.nextInt();
    if(num1>num2){max = num1;} else {max = num2;}
    if(max<num3){max = num3; }
    System.out.println(+max);
  
  }
}