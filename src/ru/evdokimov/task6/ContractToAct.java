package ru.evdokimov.task6;

import java.util.Arrays;

class Contract {            //создаем класс Договор
    public int number;
    public String date;
    public String[] prodList;


    Contract(int number, String date, String[] prodList) { //Инициализируем поля договора
        this.date = date;
        this.prodList = prodList;
        this.number = number;
    }

    public String[] getProdList() { //геттерами возращаем значения полей
        return prodList;
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }
}

class Act { //создаем класс Акт
    private int number;
    private String date;
    private String[] prodList;

    public void setNumber(int number) { //сеттерами присваиваем значения полям этого класса
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setProdList(String[] prodList) {
        this.prodList = prodList;
    }

    public String[] getProdList() {
        return prodList;
    }
}

class ContractToAct { //отдельный класс для конвертации договора в акт

    static String date;
    static String[] prodList;
    static int number;

    public static void contractToAct(Contract contract, Act act) { //в данном методе конвертируем договор в акт, в
        //в качестве параметров принимаем данные полей договора
        date = contract.getDate();
        act.setDate(date);
        prodList = contract.getProdList();
        act.setProdList(prodList);
        number = contract.getNumber();
        act.setNumber(number);


    }

    public static void main(String[] args) {
        Contract contract = new Contract(36, "05.03.2020", new String[]{"ПГС", "Песок", "Гравий", "Цемент"});
        Act act = new Act();
        contractToAct(contract, act);
        Contract contract1 = new Contract(56, "25.12.2008", new String[]{"Хлеб", "Молоко", "Вискарь", "Сахар"});
        Act act1 = new Act();
        System.out.println("Номер акта: " + act.getNumber() + " Дата акта: " + act.getDate() + " Список товаров: "
                + Arrays.toString(act.getProdList()));
        contractToAct(contract1, act1);
        System.out.println("Номер акта: " + act1.getNumber() + " Дата акта: " + act1.getDate() + " Список товаров: "
                + Arrays.toString(act1.getProdList()));
    }


}

