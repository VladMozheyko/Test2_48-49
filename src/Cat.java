public class Cat {
    String name;
    int age;
    double weight;
    static int id;   //  Переменная принадлежащая классу
    int ident;       // Переменная принадлежащая объекту

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        ident = id;     // Автоматически генерирую идентификаторы
        id++;
    }

    public void className(){
        System.out.println("Создан в классе Cat");
    }

    @Override
    public String toString() {        //  Метод для вывода полей объекта
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", ident=" + ident +
                '}';
    }
}
