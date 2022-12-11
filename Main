import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
              System.out.println("Введите выражение по примеру \"а + b\"" +
                                "\n числа могут быть либо римскими либо арабскими" +
                              "\n вводимые значения не должны превышать 10 и быть не меньше 1" +
                            "\n калькулятор работает только с целыми числами" +
                          "\n в случае с римскими числами результат не может быть меньше 1");
        Scanner expression = new Scanner(System.in);
        String str = expression.nextLine();
        str = str.toUpperCase();
        System.out.println(calc(str));

    }
    public static int checCalculate(int[] value, String operation, boolean flag)
    {
        if ((1 > value[0] || 10 < value[0]) || (1 > value[1] || 10 < value[1])){
            throw new IllegalArgumentException("Введенные операнды не соответстуют." +
                    " Числа должны быть в диапазоне от 1 до 10 включительно. Завершение работы.");
        }
        else {
            int res = 0;
            switch (operation) {
                case "+" -> res = value[0] + value[1];
                case "-" -> {
                    if (flag) {
                            if(value[0] - value[1] <= 0){
                                throw new IllegalArgumentException("Результат вычитания римских чисел не может" +
                                        " принимать нулевое или отрицательное значение");
                            } else {res = value[0] - value[1];}
                        }else {res = value[0] - value[1];}}
                case "/" -> res = value[0] / value[1];
                case "*" -> res = value[0] * value[1];
                default ->
                        throw new IllegalArgumentException("Введена неподдерживаемая" +
                                                        " арифметическая операция. Завершение работы.");
            }
            return res;
        }
    }

    private static boolean isInt(String[] values) {
        try {
            Integer.parseInt(values[0]);
            Integer.parseInt(values[2]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static String calc(String input) {
        String[] value = input.split(" ");
        if (value.length != 3) {
            throw new IllegalArgumentException("Введённая строка не подходит для калькулятора. Завершение работы.");
        }
        int otvet = 0;
        String res = "";
        if (isInt(value)) {
            otvet = checCalculate(new int[]{Integer.parseInt(value[0]),
                    Integer.parseInt(value[2])}, value[1], false);
            res = Integer.toString(otvet);
        } else {
            if (RomeNum.romeToArabic(value[0]) == 0 || RomeNum.romeToArabic(value[2]) == 0) {
                System.out.println("Введено не коректное значение операнда");
            } else {
               otvet = checCalculate(new int[]{RomeNum.romeToArabic(value[0]),
                        RomeNum.romeToArabic(value[2])}, value[1], true);
               res = RomeNum.arabicToRome(otvet);
                }
        }
        return res;
    }

}
                                " арифметическая операция. Завершение работы.");
            }
            return res;
        }
    }

    private static boolean isInt(String[] values) {
        try {
            Integer.parseInt(values[0]);
            Integer.parseInt(values[2]);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static String calc(String input) {
        String[] value = input.split(" ");
        if (value.length != 3) {
            throw new IllegalArgumentException("Введённая строка не подходит для калькулятора. Завершение работы.");
        }
        int otvet = 0;
        String res = "";
        if (isInt(value)) {
            otvet = checCalculate(new int[]{Integer.parseInt(value[0]),
                    Integer.parseInt(value[2])}, value[1], false);
            res = Integer.toString(otvet);
        } else {
            if (RomeNum.romeToArabic(value[0]) == 0 || RomeNum.romeToArabic(value[2]) == 0) {
                System.out.println("Введено не коректное значение операнда");
            } else {
               otvet = checCalculate(new int[]{RomeNum.romeToArabic(value[0]),
                        RomeNum.romeToArabic(value[2])}, value[1], true);
               res = RomeNum.arabicToRome(otvet);
                }
        }
        return res;
    }

}
