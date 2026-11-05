package aulaStreams;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestandoOutputStreams {

    static void main() {

        //Stream para escrever dados em um arquivo
        try(FileOutputStream fw = new FileOutputStream("./src/aulaStreams/saida.txt", true)) {

            //Stream para saída de dados
            DataOutputStream dos = new DataOutputStream(fw);

            dos.writeBytes("Primeira Linha;\n"); //Escreve uma String (conjunto de bytes)

            for (int i = 2; i <= 100; i++) dos.writeBytes("Linha " + i + ";\n"); //Escreve +99 linhas

            dos.close(); //Fecha a stream de saída
            System.out.println("Terminou");

        } catch(IOException ex) {
            System.out.println(ex.getMessage());  //Saída de erro
        }
        //Ao término do try-with-resources, o fw é automaticamente fechado
    }

}
