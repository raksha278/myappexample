public class classesmain {
    public static void main(String[] args){
        car ferrari = new car();
        ferrari.model="ferrari f438";
        ferrari.seats=4;
        ferrari.colour="red";
        ferrari.display();

        car audi= new car();
        audi.model="sq7";
        audi.colour="black";
        audi.seats=4 ;
        audi.display();

        //object delaration and memoy allocation

        car test; //declrae object
        test = new car();//memory allocation by using new key word by using new operator memory will be allocated each object;


    }
}
