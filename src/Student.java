public class Student {

    private String name;
    private String surname;
    private String patronymic;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    void printFullName() {
        System.out.print("Фамилия: " + surname + " Имя: " + name + " Отчество: " + patronymic + "\n");
    }
}