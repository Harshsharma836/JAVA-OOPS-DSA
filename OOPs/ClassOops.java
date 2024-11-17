
class Car{
    String Model;
    int Price;

    public void PrintModel(){
        System.out.println(this.Model);
    }
}




public class ClassOops {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.Model = "BMW 546";

        Car audi = new Car();
        audi.Model = "Audi 321";

        bmw.PrintModel();


    }
}
