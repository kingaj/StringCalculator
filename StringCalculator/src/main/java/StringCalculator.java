public class StringCalculator
{

    public static int count = 0;

    class NagitiveNumberException extends Exception
    {
        public NagitiveNumberException(String str)
        {
            System.out.println(str);
        }
    }

    public int getCalledCount() {
        return count;
    }

    public int add(String number)
    {
        int sum = 0;

        try
        {
            count++;

            number = number.replace("\\s","");

            number = number.replace("\n",",");

            number = number.replace("//;",",");

            number = number.replace(";",",");

            if(number.trim().length() == 0)
                return 0;

            if(!number.contains(","))
                return Integer.parseInt(number);

            for(String num:number.split(","))
            {
                if(num.trim().length() > 0  && (!num.contains(";") || !num.contains("\n") || !num.contains(",")))
                {
                    int val = Integer.parseInt(num);

                    if(val > 0)
                    {
                        sum += val;
                    }
                    else
                    {
                        throw new NagitiveNumberException("Number is negative");
                    }
                }
            }
        }
        catch (NagitiveNumberException exception)
        {
            System.out.println(exception);
        }

        return sum;
    }
}