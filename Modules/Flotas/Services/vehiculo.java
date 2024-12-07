package Modules.Flotas.Services;

public class vehiculo {

    class vehicul extends destino_final {
        @Override
        public void TP() {
            System.out.println(" el carro se teletransporta");
        }
    }
    

    class teletransporta extends vehiculo {
     //forzamos un comportamiento que no tiene sentido.
        public void TP() {
            throw new UnsupportedOperationException("Los carros no hacen tp");
        }
    }
}

//este es el tercer principio (L) se hizo la clase TP (teletransportarse) pero el vehiculo no lo puede hacer, se debe de heredar de manera coherente
