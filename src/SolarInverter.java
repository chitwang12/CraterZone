

public class SolarInverter extends Inverter {
    Boolean GridOn=false;
    SolarInverter(float current,float OperatingVoltage,Boolean GridOn)
    {
        this.current = current ;
        this.OperatingVoltage = OperatingVoltage;
        this.GridOn = GridOn;

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
        System.out.println("The inverter has a feature of GridOn :"+GridOn);
    }

}
