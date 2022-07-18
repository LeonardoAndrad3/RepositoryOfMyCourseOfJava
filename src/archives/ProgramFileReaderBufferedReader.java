package archives;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFileReaderBufferedReader {

	public static void main(String[] args) {
		String path = ("c:\\Users\\leona\\eclipse-workspace\\courseJava\\src\\archives\\in.txt");


		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// try com "()" são para abrir recurso e declarar ações no try sem precisar fechar as variaveis
			String line = br.readLine();

			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}


	}

}
