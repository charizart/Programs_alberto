/*
Alberto vega vega
tempertureConverter.java
this program converter from fahrenheit to celcius
*/
public class tempertureConverter{
  public static void main (String[] args ){
    final double FREEZINGS_POINT=32.0;
    final double CONVERSION_FACTOR=5.0/9.0;
    double fahrenheit=50;
    double celcius=0;
    celcius=CONVERSION_FACTOR*(fahrenheit-FREEZINGS_POINT);
    System.out.println(fahrenheit + " degrees fahrenheit = " +celcius+" degrees celcius" );

  }

}
