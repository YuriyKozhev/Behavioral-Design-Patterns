package pattern.memento;

public class Memento {
    final String contentA;
    final String contentB;

    public String getContentA() {
        return contentA;
    }

    public String getContentB() {
        return contentB;
    }

    public Memento(String contentA, String contentB) {
        this.contentA = contentA;
        this.contentB = contentB;
    }
}
