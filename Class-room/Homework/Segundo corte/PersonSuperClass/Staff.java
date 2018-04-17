public class Staff extends Person{
  private String school;
  private double pay;
  public Staff(String name,String address,String school,double pay){
    super (name,address);
    this.school=school;
    this.pay=pay;
  }
  public String getSchool(){
    return this.school;
  }
  public void setSchool(String school){
    this.school=school;
  }
  public double getPay(){
    return this.pay;
  }
  public void set(double pay){
    this.pay=pay;
  }
  @Override
  public String toString(){
    return "the name is: "+super.getName()+"\n the address is: "+super.getAdrees()+"\n the school is: "+getSchool()+"\n the pay is: "+getPay();
  }
}
