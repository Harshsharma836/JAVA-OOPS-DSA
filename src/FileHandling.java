import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\harsh\\OneDrive\\Desktop";
        File file = new File(directoryPath , "file.txt");
//        try{
//            if(file.createNewFile()){
//                System.out.println("File has Created");
//            }
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        // Writing the data into file
//        try{
//            FileWriter fileWrite = new FileWriter("C:\\Users\\harsh\\OneDrive\\Desktop\\file.txt");
//            fileWrite.write("Hello How are you ");
//            System.out.println("Data entred");
//            fileWrite.close();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }



        // Printing the data from a file
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
