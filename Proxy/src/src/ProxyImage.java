package src;
import java.util.Date;

public class ProxyImage implements Image{
    private final String filename;
    private final String description;
    private final Date date;
    private RealImage image;
    public ProxyImage(String filename, String description, Date date) {
        this.filename = filename;
        this.description = description;
        this.date = date;
    }
    @Override
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename, description, date);
        }
        image.displayImage();
    }

    @Override
    public void showPhotoDetails() {
        if (image == null) {
            image = new RealImage(filename, description, date);
        }
        image.showPhotoDetails();
    }
}
