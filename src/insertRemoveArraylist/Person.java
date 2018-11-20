
package insertRemoveArraylist;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String gender;
    public Person(String nm, int ag, String g){
        name = nm;
        age = ag;
        gender = g;
    }
    public Person(String nm, int ag){
        name = nm;
        age = ag;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int a){
        age = a;
    }

    public int getAge() {
        return age;
    }
    public String getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
    
    public int compareTo(Person t) {
        return name.compareTo(t.getName());
    }
    
}
