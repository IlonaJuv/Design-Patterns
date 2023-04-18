public class Viisarit implements Cloneable{
    private int minuutti;
    private int tunti;

    public Viisarit(int tunti, int minuutti) {
        this.tunti = tunti;
        this.minuutti = minuutti;
    }

    public int getMinuutti() {
        return minuutti;
    }
    public int getTunti() {
        return tunti;
    }
    public void setMinuutti(int minuutti) {
        this.minuutti = minuutti;
    }

    public void setTunti(int tunti) {
        this.tunti = tunti;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
