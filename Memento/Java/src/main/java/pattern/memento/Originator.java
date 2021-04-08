package pattern.memento;

public class Originator {
    public void setContentA(String contentA) {
        this.contentA = contentA;
    }

    public void setContentB(String contentB) {
        this.contentB = contentB;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "contentA='" + contentA + '\'' +
                ", contentB='" + contentB + '\'' +
                '}';
    }

    private String contentA;
    private String contentB;

    public Originator(String contentA, String contentB) {
        this.contentA = contentA;
        this.contentB = contentB;
    }

    public Memento createState() {
        return new Memento(this.contentA, this.contentB);
    }
    
    public void restoreState(Memento state) {
        if (state == null) {
            System.out.println("Unable to restore previous state");
            return;
        }
        this.contentA = state.getContentA();
        this.contentB = state.getContentB();
    }

}
