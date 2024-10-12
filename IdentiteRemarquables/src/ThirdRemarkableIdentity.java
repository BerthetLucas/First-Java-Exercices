public class ThirdRemarkableIdentity  extends RemarkableIdentity{


    private String name;

    public ThirdRemarkableIdentity(int a, int b, String name) {
        super(a, b);
        this.name = name;
    }

    // Why is it working without the Override tag ??

    public String getName() {
        String equation = name.replace("a", String.valueOf(a));
        String result = equation.replace("b", String.valueOf(b));
        return result;
    }

    public int compute() {
        return  (a + b) * (a-b);
    }


}
