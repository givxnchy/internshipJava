package primitive_conv;

public class ConvClass {
    byte primConvertToByte(byte b){
        byte result = 0;
        result = (b+1000)*2;
        return result;
    }

    int primConvertToInt(int i){
        int result = 0;
        result = (i+2147483648)*2;
        return result;
    }

    long primConvertToLong(long l){
        long result = 0;
        result = (l+9223372036854775807)*10000000000;
        return result;
    }

    //?????????????
    //Надо ли сделать main и фикс проблем в телах методов
}