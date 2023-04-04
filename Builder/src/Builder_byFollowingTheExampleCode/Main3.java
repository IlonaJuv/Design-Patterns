package Builder_byFollowingTheExampleCode;

import Builder_byFollowingTheExampleCode.Director.Waiter;
import Builder_byFollowingTheExampleCode.Builder.HamburgerBuilder;
import Builder_byFollowingTheExampleCode.Hesburger.HBurger;
import Builder_byFollowingTheExampleCode.Hesburger.HesburgerBuilder;
import Builder_byFollowingTheExampleCode.McDonalds.McBurger;
import Builder_byFollowingTheExampleCode.McDonalds.McBurgerBuilder;

public class Main3 {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        //Luodaan konkreettinen builder
        HesburgerBuilder hese = new HesburgerBuilder();
        waiter.setBurgerBuilder(hese);
        waiter.constructHamburger();

        HBurger burger = hese.getBurger();
        System.out.println(burger);

        // Tai interfacen avulla
        HamburgerBuilder mcBuilder = new McBurgerBuilder();
        waiter.setBurgerBuilder(mcBuilder);
        waiter.constructHamburger();

        McBurger mcBurger = (McBurger) waiter.serveHamburger();
        System.out.println(mcBurger);

        //Tai hampurilaisen haku suoraan builderista
        HamburgerBuilder heseBuilder = new HesburgerBuilder();
        waiter.setBurgerBuilder(heseBuilder);
        waiter.constructHamburger();

        HBurger heseBurger = (HBurger) heseBuilder.getBurger();
        System.out.println(heseBurger);
    }
}
