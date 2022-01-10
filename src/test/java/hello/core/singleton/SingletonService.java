package hello.core.singleton;

public class SingletonService {

    //static은 하나만 올라간다.
    private static final SingletonService instance = new SingletonService();


    public static  SingletonService getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonService singletonService1 = new SingletonService();
        SingletonService singletonService2 = new SingletonService();
    }

    private SingletonService(){
    }

    public void login(){
        System.out.println("싱글톤 객체 로직 호출출");    }

}
