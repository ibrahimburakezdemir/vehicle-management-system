/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehiclemanagementsystem;
import java.util.*;

/**
 *
 * @author ibrah
 */
public class VehicleManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainMenu mainMenu= new MainMenu();
        Scanner scanner=new Scanner(System.in);
        String choice = scanner.nextLine();
        VehicleManager vehicleManager=new VehicleManager();
        
        switch(choice){
            case "1":
                DataInput dataInput = new DataInput();
                Scanner scanner1=new Scanner(System.in);
                String choice1 = scanner1.nextLine();
                switch(choice1){
                    case "1":
                        Scanner scanner2=new Scanner(System.in);
                        String choice2 = scanner2.nextLine();
                        vehicleManager.vehicle=new Car();
                        vehicleManager.setVehicle(choice2);
                        break;
                    case "2":
                        
                        break;
                    case "3":
                        
                        break;
                    case "4":
                        
                        break;
                    case "5":
                        
                        break;
                    case "<":
                        
                        break;
                    case "X":
                        
                        break;
                }
                System.out.println("Choice1: "+choice1);
                break;
            case "2":
                
                break;
            case "3":
                
                break;
            case "X":
                
                break;
        }
        System.out.println("Choice: "+choice);
        vehicleManager.getVehicle();
    }
    
}
