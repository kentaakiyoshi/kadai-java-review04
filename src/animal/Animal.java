package animal;

public class Animal {
    public Animal() {
        
    }
    
    private String name;
    private int age;
    
    public Animal(String name,int age) {
       this.name = name;
       this.age = age;
        
    }
    
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
