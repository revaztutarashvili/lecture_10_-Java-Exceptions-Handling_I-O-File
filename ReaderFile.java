import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReaderFile {

    public void reader(){
        try {
//            მე ვიყენებ ლინუქს ოპერაციულ სისტემას და კოდის გასაშვებად საჭირო იქნება Path_ის შეცვლა ფაილებისათვის
            FileReader fileReader =new FileReader("/home/revaztutarashvili/IdeaProjects/lecture10/template.txt");
            Scanner scanner =new Scanner(fileReader);
            while (scanner.hasNextLine()){
                System.out.println("file contains:\n"+scanner.nextLine());
                fileReader.close();

            }
        } catch (IOException e) {
            System.out.println("something goes Wrong about read file"+e.getClass().getName());
        }
    }
}
