import java.io.File;
import java.util.Scanner;

public class ReadFromFile{
    Scanner readFile;

    public ReadFromFile(String file){
        File fileToRead = new File(file);
        try {
            readFile = new Scanner(fileToRead);
        }catch(Exception e){
            System.out.println("file not found");
        }
    }


    public int getLinesAmount(){
        int numberOfLines = 0;
        while(readFile.hasNextLine()){
            numberOfLines += 1;
            readFile.nextLine();
        }
        return numberOfLines;
    }

}
