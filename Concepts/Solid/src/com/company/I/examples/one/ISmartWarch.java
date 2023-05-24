package com.company.I.examples.one;

/*
  Cuando quiero crear otra clase de tipo SmartWatch agrego otra interface para poder recibir estos métodos y no
  afectar a mi clase común Watch.
 */
public interface ISmartWarch {
    void sendMessage();
    void getEmails();
}
