
public class Car {
    public string Make;
    public string Model;
    public int Year;

    public Car(string make, string model, int year) {
        //what are the field values here?
        Make = make;
        Model = model;
        Year = year;
        //what about here?
    }
    
    public int GetNumberOfWheels() {
        return 4;
    }

    public Car GetANewerCar(int numberOfYears) {
        return new Car(Make, Model, Year + numberOfYears);
    }

    private void SelfDestruct(int secondsDelay) {
        //TODO figure out if we need this method
    }
}