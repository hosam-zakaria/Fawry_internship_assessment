package ScrRadar;

public class Violation {
    private String text;
    private int money;

    public Violation(String d, int f){
        this.text = d;
        this.money = f;
    }
    
    public int getMoney(){
        return money;
    }
    public String getText(){
        return text;
    }

}
