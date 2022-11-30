package classes;

public class FightCat {
    String name;
    int age;
    int weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public boolean fight(FightCat nextFightCat) {
        int i = 0;
        int strength1 = (this.age / this.weight);
        int strength2 = (nextFightCat.age / nextFightCat.weight);
        if (this.age > nextFightCat.age) i++;
        else if (this.age < nextFightCat.age) i--;
        if (strength1 > strength2) i++;
        else if (strength1 < strength2) i--;
        if (this.weight > nextFightCat.weight) i++;
        else if (this.weight < nextFightCat.weight) i--;
        return (i >= 0);
    }


    public static void main(String[] args) {
        FightCat zopa = new FightCat();
        zopa.setAge(1 + (int) (Math.random() * 15));
        zopa.setWeight(1 + (int) (Math.random() * 9));
        zopa.setName("Zopa");
        FightCat sirko = new FightCat();
        sirko.setAge(1 + (int) (Math.random() * 15));
        sirko.setWeight(1 + (int) (Math.random() * 9));
        sirko.setName("Sirko");
        FightCat arno = new FightCat();
        arno.setAge(1 + (int) (Math.random() * 15));
        arno.setWeight(1 + (int) (Math.random() * 9));
        arno.setName("Arno");
    //    System.out.println(zopa.fight(sirko));
     //   System.out.println(sirko.fight(zopa));
        resultOfFight(zopa,sirko);
        resultOfFight(zopa,arno);
        resultOfFight(sirko,arno);
    }

    public static void resultOfFight(FightCat cat, FightCat cat1) {
        if (cat.fight(cat1) == true && cat1.fight(cat) == false) {
            System.out.println(cat.name + " Win");
        } else if ((cat.fight(cat1) == false && cat1.fight(cat) == true)) {
            System.out.println(cat1.name + " Win");
        }
    }
}
