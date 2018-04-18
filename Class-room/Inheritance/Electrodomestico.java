/*
EXAM
DIEGO PEREZ CARRILLO
LUIS URIEL VICTORIANO JUAREZ
THIS IS THE SUPER CLASS
*/
public class Electrodomestico {
    //Constants = Default values
    protected final static String COLOR_FOR_DFCT="WHITE";
    protected final static char ENERGY_CONSUMPTION_FOR_DFCT='F';
    protected final static double BASE_PRICE_FOR_DFCT=100;
    protected final static double WEIGHT_FOR_DFCT=5;

    //attributes
    protected double baseprice;
    protected String color;
    protected char energyconsumption;
    protected double weight;

    public Electrodomestico(){
        this(BASE_PRICE_FOR_DFCT, WEIGHT_FOR_DFCT, ENERGY_CONSUMPTION_FOR_DFCT, COLOR_FOR_DFCT);
    }

    public Electrodomestico(double baseprice, double weight){
        this(baseprice, weight, ENERGY_CONSUMPTION_FOR_DFCT, COLOR_FOR_DFCT);
    }


    public Electrodomestico(double baseprice, double weight, char energyconsumption, String color){
        this.baseprice=baseprice;
        this.weight=weight;
        comprobarenergyconsumption(energyconsumption);
        comprobarColor(color);
    }

    private void comprobarColor(String color){
        String colores[]={"WHITE", "BLACK", "RED", "BLUE", "GRAY"};
        boolean encontrado=false;
        for(int i=0;i<colores.length && !encontrado;i++){

            if(colores[i].equals(color)){
                encontrado=true;
            }

        }

        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_FOR_DFCT;
        }


    }


    public void comprobarenergyconsumption(char energyconsumption){

        if(energyconsumption>=65 && energyconsumption<=70){
            this.energyconsumption=energyconsumption;
        }else{
            this.energyconsumption=ENERGY_CONSUMPTION_FOR_DFCT;
        }

    }


    public double getBasePrice() {
        return baseprice;
    }
    public String getColor() {
        return color;
    }
    public char getEnergyConsumption() {
        return energyconsumption;
    }
    public double getweight() {
        return weight;
    }
    public double precioFinal(){
        double plus=0;
        switch(energyconsumption){
            case 'A':
                plus+=100;
                break;
            case 'B':
                plus+=80;
                break;
            case 'C':
                plus+=60;
                break;
            case 'D':
                plus+=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
        }

        if(weight>=0 && weight<19){
            plus+=10;
        }else if(weight>=20 && weight<49){
            plus+=50;
        }else if(weight>=50 && weight<=79){
            plus+=80;
        }else if(weight>=80){
            plus+=100;
        }

        return baseprice+plus;
    }

}// end class Electrodomestico
