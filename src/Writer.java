/*
* File: app.js
* Author: Németh Angéla
* Copyright: 2023, Németh Angéla
* Group: Szoft 2-1 E
* Date: 2023-11-22
* Github: https://github.com/NemethAngela/
* Licenc: GNU GPL
*/

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
