package designpatterns.observer;

public class MediaMarktClient implements Subscriber {

    @Override
    public void notifyAboutNewsletter(Newsletter newsletter) {
        System.out.format("Otrzymano newsletter: %s", newsletter);
        System.out.println();
    }
}
