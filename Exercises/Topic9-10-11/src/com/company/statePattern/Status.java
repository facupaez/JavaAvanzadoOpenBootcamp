package com.company.statePattern;

public abstract class Status {
    public Telephone telephone;

    public Status(Telephone telephone){
        this.telephone = telephone;
    }

    public abstract String unlock();

    public abstract String openCam();

    public abstract String makePhoto();
}
