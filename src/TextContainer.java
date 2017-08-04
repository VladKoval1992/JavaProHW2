import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

@SaveTo(path= "c:\\save.txt")
class TextContainer {
    String massage = "Hello world!";

    @Saver
    public void save(String path) {
        try (Writer text = new BufferedWriter(new FileWriter(path))){
            try {
                text.write(massage);
                text.flush();
            } catch (IOException e){
                e.printStackTrace();
            } finally {
                text.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
