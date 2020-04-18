package ru.evdokimov.task6;

import java.util.Arrays;

class Contract {
    public int number;
    public String date;
    public String[] goods;

    Contract(int number, String date, String[] goods) {
        this.number = number;
        this.date = date;
        this.goods = goods;
    }

}

class Act {
    public Contract contract;


    void setContract(Contract contract) {
        this.contract = contract;
    }

    public int getNumber() {
        return contract.number;
    }

    public String getDate() {
        return contract.date;
    }

    public String[] getGoods() {
        return contract.goods;
    }
}

public class DocToAct {
    public static void main(String[] args) {
        Contract contract = new Contract(23, "23/11/2008", new String[]{"Хлеб", "Молоко", "Мука"});
        docsConvert(contract);
        Contract contract1 = new Contract(33, "23/04/2012", new String[]{"Водка", "Вино", "Пиво"});
        docsConvert(contract1);
    }

    public static void docsConvert(Contract contract) {
        Act act = new Act();
        act.setContract(contract);
        System.out.println("Договор № " + contract.number + " конвертирован в Акт: № " + act.getNumber() + " от " +
                act.getDate() + " с товаром: " + Arrays.toString(act.getGoods()));
    }

}