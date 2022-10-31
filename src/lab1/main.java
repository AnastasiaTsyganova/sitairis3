package lab1;

public class main {
    public static void main(String[] args){
        person p1=new person("Петрова", false);
        person p2=new person();
        person p3=new person();
        WriterInfo wi=new WriterInfo();
        p2.setSurname("Сидоров");
        p2.setAge(65);
        System.out.println("Человек 1: ");
        wi.print(p1);
        System.out.println("Человек 2: ");
        wi.print(p2);
        System.out.println("Человек 3: ");
        wi.print(p3);
        int a1, a2, a3;
        a1=p1.getAge();a2=p2.getAge();a3=p3.getAge();
        int res = (a1 + a2 + a3) / 3;
        System.out.println("Средний возраст трёх человек: " + res);
        boolean v1, v2, v3;
        v1=p1.getGender();v2=p2.getGender();v3=p3.getGender();
        res = 0;
        if (v1)
        {
            res++;
        }
        if (v2)
        {
            res++;
        }
        if (v3) res++;
        System.out.println("Кол-во мужчин в списке: "+res);

    }
}
