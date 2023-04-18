public class Main {
    public static void main(String[] args) {

        Kello k = new Kello(22, 12, new Viisarit(22, 15));
        System.out.println(k.getTunti() + "." +  k.getMinuutti() +  ":" + k.getViisari().getTunti() + "." +  k.getViisari().getMinuutti());

        //Syväkopiointi, ota toinen clone-metodi käyttöön Kello luokasta
        Kello k3 = k.clone();
        System.out.println(k3.getTunti() + "." + k3.getMinuutti() + ":" + k3.getViisari().getTunti() + "." + k3.getViisari().getMinuutti());

        k3.setMinuutti(34);
        k3.setTunti(1);
        k3.getViisari().setMinuutti(2);
        k3.getViisari().setTunti(9);
        System.out.println("k3 " + k3.getTunti() + "." + k3.getMinuutti() + ":" + k3.getViisari().getTunti() + "." + k3.getViisari().getMinuutti());
        System.out.println("k " + k.getTunti() + "." +  k.getMinuutti() +  ":" + k.getViisari().getTunti() + "." +  k.getViisari().getMinuutti());

        /*
        *
        //Matalakopiointi, ota Kello-luokasta toinen clone käyttöön ja Viisarit luokasta voi ottaa clonen pois
        Kello k2 =  k.clone();
        System.out.println(k2.getTunti() + "." +  k2.getMinuutti() +  ":" + k2.getViisari().getTunti() + "." +  k2.getViisari().getMinuutti());

        k2.setMinuutti(10);
        k2.setTunti(5);
        k2.getViisari().setMinuutti(15);
        k2.getViisari().setTunti(7);
        System.out.println(k2.getTunti() + "." +  k2.getMinuutti() +  ":" + k2.getViisari().getTunti() + "." +  k2.getViisari().getMinuutti());
        System.out.println(k.getTunti() + "." +  k.getMinuutti() +  ":" + k.getViisari().getTunti() + "." +  k.getViisari().getMinuutti());
        */

    }
}
