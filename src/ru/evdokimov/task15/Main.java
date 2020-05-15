package ru.evdokimov.task15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.URL;


class CovidByCountry{


}
public class Main {
    public static void main(String[] args) throws IOException {
try {
    CovidByCountry covid;

    URL url = new URL("https://api.covid19api.com/");
    InputStream input = url.openStream();

    byte[] buffer = input.readAllBytes();
    String str = new String(buffer);
    ObjectMapper mapper = new ObjectMapper();
    covid = mapper.readValue(str, CovidByCountry.class);
    System.out.println(covid);
}
catch (IOException e)
{
    System.out.println(e);
}
    }
}
