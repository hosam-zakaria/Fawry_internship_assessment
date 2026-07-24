package ScrRadar;

import java.util.HashMap;

public class Printer {

    public void printFine(Fine f){
        System.out.println("Traffic fine for car " + f.getPlateNumber());
        System.out.println("Total amount: " + f.getTotalAmount() + " EGP");
        System.out.println("Violations:");
        for(Violation vv : f.getVolt()){
            System.out.println("- " + vv.getText() + " : " + vv.getMoney() + " EGP");
        }
    }

    public void printAllFines(RadarSystem r){
        for(Fine f : r.getAllFine()) {
            System.out.println(f.getPlateNumber() + " : " + f.getTotalAmount() + " EGP");
        }
    }

    public void printViolatedCount(RadarSystem radar){
        HashMap<String, Integer> cnt = new HashMap<>();

        for(Fine f : radar.getAllFine()){
            for(Violation vv : f.getVolt()){
                String d = vv.getText().trim();
                if(cnt.containsKey(d)) { cnt.put(d, cnt.get(d) + 1); } 
                else{
                    cnt.put(d, 1);
                }
            }
        }
        for (String s : cnt.keySet()){
            System.out.println(s + " : " + cnt.get(s));
        }
    }
}