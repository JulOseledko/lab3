package Basis;
import Dop.Body;
import Dop.Clarify;

public class ActionFail extends Action implements Clarify {
    private String Name;
    public ActionFail(String s){
        this.Name = s;
    }
    public static void collapsed(){
        Body b = Body.BREAST;
        System.out.println("рухнул " + b.toString());
    }
    public void disappear(){
        Health disease = new Health("болезнь");
        System.out.println(disease.toString() + " пропадает");
        disease.clarifyDetails();
    }

    @Override
    public void clarifyDetails() {
        Body b = Body.FACE;
        System.out.println(this.Name + " " + b.toString() + " вниз");
    }
}
