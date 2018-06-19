import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        AthleteList<Athlete> list = new AthleteList<Athlete>();
        Athlete athlete0 = new Athlete("Joe", 5, 20);
        Athlete athlete1 = new Athlete("Joe1", 5, 20);
        Athlete athlete2 = new Athlete("Joe2", 5, 20);
        Athlete athlete3 = new Athlete("Joe3", 5, 20);
        Athlete athlete4 = new Athlete("Joe4", 5, 20);
        Athlete athlete5 = new Athlete("Joe5", 5, 20);
        Athlete athlete6 = new Athlete("Joe6", 5, 20);
        Athlete athlete7 = new Athlete("Joe7", 5, 20);
        Athlete athlete8 = new Athlete("Joe8", 5, 20);
        Athlete athlete9 = new Athlete("Joe9", 5, 20);
        Athlete athlete10 = new Athlete("Joe10", 5, 20);
        list.add(athlete0);
        list.add(athlete1);
        list.add(athlete2);
        list.add(athlete3);
        list.add(athlete4);
        list.add(athlete5);
        list.add(athlete6);
        list.add(athlete7);
        list.add(athlete8);
        list.add(athlete9);
        list.add(athlete10);
        list.printArray();
        //AthleteList(0);
        //athlete0.train();
        //System.out.println(list.get(3));
        list.train(0);
        //list.rest(0);
        // System.out.println(athlete0.getName());
        // System.out.println(athlete0.getEnergy());
        // System.out.println(athlete0.getStrength());


        //System.out.println(list.remove(0));
        // System.out.println(list.get(0)); 

    }
}