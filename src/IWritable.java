/*
* File: app.js
* Author: Németh Angéla
* Copyright: 2023, Németh Angéla
* Group: Szoft 2-1 E
* Date: 2023-11-22
* Github: https://github.com/NemethAngela/
* Licenc: GNU GPL
*/

import java.io.IOException;

public interface IWritable {
    public void writeContent(String content) throws IOException;
}
