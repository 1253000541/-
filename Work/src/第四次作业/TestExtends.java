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

Student o2 = new Student("����", 18, "��ѧ��");

o2.show();

System.out.println();

Undergraduate o = new Undergraduate("����", 22, "����", "�����");
o.show();

Graduate o1 = new Graduate("����",26,"�о���","�ֲ�ʽ����");

o1.show();

}

}

class Student { //ѧ����

String name; //����

int age; //����

String education; //ѧ��

public Student(String name, int age, String education) { //���췽��

this.name = name;

this.age = age;

this.education = education;

}

public void show() {

System.out.print("����:" + name + " ����:" + age + " ѧ��:" + education); }

}



class Undergraduate extends Student { //�������࣬��ѧ����̳�

String specialty; //רҵ����������

public Undergraduate(String name, int age, String education,

String specialty) {

super(name, age, education);

this.specialty = specialty;

}

@Override

public void show() { //���Ǹ����ͬ��show()����

super.show();

System.out.println(" רҵ:" + specialty );

}

}



class Graduate extends Student { //�о����࣬��ѧ����̳�

String direction; //�о�������������

public Graduate(String name, int age, String education, String direction) {

super(name, age, education);

this.direction = direction;

}

@Override

public void show() { //���Ǹ����ͬ��show()����

super.show();

System.out.println(" �о�����:" + direction );

}

}
