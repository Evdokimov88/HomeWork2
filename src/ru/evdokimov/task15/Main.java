package ru.evdokimov.task15;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;

@JsonAutoDetect
class Foaas{
    String massage;
    String subtitle;

    Foaas(){

    }


}
public class Main {
    public static void main(String[] args) throws IOException {
try {
    Foaas foaas;

    URL url = new URL("https://www.foaas.com/?callback=?");
    InputStream input = url.openStream();

    byte[] buffer = input.readAllBytes();
    String str = new String(buffer);
    //StringReader str = new StringReader(input.toString());
    ObjectMapper mapper = new ObjectMapper();
    foaas = mapper.readValue(str, Foaas.class);
    System.out.println(foaas);
}
catch (IOException e)
{
    System.out.println(e);
}
    }
}
