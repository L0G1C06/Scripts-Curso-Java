// Excluindo um arquivo .txt

import java.io.File;


public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("O seguinte arquivo foi deletado com sucesso: " + myObj.getName());
        } else {
            System.out.println("Falha ao deletar o arquivo.");
        }
    }
}
