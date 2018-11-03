package designpatterns;

import designpatterns.abstractfactory.LinuxGuiFactory;
import designpatterns.abstractfactory.OperationSystem;
import designpatterns.abstractfactory.WindowsGuiFactory;
import designpatterns.abstractfactory.excercise.AppleFactory;
import designpatterns.abstractfactory.excercise.GoogleFactory;
import designpatterns.abstractfactory.excercise.Shop;
import designpatterns.command.*;
import designpatterns.facade.*;
import designpatterns.proxy.Developer;
import designpatterns.proxy.Employee;
import designpatterns.proxy.Manager;
import designpatterns.proxy.ProxyEmlopyee;
import designpatterns.templatemethod.BasicComputerSetup;
import designpatterns.templatemethod.DeveloperComputerSetup;

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

//        __________________Iterator______________________

//        FootballTeam footballTeam = new FootballTeam();
//        FootballPlayer footballPlayer = new FootballPlayer("Krystjano","Rolando",FootballPlayerPosition.ATTACKER);
//        FootballPlayer footballPlayer1 = new FootballPlayer("Camillio","Glik",FootballPlayerPosition.DEFFENDER);
//        footballTeam.addFootballPlayer(footballPlayer);
//        footballTeam.addFootballPlayer(footballPlayer1);
//        Iterator iterator = footballTeam.getIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        __________________Łańcuch Zobowiązań______________________

//        ShopItemPurchaseRequest samsungS7 = new ShopItemPurchaseRequest("Samsung S7",2);
//
//        VilligeShop sklepWiejski = new VilligeShop();
//        TownShop sklepMalomiasteczkowy = new TownShop();
//        CityShop sklepMiejski = new CityShop();
//        BigCityShop sklepWielkomiejski = new BigCityShop();
//
//        sklepMiejski.addToStock("Samsung S7", 1);
//        sklepWielkomiejski.addToStock("Samsung S7", 2);
//
//        sklepWiejski.setSuccessor(sklepMalomiasteczkowy);
//        sklepMalomiasteczkowy.setSuccessor(sklepMiejski);
//        sklepMiejski.setSuccessor(sklepWielkomiejski);
//        sklepWiejski.processRequest(samsungS7);
        
//         __________________Kompozyt______________________

//        DataStructure programFiles = new Directory("Program Files");
//        DataStructure file = new File("batman.mp4");
//        DataStructure music = new Directory("Music");
//        DataStructure track1 = new File("track1.mp3");
//        DataStructure track2 = new File("track2.mp3");
//        DataStructure rockMusic = new Directory("Rock");
//        DataStructure rockTrack = new File("rockTrack.mp3");
//        rockMusic.addChild(rockTrack);
//        music.addChild(rockMusic);
//        music.addChild(track1);
//        music.addChild(track2);
//        programFiles.addChild(file);
//        programFiles.addChild(music);
//        programFiles.browse();

//         __________________Most______________________

//        HBOVod<MediaPlayer> hboVod = new HBOVod<>(new ExoPlayer());
//        HBOVod<MediaPlayer> hboVodChina = new HBOVod<>(new ChinaPlayer());
//        hboVod.addFile(new designpatterns.bridge.File("123.mp3"));
//        hboVod.addFile(new designpatterns.bridge.File("drugi.mp3"));
//        hboVod.addFile(new designpatterns.bridge.File("osiem.mp3"));
//        hboVodChina.addFile(new designpatterns.bridge.File("stefan.mp3"));
//        hboVodChina.startPlaying();
//        hboVodChina.stopPlaying();
//        hboVod.startPlaying();
//        hboVod.stopPlaying();

//         __________________Mediator______________________

