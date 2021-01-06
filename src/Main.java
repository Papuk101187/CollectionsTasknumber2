import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String args[]) {

        String string = "3806336673783809756672834545380634372343380633667378380987874536380667443723380634372343";
        PersonalComputer personalComputer = new PersonalComputer(new Parsing());
        personalComputer.cdrom(string);
        personalComputer.checkRecord();


    }


}
