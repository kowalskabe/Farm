package Factories;

public class FactoryGenerator {
    public static AbstractFactory getFactory (FactoryType factoryType){
        switch (factoryType){
            case ANIMALFACTORY:
                return new AnimalFactory();
            case NURSERYFACTORY:
                return new NurseryFactory();
        }
        return null;
    }
}
