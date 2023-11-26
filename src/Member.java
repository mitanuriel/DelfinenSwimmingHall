import java.time.*;
import java.io.*;

public class Member {

    private String name;
    LocalDateTime birthday;
    private File membersFile;
    
    private Membership membership = new Membership();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    

    public void saveFile (){
        //?
        // TODO: Specify to which directory file should be saved to.
        String directory = "directory to save file";
        File membersFile = new File(directory);
    }











}
