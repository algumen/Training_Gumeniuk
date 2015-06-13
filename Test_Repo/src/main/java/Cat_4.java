/**
 * Created by Oleksii on 07.06.2015.
 */

/* ������� ��� ������� ���� Cat
� ������ main ������� ��� ������� ���� Cat � ��������� �� �������.
������������ ����� Cat �� ������ ������. ����� Cat ��������� �� ����.
*/

public class Cat_4 {
    public static void main(String[] args) {

        Cat catVaska = new Cat("Vaska",3,4,5);
        Cat catBarsik = new Cat("Barsik",3,4,5);
        Cat catMurzik = new Cat("Murzik",3,4,5);

        //add your code here
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
