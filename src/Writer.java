import java.io.FileWriter;
import java.io.IOException;

public class Writer implements IWritable {

    String myFilePath;

    public Writer(String filePath) {
        this.myFilePath = filePath;
    }

    @Override
    public void writeContent(String content) {
        try {
            FileWriter writefile = new FileWriter(myFilePath);
            writefile.write(content);
            writefile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
