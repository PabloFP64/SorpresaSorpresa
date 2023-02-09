package org.example;

class DialogoMac implements Dialogo {
    @Override
    public void mostrarMensaje() {
        System.out.println("Error, estas en un Windows, intentalo de nuevo");
    }

    @Override
    public void render() {

    }
}
