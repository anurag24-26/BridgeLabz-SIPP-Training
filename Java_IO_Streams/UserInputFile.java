package Java_IO_Streams;

import java.io.*;
class UserInputFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = new FileWriter("userinfo.txt");

        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.print("Enter your age: ");
        String age = reader.readLine();
        System.out.print("Enter favorite programming language: ");
        String lang = reader.readLine();

        writer.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + lang);
        writer.close();
        System.out.println("User info saved.");
    }
}