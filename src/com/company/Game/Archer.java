package com.company.Game;

public class Archer extends Players implements Magicattak {
    private int archerbrone;

    public Archer(String name, int live, int uron, int archerbrone) {
        super(name, live, uron, archerbrone);

    }

    public int getArcherbrone() {
        return archerbrone;
    }

    public void setArcherbrone(int archerbrone) {
        this.archerbrone = archerbrone;
    }

    public void attackt(Players gamer_1) {

        int live1 = getLive();
        live1 = getLive() - (getArcherbrone() * gamer_1.getUron() / 100);
        setLive(live1);
        System.out.println(getName() + " Live is " + (live1));
    }
}
