import java.util.*;

public class PersonalComputer<T> {

    private Programs program;
    Set<String> myHashSet = new HashSet<String>();


    PersonalComputer(Programs program) {
        this.program = program;
    }

    public void cdrom(String information) {
        myHashSet = (Set<String>) program.starting(information);
    }

    public void checkRecord() {
        for (Object o : myHashSet) {
            System.out.println(o);
        }
    }


}
