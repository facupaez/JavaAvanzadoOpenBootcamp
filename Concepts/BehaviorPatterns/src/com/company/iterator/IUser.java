package com.company.iterator;

public interface IUser {
    // métodos más comunes que se implementan en patrón Iterator

    // devuelve el siguiente elemento en una lista
    User next();

    // reinicia el contador de la lista a 0
    void reset();

    // nos indica si hay mas o no hay mas elementos por recorrer
    boolean hasMore();
}
