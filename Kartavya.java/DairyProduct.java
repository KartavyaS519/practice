public class DairyProduct {
    private String name;                //creating the properties going to be inherited by all the classes//
    private int price;
    private String expirationDate;
    private int amountOfSaturatedFat;
//Creating constructor for the parent class//
    public DairyProduct(String name, int price, String expirationDate, int amountOfSaturatedFat) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.amountOfSaturatedFat = amountOfSaturatedFat;
    }
//Creating void method to print the details//
    public void printDeatils() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price + "$");
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Amount of Saturated Fat: " + amountOfSaturatedFat+"%");

        if (amountOfSaturatedFat>10)
            System.out.println("This dairy product is not suitable for consumers with high colestrol level.");
        else
            System.out.println("This dairy product is suitable for all the consumers.");
    }
}
//Creating a child class inheriting parent class//
    class milk extends DairyProduct {
        private String[] type;

//Inheriting the properties of parent class//
        public milk(String name, int price, String expirationDate, int amountOfSaturatedFat) {
            super(name, price, expirationDate, amountOfSaturatedFat);
            this.type = new String[]{"skimmed", "unskimmed"};
        }
        //overriding the method of the parent class//
       @Override
        public void printDeatils() {
            super.printDeatils();
            String type1 = "";
            for (int i = 0; i < this.type.length; i++) {
                type1 = type1 + " " + type[i] + ",";
            }
            System.out.println("The types of this prodcut are: "+type1);
            System.out.println("*_____________________________________*");
        }
    }

     class Cheese extends DairyProduct {
        private String[] appearance;


        public Cheese(String name, int price, String expirationDate, int amountOfSaturatedFat) {
            super(name, price, expirationDate, amountOfSaturatedFat);
            this.appearance = new String[]{"shredded", "plain"};
        }
        @Override
        public void printDeatils() {
            super.printDeatils();
            String appearance1 = "";
            for (int i = 0; i < this.appearance.length; i++) {
                appearance1 = appearance1 + " " + appearance[i] + ",";
            }
            System.out.println("The appearannce of this product is: "+appearance1);
            System.out.println("*_____________________________________*");

        }
    }
    class yogurt extends DairyProduct {
        private String[] flavour;

        public yogurt(String name, int price, String expirationDate, int amountOfSaturatedFat) {
            super(name, price, expirationDate, amountOfSaturatedFat);
            this.flavour = new String[]{"sweet", "plain", "strwaberry"};
        }
        @Override
        public void printDeatils() {
            super.printDeatils();
            String flavour1 = "";
            for (int i = 0; i < this.flavour.length; i++) {
                flavour1 = flavour1 + " " + flavour[i] + ",";
            }
            System.out.println("The flavours available are: "+flavour1);
            System.out.println("*_____________________________________*");
        }
    }
