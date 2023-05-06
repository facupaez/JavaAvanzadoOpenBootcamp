package com.company.statePattern;

public class LockStatus extends Status {

    public LockStatus(Telephone telephone) {
        super(telephone);
    }

    @Override
    public String unlock() {
        // cambiamos estado a móvil desbloqueado
        telephone.changeStatus(new UnlockStatus(telephone));
        return "unlock(): Móvil debloqueado, proceda.";
    }

    @Override
    public String openCam() {
        return "openCam(); La cámara esta bloqueada, desbloquea el móvil antes.";

    }

    @Override
    public String makePhoto() {
        return "makePhoto(): La cámara esta bloqueada, desbloquea el móvil antes.";
    }
}
