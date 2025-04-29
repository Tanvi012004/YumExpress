
import java.util.Base64;




public class Demo {
    
    public static String getEncryptedPassword(String pwd){
        Base64.Encoder en= Base64.getEncoder();
        String encrptedPwd=en.encodeToString(pwd.getBytes());
        return encrptedPwd;
    } 
    
    public static String getDecryptedPassword(String pwd){
        Base64.Decoder dec=Base64.getDecoder();
        byte[]arr=dec.decode(pwd.getBytes());
        String decryptedPwd=new String(arr);
        System.out.println(decryptedPwd);
        return decryptedPwd;
    }
    public static void main(String[] args) {
        String pwd="garima@123";
        String s=Demo.getEncryptedPassword(pwd);
        System.out.println(s);
        String r=Demo.getDecryptedPassword(s);
        System.out.println(r);
    }
}
