package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = "Fwelkmgwelw tglawmlgtmwalt,g mtlw4eg wgl;a4gmt tmg waltgm wl; tglt ;w4wg amglatg,t4gw.tw4e tgwetwgwatkm.";
        String text2= "Htrsdjtsi ehjirhjheo hjerioje aldklfewkljw lfejwfewkm,lwrer rwerfe.rewrerrew  erwrwewekgehtoj; ethehthe.";
        writeToFile(text,"file1.txt");
        writeToFile(text2,"file2.txt");
        readFromFiles("file1.txt","file2.txt");
        System.out.println();
        boolean b = findWord("file.txt","sea");
        System.out.println(b);
        System.out.println("Files with word 'ocean' in folder 'folder1':");
        findWordInFolder("folder1","ocean");
    }

    private static void findWordInFolder(String folder, String word) {
        File file=new File(folder);
        String[] strings=file.list((dir,name)->{
            File file2=new File(dir+"/"+name);
            if (file2.isDirectory()) {findWordInFolder(dir+"/"+name,word);return false;}
            else
                return findWord(dir+"/"+name,word);
        }

            );
        for (String s:strings){
            System.out.println(s);
        }
    }

    private static void readFromFiles(String file1, String file2) {
        readFromFile("file1.txt");
        readFromFile("file2.txt");
    }

    private static boolean findWord(String fileName, String word) {
        try(FileInputStream fis=new FileInputStream(fileName))
        {
            String s;
            int i;
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                s=scanner.next();
                i = s.indexOf(',');
                if (i != -1) s = s.substring(0, i);
                i = s.indexOf(';');
                if (i != -1) s = s.substring(0, i);
                i = s.indexOf('.');
                if (i != -1) s = s.substring(0, i);
                if (s.equalsIgnoreCase(word)) return true;
            }
            scanner.close();
        }
        catch(IOException ex){

            ex.printStackTrace();
        }

          return false;
    }

    private static void readFromFile(String fileName) {
        try(FileInputStream fis=new FileInputStream(fileName))
        {
            int i;
            while((i=fis.read())!=-1){

                System.out.print((char)i);
            }
        }
        catch(IOException ex){

            ex.printStackTrace();
        }

    }

    private static void writeToFile(String text,String fileName) {

        try(FileOutputStream fos=new FileOutputStream(fileName))
        {

            byte[] b = text.getBytes();
            fos.write(b);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }

    }

}
