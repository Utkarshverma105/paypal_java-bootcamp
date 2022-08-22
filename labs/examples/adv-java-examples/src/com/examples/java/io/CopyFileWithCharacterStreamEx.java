package com.examples.java.io;

import java.io.*;
public class CopyFileWithCharacterStreamEx {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("D:\\Temp\\input.txt");
         out = new FileWriter("D:\\Temp\\output.txt", true);
         
         int c;
         while ((c = in.read()) != -1) {
            System.out.println((char)c);
            out.write(c);
         }
         
         System.out.println("File copied successfully.");
         
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}