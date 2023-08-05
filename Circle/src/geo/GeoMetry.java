package geo;

/**
 *
 * @author user
 */
public class GeoMetry {

    private double radius;

    //default constructor
    public GeoMetry() {

    }

    //argument constructor
    public GeoMetry(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        
        if(radius > 0){
        this.radius = radius;
    }}

    public double getArea() {

        double area = Math.PI * radius * radius;

        return area;
    }

    public double getPerimeter() {

        double perimeter = 2 * Math.PI * radius;

        return perimeter;
    }

}
