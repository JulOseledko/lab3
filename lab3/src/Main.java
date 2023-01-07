import Basis.*;
import Dop.Body;

public class Main {
    public static void main(String[] args) {
        Protagonists nano = new Protagonists("Незнайка");
        nano.see();
        Protagonists vish = new Protagonists("Винтик и Шпунтик");
        ActionLetGo.noLetGo(vish, nano);
        ActionResist.escape(nano);
        Protagonists schpyntic = new Protagonists("Шпунтик");
        ActionResist.hit(schpyntic);
        ActionLetGo.letGo(vish, nano);
        Epithets uncertain = new Epithets("несколько неуверенных");
        nano.giveVibe(uncertain);
        ActionFail.collapsed();
        ActionFail fail = new ActionFail("упал");
        fail.clarifyDetails();
        nano.kiss();
        MinorCharacters hat = new MinorCharacters("шляпа");
        hat.fly(nano);
        nano.whisper();
        MinorCharacters sun = new MinorCharacters(" солнышко");
        Epithets red = new Epithets("красное");
        sun.giveVibe(red);
        MinorCharacters wind = new MinorCharacters(" ветерок");
        wind.blowing(nano);
        ActionFeel.iron();
        ActionFeel.seems(nano);
        Felling feel = new Felling("чувство");
        Epithets over = new Epithets("огромное-преогромное");
        feel.giveVibe(over);
        ActionKnow.notKnow(nano);
        feel.named();
        ActionKnow.know(feel);
        nano.description("прижимал");
        MinorCharacters creature = new MinorCharacters("существо");
        creature.description("к родному близкому");
        ActionFeel.feel();
        fail.disappear();

    }
}
