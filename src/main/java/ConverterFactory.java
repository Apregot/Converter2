import ru.converter.CelsiusToFahrenheitConverter;
import ru.converter.CelsiusToKelvinConverter;
import ru.converter.Converter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ConverterFactory {
    private final Set<String> fahrenheitCountries = new HashSet<>(Arrays.asList("BS","US","BZ","KY","PW"));

    public Converter getConverter(MyLocale myLocale){
        if(fahrenheitCountries.contains(myLocale.getLocale().getLanguage().toUpperCase())){
            System.out.println("Создан конвертер из Цельсиев в Фаренгейты.");
            return new CelsiusToFahrenheitConverter();
        }
        else{
            System.out.println("Создан конвертер из Цельсиев в Кельвины.");
            return new CelsiusToKelvinConverter();
        }
    }

}
