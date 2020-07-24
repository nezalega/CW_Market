package CW_Market;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Call {

    private String name;
    private static String dateOfBirth;

    public static void dateOfBirth() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void userInfo() {
        if(checkDateOfBirth(dateOfBirth) == false) {
            setDateOfBirth("01/01/2020");
        }
        System.out.println("User " + name + " is " + "(" + dateOfBirth + ")");
    }

    public String getDateOfBirth(){
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public boolean checkDateOfBirth(String dateOfBirth){
        Pattern p = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3][0|1])/([0][1-9]|1[0-2])/\\d{2,4}");
        Matcher m = p.matcher(dateOfBirth);
        if(m.find()){
            return true;
        } else return false;
    }


}

