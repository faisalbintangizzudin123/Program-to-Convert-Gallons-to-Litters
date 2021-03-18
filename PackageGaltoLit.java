/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgpackage.galtolit;
import java.util.Scanner;

/**


 * @author LENOVO
 */
public class PackageGaltoLit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 

        int gallons = 0 ;
        double liters;

        Scanner scan = new Scanner(System.in);
        System.out.println("Inputkan Gallon yang ingin di convert : ");
        gallons = scan.nextInt();


        liters = gallons *3.785;



        System.out.println(gallons + " gallons adalah " + liters + " liters.");



    }
}
  
    
