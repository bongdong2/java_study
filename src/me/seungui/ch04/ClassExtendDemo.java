package me.seungui.ch04;

public class ClassExtendDemo {

    public static void main(String[] args) {

        // Manager 객체를 Employee 변수에 할당하는 이유는 모든 직원에 동작하는 코드를 작성할 수 있기 때문
        Employee[] staff = new Employee[4];
        staff[0] = new Employee("seungui", 2400);
        staff[1] = new Employee("jwa", 2800);
        staff[2] = new Employee("bongdong", 3300);
        staff[3] = new Manager("buminseok", 600);

        Manager temp = (Manager)staff[3];
        temp.setBonus(10);

        double sum = 0;
        for(Employee em : staff) {
            System.out.println("name: " + em.getName() + ", salary : " + em.getSalary());
        }

        // ======================================================================================
        /*System.out.println("==============================================");
        MagicGoblin magicGoblin = new MagicGoblin("uuuueeee", 100, 25);
        magicGoblin.levelup();
        System.out.println(magicGoblin.toString());

        System.out.println("==============================================");

        BasicGoblin basicGoblin = new BasicGoblin("seungui", 80, 5);
        System.out.println("basicGoblin HP : " + basicGoblin.getHp());
        basicGoblin.levelup();
        System.out.println("basicGoblin HP : " + basicGoblin.getHp());
        basicGoblin.attack();
        System.out.println(basicGoblin.toString());*/
        // ======================================================================================
    }
}

class Monster {
    public String name;
    public int hp;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void levelup() {
        System.out.println("level up!");
        this.hp += 20;
    }

    public void die() {
        System.out.println("you died");
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}

class MagicGoblin extends Monster {
    private int mp;

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public MagicGoblin(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }

    public void levelup() {
        System.out.println("magicGoblin level up!!");
        this.hp += 30;
        this.mp += 5;

        System.out.println(this.getHp());
        System.out.println(this.getMp());
    }

    @Override
    public String toString() {
        return "MagicGoblin{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                '}';
    }
}

class BasicGoblin extends Monster {
    private int attackDamage;

    public BasicGoblin(String name, int hp, int attackDamage) {
        super(name, hp);
        this.attackDamage = attackDamage;
    }

    public void attack() {
        System.out.println("attack : " + attackDamage);
    }
}