public class Application implements Runnable {

    public static void main(String[] args) {
        new Application().run();
    }

    public void run() {

        for(int i=100;i>=0;i--){
            System.out.println(i);
        }
    }

}
