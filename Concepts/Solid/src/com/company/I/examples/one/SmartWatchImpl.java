package com.company.I.examples.one;

/*
    Implemento las interfaces que quiera usar en esta cl22ase.
    No debemos implementar demasiadas interfaces.
 */
public class SmartWatchImpl implements IWatch, ISmartWarch{
    @Override
    public void sendMessage() {

    }

    @Override
    public void getEmails() {

    }

    @Override
    public String currentTime() {
        return "22";
    }

    @Override
    public String currentMinutes() {
        return "10";
    }

    @Override
    public String currentSeconds() {
        return "32";
    }
}
