package day45_Abstraction.Shapes;

public abstract class ShapeParent {

    private final String name;



    public ShapeParent( String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }



    public abstract  double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
