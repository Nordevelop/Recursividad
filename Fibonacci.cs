using System;
 
namespace fibonacci
{
	class Program
	{
		static void Main(string[] args)
		{
			byte CAN, K;
			int A, B, C;
			string linea;
 
			Console.Write("hasta que Nro desea hacer fibonacci: ");
			linea = Console.ReadLine();
 
			CAN = byte.Parse(linea);
			A = 1;B = 1;
			Console.Write(A + " " + B + " ");
			for(K = 3; K <= CAN; K++){
				C = A + B;
				Console.Write(C + " ");
 
				//intercambio de valores
				A = B;
				B = C;
			}
			Console.WriteLine();
		}
	}
}
