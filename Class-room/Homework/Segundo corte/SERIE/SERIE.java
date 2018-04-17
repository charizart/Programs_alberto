import javax.swing.*;
public class SERIE{
  private String  title, entregado="false", category, creator;
private int numberOfSeansons=3;
  public SERIE(){
    this.title="la momia";
    this.entregado="false";
    this.category="trama";
    this.creator="fox";
    this.numberOfSeansons=30;
  }
  public SERIE(String  title,String creator){
    this.title=title;
    this.entregado="false";
    this.category="unknown";
    this.creator=creator;
    this.numberOfSeansons=3;
  }
  public SERIE(String  title,String category,String creator, int numberOfSeasons){
    this.title=title;
    this.category="unknown";
    this.creator=creator;
    this.numberOfSeansons=3;
  }
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
  public void setCreator(String creator){
    this.creator=creator;
  }
  public String getCreator(){
    return this.creator;
  }
  public void setNumberOfSeansons(int numberOfSeansons){
    this.numberOfSeansons=numberOfSeansons;
  }
  public int getNumberOfSeansons(){
    return this.numberOfSeansons;
  }
  @Override
  public String toString(){
    return "the title is: "+getTitle()+"\n the category is: "+getCategory()+"\n the creator is: "+getCreator()+"\n the number of seanson is: "+getNumberOfSeansons();
  }
  public String getEntrega(){
    String entre=this.entregado;
    return entre;
  }
  /*********************************************/
public static void main(String[] args) {
  SERIE serie=new SERIE();
JOptionPane.showMessageDialog(null,serie.toString()+"\n the entregado is: "+serie.getEntrega());
  SERIE serie2=new SERIE("LA MOMIA 2","FOX2");
  JOptionPane.showMessageDialog(null,serie2.toString());
  SERIE serie3=new SERIE("LA MOMIA 3","TERROR","FOX3",4);
  JOptionPane.showMessageDialog(null,serie.toString());
}

}
