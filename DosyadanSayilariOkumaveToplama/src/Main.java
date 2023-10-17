import java.io.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        // sayilar.txt adında dosya oluşturma:
      File file =new File("sayilar.txt");
      if(!file.exists()){
          file.createNewFile();
      }
      //sayilar.txt dosyasına veri ekleme:
      String val="5\n" +
              "10\n" +
              "20\n" +
              "12\n" +
              "33";
      FileWriter fileWriter = new FileWriter(file,false);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      bufferedWriter.write(val);
      bufferedWriter.close();

      //dosyadan veri okuma:
        FileReader fileReader = new FileReader(file);
        String line;
        int sum=0;

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) !=null){
            System.out.println(" "+line);
            sum+=Integer.parseInt(line);

        }
        bufferedReader.close();
        fileReader.close();

        System.out.println(" --***--  ");
        System.out.println("sayılar.txt dosyasının toplamı:   "   +sum);


    }
}