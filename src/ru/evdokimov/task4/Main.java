package ru.evdokimov.task4;

class Hospital {       //оздаем класс Больница с полями Имя, город, возраст, диагноз
    String fullname;
    String city;
    int age;
    String diagnosis;


    Hospital(String fullname, String city, int age, String diagnosis) { //оздаем конструктор для инициализации полей
        this.fullname = fullname;
        this.city = city;
        this.age = age;
        this.diagnosis = diagnosis;
    }
}


class InfectionalHosp extends Hospital { //оздаем класс инфекционная больница, который расширяет класс больница
    //с полями Тип инфекциии и закрытым полем номер палаты(wardNumber)
    String infection;
    private int wardNumber;

    InfectionalHosp(String fullname, String city, int age, String diagnosis, String infection) {
        //инициализируем поля класса больница и поля класса инфекионная больница
        super(fullname, city, age, diagnosis);
        this.infection = infection;
    }

    public void infectional() { //оздаем метод inectional и выводим сообщение на консоль
        System.out.println("Лечим инфекционные заболевания");

    }

    public void setWardNumber(int ward) { //создаем метом установки номера палаты
        wardNumber = ward;
    }

    public int getwardNumber() {//возвращаем номер палаты
        System.out.println("Пациента с инфекцией необходимо поместить в палату: " + wardNumber);
        return wardNumber;
    }
}


class Infectional extends InfectionalHosp { //создаем класс бактериальная инфекция, который расширяет класс
    //инфекционная больница
    private String antiBiotic;

    Infectional(String fullname, String city, int age, String diagnosis, String infection) {
        super(fullname, city, age, diagnosis, infection);

    }

    public void setMassage(String massage) {//метод установки лечения

        antiBiotic = massage;
    }
    public String getMassage (){//возвращаем значение
        System.out.println("Лечим бактериальную инфекцию "+antiBiotic);
        return antiBiotic;
    }
}

class SpecialBox extends InfectionalHosp {//создаем подкласс в котором лечим противирусными препаратами
    boolean covid19;

    SpecialBox(String fullname, String city, int age, String diagnosis, String infection, boolean covid19) {
        super(fullname, city, age, diagnosis, infection);
        this.covid19 = covid19;
    }

    public void antiVirus() {
        System.out.println("Лечим противовирусными препаратами");
    }
}

class Traumatology extends Hospital {//класс травматология расширяем класс больница
    String trauma;

    Traumatology(String fullname, String city, int age, String diagnosis, String trauma) {
        super(fullname, city, age, diagnosis);
        this.trauma = trauma;
    }

    public void gips() {//накладываем гипс

        System.out.println("При переломе требуется наложить гипс");
    }
}

public class Main {
    public static void main(String[] args) {
        SpecialBox patientCovid = new SpecialBox("Ivanov Ivan", "Kazan", 47, "CovID19",
                "Вирусная", true);//создаем пациента спец бокса с подтвержденным короновирусом=))
        System.out.println(patientCovid.fullname + patientCovid.diagnosis);
        patientCovid.antiVirus();//лечим
        Traumatology patientfracture = new Traumatology("Sidorov Sergey", "Chistopol", 35,
                "Перелом", "Закрытый"); //создаем пациента травматологии
        System.out.println(patientfracture.fullname + " " + patientfracture.trauma + " " + patientfracture.diagnosis);
        patientfracture.gips();//лечим
        Infectional patientInfection = new Infectional("Мешок Пряников", "Казань", 40,
                "Сальманеллез", "Бактериальная");//создаем пациента бактериального отделения
        System.out.println(patientInfection.fullname + " " + patientInfection.diagnosis);
        patientInfection.setWardNumber(15);//назначаем палату
        patientInfection.getwardNumber();
        patientInfection.setMassage("антибиотиками");//выписываем лечение
        patientInfection.getMassage();
    }
}
