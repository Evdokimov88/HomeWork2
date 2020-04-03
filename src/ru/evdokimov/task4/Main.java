package ru.evdokimov.task4;

class Hospital {
    String fullname;
    String city;
    int age;
    String diagnosis;

    Hospital(String fullname, String city, int age, String diagnosis) {
        this.fullname = fullname;
        this.city = city;
        this.age = age;
        this.diagnosis = diagnosis;
    }
}


class InfectionalHosp extends Hospital {
    String infection;

    InfectionalHosp(String fullname, String city, int age, String diagnosis, String infection) {
        super(fullname, city, age, diagnosis);
        this.infection = infection;
    }

    public void infectional() {
        System.out.println("Лечим инфекционные заболевания");

    }
}

class Traumatology extends Hospital {
    String trauma;

    Traumatology(String fullname, String city, int age, String diagnosis, String trauma) {
        super(fullname, city, age, diagnosis);
        this.trauma = trauma;
    }

    public void gips() {

        System.out.println("При переломе требуется наложить гипс");
    }
}

class Infectional extends InfectionalHosp {


    Infectional(String fullname, String city, int age, String diagnosis, String infection) {
        super(fullname, city, age, diagnosis, infection);

    }

    public void antiBiotik() {
        System.out.println("Лечим бактериальную инфекцию антибиотиками");
    }
}

class SpecialBox extends InfectionalHosp {
    boolean covid19;

    SpecialBox(String fullname, String city, int age, String diagnosis, String infection, boolean covid19) {
        super(fullname, city, age, diagnosis, infection);
        this.covid19 = covid19;
    }

    public void antiVirus() {
        System.out.println("Лечим противовирусными препаратами");
    }
}

public class Main {
    public static void main(String[] args) {
        SpecialBox patientcovid = new SpecialBox("Ivanov Ivan", "Kazan", 47, "CovID19",
                "Вирусная", true);
        patientcovid.antiVirus();
        System.out.println(patientcovid.fullname+patientcovid.diagnosis);
        Traumatology patientfracture = new Traumatology("Sidorov Sergey", "Chistopol", 35,
                "Перелом", "Закрытый");
        patientfracture.gips();
        System.out.println(patientfracture.fullname+" "+patientfracture.trauma+" "+patientfracture.diagnosis);
    }
}
