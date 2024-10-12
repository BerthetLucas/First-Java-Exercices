public abstract class RemarkableIdentity {

    protected int b;
    protected int a;

    public RemarkableIdentity(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int compute();

    public abstract String getName();

}
