package ScrRadar;
import java.util.HashMap;
public class SpeedRule implements Rule{
    private HashMap<String, Integer> limit;
    public SpeedRule(){
        limit = new HashMap<>();
        limit.put("PRIVATE", 80);
        limit.put("TRUCK", 60);
        limit.put("BUS", 100); 
    }
    public Violation check(Observation ob){
        String type = ob.getCarType().toUpperCase();

        if(!limit.containsKey(type)){ return null; }

        int mx = limit.get(type);
        if(ob.getSpeed() > mx){
            return new Violation("speed of " + ob.getSpeed() + " exceeded max allowed " + mx, 300);
        }
        return null;
    }
}
