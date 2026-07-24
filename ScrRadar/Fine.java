package ScrRadar;
import java.util.ArrayList;
public class Fine {
    private String n;
    private ArrayList<Violation> v;
    public Fine(String n){
        this.n = n;
        v = new ArrayList<>();
    }
    public void addViolation(Violation vv){
        v.add(vv);
    }
    public String getString(){
        return n;
    }
    public String getPlateNumber(){
        return n;
    }
    public ArrayList<Violation> getVolt(){
        return v;
    }
    public int getTotalAmount() {
        int sum = 0;
        for(Violation vv : v){ sum += vv.getMoney(); }
        return sum;
    }
    public void printFine(){
        System.out.println("Traffic fine for car " + n);
        System.out.println("Total amount: " + getTotalAmount() + " EGP");
        System.out.println("Violations:");
        for(Violation vv : v){
            System.out.println("- " + vv.getText() + " : " + vv.getMoney() + " EGP");
        }
    }
}
