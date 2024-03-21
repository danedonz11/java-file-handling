import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

class FileWriterProgram{

public static void main(String[] args){
    System.out.println("Hello World!");
    File textFile = new File("main.txt");

    try {

        FileWriter writer = new FileWriter(textFile);
        writer.write("Hello Worlds");
        writer.close();
        System.out.println("printed successfully");


    } catch (Exception e) {
        System.out.println("Nag error sya");
        e.printStackTrace();
    }
}
}
