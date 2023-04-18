public class Kello implements Cloneable{
//Tästä luokasta tehdään klooni

    private Viisarit aikaviisarit;
    private int tunti;
    private int minuutti;

    public Kello (int tunti, int minuutti, Viisarit aika) {
        this.aikaviisarit = aika;
        this.tunti = tunti;
        this.minuutti = minuutti;
    }

    public Viisarit getViisari() { return aikaviisarit; }

    public int getTunti() {
        return tunti;
    }

    public void setTunti(int tunti) {
        this.tunti = tunti;
    }

    public int getMinuutti() {
        return minuutti;
    }

    public void setMinuutti(int minuutti) {
        this.minuutti = minuutti;
    }

    //Syväkopio
    public Kello clone() {
        Kello kello = null;
        try {
            kello = (Kello)super.clone();
            kello.aikaviisarit = (Viisarit) aikaviisarit.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Syväkopiointi ei onnistunut! ");
        }
        return kello;
    }

    /*
    *
    //Matalakopio
    public Kello clone() {
        try {
            return (Kello) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
*/


}
