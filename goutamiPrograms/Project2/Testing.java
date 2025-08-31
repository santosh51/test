public class Testing {
  int modelYear;
  String modelName;

  public Testing(int year, String name) {
    modelYear = year;
    modelName = name;
  }

public void displayValues(){
    System.out.println("Method call"+modelYear + " " + modelName);
}
  public static void main(String[] args) {
    Testing myCar = new Testing(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
    myCar.displayValues();
  }
}

