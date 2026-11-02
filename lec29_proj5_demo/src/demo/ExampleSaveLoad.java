package lec29_proj5_demo.src.demo;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

import java.io.File;

public class ExampleSaveLoad {
    void main() {
        String filename = "name.txt";
        File file = new File(filename);

        // Step 1: Check if the file exists and read the saved name
        if (file.exists()) {
            In in = new In(file);
            if (in.hasNextLine()) {
                String savedName = in.readLine();
                IO.println("Hello, the last time you ran this program, your name was " + savedName);
            } else {
                IO.println("I don't know your name.");
            }
        } else {
            IO.println("I don't know your name.");
        }

        // Step 2: Prompt the user for their name
        IO.print("Please enter your name: ");
        In keyboard = new In();  // Reads from standard input
        String currentName = keyboard.readLine();

        // Step 3: Save the new name to the file
        Out out = new Out(filename);
        out.println(currentName);
        out.close();
    }
}