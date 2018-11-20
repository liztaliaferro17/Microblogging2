import javax.swing.*;
import java.util.ArrayList;
import java. util. Scanner;
import java.util.Iterator;

public class Microblogging2 {
    protected static final Object ArrayList = new ArrayList();

    private int id;
    private String name;
    private String post1;
    private String post2;
    private String post3;
    private String post4;
    private String post5;
    private String post6;
    private String post7;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList names = new ArrayList();
        names.add("FlyTeacher");
        names.add("Coco");
        names.add("Shay");
        names.add("NewNew");
        names.add("Belle");
        names.add("Badness");
        names.add("Tug");


        System.out.println("What are the names of the bloggers?");

        Iterator iter = names.iterator();
        while (iter.hasNext()) {
            String name = (String) iter.next();
            System.out.println(name);
        }

        System.out.println("Who is blogging today?");
        String name = keyboard.nextLine();
        System.out.println("What's your take on the election results?");
        String post1 = keyboard.nextLine();
        System.out.println("Do you agree NewNew? Please explain.");
        String post2= keyboard.nextLine();
        System.out.println("Tug do you have any solutions?");
        String post3= keyboard.nextLine();
        System.out.println("Coco what will make you fight?");
        String post4= keyboard.nextLine();
        System.out.println("Shay what is our collective responsibility?");
        String post5= keyboard.nextLine();
        System.out.println("Keli you'll be part of the next new voters to elect a president. What are your requiremnts?");
        String post6= keyboard.nextLine();
        System.out.println("Badness as the youngest what do you know about any of this?");
        String post7= keyboard.nextLine();





    }


    }









