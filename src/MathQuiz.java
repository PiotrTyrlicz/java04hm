import java.util.Scanner;

public class MathQuiz {
    Scanner scan1 = new Scanner (System.in);
    int wynik=0;
    boolean odpowiedz1=false;
    boolean odpowiedz2=false;
    boolean odpowiedz3=false;

    public void question1(){
        System.out.println("Ile to 3*5? ");
        int odpowiedz = scan1.nextInt();
        if(odpowiedz==15){
            wynik++; odpowiedz1 =true;
        }
    }
    public void question2(){
        System.out.println("Pole kwadratu o boku 12");
        int odpowiedz = scan1.nextInt();
        if(odpowiedz==144){
            wynik++; odpowiedz2 =true;
        }
    }
    public void question3(){
        System.out.println("Pierwiastek z 15129 ");
        int odpowiedz = scan1.nextInt();
        if(odpowiedz==123){
            wynik++; odpowiedz3 =true;
        }
    }
    public void wynik(){
        System.out.println("Twój wynik to:"+wynik+"/3");
        System.out.println(odpowiedz1+" "+odpowiedz2+" " + odpowiedz3);
    }

}
