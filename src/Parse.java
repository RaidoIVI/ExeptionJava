
public class Parse {
    public static int ToInt(String value) throws ParseException {
        if (value.isEmpty()) throw new ParseException();
        int result = 0;
        boolean sign = value.charAt(0) == 45;
        for (int i = sign ? 1 : 0; i < value.length(); i++) {
            if (!(value.charAt(i) >= 48 && value.charAt(i) <= 57)) {
                throw new ParseException();
            } else {
                result = result * 10 + value.charAt(i) - 48;
            }
        }
        return sign ? -result : result;
    }

    public static Double ToDouble(String value) throws ParseException {
        if (value.isEmpty()) throw new ParseException();
        int intPart;
        int fractionalPart;
        int dotIndex = 0;
        while ((dotIndex != value.length() - 1) && (value.charAt(dotIndex) != 46) && (value.charAt(dotIndex) != 44)) {
            dotIndex++;
        }
        if (dotIndex != value.length() - 1) {
            intPart = ToInt(value.substring(0, dotIndex));
            fractionalPart = ToInt(value.substring(dotIndex + 1));
            if (fractionalPart < 0) throw new ParseException();
            return intPart + fractionalPart * Math.pow(0.1, value.length() - dotIndex - 1);
        } else {
            intPart = ToInt(value);
            return (double) intPart;
        }
    }

    static class ParseException extends Exception {
        ParseException() {
            super("Распарсить не получилось");
        }
    }
}

