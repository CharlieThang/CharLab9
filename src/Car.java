import java.util.Scanner;

/**
 * Created by "Charlie"
 * February, 15, 2017
 */

public class Car {

          // Declare Instance Data Variables
          private String make;
          private String model;
          private int year;
          private double autoPrice;

        //Create A "No" Argument Constructor That Will Store Variable Data
        public Car() {
        make = "";
        model = "";
        year = 0000;
        autoPrice = 0;
        }

        //Create An "All" Arguments Constructor
        public Car (String make, String model, int year, double autoPrice){

        // Local Variables Will Run Out Of Scope, Store Their Values In Their Instance Variables

              this.make = make;
              this.model = model;
              this.year = year;
              this.autoPrice = 0;
          }

        private String getMake() {
            return make;
        }

        private void setMake(String make) {
            this.make = make;
        }

        private String getModel() {
            return model;
        }

        private void setModel(String model) {
            this.model = model;
        }

        private int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        private double getAutoPrice() {
            return autoPrice;
        }

        private void setAutoPrice(double autoPrice) {
            this.autoPrice = autoPrice;
        }


        public String toString() {
            //return car details formatted string; "make, model, year & Price.
            return "year:" + getYear() + "\t make:" + getMake() + "\t model:" + getModel() + "\t Auto Price:" + "$"+getAutoPrice();
        }



}


