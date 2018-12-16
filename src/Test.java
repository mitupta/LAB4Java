public class Test {

    public static void main(String[] args) {

        pl.edu.wszib.java.PackagePresenter javaPackagePresenter = new pl.edu.wszib.java.PackagePresenter();
        javaPackagePresenter.showPackage();

        pl.edu.wszib.podyplomowe.PackagePresenter podyplomowePackagePresenter = new pl.edu.wszib.podyplomowe.PackagePresenter();
        podyplomowePackagePresenter.showPackage();


        Test test = new Test();
        System.out.println("Pakiet klasy Test: " + test.getClass().getPackage());

    }

}

