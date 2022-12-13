import java.io.IOException;
public enum RomeNum {
    I(1, "I"), II(2, "II"), III(3,"III"), IV(4, "IV"),
    V(5, "V"), VI(6,"VI"), VII(7,"VII"), VIII(8,"VIII"),
    IX(9, "IX"), X(10, "X"), XL(40, "XL"),
    L(50, "L"), XC(90, "XC"), C(100, "C");

    int num;
    String name;

    private RomeNum(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum(){return num;}

    public String getName(){return name;}

    static int romeToArabic(String string) {
        int y = 0;
            for (RomeNum x : RomeNum.values()) {
                if (x.getName().equals(string)) {
                    y = x.getNum();
                }
            }
        return y;
    }

    static String arabicToRome(int res){
        String str = "";
        while(res >= 100){
            str += "C";
            res -= 100;
        }
        while(res >= 90){
            str += "XC";
            res -= 90;
        }
        while(res >= 50){
            str += "L";
            res -= 50;
        }
        while(res >= 40){
            str += "XL";
            res -= 40;
        }
        while(res >= 10){
            str += "X";
            res -= 10;
        }
        while(res >= 9){
            str += "IX";
            res -= 9;
        }
        while(res >= 5){
            str += "V";
            res -= 5;
        }
        while(res >= 4){
            str += "IV";
            res -= 4;
        }
        while(res >= 1){
            str += "I";
            res -= 1;
        }
        return str;
    }
}
