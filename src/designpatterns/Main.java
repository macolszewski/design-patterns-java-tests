package designpatterns;

import designpatterns.iterator.FootballPlayer;
import designpatterns.iterator.FootballPlayerPosition;
import designpatterns.iterator.FootballTeam;
import designpatterns.iterator.Iterator;

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

//        Shop shop = new Mediamarkt();
//        Subscriber subscriber= new MediaMarktClient();
//        Subscriber subscriber1= new MediaMarktClient();
//        shop.addSubscriber(subscriber);
//        shop.addSubscriber(subscriber1);
//        shop.notifyAboutNewsletter(new Newsletter("Gazeta Rolnicza", "Krowa zdechła i śmierdzi"));
//        shop.removeSubscriber(subscriber);
//        shop.notifyAboutNewsletter(new Newsletter("Gazeta Rolnicza", "Krowa jednak żyje, ale dalej śmierdzi"));

//        __________________Fabryka______________________

//        CarObjectsFactory carObjectsFactory = new CarObjectsFactory();
//        Car sedan = carObjectsFactory.produceCar(CarType.SEDAN);
//        Car kombi = carObjectsFactory.produceCar(CarType.KOMBI);
//        System.out.println(String.format("opis: %s", sedan.toString()));
//        System.out.println(String.format("opis: %s", kombi.toString()));

//        __________________Fabryka______________________

        FootballTeam footballTeam = new FootballTeam();
        FootballPlayer footballPlayer = new FootballPlayer("Krystjano","Rolando",FootballPlayerPosition.ATTACKER);
        FootballPlayer footballPlayer1 = new FootballPlayer("Camillio","Glik",FootballPlayerPosition.DEFFENDER);
        footballTeam.addFootballPlayer(footballPlayer);
        footballTeam.addFootballPlayer(footballPlayer1);
        Iterator iterator = footballTeam.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }






    }
}
