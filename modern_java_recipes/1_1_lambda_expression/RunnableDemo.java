public class RunnableDemo {
    public static void main(String[] args) {

        // new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("inside runnable using an anonymous inner class");
        //     }
        // }).start();


        // same with lambda
        new Thread(() -> System.out.println("inside Thread ctor using lambda")).start();

        // same with lambda (with sleep)
        new Thread(() -> {
            System.out.println("inside Thread ctor using lambda");
            try {
                System.out.println("waiting...");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }).start();

        Runnable r = () -> System.out.println("lambda exp impl the run mehtod");
        new Thread(r).start();

        //
        //
        // Assigning a lambda to the functional interface is the same as saying
        // the lambda is the implementation of the single abstract method inside it.
        //
        //

    }
}
