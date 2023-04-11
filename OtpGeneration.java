import java.util.*; 
public class OtpGeneration
{ 
  public static char[] generatorOTP(int length) 
  { 
    System.out.print("Your OTP is : "); 

    //Creating object of Random class
    Random obj = new Random(); 

    char[] otp = new char[length]; 

    for (int i=0; i<length; i++) 
    { 
      otp[i]= (char)(obj.nextInt(10)+48); 
    } 
    return otp; 
  } 
  public static void main(String[] args) 
  {  
    // If you want 6 digit otp just add length is 6 
    System.out.println(generatorOTP(6)); 
  } 
} 