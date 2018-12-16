package pl.michau;

import java.util.Random;

public class MyDataProvider implements DataProvider {

    @Override
    public String getData() {
        Random r = new Random();
        return "Losowo: " + Double.toString(r.nextGaussian()) + " ";

    }
}
