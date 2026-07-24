package ScrRadar;

public class Main {
    public static void main(String[] args) {
        RadarSystem radar = new RadarSystem();
        Printer printer = new Printer();
        radar.addRule(new SeatbeltRule());
        radar.addRule(new SpeedRule());

        Observation car1 = new Observation("ABC1234", "23/7/2026", "PRIVATE", 94, "not");
        radar.observe(car1);
        
        for(Fine fine : radar.getAllFine()){
            printer.printFine(fine);
        }
    }

}
