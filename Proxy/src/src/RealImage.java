package src;
import java.util.Date;

public class RealImage implements Image{
    private final String filename;
    private final String description;
    private final Date date;
    public RealImage(String filename, String description, Date date) {
        this.filename = filename;
        this.description = description;
        this.date = date;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading  " + filename);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying  " + filename);
    }

    @Override
    public void showPhotoDetails() {
        System.out.println("Showing details of " + filename);
        System.out.println(filename + "date is " + date + " descriprion: " + description);
        //Tänne myös kuvan tietoja esim päivämäärä
    }
}
