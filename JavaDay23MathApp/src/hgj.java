@FunctionalInteface
interface Parent{

public void sayHello();

}


class MyImple implements Parent{

public void sayHello(){

System.out.println("Hi All");
}

}

class Test {
  public static void main(String [] args)
{
  MyImple  myImple = new MyImple();
  myImple.sayHello();

 }
}