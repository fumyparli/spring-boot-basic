package ga.fumyparli.e2.singleton;

public class SingletonService {
    //1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static final SingletonService instance = new SingletonService();

    //2. public으로 열어서 객체 인스터스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한 다.
    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() { // private 생성자 = 핵심
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
