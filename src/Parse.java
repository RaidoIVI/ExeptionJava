import java.util.ArrayList;
import java.util.Arrays;

public class Parse {
    public static Integer ToInt(String value) {
        int result = 0;
        boolean sign = value.charAt(0) == 45;
        for (int i = sign ? 1 : 0; i < value.length(); i++) {
            if (!(value.charAt(i) >= 48 && value.charAt(i) <= 57)) {
                return null;
            } else {
                result = result * 10 + value.charAt(i) - 48;
            }
        }
        return sign ? -result : result;
    }

    public static Double ToDouble(String value) {
        Integer intPart = null;
        Integer fractionalPart = null;
        int dotIndex = 0;
        while ((dotIndex != value.length() - 1) && (value.charAt(dotIndex) != 46) && (value.charAt(dotIndex) != 44)) {
            dotIndex++;
        }
        if (dotIndex != value.length()-1) {
            intPart = ToInt(value.substring(0, dotIndex ));
            if (intPart == null) return null;
            fractionalPart = ToInt(value.substring(dotIndex + 1, value.length()));
            if (fractionalPart == null) return null;
            return intPart + (fractionalPart * Math.pow(0.1, value.length() - dotIndex-1));
        } else {
            intPart = ToInt(value);
            if (intPart == null) return null;
            return (double) intPart;
        }
    }
}

