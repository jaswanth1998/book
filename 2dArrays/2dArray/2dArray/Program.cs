using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OnlineApp
{
    class Program
    {
        static void Main(string[] args)
        {


            // declaration
            int[,] cinema = new int[5, 5];
            // filling with data
            cinema[2, 2] = 1; // center
            for (int i = 1; i < 4; i++) // fourth row
            {
                cinema[i, 3] = 1;
            }
            for (int i = 0; i < 5; i++) // the last row
            {
                cinema[i, 4] = 1;
            }

            for (int j = 0; j < cinema.GetLength(1); j++)
            {
                for (int i = 0; i < cinema.GetLength(0); i++)
                {
                    Console.Write(cinema[i, j]);
                }
                Console.WriteLine();
            }
        }
    }
}