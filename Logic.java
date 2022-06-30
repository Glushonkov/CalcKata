public class Logic {
    public static int operators(int firstnum, int secondnum, char operator) throws Exception {
        int result=0;
        switch (operator)
        {case '+': result=firstnum+secondnum;
            break;
         case '-': result=firstnum-secondnum;
            break;
         case '*': result=firstnum*secondnum;
            break;
         case '/': result=firstnum/secondnum;
            break;

        }
        if (operator!='+' && operator!='-' && operator!='*' && operator!='/' )
            throw new Exception("Недопустимый математический оператор");
        return result;}
    public static boolean oneten(int num1,int num2)
    {   if (num1>0 && num1<11 && num2>0 && num2<11)
          return Boolean.TRUE;
        else
            throw new ArithmeticException ("Числа должны быть в диапазоне [1;10]");


        }}

