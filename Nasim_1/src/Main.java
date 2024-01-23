import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       AppRun();


    }

    static void AppRun(){
        char[] SaveName=InpuName();
        char[] SavePassword=InputPassword();

        Scanner in = new Scanner(System.in);
        System.out.println("Input Your Name ");
        String name=in.nextLine();
        System.out.println("Input Your Password ");
        String password=in.nextLine();


        boolean flag= CheekLogIn(name,password,SaveName,SavePassword);
        if(flag) System.out.println("Log in successful  ");
        else System.out.println("Log In Valid");


    }
static char[] UserName(String name){

    return name.toCharArray();
}

static char[] UserPassword(String password){
    return password.toCharArray();
}
static boolean CheekLogIn(String name, String password, char[] mname, char[] mpassword ){
   char[] arrname= UserName(name);
   char[] arrpassword= UserPassword(password);
    return Arrays.equals(arrname, mname) && Arrays.equals(arrpassword, mpassword);
}

static char[] InpuName(){
    Scanner in = new Scanner(System.in);
    System.out.print("Name : ");
    return in.nextLine().toCharArray();


}
static char[] InputPassword(){
    Scanner in = new Scanner(System.in);
    System.out.print("Password : ");
    return in.nextLine().toCharArray();
}

}