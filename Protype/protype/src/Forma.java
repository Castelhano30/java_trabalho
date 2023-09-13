abstract class Forma implements Cloneable {
    private String id;

    abstract void desenhar();

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}