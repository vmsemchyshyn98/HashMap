package com.company.Test;

public class DemoStatic
{
    static int sd; // статический член данных - общий для всех объектов класса
    int d; // нестатический член данных

    // конструктор
    DemoStatic()
    {
        sd = 0;
        d = 0;
    }

    // методы доступа
    int GetSd()
    {
        return sd;
    }

    int GetD()
    {
        return d;
    }

    void SetSd(int nsd)
    {
        sd = nsd;
    }

    void SedD(int nd)
    {
        d = nd;
    }

    // статический метод, который демонстрирует использование статического члена данных
    static void DemoMethod()
    {
        // объявление объектов класса
        DemoStatic d1 = new DemoStatic();
        DemoStatic d2 = new DemoStatic();
        DemoStatic d3 = new DemoStatic();
        int t; // дополнительная переменная

        t = d1.GetD(); // t = 0
        t = d1.GetSd(); // t = 0

        // изменение статического члена данных
        d1.SetSd(5);
        t = d2.GetSd(); // t = 5 - статический член данных есть общим для объектов d1, d2, d3
        t = d3.GetSd(); // t = 5 - так же

        // изменение нестатического члена данных
        d1.SedD(8);
        t = d2.GetD(); // t = 0

        System.out.println(t);
    }

    public static void main(String[] args)
    {
        DemoMethod();
    }
}