package web.models;

public class Car {

    private String vendor;
    private String model;
    private int date;
    private static String header = "Vendor/" + ' ' + "Model/" + ' ' + "Date of production";

    public Car(String vendor, String model, int date) {
        this.vendor = vendor;
        this.model = model;
        this.date = date;
    }

    public Car() {
    }

    ;

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                '}';
    }

    public String toStringFormatted() {
        return vendor + "/ " + model + "/ " + +date;
    }

    public String header() {
        return header;
    }
}
