package com.company.statePattern;

public class MakePhotoStatus extends Status{

    public MakePhotoStatus(Telephone telephone){
        super(telephone);
    }

    @Override
    public String unlock() {
        return "unlock(): El móvil ya está desbloqueado.";
    }

    @Override
    public String openCam() {
        return "openCam(): La cámara ya está abierta.";
    }

    @Override
    public String makePhoto() {
        // cambiamos a estado del móvil bloqueado
        telephone.changeStatus(new LockStatus(telephone));
        return "makePhoto(): La foto se ha hecho. \nBloqueando móvil.";
    }
}
