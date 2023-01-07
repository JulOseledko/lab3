package Basis;
import Dop.Body;

public class ActionResist extends Action {
    public static void escape(Protagonists p) {
        Body b = Body.HAND;
        System.out.println("объект " + p.toString() + " принялся вырываться " + b.toString());
    }
    public static void hit(Protagonists p){
        System.out.println("пытался ударить объект " + p.toString());
    }
}
