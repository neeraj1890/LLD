package vehicle;

import strategy.SpecialDriveStrategy;

public class HeavyVehicle extends Vehicle{

    public HeavyVehicle(){
        super(new SpecialDriveStrategy());
    }
}
