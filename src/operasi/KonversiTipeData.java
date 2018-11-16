public class KonversiTipeData{
    public static void main(String[] args){
        byte varByte = 120;
        System.out.println("var byte adalah : " + varByte);     //tipe primitif inisiasi beda dengan tipe standar
        short varShort = varByte;
        System.out.println("var byte ke short adalah : " + varShort);
        int varInteger = varShort;
        System.out.println("var Short ke integer adalah : " + varInteger);
        long varLong = varInteger;
        System.out.println("var integer ke long adalah : " + varLong);
        float varIntToFloat = varInteger;
        System.out.println("var integer ke float adalah : " + varIntToFloat);
        float varLongToFloat = varLong;
        System.out.println("var byte adalah : " + varLongToFloat);
        double varFloatToDouble = varIntToFloat;
        System.out.println("var byte adalah : " + varFloatToDouble);
        double varIntToDouble = varInteger;
        System.out.println("var byte adalah : " + varIntToDouble);
        double varLongToDouble = varLong;
        System.out.println("var byte adalah : " + varLongToDouble);
    }
}