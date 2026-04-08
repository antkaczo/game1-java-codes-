public class Thug extends Enemy{

    int HP ;
    int max_demage;
    int secondattack;
    String name;

    public Thug(String name, int Max_demage, int SecondDemage,int hp){
        this.name=name;
        this.max_demage=Max_demage;
        this.secondattack=SecondDemage;
        this.HP=hp;
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
        System.out.println(name + " odzyskał " + heal + " punktów życia");
        return HP;
    }


    int firstattack(int max_demage){
        int demage = random.nextInt(max_demage);
        if (demage==0){
            System.out.println(name + " nie trafił");
        }
        if (demage>=(max_demage-2)){
            System.out.println("Trafienie krytyczne");
        }
        return demage;
    }

    int SecondAttack(int second_attack_max_demage){
        int demage = random.nextInt(second_attack_max_demage);
        if (demage==0){
            System.out.println(name + " nie trafił");
        }
        if (demage>=(max_demage-2)){
            System.out.println("Trafienie krytyczne");
        }
        return demage;
    }

    int Bow(){
        if (random.nextInt(10)>2){
            int demage = random.nextInt(max_demage);
            while (demage==0){
                demage=random.nextInt(max_demage);
            }
            System.out.println("Strzała wystrzelona z łuku zadaje ci " + demage+ " punktów obrażeń");
            return demage;
        }else {
            System.out.println("Strzała nie trafiłą");
            return 0;
        }
    }
}
