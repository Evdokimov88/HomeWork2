package ru.evdokimov.task15;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.net.URL;
import java.util.Date;

@JsonAutoDetect
class CovidByCountry {
    private String country;
    private int confirmed;
    private int death;
    private int recovered;
    private int activity;
    private Date date;
    @JsonProperty("CountryCode")
    @JsonIgnore
    private String CountryCode;
    @JsonProperty("Province")
    @JsonIgnore
    private String Province;
    @JsonProperty("City")
    @JsonIgnore
    private String City;
    @JsonProperty("CityCode")
    @JsonIgnore
    private int CityCode;
    @JsonProperty("Lat")
    @JsonIgnore
    private double Lat;
    @JsonProperty("Lon")
    @JsonIgnore
    private double Lon;
public CovidByCountry(){
    super();
}
   public CovidByCountry(String country, int death, int confirmed, int activity, int recovered, Date date) {
        this.activity=activity;
        this.recovered=recovered;
        this.country=country;
        this.confirmed=confirmed;
        this.death=death;
        this.date=date;
    }


    @JsonProperty("Active")
    public void setActivity(int activity) {
        this.activity = activity;
    }
    public int getActivity(){
        return activity;
    }
    @JsonProperty("Confirmed")
    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("Date")
    public void setDate(Date date) {
        this.date = date;
    }


    @JsonProperty("Deaths")
    public void setDeath(int death) {
        this.death = death;
    }


    @JsonProperty("Recovered")
    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    @Override
    public String toString() {
        return  "Страна"+getActivity()+
                "Подтвержденные случаи: "+confirmed+
                "Умерло: "+death+
                "Вылечилось: "+recovered+
                "На лечении: "+activity+
                "Дата обновления: "+date;
    }
}

public class Main {
    public static void main(String[] args) throws IllegalStateException, IOException {
        try {
            URL url = new URL("https://api.covid19api.com/live/country/south-africa/status/confirmed");
            InputStream input = url.openStream();

            byte[] buffer = input.readAllBytes();
            String str = new String(buffer);


            ObjectMapper mapper = new ObjectMapper();
            CovidByCountry[] covid = mapper.readValue(str, CovidByCountry[].class);
            System.out.println(covid);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
