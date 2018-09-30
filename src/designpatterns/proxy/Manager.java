package designpatterns.proxy;

public class Manager implements Employee {

    @Override
    public void generateTimeReport() {
        System.out.print("Generuje raport");
        Thread thread = new Thread() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    if (i < 8) {
                        try {
                            Thread.sleep(500);
                            System.out.print(".");
                            i++;
                        } catch (InterruptedException e) {
                            return;
                        }
                    } else {
                        System.out.println();
                        break;
                    }
                }
                this.interrupt();
            }
        };
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Wyświetlam raport dla Managera!");
        System.out.println("160h");
        System.out.println();
    }


    @Override
    public boolean hasPermisson() {
        return true;
    }

    @Override
    public String toString() {
        return "Manager";
    }
}
