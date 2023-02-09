package org.example;

class FabricaDialogoMac implements FabricaDialogo {
    @Override
    public Dialogo crearDialogo() {
        return new DialogoMac();
    }
}
