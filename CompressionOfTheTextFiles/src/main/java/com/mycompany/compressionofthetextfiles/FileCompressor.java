package com.mycompany.compressionofthetextfiles;

public class FileCompressor {
    public java.io.File compressFile(String diractory, String fileName) {
        java.io.File file = new java.io.File(diractory, fileName);
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int lineCounter = 0;
        try {
        java.io.FileReader reader = new java.io.FileReader(file);
        java.io.FileWriter writer = new java.io.FileWriter(file, false);
        java.util.Scanner scanner = new java.util.Scanner(reader);
        
        while(scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals(list.get(i+1))){
                lineCounter++;
            } else {
                writer.write(list.get(i) + " " + lineCounter);
                lineCounter = 0;
            }
        }
        
        } catch (java.io.FileNotFoundException ex) {
            System.out.println("Файл не существует");
        } catch (java.io.IOException ex) {
            System.out.println("Проблемы с вводом");
        }
        return file;
    }
}
