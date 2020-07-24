package CW_Market.AboutValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator extends Validator {

    private Pattern p = Pattern.compile("^\\+1[\\d]{11}$");

    @Override
    public boolean validate(String vString) {
        Matcher m = p.matcher(vString);
        return m.find();
    }
}
