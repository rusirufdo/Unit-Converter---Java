import java.util.Scanner;
public class Centimeters_inches {
    public static void main(String[] args) {

        //initialising Scanner Object
        Scanner input = new Scanner(System.in);

        //display menu for the user
        System.out.println("================================== ");
        System.out.println("           CONVERTER");
        System.out.println("================================== ");
        System.out.println("Enter 1 to convert from Centimetre to inch ");
        System.out.println("Enter 2 to convert from inch to Centimetre ");
        System.out.println("---------------------------------- ");

        System.out.print("Enter choice : "); //asks the user for his/her conversion choice
        boolean wrong = true; //this controls the while loop below
        String choice = input.nextLine(); //this stores the user's conversion choice

        while (wrong) {   //checks whether the user input choice is valid ( 1 or 2 )

            String valueToConvert_String; //variable to store user input as string( i.e. the value to be converted)
            double convertedValue; //variable to store resulting output ( i.e. the converted value)
            double valueToConvert=0; //variable which stores the validated user input value
            boolean checkNumber=false;//controls the validation while loop

            switch (choice) {
                //if choice is 1
                case "1":
                    System.out.println("---------------------------------- ");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter length in Centimeters : ");
                    while(!checkNumber) {
                        try {
                            valueToConvert_String = input.next();
                            valueToConvert=Double.parseDouble(valueToConvert_String);
                            checkNumber=true;
                        }
                        catch (NumberFormatException ex) {
                            System.out.print("You have entered an invalid Value!!!....Please re-enter : ");
                        }
                    }

                    //Do the conversion
                    convertedValue = valueToConvert * 0.393;

                    //Get the converted value to 3 decimal places
                    convertedValue=Math.round(convertedValue*1000);
                    convertedValue=convertedValue/1000;

                    //Display the converted value to the user
                    System.out.println("Length in Inches : " + convertedValue + " inches");
                    wrong = false;
                    break;

                // if choice is 2
                case "2":
                    System.out.println("---------------------------------- ");

                    //Get the value to be converted from the user
                    //Validate whether the user input is a number
                    System.out.print("Enter length in Inches : ");
                    while(!checkNumber) {
                        try {
                            valueToConvert_String = input.next();
                            valueToConvert=Double.parseDouble(valueToConvert_String);
                            checkNumber=true;
                        }
                        catch (NumberFormatException ex) {
                            System.out.print("You have entered an invalid Value!!!....Please re-enter : ");
                        }
                    }

                    //Do the conversion
                    convertedValue = valueToConvert * 2.54;

                    //Get the converted value to 3 decimal places
                    convertedValue=Math.round(convertedValue*1000);
                    convertedValue=convertedValue/1000;

                    //Display the converted value to the user
                    System.out.println("Length in Centimeters : " + convertedValue + " cm");
                    wrong = false;
                    break;

                //if choice is invalid
                default:
                    //asks the user to input the choice again in-case the choice is invalid
                    System.out.print("Invalid choice....Please re-enter : ");
                    choice = input.nextLine();
                    wrong = true;
            }
        }
        System.out.println("===================================");
    }
}
