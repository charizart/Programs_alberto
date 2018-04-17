import javax.swing.*;
public class VIDEOJUEGOS{
  private String title;
  private String entregado="false";
  private String category;
  private String company;
  private int estimatedHours=10;
  public VIDEOJUEGOS(){
    this.title="gears";
    this.entregado="false";
    this.category="guerra";
    this.company="xbox";
    this.estimatedHours=10;
  }
  public VIDEOJUEGOS(String title,int estimatedHours){
    this.title=title;
    this.entregado="true";
    this.category="unknown";
    this.company="unknown";
    this.estimatedHours=estimatedHours;
  }
  public VIDEOJUEGOS(String title,String category,String company, int estimatedHours){
    this.title=title;
    this.entregado="true";
    this.category=category;
    this.company=company;
    this.estimatedHours=estimatedHours;
  }

  //methods
  public void setTitle(String title){
    this.title=title;
  }
  public String getTitle(){
    return this.title;
  }
  public void setCategory(String category){
    this.category=category;
  }
  public String getCategory(){
    return this.category;
  }
  public void setCompany(String company){
    this.company=company;
  }
  public String getCompany(){
    return this.company;
  }
  public void setEstimatedHours(int estimatedHours){
    this.estimatedHours=estimatedHours;
  }
  public int getEstimatedHours(){
    return this.estimatedHours;
  }
  @Override
  public String toString(){
    return " the title is: "+getTitle()+"\n the category is: "+getCategory()+"\n the creator is:"+getCompany()+"\n the estimated hours is: "+getEstimatedHours();
  }


  public static void main(String[] args) {
    VIDEOJUEGOS videojuegos=new VIDEOJUEGOS();
    JOptionPane.showMessageDialog(null,videojuegos.toString());

    VIDEOJUEGOS videojuegos2=new VIDEOJUEGOS("resident evil",10);
    JOptionPane.showMessageDialog(null,videojuegos2.toString());

    VIDEOJUEGOS videojuegos3=new VIDEOJUEGOS("fifa 18","futbol","xbox",15);
    JOptionPane.showMessageDialog(null,videojuegos3.toString());
  }
}
