package Filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public static void main(String[] args) throws IOException {

        System.out.println("Hii this is Chandan");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        String name = br.readLine(); // by default the buffer reader will take the input as String
        int num = Integer.parseInt(br.readLine());

        //buffer reader is a resouce so it is a good practice to close it
        br.close();
    }
}
