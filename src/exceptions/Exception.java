package exceptions;

import java.io.File;
import java.io.IOException;

public class Exception {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Diversas simulações de exception");
		
	}	
}
		/*
		abrirArquivo();
		
		/*
		try {
			criarArquivo();
		} catch (IOException e) {
				e.printStackTrace();
		}
		*/
		
		/*
	
	public static void criarArquivo() throws IOException {
		File file = new File("test.txt");
		System.out.println("Arquivo criado : " + file.canExecute());
		System.out.println("Arquivo criado");
	}
	
	// não vai abrir arquivo, modo como deve utilizar
	
	public static void abrirArquivo() throws IOException {
		File file = new File("teste.txt");
		//System.out.println("Arquivo criado" + file.createNewFile());
		System.out.println("Abrindo um arquivo");
		System.out.println("Executando a leitura do arquivo");
		//throw new Exception();
		System.out.println("Escrevendo no arquivo");
		System.out.println("Fechar o arquivo");
	}

	private void printStackTrace() {
		System.out.println("Fechar arquivo");
		
	}
	
	

	*/
	// formas de evitar exception criando meios de tratamento

		/*
		public static void abrirArquivo() {
			try{
				System.out.println("abrindo um arquivo");
				System.out.println("");
				throw new Exception();
				
			}catch (Exception e) {
				System.out.println("");
				e.printStackTrace();
				
			}finally {
				System.out.println("");
			}
		}

		
		
	}

	private void printStackTrace() {
		// TODO Auto-generated method stub
		
	}
	*/

