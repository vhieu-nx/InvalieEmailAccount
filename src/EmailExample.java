import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public boolean validate1(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher  matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
