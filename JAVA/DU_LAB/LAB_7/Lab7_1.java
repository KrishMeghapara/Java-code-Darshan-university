
public class Lab7_1 {
    public static void main(String[] args) {
        potato p1 = new potato();

    }
}

abstract class vegetable {
    String name;
    String color;

    vegetable(String name, String color) {
        this.name = name;
        this.color = color;
    }

}

class potato extends vegetable {
    super(name,color);
   public potato(String name){
        


    }
}

class Brinjal {
    String name = "Brinjal";
}

class tomato {
    String name = "tomato";
}
