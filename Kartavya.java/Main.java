public class Main {
    public static void main(String[] args) {
        //Creating objects for the three child classes inheriting properties of parent class//
        milk M1= new milk("Milk",35,"10 May 2024",8);
        Cheese C1= new Cheese("Cheese",48,"15 July 2024",18);
        yogurt Y1= new yogurt("Yogurt",30,"25 September 2024",9);
        M1.printDeatils();
        C1.printDeatils();
        Y1.printDeatils();
    }
}