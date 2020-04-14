package ru.evdokimov.task6;

class CounterClass {

    private static int counter;
        CounterClass (){
        counter++;//Конструктор со счетчиком
    }

    public static int getCounter() {
        return counter; //создаем статический метод в котором возвращаем количество созданных обьектов
    }
    public static void main(String[] args){
        CounterClass obj =  new CounterClass();
        CounterClass obj1 = new CounterClass();
        CounterClass obj2 = new CounterClass();
        System.out.println("Количество объектов класса CounterClass: "+getCounter());
    }
}
