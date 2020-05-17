package ru.evdokimov.task15;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.annotations.JsonAdapter;


import java.io.*;
import java.net.URL;

import java.util.Date;

@JsonAutoDetect
class CovidByCountry{

String country;
int confirmed;
int death;
int recovered;
int activity;
Date date;

}
public class Main {
    public static void main(String[] args) throws IllegalStateException, IOException {
        try {
            URL url = new URL("https://api.covid19api.com/live/country/south-africa/status/confirmed");
            InputStream input = url.openStream();

            byte[] buffer = input.readAllBytes();
            String str = new String(buffer);


    ObjectMapper mapper = new ObjectMapper();
    CovidByCountry covid = mapper.readValue(str, CovidByCountry.class);
                //StringReader str = new StringReader(input.toString());
               /* Gson g = new Gson();
                CovidByCountry covid = g.fromJson(str, CovidByCountry.class);*/
                System.out.println(covid);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
