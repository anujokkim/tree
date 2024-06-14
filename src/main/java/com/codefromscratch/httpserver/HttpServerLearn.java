package com.codefromscratch.httpserver;



import com.codefromscratch.httpserver.config.Configuration;
import com.codefromscratch.httpserver.config.ConfigurationManager;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class HttpServerLearn {
    public static void main(String[] args) {
        System.out.println("Server starting...");

        ConfigurationManager.getInstance().loadConfigurationFile("src/main/resources/http.json");

        Configuration conf = ConfigurationManager.getInstance().getCurrentConfiguration();

        System.out.println("using port:"+conf.getPort());
        System.out.println("using WebRoot:"+conf.getWebroot());
        try{
            ServerSocket serverSocket=new ServerSocket(conf.getPort());
            Socket socket=serverSocket.accept();

            InputStream inputStream=socket.getInputStream();
            OutputStream outputStream=socket.getOutputStream();


            String html="<html><head><title>Simple java Http Server</title></head>This page was served using my simple java Http server<body><h1></h1></body></html>";
            final String CRLF="\n\r";
            String response =
                    "Http/1.1 200 OK"+CRLF + "Content-length"+ html.getBytes().length+ CRLF +
                            CRLF +
                            html +
                            CRLF+
                            CRLF + CRLF;
            outputStream.write(response.getBytes());

            inputStream.close();
            outputStream.close();
            socket.close();
            serverSocket.close();


        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
