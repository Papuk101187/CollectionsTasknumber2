import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing implements Programs {


    public Collection starting(String string) {


        Set<String> myHashSet = new HashSet<String>();

        Pattern pattern = Pattern.compile("(\\+38\\d{10}|38\\d{10}|0\\d{9}|8\\d{10})");
        Matcher matches = pattern.matcher(string);

        while (matches.find()) {
            String phone = Getcorrectphone(matches.group());
            myHashSet.add(phone);
        }

        return myHashSet;
    }

    private String Getcorrectphone(String group) {

        int lengs = group.length();
        String phone = group;

        switch (lengs) {

            case (13):
                break;
            case (12):
                phone = "+" + phone;
                break;
            case (11):
                phone = "+3" + phone;
                break;
            case (10):
                phone = "+38" + phone;
                break;
        }

        return phone;

    }


}
