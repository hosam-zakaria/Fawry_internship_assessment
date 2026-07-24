package ScrRadar;

public class Observation {
    private String pNumber;
    private String date;
    private String car_type;
    private int speed;
    private String seatbelt;


    public Observation(String n, String d,String t, int s,String st){
        this.pNumber = n;
        this.date = d;
        this.car_type = t;
        this.speed = s;
        this.seatbelt = st;
    }

    public String getPlateNumber(){
        return pNumber;
    }
    public String getDate(){
        return date;
    }
    public String getCarType(){
        return car_type;
    }
    public int getSpeed(){
        return speed;
    }
    public String getSeatbelt(){
        return seatbelt;
    }

}
