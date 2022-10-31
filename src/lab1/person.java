package lab1;
//средний возраст и кол-во мужчин
public class person {
    private String surname;
    private int age;
    private boolean gender;

    public person() {
        surname = "Иванов";
        age = 32;
        gender = true;
    }
    public person(String val) {
        surname = val;
       }
    public person(int val) {
        age = val;
    }
    public person(String val1, boolean val2) {
        surname = val1;
        gender = false;
    }

    public void setSurname(String val) {
        surname = val;
    }
    public void setAge(int val) {
        age = val;
    }
    public void setGender(boolean val) {
        gender = val;
    }

    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public boolean getGender() {
        return gender;
    }


}
