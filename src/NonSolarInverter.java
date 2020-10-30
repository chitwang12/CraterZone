public class NonSolarInverter extends Inverter {
    NonSolarInverter(float current,float OperatingVoltage)
    {
      this.current = current;
      this.OperatingVoltage=OperatingVoltage;


    }
    public  float powerRating()
    {
        return current * OperatingVoltage;
    }
    void display()
    {
        System.out.println("The specifications for the following are");
        System.out.println("The inverter has an operating voltage of :" + OperatingVoltage+"volts");
        System.out.println("The inverter works on current of  :" + current+"Ampere");
        System.out.println("The inverter has a powerRating of:" + powerRating());

    }

}
