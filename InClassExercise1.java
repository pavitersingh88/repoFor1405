/*
* 0. Write a for loop to print 1, 3, 5, 7, 9, 11.
* 1. Flip a sign inside the for loop so it prints 1 -3  5 -7  9 -11.
* 2. Separately, experiment with math.pow() and math.factorial() (or if working in Java,
*    write your own.)
*/


/**
 * @author Zaki Asmat
 * @version "1.2.3"
 */
public class InClassExercise1
{
    /**
     The main function.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("In Class Assignment 1 Components  is are : ");
        InClassExercise1.print1357();   // because print1357 is declared as static
        print1197531();
        print54321();
        printMulTableFor4();
        print1_35_7();
        System.out.println(Math.pow(2, 3));
        factorial(5);
        power(5, 3);
        //sum(5);
        //putAllTogether();
    }

    /**
     Print 1 3 5 7 9 11
     *
     */
    public static void print1357()
    {
        int i;
        for(i = 1; i < 12; i += 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     Print 11 9 7 5 3 1
     *
     */
    public static void print1197531()
    {
        int i;
        for(i = 11; i > 0; i -= 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     Print 5 4 3 2 0 -1 -2
     *
     */
    public static void print54321()
    {
        int i;
        for(i = 5; i > -3; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    /**
     Print the multiplication table for 4.
     4 8 12 16...40
     *
     */
    public static void printMulTableFor4()
    {
        int i;
        for(i = 4; i < 41; i += 4)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    /**
     Print 1 -3  5 -7  9 -11
     *
     */
    public static void print1_35_7()
    {
        int sign = 1;
        int i;
        for(i = 1; i < 12; i += 2)
        {
            System.out.print(sign * i + " ");
            sign *= -1;
        }
        System.out.println();
    }
    
    /**
     Print factorial of a number.
     For example 5! = 120
     *
     * @param num
     */

    public static void factorial(int num)
    {
        // int result = 1;
        // for(i = 2; i < num + 1; i++)
        // {

        // }
        // System.out.println();
    }
    
    /**
    Write your own pow() method.
     * @param num
     * @param exponent
     * @return the result
    */
    public static int power(int num, int exponent)
    {
        int result = 1;
        int i;
        for(i = 1; i < exponent + 1; i++)
        {
            result *= num;
        }
        System.out.println(result);
        return result;
    }
    
    /**
     Write a method to sum up 0-5 (which is 15).
     *
     * @author Lebron James
     * @param  num: number of elements starting at 0.
     * @throws IllegalArgumentException or some other kind of exception
     * @return the sum
     * @see    "Mr. Lebron James for more info"
     * @since  Version 1.2
     */
    public static int sum(int num)
    {
        int result = 0;
        int i;
        for(i = 1; i < num; i++)
        {
            result += i;
        }
        System.out.println(result);
        return result;
    }
    
    /**
     incorporate your own methods in the solution.
     *
     * @param num
     */
    public static void putAllTogether(int num)
    {
        int result = 0;
        int i;
        for(i = 1; i < num; i++)
        {

        }
        System.out.println(result);
    }
    
    //
    
}

/*
tools/options/java/maven/global execution options: -q
view/show inline hints

*/
/*
    for(fjdskjflkj) {
        if() {
            sdfskdfjs
            for() {
                dsdfdsf
            }
        } 
        else {
            sdfksdfkldjs();
        }
    }

    for(fjdskjflkj) 
    {
        if() 
        {
            sdfskdfjs
            for() 
            {
                dsdfdsf
            }
        } 
        else 
        {
            sdfksdfkldjs();
        }
    }
*/
/*
* Function name:
* Synopsis     :
* Inputs       :
* Output       :
* Constrains   :
* Error code   :
*/
