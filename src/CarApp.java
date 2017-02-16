import java.util.Scanner;
import java.util.ArrayList;

/**
 * Created by maki on 2/16/2017.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner charscan = new Scanner(System.in);

        //Find Out How Many Cars To Enter
        System.out.print("How Many Cars Do You Want To Enter:");
        int answerMe = charscan.nextInt();

        //Create An Empty ArrayList
        ArrayList<Car> CarList = new ArrayList<Car>();

        //Store Number Of Cars
        for (int i=0; i<answerMe; i++){

            //Request Information

            System.out.print("Year Of Car:");
            int year = charscan.nextInt();

            System.out.print("Make Of Car:");
            String make = charscan.next();

            System.out.print("Model Of Car");
            String model = charscan.next();

            System.out.print("Auto Price");
            double autoPrice = charscan.nextDouble();

            //Creating A New Instance
            Car c = new Car (make, model, year, autoPrice);
            CarList.add(c);

            }

        //Read Through Car Inventory & Output
        for (Car c: CarList) {
            System.out.println(c);
            System.out.println();
        }
        }

        //Car car1 = new Car();
        //Car car2 = new Car();
        //Car car3 = new Car();

        //System.out.println(car1);
        //System.out.println(car2);
        //System.out.println(car3);
    }

