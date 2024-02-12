import java.util.Scanner;

public class Start {
    private UserLogin loginObj; // UserLogin nesnesi

    public Start(UserLogin loginObj) {
        this.loginObj = loginObj;
    }

    public void begin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1- Registration");
        System.out.println("2- Login");
        String method1 = sc.nextLine();
        switch (method1) {
            case "1" -> loginObj.obj.Register();
            case "2" -> loginObj.Login();
        }

        System.out.println("Giriş yapmak istiyor musunuz? - H/Y");
        String secim = sc.nextLine();
        if (secim.equalsIgnoreCase("H")) {
            loginObj.Login();
        } else {
            System.out.println("Program sonlandırıldı");
        }
    }
}
