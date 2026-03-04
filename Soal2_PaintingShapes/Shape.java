// abstract class Shape, parent buat semua bentuk
abstract public class Shape
{
   private String shapeName;

   public Shape (String name)
   {
      shapeName = name;
   }

   // tiap shape harus punya method area
   abstract public double area();

   public String toString()
   {
      return shapeName;
   }
}
