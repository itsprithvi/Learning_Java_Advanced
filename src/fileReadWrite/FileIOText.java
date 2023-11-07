package fileReadWrite;


import java.io.*;

public class FileIOText {
    public static void main(String[] args) throws IOException {

//        BufferedWriter writer = null;
        String[] arr = {"prithvi", "raj"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file");

            for(String s : arr) {
                writer.write("\n" +s);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
