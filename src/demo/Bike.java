package demo;

/**
 * Ibodulla Ibodullaev created on 16.08.2019 inside the package - demo
 */
class Bike
{

    // declaring data members and methods

    private String color;

    private int wheels;

    public void bikeFeatures()

    {

        System.out.println("Bike Color= "+color + " wheels= " + wheels);

    }

    public void setColor(String color)

    {

        this.color = color;

    }

    public void setwheels(int wheels)

    {

        this.wheels = wheels;

    }

}