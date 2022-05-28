
public class Main {

    public static void main(String[] args) {
        Formula first = new Formula(4,9,3);
        Converter bb = x -> new Formula2(first.values1, first.values2, first.values3);
        Formula2 second = (Formula2) bb.conv(first);
        second.displayFormula();
    }
}
class Formula{
    int values1;
    int values2;
    int values3;
    Formula(int values1, int values2, int values3) {
        this.values1 = values1;
        this.values2 = values2;
        this.values3 = values3;
    }
    public void displayFormula() {
        double vector = values1 * Math.pow(values2, values3);
        System.out.println(vector);
    }
}
class Formula2 {
    int values4;
    int values5;
    int values6;

    Formula2(int values4, int values5, int values6) {
        this.values4 = values4;
        this.values5= values5;
        this.values6 = values6;
    }

    public void displayFormula() {
        double vector = values4 * Math.pow(values5, values6);
        System.out.println(vector);
    }
}
@FunctionalInterface
interface Converter <Formula,Formula2> {
    Formula2 conv(Formula t);

}