package Basis;

public class ActionLetGo extends Action {

    public static void noLetGo(Protagonists protagonist, Protagonists p ){
        System.out.println(protagonist.toString() + " боятся отпустить объект " + p.toString());
    }
    public static void letGo(Protagonists protagonist, Protagonists p){
        System.out.println(protagonist.toString() + " отпустили объект " + p.toString());
    }
}
