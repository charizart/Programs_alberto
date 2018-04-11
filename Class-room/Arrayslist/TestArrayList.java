/*
*/
import java.util.ArrayList:;
import javax.swing.*;

public class TestArrayList{
  public static void main(String[] args) {
    ArrayList cityList = new ArrayList();
    cityList.add("London");
    cityList.add("New York");
    cityList.add("Paris");
    cityList.add("Tokyo");
    cityList.add("Miami");

    JOptionPane.showMessageDialog("List size" + cityList.size());

    JOptionPane.showMessageDialog(null, " is Miami in this List? " + cityList.contains("Miami"));

    JOptionPane.showMessageDialog(null, "the location of Paris is " + cityList.indexOf("Paris"));

    JOptionPane.showMessageDialog(null, "IS this LIST EMPTY?" + cityList.isEmpty());

    cityList.remove("London");
  }
}
