package org.lzh.creational.factory;

import org.lzh.creational.factory.service.Computer;
import org.lzh.creational.factory.service.impl.Dell;
import org.lzh.creational.factory.service.impl.Lenovo;
import org.lzh.creational.factory.service.impl.Mac;

public class ComputerFactory {

    public Computer getComputer(String computer){

        if (null == computer){
            return null;
        }
        if (computer.equalsIgnoreCase("Dell")){
            return new Dell();
        }
        if (computer.equalsIgnoreCase("Lenovo")){
            return new Lenovo();
        }
        if (computer.equalsIgnoreCase("Mac")){
            return new Mac();
        }
        return null;
    }
}
