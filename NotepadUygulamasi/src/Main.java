import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // dosya oluşturma:
        File file = new File("notepad.txt");
        try {


            if (!file.exists()) {
                file.createNewFile();
            }
            // girilen verilerin dosyaya eklenebilmesi için:
            FileReader fileReader = new FileReader("notepad.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String okunanMetin = bufferedReader.readLine();
            bufferedReader.close();

            // girilen verilerin yazdırılabilmesi için:
            while ((okunanMetin= bufferedReader.readLine()) !=null) {
                System.out.println(okunanMetin);
            }
            bufferedReader.close();
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

        // kullanıcıdan veri almak için:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        scanner.close();

        // aldığımız veriyi dosyaya yazdırmak için :
        FileWriter fileWriter = new FileWriter("notepad.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(metin);
        printWriter.close();
        fileWriter.close();



    }


}