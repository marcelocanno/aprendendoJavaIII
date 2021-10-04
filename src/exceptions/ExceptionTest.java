package exceptions;

public class ExceptionTest extends Exception{

	public static void main(String[] args) {
		
			System.out.println("Esplicando as exception");
	}
}
	
	/*
		try {
			divisao(10,0);
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	private static void divisao(int num1, int num2) {
		if(num2 == 0) {
			throw new IllegalArgumentException("passe valor diferente de 0 para o num2");
		}
		int result = num1/num2;
		System.out.println(result);
	}
}





		/*
		Object o = null;
		/*
		int a = 10;
		int b = 0 ;
		if(b != 0) {
			int c = a/b;
			System.out.println(c);
		}
		*/
		
		
		
		/*
		int[] a = new int[2];
		System.out.println(a[2]);
		*/
		
		// demonstração de exception em runTime
		// exception aparece na hora de runTime
		// tratando exception
		/*
		try {
			int[] a = new int[2];
			System.out.println(a[2]);
			System.out.println("Tratando depois da possivel exception");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();		
		}
		System.out.println("fora do bloco catch");
	}
	*/

