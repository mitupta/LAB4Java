package pl.podyplomowe;
import java.net.MalformedURLException;
import java.net.URL;

import javax.print.DocFlavor;

public class CheckExceptionExample {

    public static void main(String[] args) {
        CheckExceptionExample checkExceptionExample = new CheckExceptionExample();

        //checkExceptionExample.urlTesterByTryCatch("lipa https://wszib.edu.pl/shiet");

        try {
            checkExceptionExample.urlTesterByThrows("aaaahttp://niewiem");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void urlTesterByTryCatch(String urlStr){
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocool: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("------------------------------------");
            e.printStackTrace();
        }
    }

    public void urlTesterByThrows(String urlStr) throws MalformedURLException {
        URL url = new URL(urlStr);
        System.out.println("Protocool: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }
}
