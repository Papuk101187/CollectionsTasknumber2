import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parsing implements Programs {




    public Collection starting(String string) {


        Set<String> myHashSet = new HashSet<String>();

        Pattern pattern = Pattern.compile("(38\\d{10})");
        Matcher matches = pattern.matcher(string);

        while (matches.find()){
            myHashSet.add(matches.group());
        }

        return myHashSet;
    }







}
