// Salesperson implements Comparable, bisa di-sort berdasarkan sales
public class Salesperson implements Comparable
{
   private String firstName, lastName;
   private int totalSales;

   public Salesperson (String first, String last, int sales)
   {
      firstName = first;
      lastName = last;
      totalSales = sales;
   }

   public String toString()
   {
      return lastName + ", " + firstName + ": \t" + totalSales;
   }

   public boolean equals (Object other)
   {
      return (lastName.equals(((Salesperson)other).getLastName()) &&
              firstName.equals(((Salesperson)other).getFirstName()));
   }

   // compare berdasarkan totalSales, kalo sama pake nama
   public int compareTo(Object other)
   {
      int result;
      Salesperson otherSP = (Salesperson) other;

      // bandingin sales dulu
      if (totalSales < otherSP.totalSales)
         result = -1;
      else if (totalSales > otherSP.totalSales)
         result = 1;
      else
      {
         // sales sama, break tie pake lastName
         result = lastName.compareTo(otherSP.lastName);
         if (result == 0)
            // lastName juga sama, pake firstName
            result = firstName.compareTo(otherSP.firstName);
      }

      return result;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public int getSales()
   {
      return totalSales;
   }
}
