package com.company.Game;

public class Magic extends Players implements Magicattak {
    private int magician;

    public Magic(String name, int live, int uron, int magicbrone) {
        super(name, live, uron, magicbrone);
    }

    public   void attackt(Players gamer_1) {
        int live1 = getLive();
        int magicmag = gamer_1.getUron() / 100 * getMagician();
        int live = gamer_1.getLive() - magicmag;
        live1 = getLive() - gamer_1.getUron() + magicmag;
        setLive(live1);
        System.out.println(getName() + " Live is " + (live1));

    }

    public int getMagician() {
        return magician;
    }


}