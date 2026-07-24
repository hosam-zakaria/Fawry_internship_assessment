package ScrRadar;

public interface Rule {
    Violation check(Observation ob);
}