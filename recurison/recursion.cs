using System;    
namespace InterviewQuestionPart4    
{    
    class Program    
    {    
        static void Main(string[] args)    
        {    
            Console.WriteLine("Please Enter a Number");    
    
            //read number from user    
            int number =Convert.ToInt32(Console.ReadLine());    
    
            //invoke the static method    
            double factorial = Factorial(number);    
    
            //print the factorial result    
            Console.WriteLine("factorial of"+number+"="+factorial.ToString());    
    
        }    
        public static double Factorial(int number)    
        {    
            if (number == 0)    
                return 1;    
    
            double factorial = 1;    
            for (int i = number; i >= 1;i-- )    
            {    
                factorial = factorial * i;    
            }    
            return factorial;    
        }    
    }    
}