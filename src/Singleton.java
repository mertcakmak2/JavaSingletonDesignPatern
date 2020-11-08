import java.security.Signature;

public class Singleton {

    private static Singleton singleton ;

    private Singleton(){
        System.out.println("Class created..");
    }

    public static Singleton getSingleton(){

        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
