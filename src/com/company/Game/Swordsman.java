package com.company.Game;

import java.util.Random;

public class Swordsman extends Players implements Magicattak {
    public Swordsman(String name, int live, int uron) {
        super(name, live, uron);
    }

    public void attackt(Players gamer_1) {
             Random random = new Random();
            int critic = random.nextInt(5);
            if (critic == 4) {
                 int sworduron =2*getUron();
                setUron(sworduron);
                int live1 = getLive();
                live1 = getLive() - gamer_1.getUron()*2 ;
                setLive(live1);
                System.out.println(getName() + " Live is " + (live1));
            }    else {
                int live1 = getLive();
                live1 = getLive() - gamer_1.getUron();
                setLive(live1);
                System.out.println(getName() + " Live is " + (live1));
            }

    }
}
