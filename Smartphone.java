//: oscar dumeng
// date: 11//2026
// course: cmp129
// week: 10-11
// lab: 1
public class Smartphone implements Device {
    private String brand;
    private String model;
    private double screenSize;

    
    public Smartphone(String brand, String model, double screensize)
    {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public double getScreensize()
    {
        return screenSize;
    }
    public void setScreensize(double screenSize)
    {
        this.screenSize = screenSize;
    }

    @Override 

    public void turnOn()
    {
        System.out.println(brand + model+ "laptop turned on");
        System.out.println("processor: " + screenSize);
    }
}
