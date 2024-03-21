import java.io.File;
import java.io.IOException;

class FileCreation{

public static void main(String[] args){
    System.out.println("Hello World!");
    File textFile = new File("main.txt");

    try {
        if(textFile.createNewFile()){
            System.out.println("File is Created");
        } else {
            System.out.println("File is existing already");
        }
    System.out.println("File successfully!");

    } catch (IOException e) {
 System.out.println("Nag error sya");

}
    }
}