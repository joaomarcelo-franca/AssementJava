package MainProgram.Metodos;

import MainProgram.Personagens.IPersonagem;

import java.util.Random;

public abstract class MetodosCalc {
    static Random random = new Random();
    public static int dadode2(){
        return random.nextInt(2 - 1 + 1) + 1;
    }
    public static int dadode4(){
        return random.nextInt(4 - 1 + 1) + 1;
    }
    public static int dadode6(){
        return random.nextInt(6 - 1 + 1) + 1;
    }
    public static int dadode8(){
        return random.nextInt(8 - 1 + 1) + 1;
    }
    public static int dadode10(){
        return random.nextInt(10 - 1 + 1) + 1;
    }
    public static int calcIni(int agilidade){
        return agilidade + dadode10();
    }

}
