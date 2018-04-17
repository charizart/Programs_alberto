public class Person{
  private String name;
  private String address;
  public Person(String name, String address){
    this.name=name;
    this.address=address;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getAdrees(){
    return this.address;
  }
  public void setAddres(String address){
    this.address=address;
  }
}
