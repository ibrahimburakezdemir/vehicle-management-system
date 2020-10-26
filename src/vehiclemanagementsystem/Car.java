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
public class Car extends LandVehicles{
    
    private String brand, color, fuelType;
    private int speed, numberOfPassengers, cost, numberOfWheels, yearOfProduction;
    
    @Override
    public void acceleration() {
        System.out.println(brand+" car accelerated");
    }

    @Override
    public void brake() {
        System.out.println(brand+" car slowed down");
    }

    @Override
    public void stop() {
        System.out.println(brand+" car stoped");
    }
    
    @Override
    public void info() {
        System.out.println(getBrand());
        
    }
    
    @Override
    public void describe(String brand) {
        setBrand(brand);
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the fuelType
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * @param fuelType the fuelType to set
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the numberOfPassengers
     */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * @param numberOfPassengers the numberOfPassengers to set
     */
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @return the numberOfWheels
     */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    /**
     * @param numberOfWheels the numberOfWheels to set
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /**
     * @return the yearOfProduction
     */
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    /**
     * @param yearOfProduction the yearOfProduction to set
     */
    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

   

    
    
}
