public class Dzien {
    int dzien;
    public Dzien(int dzien){
        this.dzien =dzien;
    }
    public void sprawdz() {

        switch (dzien) {
            case 1:
                System.out.print("Mamy pon");
                break;
            case 2:
                System.out.print("Mamy wt");
                break;
            case 3:
                System.out.print("Mamy sr");
                break;
            case 4:
                System.out.print("Mamy czw");
                break;
            case 5:
                System.out.print("Mamy pt");
                break;
            case 6:
                System.out.print("Mamy sb");
                break;
            case 7:
                System.out.print("Mamy nd");
                break;
            default:
                System.out.println("Nie ma takiego dnia");
        }
        if (dzien > 0 && dzien < 6) {
            System.out.println("-dzień pracyjąc");
        } else if (dzien > 5 && dzien < 8) System.out.println("-Weekend");
       // else System.out.println("Niewłaściwy dzień");
    }
}