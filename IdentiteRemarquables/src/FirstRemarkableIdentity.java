public class FirstRemarkableIdentity extends RemarkableIdentity{

    private String name;

    public FirstRemarkableIdentity(int a, int b, String name) {
        super(a, b);
        this.name = name;
    }

    @Override
    public int compute (){
        // Cast method to force type the method return;
        return (int) (Math.pow(a,2) + 2 * a * b + Math.pow(b, 2));
    }

    @Override
    public String getName() {
        String equation =  name.replace("a", String.valueOf(a));
        String result  = equation.replace("b", String.valueOf(b));

        return result;
    }
}
