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
public interface IVehicle {
    void acceleration();
    void brake();
    void stop();
    void describe(String brand);
    void info();
}
