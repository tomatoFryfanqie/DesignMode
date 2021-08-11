package org.lzh.creational.factory;

import org.lzh.creational.factory.ComputerFactory;
import org.lzh.creational.factory.service.Computer;

public class Customer {

    public static void main(String[] args) {

        ComputerFactory computerFactory = new ComputerFactory();

        Computer dell = computerFactory.getComputer("Dell");
        dell.sellComputer();

        Computer lenovo = computerFactory.getComputer("Lenovo");
        lenovo.sellComputer();

        Computer mac = computerFactory.getComputer("Mac");
        mac.sellComputer();
    }
}