//        Dispatcher taxiDispatcher = new TaxiDispatcher();
//        Driver taxi = new TaxiDriver(taxiDispatcher, DriverStatus.DURING_ORDER);
//        Driver taxi1 = new TaxiDriver(taxiDispatcher, DriverStatus.DURING_ORDER);
//        Driver taxi2 = new TaxiDriver(taxiDispatcher, DriverStatus.DURING_ORDER);
//        Driver taxi3 = new TaxiDriver(taxiDispatcher);
//
//        taxiDispatcher.addDriver(taxi);
//        taxiDispatcher.addDriver(taxi1);
//        taxiDispatcher.addDriver(taxi2);
//        taxiDispatcher.addDriver(taxi3);
//
//        taxiDispatcher.takeOrder("Na odzieżową 6");
//        taxiDispatcher.takeOrder("Na odzieżową 5");
//        taxi3.stopOrder();
//        taxiDispatcher.takeOrder("Na odzieżową 5");

//         __________________Budowniczy______________________


//        Computer notebook = new NotebookComputerBuilder()
//                .setComputerName("Predator")
//                .setComputerRam("8GB")
//                .setComputerCpu("Intel i7 8 gen")
//                .setComputerGpu("Nvidia GeForce 1080")
//                .build();
//
//        Computer desktop = new DesktopComputerBuilder()
//                .setComputerName("Szafa")
//                .setComputerRam("32GB")
//                .setComputerCpu("2x Intel i7 8 gen")
//                .setComputerGpu("4x Nvidia GeForce 1080")
//                .setComputerKeyboard("DVORAK")
//                .setComputerMonitor("32\" curved")
//                .setComputerCover("Tower")
//                .build();
//
//
//        System.out.println(desktop.toString());
//        System.out.println(notebook.toString());

//         __________________Metoda szablonowa______________________


//        DeveloperComputerSetup developerComputerSetup = new DeveloperComputerSetup();
//        BasicComputerSetup basicComputerSetup = new BasicComputerSetup();
//
//        System.out.println("Developer computer:");
//        developerComputerSetup.setup();
//        System.out.println();
//        System.out.println("Basic computer:");
//        basicComputerSetup.setup();


//         __________________Pełnomocnik______________________

//        Employee manager = new ProxyEmlopyee(new Manager());
//        Employee developer = new ProxyEmlopyee(new Developer());
//
//
//        System.out.println("RAPORT DLA MANAGER:");
//        manager.generateTimeReport();
//        System.out.println();
//        System.out.println("RAPORT DLA DEVELOPER:");
//        developer.generateTimeReport();

//        ___________________Fabryka Abstrakcyjna______________


//        OperationSystem operationSystem = new OperationSystem(new WindowsGuiFactory());
//        operationSystem.showOperationSystemGui();
//
//        OperationSystem linux = new OperationSystem(new LinuxGuiFactory());
//        linux.showOperationSystemGui();


//        EXCERCISE:

//        Shop googleShop = new Shop(new GoogleFactory());
//        Shop appleShop = new Shop(new AppleFactory());
//
//        googleShop.showProducts();
//        appleShop.showProducts();

//        ________________Fasada______________________

//        Computer computer = new Computer("Raptor X");
//        computer.setup(
//                new Cpu("Intel Pentium II MMX"),
//                new Gpu("ATI Radeon"),
//                new Input("Keyboard and Mouse"),
//                new Ram("2MB SDRAM Kingston"),
//                new HardDrive("Segate Barracuda 250MB"),
//                new OperatingSystem("Windows 98 SE"));
//        computer.start();


//        _________________Polecenie_____________________

        Calculation calculation = new Calculation(10.0,2.0);
        AdditionCommand additionCommand = new AdditionCommand(calculation);
        SubstractCommand substractCommand = new SubstractCommand(calculation);
        MultiplyCommand multiplyCommand = new MultiplyCommand(calculation);
        DivideCommand divideCommand = new DivideCommand(calculation);
        ModuloCommand moduloCommand = new ModuloCommand(calculation);

        System.out.println(additionCommand.execute());
        System.out.println(substractCommand.execute());
        System.out.println(multiplyCommand.execute());
        System.out.println(divideCommand.execute());
        System.out.println(moduloCommand.execute());
        System.out.println();
        System.out.println(calculation.getLastResult());
        System.out.println();
        System.out.println(calculation.reverseResult(1));


    }
}
