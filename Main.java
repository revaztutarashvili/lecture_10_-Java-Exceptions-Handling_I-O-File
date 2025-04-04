public class Main {

    public static void main(String[] args) {
CreateFile createFile = new CreateFile();
WriteInFile writeInFile = new WriteInFile();
ReaderFile readerFile=new ReaderFile();

createFile.createFile();
writeInFile.writer("Hello, now i can write in .txt file any text what i want..");
readerFile.reader();

    }
}

