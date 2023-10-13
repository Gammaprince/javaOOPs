* Comparator is interface by using which we can specify own logic for sorting.
* Comparable is also interface using which we can specify own logic for sorting within class itself


  // Below is example for comparator
class Student {
  int age;
  String name;
  public Student(int age , String name){
    this.age = age;
    this.name = name;
  }
}
public static void main(){

  Comparator<Student> com = new Comparator<>(){  // Comparator is interface
    public compareTo(Student i , Student j){
      if(i.age > j.age) return 1;
      else return -1;
    }
  }
  
  List<Student> stud = new ArrayList<>();
  stud.add(new Student(11,"Kan"));
  stud.add(new Student(9,"Ran"));
  stud.add(new Student(17,"Rocky"));
  stud.add(new Student(8 , "Ram"));

  Collections.sort(stud,com);
  
}

// if we had list of Integer then for default sorting we don't need comparator interface because Integer class is using comparable by which if you would not provide comparotor logic.
// It would run perfectly fine based over comparable interface.

// so for implementing custom logic for sorting inside own class , it happens using comparable

// example below for comparable

class Student implements Comparable<Student> {
  int age;
  String name;
  public Student(int age , String name){
    this.age = age;
    this.name = name;
  }
  public compareTo(Student i){
    if(this.age > i.age) return 1;
    else return -;1
  }
}

public static void main(){
  List<Student> stud = new ArrayList<>();
  stud.add(new Student(11,"Kan"));
  stud.add(new Student(9,"Ran"));
  stud.add(new Student(17,"Rocky"));
  stud.add(new Student(8 , "Ram"));

  Collections.sort(stud); // by default , if we would not use comparator then this list of object will be sorted according to comparable, but still we can overwrite logic in comparator.
}

