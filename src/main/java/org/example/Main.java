package org.example;

interface Dialogo {
    void render();
}

class DialogoWindows implements Dialogo {
    @Override
    public void render() {
        System.out.println("Rendering del diálogo de Windows");
    }
}

class DialogoMac implements Dialogo {
    @Override
    public void render() {
        System.out.println("Rendering del diálogo de Mac");
    }
}

interface FabricaDialogo {
    Dialogo crearDialogo();
}

class FabricaDialogoWindows implements FabricaDialogo {
    @Override
    public Dialogo crearDialogo() {
        return new DialogoWindows();
    }
}

class FabricaDialogoMac implements FabricaDialogo {
    @Override
    public Dialogo crearDialogo() {
        return new DialogoMac();
    }
}

class Cliente {
    private Dialogo dialogo;

    public Cliente(FabricaDialogo fabrica) {
        dialogo = fabrica.crearDialogo();
    }

    public void render() {
        dialogo.render();
    }
}

class Main {
    public static void main(String[] args) {
        FabricaDialogo fabrica = new FabricaDialogoWindows();
        Cliente cliente = new Cliente(fabrica);
        cliente.render();
    }
}
