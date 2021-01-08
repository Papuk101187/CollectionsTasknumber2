import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String args[]) {

        String string = "+380633667378 380633667378 80633667378 0633667378 380634741526 0634741526" +
                "380936961527";

        PersonalComputer personalComputer = new PersonalComputer(new Parsing());
        personalComputer.cdrom(string);
        personalComputer.checkRecord();

    }


}
