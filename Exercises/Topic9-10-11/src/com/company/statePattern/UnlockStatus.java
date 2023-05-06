package com.company.statePattern;

public class UnlockStatus extends Status{

    public UnlockStatus(Telephone telephone){
        super(telephone);
    }

    @Override
    public String unlock() {
        return "unlock(): El móvil ya está desbloqueado.";
    }

    @Override
    public String openCam() {
        // cambiamos estado de la cam a cam abierta
        telephone.changeStatus(new OpenCamStatus(telephone));
        return "openCam(): Cámara abierta, puede hacer la foto.";
    }

    @Override
    public String makePhoto() {
        return "makePhoto(): No se puede hacer una foto sin abrir la cámara.";
    }
}
