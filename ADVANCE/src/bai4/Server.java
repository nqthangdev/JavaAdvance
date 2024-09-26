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
public class Server {
    public static void main(String[] args) throws IOException{
        
            ServerSocket serverSocket = new ServerSocket(123);
            Socket socket = serverSocket.accept();
            System.out.println("Server has port 123"); 
            
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            
            String str = bufferedReader.readLine();
            System.out.println("client : " + str);
            
            PrintWriter pr = new PrintWriter(socket.getOutputStream());
            pr.print("yes");
            pr.flush();
    }
}
