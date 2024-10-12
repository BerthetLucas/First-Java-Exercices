//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RemarkableIdentity first = new FirstRemarkableIdentity(6, 3, "(a+b)^2");
        System.out.println(first.getName() + " = " + first.compute() );

        RemarkableIdentity second = new SecondRemarkableIdentity(5, 4, "(a+b)^2");
        System.out.println(second.getName() + " = " + second.compute() );

        RemarkableIdentity third = new ThirdRemarkableIdentity(5, 4, "(a + b) * (a - b)");
        System.out.println(third.getName() + " = " + third.compute() );

    }
}