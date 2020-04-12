package ru.evdokimov.task6;

public class Final {
    public final String s ="Привет мир!";
    public int myVar=543;
    public static final double ACCEL=9.8;
    public void myMethod(){
        //s="Hello world"; действие ошибочно, т.к. переменная помечена final(константа)
        myVar = 543;
        //accel=3; аналогично

    }
    final static double speedFromAccel(int time){
        double speed = time*ACCEL;
        return speed;
    }
   /* static class MoonAccel extends Final{
        public static void speedFromAccel(int time){ МЕТОД FINAL НЕ МОЖЕТ БЫТЬ ПЕРЕОПРЕДЕЛЕН
            double speed = time*ACCEL;
        }

    }*/
public static void main(String[] args){
      System.out.println("Скорость при ускорении свободного падения Земли на 50-й секунде равна "+
              Final.speedFromAccel(50)+"м/с");
      //  System.out.println("Скорость при ускорении свободного падения Луны на 50-й секунде равно "+
    //  MoonAccel.speedFromAccel(50));
    //       ВЫПОЛНЕНИЕ ДАННОГО МЕТОДА НЕВОЗМОЖНО (см. выше)
}
}
