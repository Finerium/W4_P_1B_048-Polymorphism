// Commission employee, extends Hourly tapi dapet komisi dari sales juga
public class Commission extends Hourly
{
   private double totalSales;
   private double commissionRate;

   // constructor 6 param, 5 pertama sama kayak Hourly + commissionRate
   public Commission (String eName, String eAddress, String ePhone,
                      String socSecNumber, double hourlyPayRate,
                      double commRate)
   {
      super (eName, eAddress, ePhone, socSecNumber, hourlyPayRate);
      commissionRate = commRate;
      totalSales = 0;
   }

   // method buat nambah sales
   public void addSales (double sales)
   {
      totalSales += sales;
   }

   // override pay: gaji per jam + komisi dari total sales
   public double pay()
   {
      double payment = super.pay();
      payment += totalSales * commissionRate;
      totalSales = 0; // reset sales setelah dibayar
      return payment;
   }

   // override toString: tambahin info total sales
   public String toString()
   {
      String result = super.toString();
      result += "\nTotal sales: " + totalSales;
      return result;
   }
}
