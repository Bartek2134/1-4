import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner wpisz = new Scanner(System.in);
    System.out.println("Program 3 - kalkulator");
    System.out.println("Jakie chcesz wykonac dzialanie ?");
    System.out.println("Dodawanie - 1");
    System.out.println("Odejmowanie - 2");
    System.out.println("Mnożenie - 3");
    System.out.println("Dzielenie - 4");
    System.out.println("Zakoncz program - 5");
      int kalk = wpisz.nextInt();
    System.out.println("Podaj liczbe 1:");
      float a = wpisz.nextFloat();
    System.out.println("Podaj liczbe 2:");
      float b = wpisz.nextFloat();
    switch(kalk) {
      case 1:
        System.out.println("Suma to: " + (a+b));
        break;
      case 2:
        System.out.println("Różnica to: " + (a-b));
        break;
      case 3:
        System.out.println("Iloczyn to: " + (b*a));
        break;
      case 4:
       if(b==0){
         System.out.println("Nie dziel przez 0");
       }
       else{ 
         System.out.println("Iloraz to: " + (a/b));
         }
         break;
      default:
        System.out.println("Nie ma takiego dzialania");
      break;
    
  }
  }  
}