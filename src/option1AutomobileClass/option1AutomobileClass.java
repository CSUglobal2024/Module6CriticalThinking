package option1AutomobileClass;


import java.util.ArrayList;
import java.util.Scanner;

//------Pseudocode------
//addAutomobile(Automobile automobile):
//    Append the given automobile to the ArrayList.
//
//removeAutomobile(String make, String model, String color, int year):
//    For each automobile in the ArrayList:
//        If the make, model, color, and year of the automobile match the given parameters:
//            Remove the automobile from the ArrayList.
//            Return true.
//    Return false if no matching automobile is found.
//
//displayAutomobiles():
//    For each automobile in the ArrayList:
//        Print the string representation of the automobile.
//
//searchAutomobile(String make, String model, String color, int year):
//    For each automobile in the ArrayList:
//        If the make, model, color, and year of the automobile match the given parameters:
//            Return true.
//    Return false if no matching automobile is found.


public class option1AutomobileClass {
    private ArrayList<Automobile> automobiles;

    public option1AutomobileClass() {
        automobiles = new ArrayList<>();
    }

    // Method to add an automobile instance from user input
    public void addAutomobileFromInput() {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter the make of the automobile:");
			String make = scanner.nextLine();
			
			System.out.println("Enter the model of the automobile:");
			String model = scanner.nextLine();
			
			System.out.println("Enter the color of the automobile:");
			String color = scanner.nextLine();
			
			System.out.println("Enter the year of the automobile:");
			int year = scanner.nextInt();
			
			Automobile automobile = new Automobile(make, model, year, color);
			automobiles.add(automobile);
		}
    }

    // Method to remove an automobile from the list
    public boolean removeAutomobile(String make, String model, String color, int year) {
        for (Automobile auto : automobiles) {
            if (auto.getMake().equals(make) && auto.getModel().equals(model) &&
                auto.getColor().equals(color) && auto.getYear() == year) {
                automobiles.remove(auto);
                return true; // Automobile removed successfully
            }
        }
        return false; // Automobile not found
    }

    // Method to display all automobiles in the list
    public void displayAutomobiles() {
        for (Automobile auto : automobiles) {
            System.out.println(auto);
        }
    }

    // Method to search for an automobile in the list
    public boolean searchAutomobile(String make, String model, String color, int year) {
        for (Automobile auto : automobiles) {
            if (auto.getMake().equals(make) && auto.getModel().equals(model) &&
                auto.getColor().equals(color) && auto.getYear() == year) {
                return true; // Automobile found
            }
        }
        return false; // Automobile not found
    }

    public static void main(String[] args) {
    	option1AutomobileClass manager = new option1AutomobileClass();
        manager.addAutomobileFromInput();
        manager.displayAutomobiles();
    }
}

class Automobile {
    private String make;
    private String model;
    private int year;
    private String color;

    public Automobile(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method to represent the Automobile object as a string
    @Override
    public String toString() {
        return year + " " + make + " " + model + ", Color: " + color;
    }
}
