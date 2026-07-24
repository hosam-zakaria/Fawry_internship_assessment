package ScrRadar;
import java.util.HashMap;
import java.util.ArrayList;

public class RadarSystem {
    private ArrayList<Rule> r;
    private ArrayList<Fine> all;
    public RadarSystem(){
        r = new ArrayList<>();
        all = new ArrayList<>();
    }
    public void addRule(Rule rule){
        r.add(rule);
    }
    public void observe(Observation ob){
        Fine fine = new Fine(ob.getPlateNumber());
        for(Rule rule : r){
            Violation v = rule.check(ob);
            if(v != null){
                fine.addViolation(v);
            }
        }
        if(!fine.getVolt().isEmpty()){
            all.add(fine);
        }
    }
    public ArrayList<Fine> getAllFine(){
        return all;
    }
    public void getViolatCount(){
        HashMap<String, Integer> count = new HashMap<>();
        for(Fine f : all){
            for(Violation v : f.getVolt()){
                String d = v.getText();
                if(count.containsKey(d)){ count.put(d, count.get(d) + 1); } 
                else{
                    count.put(d, 1);
                }
            }
            }
            for(String s : count.keySet()) {
                System.out.println(s + " : " + count.get(s));
            }
        }
    }
