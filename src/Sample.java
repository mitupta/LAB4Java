public class Sample {

    public static void main(String[] args) {

        A a = new A();

        a.counter = 30;
        a.name = "Czesiek";
        a.setCounter(45);
        System.out.println(a.getCounter());

        WachingMachine wachingMachine = new WachingMachine();
        wachingMachine.modeForSensitiveClothes();
        wachingMachine.showSettings();
        wachingMachine.modeForTowelsAndBedLinen();
        wachingMachine.showSettings();


        //Rectangle rectangle = new Rectangle();

    }


}

class A{
    protected int counter;
    protected  String name;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        if ( counter < 0 ){
            System.out.println("Wprowadzono wartość < 0");
        }
        else if (counter > 20) {
            System.out.println("Wprowadzono warość > 20");
        }
        else {
            this.counter = counter;
        }
    }
}

class B extends A {
    void show(){
        System.out.println("Licznik: " + counter);
        System.out.println("Imię: " + name);
    }

    @Override
    public int getCounter() {
        System.out.println("Counter z klasy B");
        this.counter = 12;
        return this.counter;
    }
}
