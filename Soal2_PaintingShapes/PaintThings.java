// main class buat ngitung cat yang dibutuhin untuk 3 shape
import java.text.DecimalFormat;
public class PaintThings
{
   public static void main (String[] args)
   {
      final double COVERAGE = 350;
      Paint paint = new Paint(COVERAGE);

      Rectangle deck;
      Sphere bigBall;
      Cylinder tank;
      double deckAmt, ballAmt, tankAmt;

      // bikin 3 shape yang mau di-cat
      deck = new Rectangle(20, 35);
      bigBall = new Sphere(15);
      tank = new Cylinder(10, 30);

      // hitung jumlah cat buat masing-masing
      deckAmt = paint.amount(deck);
      ballAmt = paint.amount(bigBall);
      tankAmt = paint.amount(tank);

      // print hasilnya
      DecimalFormat fmt = new DecimalFormat("0.#");
      System.out.println ("\nNumber of gallons of paint needed...");
      System.out.println ("Deck " + fmt.format(deckAmt));
      System.out.println ("Big Ball " + fmt.format(ballAmt));
      System.out.println ("Tank " + fmt.format(tankAmt));
   }
}
