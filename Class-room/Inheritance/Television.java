/*

EXAM
DIEGO PEREZ CARRILLO
LUIS URIEL VICTORIANO JUAREZ
THIS IS THE CLASS WILL BE THE TEMPLATE OF THE TELEVISION (MY SMARTTV)
*/
public class Television extends Electrodomestico{

    private final static int RESOLUTION_FOR_DFCT=20;
    private int resolution;
    private boolean sintonizadorTDT;
    public double precioFinal(){

        double plus=super.precioFinal();


        if (resolution>40){
            plus+=baseprice*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }

        return plus;
    }
    public Television(){
        this(BASE_PRICE_FOR_DFCT, WEIGHT_FOR_DFCT, ENERGY_CONSUMPTION_FOR_DFCT, COLOR_FOR_DFCT, RESOLUTION_FOR_DFCT, false);
    }

    public Television(double baseprice, double weight){
        this(baseprice, weight, ENERGY_CONSUMPTION_FOR_DFCT, COLOR_FOR_DFCT, RESOLUTION_FOR_DFCT, false);
    }

    public Television(double baseprice, double weight, char energyconsumption, String color, int resolution, boolean sintonizadorTDT){
        super(baseprice, weight, energyconsumption, color);
        this.resolution=resolution;
        this.sintonizadorTDT=sintonizadorTDT;
    }
}//end class Television
