package lab1;

public class WriterInfo {
    public void print(person p)
    {
        System.out.println("Фамилия: "+p.getSurname());
        System.out.println("Возраст: "+p.getAge());
        if(p.getGender()) {System.out.println("Пол: мужчина");}
        else { System.out.println("Пол: женщина");}
    }
}
