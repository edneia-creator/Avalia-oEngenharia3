public class PizzaDelivery {

    private int numeroDeEntregasAtrasadas;
    public boolean maisDeCincoEntregasAtrasadas(){
        if(numeroDeEntregasAtrasadas > 5){
            System.out.println("Aí vai 2!");
            return true;

        }else{
            System.out.println("Aí vai 1!");

        }
        return false;
    }


}




