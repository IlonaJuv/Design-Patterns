package src;
import java.lang.reflect.InaccessibleObjectException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Image image1 = new ProxyImage("HiRes_10MB_Photo1", "Cat", sdf.parse("2000-09-23"));
        Image image2 = new ProxyImage("HiRes_10MB_Photo2", "Dog", sdf.parse("2012-3-23"));

        image1.showPhotoDetails();
        image1.displayImage();
        image2.displayImage();
        image2.showPhotoDetails();
        image1.showPhotoDetails();
        image1.displayImage();

    }
}
