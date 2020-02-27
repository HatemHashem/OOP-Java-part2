package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if((name!=null&&(name.length()>0&&name.length()<=40))&&(age>=0&&age<=120)) {

            this.name = name;
            this.age = age;
        }else {
            throw new IllegalArgumentException("the name shouldnt be null or more than 40 character." +
                    "\n The age has also to be between 0-120. ");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
