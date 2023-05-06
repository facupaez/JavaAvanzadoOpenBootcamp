package com.company.statePattern;

public class OpenCamStatus extends Status{

    public OpenCamStatus(Telephone telephone){
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
        // cambiamos estado a hacer foto
        telephone.changeStatus(new MakePhotoStatus(telephone));
        return "makePhoto(): La foto se va a dispara ya...";
    }
}
