package day39_Recap_Encapsulation_Inheritance.Shapes.Shapes;

public class Shape {

    private String name;

   // private double area;
    //private double perimeter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("Name can not be null");
            System.exit(1);
        }

        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1); // 1 means there is some issue with the code
        }
        this.name = name;
    }

/*
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }


 */
    public Shape(String name) {
        setName(name);
    }


    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
