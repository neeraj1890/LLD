package vehicle;

import strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy object){
        driveStrategy = object;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
