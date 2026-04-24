public class Wolf extends Enemy{

    int HP ;
    int max_demage;
    int secondattack=setSecond(10);
    String name;

    public Wolf(String name, int Max_demage, int SecondDemage,int hp){
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
        //Coded by Antkaczo
    }

    int getFirstattack(int max_demage) {
        return super.firstattack(max_demage);
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
            demage= random.nextInt(secondattack+1);
        }
        if (demage==0){
            System.out.println(name + " nie trafił");
        }
        if (demage>=(max_demage-2)){
            System.out.println("Trafienie krytyczne");
        }
        return demage;
    }
}




