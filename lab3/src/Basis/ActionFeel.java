package Basis;
import Dop.Body;
import Dop.Compare;
import Dop.Clarify;

public class ActionFeel implements Clarify {
    private String Name;
    public ActionFeel(){
    }
    public ActionFeel(String s) {
        this.Name = s;
    }
    public static void feel(){
        Compare c = Compare.AS;
        Health h = new Health();
        System.out.printf("чувствовал " + c.toString() + " ");
        h.energy();
    }
    public static void iron(){
        Compare c = Compare.LIKE;
        Body b = Body.HEAD2;
        System.out.println(c.toString() + " гладил " + b.toString());
    }
    public static void seems(Protagonists p){
        System.out.println("объекту " + p.toString() + " казалось");
    }

    public void onKiss(Characters c){
        System.out.println( "принялся целовать объект " + c.toString());
    }

    @Override
    public void clarifyDetails(){
        System.out.println("ласково " + this.Name + " лучами");


    }
}
