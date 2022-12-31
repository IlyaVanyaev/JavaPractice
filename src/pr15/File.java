package pr15;

import java.io.*;
import java.util.Scanner;

public class File {


    public void input(String name){
        try(FileWriter w = new FileWriter(name,false)){
            Scanner in = new Scanner(System.in);
            System.out.println("type some data:");
            String data = in.nextLine();
            w.append(data);
            w.flush();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void output(String name){
        try(BufferedReader r = new BufferedReader(new FileReader(name))){
            String line;
            while((line = r.readLine()) != null) System.out.println(line);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void addInput(String name){
        try(FileWriter w = new FileWriter(name,true)){
            Scanner in = new Scanner(System.in);
            System.out.println("add some data:");
            String data = in.nextLine();
            w.append(data);
            w.flush();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
