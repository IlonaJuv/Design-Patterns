package Builder_without_concreteProducts_2ndOption;


import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        //Luodaan konkreettinen builder
        HesburgerBuilder hese = new HesburgerBuilder();
        waiter.setBurgerBuilder(hese);
        waiter.constructHamburger();
        ArrayList hBursa = hese.getBurger();
        System.out.println(hBursa);

        //Tai kivemman näköisesti tarjoilija tarjoilee hampurilaisen
        HamburgerBuilder mcBuilder = new McBurgerBuilder();
        waiter.setBurgerBuilder(mcBuilder);
        waiter.constructHamburger();
        StringBuilder mcBurger = (StringBuilder) waiter.serveHamburger();
        System.out.println(mcBurger);

        // Tai interfacen avulla
        HamburgerBuilder heseBuilder = new HesburgerBuilder();
        waiter.setBurgerBuilder(heseBuilder);
        waiter.constructHamburger();
        ArrayList heseBurger = (ArrayList) heseBuilder.getBurger();
        System.out.println(heseBurger);
    }
}
