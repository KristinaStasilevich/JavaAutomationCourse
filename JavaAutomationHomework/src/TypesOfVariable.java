public class TypesOfVariable {
    public static void main(String[] args) {
        byte maxByte = 127;
        short minShort = -32768;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        float a = 110.56f;
        double b = 1.2;
        boolean isWeatherGood = true;
        char numberChar = '№';
        String referenceType = "String is a reference type variable";
        System.out.println("Значение переменной примитивного типа byte: " + maxByte);
        System.out.println("Значение переменной примитивного типа short: " + minShort);
        System.out.println("Значение переменной примитивного типа int: " + maxInt);
        System.out.println("Значение переменной примитивного типа long: " + maxLong);
        System.out.println("Значение переменной примитивного типа float: " + a);
        System.out.println("Значение переменной примитивного типа double: " + b);
        System.out.println("Значение переменной примитивного типа boolean: " + isWeatherGood);
        System.out.println("Значение переменной примитивного типа char: " + numberChar);
        System.out.println("Значение переменной ссылочного типа String: " + referenceType);

    }
}