public class Main {
    public static void main(String[] args) {

        // task 1

        System.out.println("Задача 1");
        int varInt = 241200724;
        byte varByte = 127;
        short varShort = 32223;
        long varLong = 8295734058798236L;
        float varFloat = 234.672F;
        double varDouble = -234.282;
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);


        // task 2

        System.out.println("Задача 2");
        float varFloat2 = 27.12f;
        long varLong2 = 987678965549L;
        double varDouble2 = 2.786;
        short varShort2 = 569;
        short varShort3 = -159;
        int varInt2 = 27897;
        byte varByte2 = 67;
        System.out.println("Инициализировал переменные");


        // task 3

        System.out.println("Задача 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short paperForAll = 480;
        short paperForOneStudent = (short) (paperForAll / (teacher1 + teacher2 + teacher3));
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");


        // task 4

        System.out.println("Задача 4");
        byte powerIn2Min = 16;
        byte power = (byte) (powerIn2Min / 2); // производительность в минуту
        int powerIn20Min = power * 20;
        int powerPerDay = power * 60 * 24;
        int powerIn3Days = powerPerDay * 3;
        int powerPerMonth = powerPerDay * 30;
        System.out.println("За 20 мин машина произвела " + powerIn20Min + " бутылок");
        System.out.println("За сутки машина произвела " + powerPerDay + " бутылок");
        System.out.println("За 3 дня машина произвела " + powerIn3Days + " бутылок");
        System.out.println("За месяц машина произвела " + powerPerMonth + " бутылок");


        // task 5

        System.out.println("Задача 5");
        byte colorWholeSchool = 120;
        byte colorWhiteOneRoom = 2;
        byte colorBrownOneRoom = 4;
        byte roomsInSchool = (byte) (colorWholeSchool / (colorWhiteOneRoom + colorBrownOneRoom));
        byte colorWhiteAllRooms = (byte) (colorWhiteOneRoom * roomsInSchool);
        byte colorBrownAllRooms = (byte) (colorBrownOneRoom * roomsInSchool);
        System.out.println("В школе, где " + roomsInSchool + " классов, нужно " + colorWhiteAllRooms + " банок белой краски и " + colorBrownAllRooms + " банок коричневой краски");


        // task 6

        System.out.println("Задача 6");
        int bananasWeight = 5 * 80;
        int milkWeight = 200 / 100 * 105;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        int breakfastWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        float breakfastWeightKg = (float) breakfastWeight / 1000;
        System.out.println("Вес завтрака - " + breakfastWeight + " г или " + breakfastWeightKg + " кг");


        // task 7

        System.out.println("Задача 7");
        byte weightKg = 7;
        short weightGr = (short) (weightKg * 1000);
        short daysLoseWeight250 = (short) (weightGr / 250);
        short daysLoseWeight500 = (short) (weightGr / 500);
        short daysLoseWeightAverage = (short) ((daysLoseWeight250 + daysLoseWeight500) / 2);
        System.out.println("Если спортсмен будет терять по 250 г в день, то на похудение уйдет " + daysLoseWeight250 + " дн");
        System.out.println("Если спортсмен будет терять по 500 г в день, то на похудение уйдет " + daysLoseWeight500 + " дн");
        System.out.println("В среднем - " + daysLoseWeightAverage + " дн");


        // task 8

        System.out.println("Задача 8");
        int mCash = 67760;
        int dCash = 83690;
        int kCash = 76230;

        int mCashNew = mCash * 110 / 100;
        int dCashNew = dCash * 110 / 100;
        int kCashNew = kCash * 110 / 100;

        int mCashDiff = mCashNew - mCash;
        int dCashDiff = dCashNew - dCash;
        int kCashDiff = kCashNew - kCash;

        int mCashNewPerYear = mCashDiff * 12;
        int dCashNewPerYear = dCashDiff * 12;
        int kCashNewPerYear = kCashDiff * 12;

        System.out.println("Маша теперь получает " + mCashNew + " рублей. Годовой доход вырос на " + mCashNewPerYear + " рублей");
        System.out.println("Денис теперь получает " + dCashNew + " рублей. Годовой доход вырос на " + dCashNewPerYear + " рублей");
        System.out.println("Кристина теперь получает " + kCashNew + " рублей. Годовой доход вырос на " + kCashNewPerYear + " рублей");


    }
}