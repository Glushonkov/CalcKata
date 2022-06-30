import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {

    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int Num1,Num2;
        char operation;
        String str;
        String strarr[];

        System.out.println("\nКалькулятор для Kata Academy \nГлушонков Антон Романович\n\nМожно использовать только римские или только арабские цифры \n" +
                "Числа должны быть в диапозоне [1;10]\nДля написания римских цифр используйте английский алфавит");
        while (Boolean.TRUE)
        {   System.out.println("   Для выхода из приложения нажмите 0\n    Введите выражение через пробел:" );
            str=scan.nextLine();
            strarr=str.split(" ");
            if (strarr.length==3)

            { try{
            Num1=Integer.parseInt(strarr[0]);
            if (Num1==0)
                break;
            operation=strarr[1].charAt(0);
            Num2=Integer.parseInt(strarr[2]);
            if (Logic.oneten(Num1,Num2))
                System.out.println(Logic.operators(Num1,Num2,operation));

        }
        catch ( NumberFormatException | ArrayIndexOutOfBoundsException e){
            try{
                Num1=Roman.romanToArabic(strarr[0]);
                operation=strarr[1].charAt(0);
                Num2=Roman.romanToArabic(strarr[2]);
                if (Logic.oneten(Num1,Num2))
                    System.out.println(Roman.arabicToRoman(Logic.operators(Num1,Num2,operation)));

            }
            catch (IllegalArgumentException  e1){
                throw new Exception("Разные типы исчисления/Некорректная запись");
            }
        }}
            else
                throw new Exception("Неправильный формат ввода, читайте инструкцию");
        }
        }
}

