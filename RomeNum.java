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
        String liter = "";
        RomeNum[] x = RomeNum.values();
        while(100 >= res && res > 0){
            for (int i = x.length - 1; i >= 0 ; i--){
                if(x[i].getNum() <= res){
                    while(x[i].getNum() <= res){
                        liter +=x[i].getName();
                        res -= x[i].getNum();
                    }
                }
                }
        }
        return liter;
    }
}
    
