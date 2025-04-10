import java.math.*;
import static big.BigDecimalMath.pi;
import static big.BigDecimalMath.cos;


class BigDecimalMathExample {
  public static void main(String args[]) {
    MathContext precision = new MathContext(30);
    MathContext precision2 = new MathContext(31);
    BigDecimal two = new BigDecimal("2");
    BigDecimal three = new BigDecimal("3");
    BigDecimal six = new BigDecimal("6");
    System.out.println("sqrt(2): " + two.sqrt(precision));
    System.out.println("cos(30\u00B0): " + three.sqrt(precision2).divide(two, precision));
    // Library BigDecimalMath - Eric Obermühlner
    BigDecimal PI = pi(precision);
    BigDecimal degrees30 = PI.divide(six, precision);
    System.out.println("cos(30\u00B0): " + cos(degrees30, precision));
  }
}