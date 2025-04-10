import java.math.*;

class ComposedInterest {
  public static void main(String args[]) {
    BigDecimal year_rate = new BigDecimal("1.03");
    BigDecimal start = new BigDecimal("1000");
    // MathContext precision = new MathContext(6);
    // BigDecimal total = start.multiply(year_rate.pow(2),precision);
    BigDecimal total = start.multiply(year_rate.pow(2)).setScale(2, RoundingMode.HALF_UP);
    System.out.println(total);
  }
}