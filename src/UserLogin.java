import java.util.Scanner;

public class UserLogin {
    public static UserRegister obj;
    public UserLogin(UserRegister obj){
        this.obj=obj;
    }
    public void Login(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Giris etmek ucun melumatlarinizi daxil edin:");
        System.out.println("Email");
        String checkEmail=sc.nextLine();

        System.out.println("Parol");
        String checkPassword=sc.nextLine();

        if(obj.email.equals(checkEmail) && obj.password.equals(checkPassword)){
            System.out.println("Sisteme ugurla giris etdiniz!!!");
        }else{
            System.out.println("daxil etdiyiniz parol ve ya email adresi yanlisdir!!!");
        }
    }
}
