package Basis;

import Dop.Body;
import Dop.Clarify;

public class Health implements Clarify {
    private String Name;
    public Health(String name){
        this.Name = name;
    }
    public Health(){
    }
    public void tears(){
        Body b = Body.EYES;
        System.out.println(b.toString() + "покатились слезы");
    }
    public void energy(){
        System.out.print("силы снова возвращаются\n");
    }

    @Override
    public void clarifyDetails() {
        System.out.println("сама собой");
    }

    @Override
    public String toString(){
        return this.Name;
    }
}
