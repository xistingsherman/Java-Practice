import java.util.ArrayList;
public class LambdaExpressions {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            System.out.println(n);
        });

        StringFunction exclaim = (s) -> s + "!";
        printFormatted("Hello", exclaim);

        FuncInter1 add = (int x, int y) -> x + y;

        System.out.println("Addition is " + operate(6, 3, add));
        System.out.println("Addition is " + operate(10, 5, add));
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    static int operate(int a, int b, FuncInter1 fobj)
    {
        return fobj.operation(a, b);
    }
}
interface StringFunction{
    String run(String str);
}

interface FuncInter1
{
    int operation(int a, int b);
}