package Basis;

import Dop.Body;
import Dop.Compare;
import Dop.Vibe;

public class Felling implements Vibe {
    private String Name;
    public Felling(String name){
        this.Name = name;
    }
    public void named(){
        Compare c = Compare.AS;
        System.out.println(c.toString() + " называется " + this.Name);
    }

    public void good() {
        System.out.println(this.Name + " хорошее и лучше нет");
    }

    @Override
    public void giveVibe(Epithets e) {
        Compare c = Compare.ASIF;
        Body b = Body.LAP;
        System.out.println(c.toString() + " " + e.toString() + " " + this.Name + " переполняет " + b.toString());
    }
}
