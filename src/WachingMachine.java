public class WachingMachine {

    private int temperature;
    private int spinning;

    void modeForSensitiveClothes(){
        temperature = 30;
        spinning = 800;
    }

    void  modeForTowelsAndBedLinen(){
        temperature = 90;
        spinning = 1200;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getSpinning() {
        return spinning;
    }

    public void setSpinning(int spinning) {
        this.spinning = spinning;
    }

    void showSettings(){
        System.out.println("temperatura: " + temperature + " obroty: " + spinning);
        System.out.println("-----------------------------------------");
    }
}
