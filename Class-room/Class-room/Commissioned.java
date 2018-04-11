public class Commssioned extends Employee implements commission{
  private double sales = 0.0;

  public Commssioned(String name){
    super(name);
    this.sales=sales;
  }
  public void addSales(double sales){
  this.sales += sales;
  }
  public double getPay(){
    double pay = COMMISSION_RATE * sales;
    this.sales = 0.0;
    return pay;
  }
}
