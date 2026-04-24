import java.util.Random;

public class Thug extends Enemy{

    int HP ;
    Random random1 = new Random();
    int maxHp;
    int max_demage;
    int secondattack;
    String name;

    public Thug(String name, int Max_demage, int SecondDemage,int hp){
        this.name=name;
        this.max_demage=Max_demage;
        this.secondattack=SecondDemage;
        this.HP=hp;
        this.maxHp=hp;
    }

    public String getName(){return name;}

    public int getHP() {
        return HP;
    }

    public int getMax_demage() {
        return max_demage;
    }

    public int getSecondattack() {
        return secondattack;
    }

    int getFirstattack(int max_demage) {
        //Coded by Antkaczo
        return super.firstattack(max_demage);
    }

    int DemageTaken(int obrazenia){
        System.out.println(name + " traci " + obrazenia + " punktów życia");
        HP=HP-obrazenia;
        return HP;
    }

    int Heal(){
        int heal = random.nextInt(20);

        HP+=heal;
        if (HP>maxHp){
            HP=maxHp;
        }

        System.out.println(name + " odzyskał " + heal + " punktów życia");
        return HP;
    }


    int firstattack(){
        int demage = random.nextInt(max_demage+1);
        if (demage==0){
            System.out.println(name + " nie trafił");
        }
        if (demage>=(max_demage-2)){
            System.out.println("Trafienie krytyczne");
        }
        return demage;
    }

    int SecondAttack(){
        int demage = random.nextInt(secondattack+1);
        while (demage>secondattack || demage<0){
            demage= random.nextInt(secondattack+1);}
        if (demage==0){
            System.out.println(name + " nie trafił");
        }
        if (demage>=(max_demage-2)){
            System.out.println("Trafienie krytyczne");
        }
        return demage;
    }


    }

