public class TypeConversion {
    public static void main(String[] args) {
        byte byteVar = 100;
        int intVar = 1000;
        double doubleVar = 12.34;
        float floatVar = 56.78f;

        // Преобразование сужения типов casting
        int intFromByte = byteVar;
        float floatFromDouble = (float) doubleVar;

        // Преобразование расширения типов casting не требуется
        byte byteFromInt = (byte) intVar;
        double doubleFromFloat = floatVar;

        // Вывод результатов преобразований
        System.out.println("intFromByte: " + intFromByte);
        System.out.println("floatFromDouble: " + floatFromDouble);
        System.out.println("byteFromInt: " + byteFromInt);
        System.out.println("doubleFromFloat: " + doubleFromFloat);
    }
}