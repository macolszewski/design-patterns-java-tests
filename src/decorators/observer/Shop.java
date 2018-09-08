package decorators.observer;

public interface Shop {

    void addSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifyAboutNewsletter(Newsletter newsletter);
}
