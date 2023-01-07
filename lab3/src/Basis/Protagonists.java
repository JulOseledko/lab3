package Basis;

import Dop.Body;
import Dop.Vibe;

public class Protagonists extends Characters implements Vibe {
    private String Name;
    public Protagonists(String name){
        this.Name = name;
    }
    public void see(){
        System.out.println("объект " + this.Name + " видит");
    }
    public void kiss(){
        ActionFeel ks = new ActionFeel();
        MinorCharacters earth = new MinorCharacters("земля");
        System.out.println("объект " + this.Name);
        ks.onKiss(earth);
    }
    public void whisper(){
        System.out.println("объект " + this.Name +  " прошептал");
    }

    @Override
    public String toString(){
        return this.Name;
}

    @Override
    public void description(String information) {
        Body b = Body.LAP;
        MinorCharacters earth = new MinorCharacters("земля");
        System.out.println( "Объект " + this.Name + " " + information + " " + b.toString() + " к объекту " + earth.toString());
    }

    @Override
    public void giveVibe(Epithets e) {
        System.out.println("объект " + this.Name + " сделал " + e.toString() + " шагов");
    }
}

