import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C://java/test.txt");
            int i;
            while((i=fis.read()) != -1){
                System.out.print(i+",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        // Запись в файл
        try {
            FileOutputStream fos = new FileOutputStream("C://java/test.txt", true);
            String text = "Hello";
            byte[] buffer = text.getBytes();
            fos.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}





