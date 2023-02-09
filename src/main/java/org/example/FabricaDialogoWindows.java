package org.example;

class FabricaDialogoWindows implements FabricaDialogo {
    @Override
    public Dialogo crearDialogo() {
        return new DialogoWindows();
    }
}
