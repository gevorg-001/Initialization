package com.company.Game;

public abstract class Players {
    private String name;
    private int live;
    private int uron;






    public Players(String name, int live, int uron, int archerbrone) {
        this.name = name;
        this.live = live;
        this.uron = uron;

    }

    public Players(String name, int live, int uron) {
        this.name = name;
        this.live = live;
        this.uron = uron;

    }


    public Players(String name, int live, int uron, int archerbrone, int magicbrone) {
        this.name = name;
        this.live = live;
        this.uron = uron;


    }
    public abstract void attackt(Players gamer_1);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getUron() {
        return uron;
    }

    public void setUron(int uron) {
        this.uron = uron;
    }}




