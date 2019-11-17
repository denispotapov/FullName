public class Main {
    public static void main(String[] args) {

        Student f = new Student();
        f.setName("Иван");
        f.setSurname("Иванов");
        f.setPatronymic("Иванович");
        /*String name = f.getName();
        String surname = f.getSurname();
        String patronymic = f.getPatronymic();*/

        f.printFullName();


    }


}
