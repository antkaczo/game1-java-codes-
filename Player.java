import java.util.Random;

public class Player {

    Random random = new Random();

    static int HP;
    int Mana;
    int zloto;
    int srebro;
    boolean sztylet=false;
    int secondattack;
    int mainattack=26;
    boolean playernegative;

    double player_effects=1.0;

    public Player(int HP, int mana, int zloto,int srebro) {
        this.HP = HP;
        this.Mana = mana;
        this.zloto = zloto;
        this.srebro=srebro;
    }

    public int PlayerAttack() {
        int attack = random.nextInt(mainattack+1);
        while (attack > 25) {
            attack = random.nextInt();
        }
        attack *= player_effects;
        if (attack >=(mainattack-2) ) {
            System.out.println("Trafeinie krytyczne");
            if (attack==0){
                System.out.println("Nie trafiasz");
            }
        }
        return attack;
    }

    public int leczenie() {
        HP += 20;
        if (HP > 100) {
            HP = 100;
        }
        return HP;
    }

    public int SecondAttack(){
        int obrazenia = random.nextInt(secondattack+1);
        if (obrazenia>=(secondattack-2)){
            System.out.println("Trafienie krytyczne");
        }
        if (obrazenia==0){
            System.out.println("Nie trafiłeś");
        }
        return obrazenia;

    }

    public int kula_ognia(){
        if (Mana <25){
            System.out.println("Nie masz wystarczająco many aby użyć tego zaklęcia");
            return Mana ;
            //Coded by Antkaczo
        }else{
            int obrazenia = random.nextInt(51);
            obrazenia*=player_effects;
            if (obrazenia>=47){
                System.out.println("Trafienie krytyczne");
            }
            System.out.println("Rzucasz kulę ognia która zadaje " + obrazenia + " punktów życia");
            Mana=Mana-25;
            return obrazenia;}
    }

    public void zakup(int wydane, int wydane_srebro) {
        if (zloto >= wydane && srebro >= wydane_srebro) {
            zloto = zloto - wydane;
            srebro = srebro - wydane_srebro;
            System.out.println("Zapłaciłeś " + wydane + " złota i " + wydane_srebro + " srebra\n" +
                    "Zostaje ci " + zloto + " złota i " + srebro + " srebra" );

        }
        else {
            System.out.println("Nie masz wystarczająco monet. nie udało się kupić");
        }
    }

    public void DemageTaken(int obrazenia, String name){
        System.out.println(name + " odbiera ci " + obrazenia + " punktów życia swoim atakiem");
        HP=HP-obrazenia;
    }

    public void negatywne(int obrazenia, int tury, String rodzaj){
        if (rodzaj=="krwawienie"&&tury>0){
            System.out.println("Tracisz " + obrazenia + " punktów życia od krwawienia");
            HP-=obrazenia;
        }
        if (tury==0 && "krwawienie"==rodzaj){
            System.out.println("Krwawienie ustało");
        }

        if (tury==0){
            playernegative=false;
        }
    }
}
