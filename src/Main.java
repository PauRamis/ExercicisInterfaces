public class Main {
    public static void main(String[] args) {
        Jeep j = new Jeep();
        HoverCraft h = new HoverCraft();
        //Frigate f = new Frigate();
        //PoliceCar c = new PoliceCar();

        IsVehicle[] vehicles = new IsVehicle[4];
        vehicles[0] = j;
        vehicles[1] = h;
        //vehicles[2] = f;
        //vehicles[3] = c;

        for (int i = 0; i < vehicles.length; i++) {
            IsVehicle v = vehicles[i];
            if (v instanceof Jeep){

            }
        }

    }
}

interface IsVehicle {
    String getName();

    void setName(String n);

    int getMaxPassengers();

    void setMaxPassengers(int p);

    int getMaxSpeed();

    void setMaxSpeed(int s);
}

interface IsLandVehicle extends IsVehicle {
    int getNumWheels();

    void setNumWheels(int w);

    void drive();
}

interface IsSeaVessel extends IsVehicle {
    int getDisplacement();

    void setDisplacement(int d);

    void launch();
}

class Jeep implements IsLandVehicle {
    private String name;
    private int numWheels;
    private int maxPassengers;
    private int maxSpeed;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    @Override
    public void setMaxPassengers(int p) {
        this.maxPassengers = p;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int s) {
        this.maxSpeed = s;
    }

    @Override
    public int getNumWheels() {
        return this.numWheels;
    }

    @Override
    public void setNumWheels(int w) {
        this.numWheels = w;
    }

    @Override
    public void drive() {

    }
}


class HoverCraft implements IsLandVehicle, IsSeaVessel {
    private String name;
    private int maxPassengers;
    private int maxSpeed;
    private int displacement;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String n) {
        this.setName(n);
    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    @Override
    public void setMaxPassengers(int p) {
        this.maxPassengers = p;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void setMaxSpeed(int s) {
        this.maxSpeed = s;
    }

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int w) {

    }

    @Override
    public void drive() {

    }

    @Override
    public int getDisplacement() {
        return this.displacement;
    }

    @Override
    public void setDisplacement(int d) {
        this.displacement = d;
    }

    @Override
    public void launch() {
        System.out.println("launching...");
    }
}

//class Frigate
