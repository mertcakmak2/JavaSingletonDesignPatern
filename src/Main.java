public class Main {

    public static void main(String[] args) {

        for(int i = 0; i<10 ; i++){
            //10 kere dönülmesine rağmen 1 defa oluşturulur..
            Singleton singleton = Singleton.getSingleton();
        }
    }
}
