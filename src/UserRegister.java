import java.util.Scanner;

public class UserRegister {
    public String name;
    public String email;

    public String password;
    public String phoneNumber;
    public  void Register(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Zəhmət olmasa qeydiyyatdan keçin ");
        System.out.println("-------------------------------- ");

        System.out.println("Adınızı daxil edin:");
        name=sc.nextLine();
        System.out.println("EMail unvanınızı daxil edin:");
        email=sc.nextLine();
        System.out.println("Mobil nömrənizi daxil edin:");
        phoneNumber=sc.nextLine();
        System.out.println("Parolunuzu daxil edin:");
        password=sc.nextLine();
        System.out.println("Qeydiyyata alındınız,Təbriklər!!!!");
    }
}
