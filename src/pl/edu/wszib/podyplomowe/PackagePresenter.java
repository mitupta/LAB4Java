package pl.edu.wszib.podyplomowe;
public class PackagePresenter {

    public void showPackage(){
        System.out.print("To jest obiekt klasy: " + this.getClass().getName());
        System.out.println(" w pakiecie: " + this.getClass().getPackage());
    }
}
