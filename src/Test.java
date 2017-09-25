public class Test {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        Triangle triangle1 = new Triangle();
        triangle1.setA(52);
        triangle1.setB(4);
        triangle1.setC(3);
        RightTriangle rightTriangle = new RightTriangle();
        boolean status=rightTriangle.isRightTriangle(triangle1);
        System.out.println(status);

        System.out.println("\nZadanie 2");
        Dzien dzien1 = new Dzien(9);
        dzien1.sprawdz();

        MathQuiz quiz=new MathQuiz();
        quiz.question1();
        quiz.question2();
        quiz.question3();
        quiz.wynik();
    }
}
