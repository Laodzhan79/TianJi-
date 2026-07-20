package ru.tianji;

import ru.tianji.core.Core;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" TianJi v0.0.3 Core");
        System.out.println("=================================");

        Core core = new Core();

        core.start();

        System.out.println("TianJi shutdown.");

    }

}
