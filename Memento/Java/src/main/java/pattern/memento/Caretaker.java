package pattern.memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> history = new Stack<Memento>();

    public void save(Memento state) {
        this.history.push(state);
    }

     public Memento load() {
        if (!history.empty()) {
            return history.pop();
        }
        else {
            return null;
        }
     }

}
