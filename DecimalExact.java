import java.math.*;

class DecimalExact {
  public static void main(String args[]) {
    BigDecimal a = new BigDecimal("0.1");
    BigDecimal b = new BigDecimal("0.2");
    BigDecimal c = a.add(b);
    System.out.println(c);
  }
}