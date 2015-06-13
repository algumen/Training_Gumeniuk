/**
 * Created by Oleksii on 07.06.2015.
 */
public class Cat_5 {

    public static void main(String[] args) {

        Cat catVaska = new Cat("Vaska",3,4,5);
        Cat catBarsik = new Cat("Barsik",4,5,6);
        Cat catMurzik = new Cat("Murzik",5,6,7);

        boolean a = catVaska.fight(catBarsik);
        boolean b = catBarsik.fight(catMurzik);
        boolean c = catVaska.fight(catMurzik);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        //add your code here
    }

        public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; //эквивалентно return score > 2 ? true : false;
        }
    }
}
