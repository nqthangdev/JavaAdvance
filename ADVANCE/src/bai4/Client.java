/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
/**
 *
 * @author Administrator
 */
public class Client {
    public static void main(String[] args) throws IOException{

        Socket socket = new Socket("localhost", 123);
        
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("it is working...");
        printWriter.flush();
        
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            
            String str = bufferedReader.readLine();
            System.out.println("server : " + str);
    }
}
