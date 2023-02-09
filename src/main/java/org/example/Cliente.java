package org.example;

class Cliente {
    private Dialogo dialogo;

    public Cliente(FabricaDialogo fabrica) {
        dialogo = fabrica.crearDialogo();
    }

    public void mostrarMensaje() {
        dialogo.mostrarMensaje();
    }
}