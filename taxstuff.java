/*
 * TAX CREDIT
 *
 * By: Robert Grønlund Nielsen
 * 29/01 - 2017
 * 
 * Below are all the answers commentated, 
 * remove comment symbols for results
 */
package taxstuff;

public class taxstuff {

    public static void main(String[] args) {
        
        double[][] array;                                                   // Prepare for array

        array = new double[151][2];                                         // Create space for array

        System.out.println("Kilometer \tDKK pr. dag");                      // Headers

        for (int i = 0; i < 151; i++) {                                     // For-loop for filling up array
            array[i][0] = i;                                                // First colloumn is kilometers

            if (i <= 25) {                                                  // 0-24 kilometers
                array[i][1] = 0;                                            // No tax credit
            } else if (i <= 120) {                                          // 25-120 km
                array[i][1] = (i - 24) * 0.213;                             // 0.213 dkk/km in tax credit
            } else if (i <= 150) {                                          // 121-150 km
                array[i][1] = 20.448 + (i - 120) * 0.107;                   // 0.107 dkk/km in tax credit 
            } // end if
        } // end for loop
        
        /*  
        // OPGAVE 1
        for (int i = 25; i < 100; i++) {                                    // Array from 25-100 km
            System.out.println(array[i][0] + "\t\t" + array[i][1]);
        }*/
        
        /*  
        // OPGAVE 2
        for (int i = 0; i < 151; i++) {                                     // Array from 0-150 km 
            System.out.println(array[i][0] + "\t\t" + array[i][1]);
        }*/
        
        /*  
        // OPGAVE 3
        for (int i = 0; i < 151; i += 10) {                                 // Array from 0-150 km, 10 km at a time
            System.out.println(array[i][0] + "\t\t" + array[i][1]);
        }*/
        
        /*  
        // OPGAVE 4
        java.util.Scanner keyboard = new java.util.Scanner(System.in);      // Struct keyboard
        
        System.out.println("Please enter kilometers to work:");             // Scan keyboard
        int kilometers = keyboard.nextInt();                                // Kilometers to work
        
        System.out.println("Please amount of workdays in a year:");         // Scan Keyboard
        int workDays = keyboard.nextInt();                                  // Workdays in a year
        
        double result = array[kilometers][1]*workDays;                      // Calculate tax credit
  
        System.out.println("With " + workDays + " workdays in a year and " + kilometers + " km to work\nYearly tax credit will be:\n" + result + "DKK in a year");   // Receipt
        */
        
        System.out.println("\nSLUT");
    }

}
