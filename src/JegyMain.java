import com.flowacademy.jegy.Jegy;
import com.flowacademy.jegy.Return;

public class JegyMain {
    public static void main(String[] args) {

        for (String arg: args){
            System.out.print(arg.toString() + ", ");
        }
        System.out.println();

        int utazasokSzama = args.length / 4;

        Jegy[] jegyTomb = new Jegy[utazasokSzama];

        int n = 0;

        for (int i = 0; i < args.length; i += 4) {

            if( n < utazasokSzama && args[i].equals("return")) {

                jegyTomb[n] = new Return(args[i + 1], Integer.parseInt(args[i + 2]), Integer.parseInt(args[i + 3]));
                n++;

            } else if (n < utazasokSzama && args[i].equals("simple")){

                jegyTomb[n] = new Jegy(args[i + 1], Integer.parseInt(args[i + 2]), Integer.parseInt(args[i + 3]));
                n++;

            } else {

                System.out.println("valami nem fasza");
            }
        }
        System.out.println("==================");
        for (Jegy jegy: jegyTomb){
            System.out.println(jegy.toString());
        }
        System.out.println("==================");

        int legnagyobbJegyAr = jegyTomb[0].arKiszamit();
        Jegy legdragabb = jegyTomb[0];

        for (int i = 0; i < jegyTomb.length; i++) {
            if (jegyTomb[i].arKiszamit() > legnagyobbJegyAr){
                legnagyobbJegyAr = jegyTomb[i].arKiszamit();
                legdragabb = jegyTomb[i];
            }
        }

        System.out.println("Legdrágább jegy: " + legdragabb);


    }
}
