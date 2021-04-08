import com.sun.management.VMOption;
import pattern.memento.Caretaker;
import pattern.memento.Originator;

public class Main {
    public static void main(String[] args){
        System.out.println("Memento pattern implementation");

        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator("a", "b");
        System.out.println("Initial state: " + originator.toString());
        caretaker.save(originator.createState());

        originator.setContentA("a2");
        System.out.println("Change state to: " + originator.toString());
        caretaker.save(originator.createState());

        originator.setContentB("b2");
        System.out.println("Change state to: " + originator.toString());
        caretaker.save(originator.createState());

        System.out.println("Restoring previous state...");
        originator.restoreState(caretaker.load());
        System.out.println("Change state to: " + originator.toString());

        System.out.println("Restoring previous state...");
        originator.restoreState(caretaker.load());
        System.out.println("Change state to: " + originator.toString());

        System.out.println("Restoring previous state...");
        originator.restoreState(caretaker.load());
        System.out.println("Change state to: " + originator.toString());

        System.out.println("Restoring previous state...");
        originator.restoreState(caretaker.load());
        System.out.println("Change state to: " + originator.toString());

    }
}

