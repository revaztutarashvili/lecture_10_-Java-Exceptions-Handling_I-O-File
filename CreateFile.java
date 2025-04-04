import java.io.File;

public class CreateFile {

    public void createFile() {
//        მე ვიყენებ ლინუქს ოპერაციულ სისტემას და კოდის გასაშვებად საჭირო იქნება Path_ის შეცვლა ფაილებისათვის
        File myObj = new File("/home/revaztutarashvili/IdeaProjects/lecture10/template.txt");
        try {
            if (myObj.createNewFile()){
                System.out.println("file created successfully");
            }
            else {System.out.println("file already exist");
            }

        } catch (Exception e) {
            System.out.println("Something wrong"+ e.getClass().getName());
        }
    }

}
