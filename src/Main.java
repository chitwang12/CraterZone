import java.util.Scanner;

public class Main {

    public static void display()
    {
        System.out.println("\t\t\tWelcome to Inverter Mart");
        System.out.println("\t\tWe deal in all kinds of Inverter Batteries\n");
        System.out.println("Solar Inverters:");
        System.out.println("================");
        System.out.println("\t Name: \t\t\t Battery: \t\t\t Grid On: \t\t");
        System.out.println("\t ===========================================");
        System.out.println("\t 1) GTI: \t\t YES \t\t\t\t YES");
        System.out.println("\t 2) PCU: \t\t YES \t\t\t\t NO");
        System.out.println("\t 3) Regalia:\t YES \t\t\t\t NO");

        System.out.println();
        System.out.println("Non Solar Inverters:");
        System.out.println("====================");
        System.out.println("\t Name: \t\t\t Battery: \t\t\t Grid On:\t\t");
        System.out.println("\t ===========================================");
        System.out.println("\t 4) Zelio: \t\t YES \t\t\t\t NO");
        System.out.println("\t 5) iCurve: \t YES \t\t\t\t NO");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        display();
        int ans = sc.nextInt();
        Inverter inverter = null;
        {
            switch (ans) {
                case 1:
                    inverter = new SolarInverter(240, 120, true);
                    System.out.println("You have selected GTI");
                    break;
                case 2:
                    inverter = new SolarInverter(240, 120, true);
                    System.out.println("You have selected PCU");
                    break;
                case 3:
                    inverter = new SolarInverter(240, 120, false);
                    System.out.println("You have selected Regalia ");
                    break;
                case 4:
                    inverter = new NonSolarInverter(240, 120);
                    System.out.println("You have selected Zelio");
                    break;
                case 5:
                    inverter = new NonSolarInverter(240, 120);
                    System.out.println("You have selected iCruze");
                    break;

                default:
                    System.out.println("Sorry Wrong Input");
            }
            inverter.display();
        }
    }
}
