/*
EXAM
DIEGO PEREZ CARRILLO
LUIS URIEL VICTORIANO JUAREZ
THIS IS THE CLASS WILL BE THE TEMPLATE OF THE WASHING MACHINES
*/
public class Lavadora extends Electrodomestico{
    private final static int LOAD_FOR_DFCT=5;
    private int load;

    public int getLoad() {
        return load;
    }

    public double precioFinal(){
        double plus=super.precioFinal();
        if (load>30){
            plus+=50;
        }

        return plus;
    }

    public Lavadora(){
        this(BASE_PRICE_FOR_DFCT, WEIGHT_FOR_DFCT, ENERGY_CONSUMPTION_FOR_DFCT, COLOR_FOR_DFCT, LOAD_FOR_DFCT);
    }

    public Lavadora(double baseprice, double weight){
        this(baseprice, weight, ENERGY_CONSUMPTION_FOR_DFCT, COLOR_FOR_DFCT, LOAD_FOR_DFCT);
    }

    public Lavadora(double baseprice, double weight, char energyconsumption, String color, int load){
        super(baseprice,weight, energyconsumption, color);
        this.load=load;
    }
}//end class Lavadora
