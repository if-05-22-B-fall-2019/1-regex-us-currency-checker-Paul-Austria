//import sun.reflect.generics.reflectiveObjects.NotImplementedException;
//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {
    public static Matcher getMatcher(String usCurrencyString) {
        Pattern pattern = Pattern.compile("\\$\\s?\\d+(\\.\\d{1,2})?");
        return  pattern.matcher(usCurrencyString);
    }
}
