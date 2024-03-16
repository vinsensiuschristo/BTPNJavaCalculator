class Kendaraan{
    public void Kendaraan(){
        System.out.println("INI KENDARAAN");
    }
}

class Mobil extends Kendaraan{
    public void Kendaraan(){
        System.out.println("INI MOBIL EXTENDS KENDARAAN");
    }
}

class Motor extends Kendaraan{
    public void Kendaraan(){
        System.out.println("INI MOTOR EXTENDS KENDARAAN");
    }
}

class Main{
    public static void main(String[] args) {

        Kendaraan kendaraan = new Kendaraan();
        Kendaraan mobil = new Mobil();
        Kendaraan motor = new Motor();

        kendaraan.Kendaraan();
        mobil.Kendaraan();
        motor.Kendaraan();
    }
}