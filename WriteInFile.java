import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

    public void writer (String text){
        try {
//            მე ვიყენებ ლინუქს ოპერაციულ სისტემას და კოდის გასაშვებად საჭირო იქნება Path_ის შეცვლა ფაილებისათვის
            FileWriter fileWriter = new FileWriter("/home/revaztutarashvili/IdeaProjects/lecture10/template.txt");

            fileWriter.write(text);
            fileWriter.close();
            System.out.println("success write");
        } catch (IOException e) {
            System.out.println("something get wrong "+e.getMessage().getClass().getName());

        }
    }
}
