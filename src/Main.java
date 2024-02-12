public class Main {
    public static void main(String[] args) {
        UserRegister registerObj = new UserRegister();
        UserLogin loginObj = new UserLogin(registerObj);
        Start start = new Start(loginObj);
        start.begin();
    }
}
