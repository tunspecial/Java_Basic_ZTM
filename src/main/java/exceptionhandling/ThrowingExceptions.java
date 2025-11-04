package exceptionhandling;

import java.io.IOException;

public class ThrowingExceptions {
  public static void main(String[] args) throws IOException{
    divide(10,0);
  }

  public static void divide(int a , int b) throws IOException{
    if (b == 0){
        throw new IOException("Can not divided by Zero");
    }
    System.out.println(a/b);
  }
}
