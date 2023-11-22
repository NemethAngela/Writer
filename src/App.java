/*Feladat 004
Adott a következő interfész:

public interface Writable {
    void writeContent(String content);
}
Készítsen osztályt Writer néven, ami megvalósítja az interfészt. Az osztály, írja fájlba a kapott szöveget.
 */

public class App {
    public static void main(String[] args) throws Exception {

        String filePath = "c:\\Angéla\\KULKER\\2_ÉVF\\Asztali_mobil_alk_Sallai\\Writer\\writeoutput.txt";
        String content = "Lorem ipsum";

        Writer writer = new Writer(filePath);
        writer.writeContent(content);
    }
}
