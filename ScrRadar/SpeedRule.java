package ScrRadar;

public class SpeedRule implements Rule{
    public Violation check(Observation ob){
        int mx = 0;
        if(ob.getCarType().equalsIgnoreCase("PRIVATE")) { mx = 80; }
        else if(ob.getCarType().equalsIgnoreCase("TRUCK")) { mx = 60; }
        else{
            return null; 
        }
        if(ob.getSpeed() > mx){
            return new Violation("speed of " + ob.getSpeed() + " exceeded max allowed " + mx, 300);
        }
        return null;
    }
}