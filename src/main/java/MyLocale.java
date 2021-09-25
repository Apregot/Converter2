import java.util.Locale;

public class MyLocale {
    Locale locale;
    MyLocale(String localeTag){

        if(localeTag.equalsIgnoreCase("default"))
            locale =  Locale.getDefault();
        else
            locale = new Locale(localeTag);
        }
    Locale getLocale(){
        return locale;
    }
}
