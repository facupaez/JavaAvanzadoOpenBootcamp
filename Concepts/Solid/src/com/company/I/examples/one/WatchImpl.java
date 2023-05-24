package com.company.I.examples.one;

public class WatchImpl implements IWatch{
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
        return "53";
    }
}
