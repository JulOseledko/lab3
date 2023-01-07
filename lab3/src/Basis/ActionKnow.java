package Basis;

public class ActionKnow extends Action{

    public static void notKnow(Protagonists p){
        System.out.println("объект " + p.toString() + " не знал");
    }
    public static void know(Felling f){
        System.out.println("но знал: ");
        f.good();
    }
}

