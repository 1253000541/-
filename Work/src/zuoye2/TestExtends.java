/**
 * 
 */
/**
 * @author kd
 *
 */
package Work;
public class TestExtends {

public static void main(String[] args) {

Student o2 = new Student("张三", 18, "大学生");

o2.show();

System.out.println();

Undergraduate o = new Undergraduate("李四", 22, "本科", "计算机");
o.show();

Graduate o1 = new Graduate("王五",26,"研究生","分布式计算");

o1.show();

}

}

class Student { //学生类

String name; //姓名

int age; //年龄

String education; //学历

public Student(String name, int age, String education) { //构造方法

this.name = name;

this.age = age;

this.education = education;

}

public void show() {

System.out.print("姓名:" + name + " 年龄:" + age + " 学历:" + education); }

}



class Undergraduate extends Student { //本科生类，从学生类继承

String specialty; //专业，新增属性

public Undergraduate(String name, int age, String education,

String specialty) {

super(name, age, education);

this.specialty = specialty;

}

@Override

public void show() { //覆盖父类的同名show()方法

super.show();

System.out.println(" 专业:" + specialty );

}

}



class Graduate extends Student { //研究生类，从学生类继承

String direction; //研究方向，新增属性

public Graduate(String name, int age, String education, String direction) {

super(name, age, education);

this.direction = direction;

}

@Override

public void show() { //覆盖父类的同名show()方法

super.show();

System.out.println(" 研究方向:" + direction );

}

}
