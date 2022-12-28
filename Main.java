public class Main {
        public static void main(String[] args) {
            System.out.println("--------Team1-----------");
    
            Comandor comandor1 = new Comandor("Ucsor", 250, new LongBow(), new Tartscheshield());
            Team<Archer> archers = new Team<>(comandor1);
            archers.addWarrior(new Archer("Pek", 150, new LongBow(), new Tartscheshield()));
            archers.addWarrior(new Archer("Bronczi", 150, new LongBow(), new Tartscheshield()));
    
            System.out.println(comandor1);
            archers.forEach(System.out::println);
            System.out.println("Урон: " + archers.getAllDamage());
            System.out.println("Здоровье:" + archers.getAllHealthPoint());
            System.out.println("Дальность атаки:" + archers.getMaxRadius());
            System.out.println("Защита:" + archers.getAllProtect());
    
    
            System.out.println("--------Team2---------");
    
            Comandor comandor2 = new Comandor("Horus", 250,new Sekira(), new Bakler());
            Team<Barbarian>  barbarians= new Team<>(comandor2);
            barbarians.addWarrior(new Barbarian("Gork", 150, new Sekira(), new Bakler()));
            barbarians.addWarrior(new Barbarian("Bork", 150, new Sekira(), new Bakler()));
            barbarians.addWarrior(new Barbarian("Mork", 150, new Sekira(), new Bakler()));
    
            System.out.println(comandor2);
            barbarians.forEach(System.out::println);
            System.out.println("Урон: " + barbarians.getAllDamage());
            System.out.println("Здоровье:" + barbarians.getAllHealthPoint());
            System.out.println("Дальность атаки:" + barbarians.getMaxRadius());
            System.out.println("Защита:" + barbarians.getAllProtect());
    
            System.out.println("--------Team3---------");
            Comandor comandor3 = new Comandor("Fugrim", 250, new LongBow(), new IronShield());
            Team<Warrior> gang = new Team<>(comandor3);
            gang.addWarrior(new Archer("Peturabo", 150, new LongBow(), new Tartscheshield()));
            gang.addWarrior(new Barbarian("Alpharius", 150, new Sekira(), new Bakler()));
    
            System.out.println(comandor3);
            gang.forEach(System.out::println);
            System.out.println("Урон: " + gang.getAllDamage());
            System.out.println("Здоровье:" + gang.getAllHealthPoint());
            System.out.println("Дальность атаки:" + gang.getMaxRadius());
            System.out.println("Защита:" + gang.getAllProtect());
    
    
    
        }
    }