package Modules.Flotas.Services;

interface Switchable {
    void turnOn();
}

class LightBulb2 implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("el gps esta encendido");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("El senor esta en funcionamiento");
    }
}

class Switch2 {
    private Switchable device;
    public Switch2(Switchable device) {
        this.device = device;
    }

    public void press() {
        device.turnOn();
    }
}

//Esta es la "D", Las clases que tengan un nivel superior deben de depender de una interfaz, en este caso switchable. 