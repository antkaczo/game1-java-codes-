import java.util.Random;
public class Enemy {
    int HP;
    int max_demage;
    int second_attack_max_demage;
    String name;

    Random random = new Random();

    int firstattack(int max_demage){
        int demage = random.nextInt(max_demage);
        if (demage==0){
            System.out.println(name + " nie trafił");
        }
        if (demage>=(max_demage-2)){
            System.out.println("Trafienie krytyczne");
            //Coded by Antkaczo
        }
        return demage;
    }

    int SecondAttack(int second_attack_max_demage){
        int demage = random.nextInt();
        if (demage==0){
            System.out.println(name + " nie trafił");
        }
        if (demage>=(max_demage-2)){
            System.out.println("Trafienie krytyczne");
        }
        return demage;
    }

    int setmaxattack(int max){
        max_demage=max;
        return max;
    }
    String SetName(String Name){
        name = Name;
        return name;
    }
    int setHP(int max){
        HP=max;
        return HP;
    }
    int setSecond(int max){
        second_attack_max_demage=max;
        return max;
    }

    int DemageTaken(int obrazenia){
        System.out.println(name + " traci " + obrazenia + " punktów życia");
        HP=HP-obrazenia;
        return HP;
    }

    int Heal(){
        int heal = random.nextInt((HP*(1/3)));
        HP+=heal;
        System.out.println(name + " odzyskał " + heal + " punktów życia");
        return HP;
    }
}
