/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclemanagementsystem;

/**
 *
 * @author ibrah
 */
public class VehicleManager {
    IVehicle vehicle;
    public void getVehicle(){
        vehicle.info();
    }
    public void setVehicle(String brand){
        vehicle.describe(brand);
    }
}
