public class Application implements Runnable {

    public static void main(String[] args) {
        new Application().run();
    }

    public void run() {

        for(int i=1;i<=100;i++){
            System.out.println(i);
        }
    }

}
