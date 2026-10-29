package ru.suhanov.main;

public interface lenmeasure {
    double measure();

    static double objlensum(lenmeasure[] objects) { //здесь запомни статик в интерфейсе значит что его не нужно имплементировать
        double totalSum = 0;
        for (lenmeasure obj : objects) {
            if (obj != null) {
                totalSum += obj.measure();
            }
        }
        return totalSum;
    }
}
