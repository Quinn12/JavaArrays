package com.company;
public class Main
{

    public static void main(String[] args)
    {
        String[] TacoVanFodAry = {"Tacos", "Burritos","Nachos","Tamale","quesadillas","Taco pizzas"};
        String[] TacoVanSupAry = {"Plates","napkins","plastic forks","cooking grease","sanitizer","soap"};
        System.out.println("Taco van food items.");
        for(int i=0;i<6;i++)
        {
            System.out.println(i + ". " + TacoVanFodAry[i]);
        }

        System.out.println("Taco van supply items.");
        for(int a=0;a<6;a++)
        {
            System.out.println(a + ". " + TacoVanSupAry[a]);
        }

    }
}
