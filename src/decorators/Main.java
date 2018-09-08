package decorators;

import decorators.decorator.BasePizza;
import decorators.decorator.OnionPizza;
import decorators.decorator.Pizza;
import decorators.decorator.SpamPizza;
import decorators.observer.*;
import decorators.prototype.FootballPlayer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

//        __________________Dekorator______________________

//        Pizza cebulowo_mielonkowa = new OnionPizza(new SpamPizza(new BasePizza()));
//
//        cebulowo_mielonkowa.makePizza();
//        cebulowo_mielonkowa.showComponents();
//        cebulowo_mielonkowa.bakePizza();


//        __________________Prototyp______________________

//        FootballPlayer footballPlayer = new FootballPlayer("Jan", "Kowalski",35,"Bramkarz");
//        FootballPlayer footballPlayer1 = (FootballPlayer) footballPlayer.clone();
//        footballPlayer.setAge(95);
//        footballPlayer1.setName("Janusz");
//        System.out.println(footballPlayer.toString());
//        System.out.println(footballPlayer1.toString());

//        __________________Obserwator______________________

        Shop shop = new Mediamarkt();
        Subscriber subscriber= new MediaMarktClient();
        Subscriber subscriber1= new MediaMarktClient();
        shop.addSubscriber(subscriber);
        shop.addSubscriber(subscriber1);
        shop.notifyAboutNewsletter(new Newsletter("Gazeta Rolnicza", "Krowa zdechła i śmierdzi"));
        shop.removeSubscriber(subscriber);
        shop.notifyAboutNewsletter(new Newsletter("Gazeta Rolnicza", "Krowa jednak żyje, ale dalej śmierdzi"));



    }
}
