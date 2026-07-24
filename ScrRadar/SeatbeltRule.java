package ScrRadar;

public class SeatbeltRule implements Rule{
    public Violation check(Observation ob){
        if (ob.getSeatbelt() != null && ob.getSeatbelt().equalsIgnoreCase("not")){
            return new Violation("Seatbelt not fastned ",100);
        }
        return null;
    }
}
