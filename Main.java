package com.company;

import java.lang.*;
class Exception1  extends Exception{
    public Exception1 (String str){
        super(str);
    }
}
class Exception2  extends Exception{
    public Exception2 (String str){
        super(str);
    }
}
class Exception3  extends Exception{
    public Exception3 (String str){
        super(str);
    }
}
public class Main {
    public static void callException(int num) throws Exception1,Exception2,Exception3{
        if(num == 1){
            throw new Exception1("call Exception1");
        }
        else if(num == 2){
            throw new Exception2("call Exception2");
        }
        else if (num== 3){
            throw new Exception3("call Exception3");
        }
        else{
            throw new NullPointerException();
        }
    }
    public static void main(String args[]){
        try {
            System.out.println("in try block");
            callException(2);
        }
        catch(Exception1 |Exception2 |Exception3 e){
            System.out.println("in catch block");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("executing finally..");
        }
    }
}