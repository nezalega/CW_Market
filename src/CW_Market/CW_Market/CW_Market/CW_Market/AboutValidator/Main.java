package CW_Market.AboutValidator;

public class Main {

    public static void main(String[] args) {

        Validator emailValidator =  new EmailValidator();
        Validator belPhoneValidator = new BelarusPhoneValidator();
        Validator americanPhoneValidator =  new AmericanPhoneValidator();

        System.out.println(emailValidator.validate("academy.@acad.emy.by"));
        System.out.println(americanPhoneValidator.validate("+111111111111"));
        System.out.println(belPhoneValidator.validate("+375553333333"));

    }
}
