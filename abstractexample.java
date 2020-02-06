public class abstractexample {
    public static void main (String[] args){
        car Car1= new ferrari();
        carrepair CarRepair=new carrepair();
        carrepair.repaircar(Car1);

        Car1=new audi();
        carrepair.repaircar(Car1);

    }
}
