package Simple;
public class Singletonlanhan {
    private static Singletonlanhan instance;
    private Singletonlanhan (){}
    public static synchronized Singletonlanhan getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
            instance = new Singletonlanhan();
        }
        return instance;
    }
}
