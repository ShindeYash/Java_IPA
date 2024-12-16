import java.io.*;

public class file_handling {
    public static void main(String[] args) throws IOException {
        //              * Create File *              //
        File f = new File("C:\\Users\\YASH\\Desktop\\file_handling.txt");
        if (f.createNewFile()){
            System.out.println("File Successfully Created ..... ");
        }
        else{
            System.out.println("File Already Exists.");
        }

        // some other file class methods
//        System.out.println(f.canExecute());
//        System.out.println(f.isFile());
//        System.out.println(f.canWrite());
//        System.out.println(f.setWritable(true));
//        System.out.println(f.canWrite());


        //                * Write in File *                //

        FileWriter fw = new FileWriter("C:\\Users\\YASH\\Desktop\\file_handling.txt");
        fw.write("Yash is gonna become the best software professional in the world.");
        fw.close();  // Closing FileWriter to flush the content


        //                * Read from File *               //

        FileReader fr = new FileReader("C:\\Users\\YASH\\Desktop\\file_handling.txt");
        int character;

        System.out.println("File Content: ");
        while ((character = fr.read()) != -1) {
            System.out.print((char) character);  // Cast integer to character
        }
        fr.close();  // Closing FileReader



    }
}
