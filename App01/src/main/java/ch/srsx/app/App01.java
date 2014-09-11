package ch.srsx.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Constructor of App01");
        
        Pattern p = Pattern.compile("^(?!\\s*$).+");
        Matcher m = p.matcher("1.5.8");
        boolean b = m.matches();
        System.out.println("Match: " + b);
    }

}
