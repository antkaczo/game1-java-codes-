import java.io.IOException;
import  java.util.Random;
import java.util.Scanner;
public class gra {
   public static PrintTxt print = new PrintTxt();
    public static boolean idzdalej=false;
    public static void main(String[] args) throws InterruptedException, IOException {

        Player gracz = new Player(100,50,0,0);


        System.out.println("-------------------------\n" +
                "|                       |\n" +
                "|         Akt 1         |\n" +
                "|        Pobudka        |\n" +
                "|                       |\n" +
                "-------------------------");

       print.PrintTxt("Budzisz się w środku dębowego lasu. Przed sobą widzisz dwie ścieżki.\n" +
                "Jedna prowadzi w lewo druga w prawo. Którą wybierzesz?\n" +
                "1 - w lewo\n" +
                "2 - w prawo\n",0);
        Scanner scanner = new Scanner(System.in);

        int wybór= scanner.nextInt();
       while (1==1){
            if (wybór==1){
                goblin(gracz.HP, gracz.Mana);
                break;}
            if (wybór==2){
                ogr(gracz.HP,gracz.Mana);
                break;}
            if (wybór==0){
                JajoWielkanocne(gracz.HP,gracz.Mana);
                break;}

                System.out.println("nie ma takiej opcji proszę wprowadzić poprawną opcje");
                wybór=scanner.nextInt();
        }
        print.PrintTxt("Podążałeś dalej leśną ścieżką aż dotarłeś do rozdroża.\n",225);
        Thread.sleep(500);
        print.PrintTxt("Gdy rozglądałeś się po okolicy zauważyłeś drogowskaz.\n Wskazuje on dwie drogi.\n Jedną do miasta. \n Drugą na polanę.\n Którą z nich chesz podążać\n 1 - do miasta\n 2 - na polanę",225);
         wybór = scanner.nextInt();
        while (1==1){
            if (wybór==1){
                miasto(gracz);
                }
            if (wybór==2){
                polana(gracz);
                }
            if (idzdalej){
                break;
            }


            else {System.out.println("nie ma takiej opcji proszę wprowadzić poprawną opcje");
            wybór=scanner.nextInt();}
           if (wybór==1||wybór==2){
               print.PrintTxt("Dokąd chesz się teraz udać\n 1 - miasto \n2 - polana",225);
               wybór = scanner.nextInt();
           }
        }
        Las FORSET = new Las();
        FORSET.Las(gracz);
        FORSET.Forest();


    }

    int wybor1;

    static void goblin(int HP, int mana) throws InterruptedException {
        int EnemyHP = 70;
        print.PrintTxt("Podążałęś wzdłóż wybranej ścieżki aż na twoej drodze stanął goblin",225);
        Scanner  scanner = new Scanner(System.in);
        while (EnemyHP>0 && HP>0) {
            System.out.println("twoje HP wynosi " + HP
                    + "/100\n" +
                    "masz " + mana + "/50 many" +
                    "\n HP goblina wynosi " + EnemyHP);


            System.out.println("Co zamierzasz zrobić?\n" +
                    "1 - zaatakować\n" +
                    "2 - użyć kuli ognia\n" +
                    "3- uleczyć się\n");
            int decyzja = scanner.nextInt();
            if (decyzja == 1) {
                int attack = PlayerAttack();
                System.out.println("zadałeś potworowi " + attack + "punktów obrażeń");
                EnemyHP = EnemyHP - attack;
            } else if (decyzja == 2) {


                int attaack = kula_ognia(mana);
                EnemyHP = EnemyHP - attaack;
                if (mana >= 25) {
                    mana = mana - 25;
                }


            } else if (decyzja == 3) {
                HP = leczenie(HP);


            } else {
                System.out.println("nie ma takiej opcji do wyboru. tura stracona");
            }
            if (EnemyHP > 0) {
                int enemyAttack = enemy_attack();
                HP = HP - enemyAttack;
            }                if (EnemyHP==0){
                break;
            }

        }
        scanner.close();


            if (HP<=0){
                print.PrintTxt("GAME OVER",500);
                System.exit(0);
        }
        print.PrintTxt("Gratulacje!!!\n Pokonałeś goblina. Możesz dalej podążać swoją drogą",225);}


    static void ogr(int HP, int mana)throws InterruptedException{
        int EnemyHP = 150;
        print.PrintTxt("Podążałęś wzdłóż wybranej ścieżki aż twoją drogę zagrodził ogr",225);
        Scanner  scanner = new Scanner(System.in);
        while (EnemyHP>0 && HP>0){
            System.out.println("twoje HP wynosi " + HP
                    + "\nmasz " + mana + " many"
                    + "\n HP ogra wynosi " + EnemyHP);


            System.out.println("Co zamierzasz zrobić?\n" +
                    "1 - zaatakować\n" +
                    "2 - użyć kuli ognia\n" +
                    "3- uleczyć się\n");
            int decyzja = scanner.nextInt();
            if (decyzja == 1){
                int attack = PlayerAttack();
                System.out.println("zadałeś potworowi " + attack + "punktów obrażeń");
                EnemyHP=EnemyHP-attack;
            }else if(decyzja ==2 ){


                int attaack =kula_ognia(mana);
                EnemyHP=EnemyHP-attaack;
                if (mana>=25){
                    mana=mana-25;
                }



            } else if (decyzja==3) {
                HP=leczenie(HP);


            }
            else{
                System.out.println("nie ma takiej opcji do wyboru. tura stracona");
            }
            if (EnemyHP>0){
                int enemyAttack = enemy_attack();
                HP=HP-enemyAttack;}
                if (EnemyHP==0){
                    break;
                }
            if (HP<=0){
                print.PrintTxt("GAME OVER",225);
                System.exit(0);}

        }
        scanner.close();


        print.PrintTxt("Gratulacje!!!\n Pokonałeś ogra. Możesz dalej podążać swoją drogą",225);}


static void miasto(Player gracz) throws InterruptedException {

    int wybor1;
        miasto Miasto = new miasto();
    print.PrintTxt("Wkroczyłeś do miasta. Na środku miasta znajduje się plac na którym grajek przygrywa melodię.\n" +
            "W oddali widać brzeg do którego prowadzą kręte ulice. \n" +
            "Po zauważeniu licznej ilości straganów rybackich wnioskujesz że w mieście powodzi się z połowami\n" +
            "Zauważasz też karczmę oraz stoisko wróźki.\n" +
            "Gdzie chesz się udać?\n 1- wybrzeże \n 2 - stragany rybackie\n 3- karczma\n 4 - stoisko wróźki\n 5- zawrócić i wyjść z miasta",150);
    Scanner scanner = new Scanner(System.in);
    wybor1 = scanner.nextInt();
    while (1==1){
        if (wybor1==1){

            Miasto.wybrzerze();
        }
        if (wybor1==2){
            Miasto.Stragany();
        }
        if (wybor1==3){
            Miasto.Karczma(gracz);

        }
        if (wybor1==4){
            Miasto.StoiskoWrożki(gracz);
        }
        if (wybor1==5){
            System.out.println("Zawracasz i udajesz się spowrotem pod drogowskaz.");
            break;
        }
        if (wybor1==1 || wybor1==2 || wybor1==3 || wybor1==4 || wybor1==5){
            print.PrintTxt("Wróciłeś na plack miejski. Co zamierzasz teraz zrobić?Gdzie chesz się udać? \n 1-pójść na wybrzeże \n 2 -przejść się po straganach rybackich\n 3- udać się do karczmy \n 4 - odwiedzić stoisko wróźki\n 5- zawrócić i wyjść z miasta\n",225);
            wybor1= scanner.nextInt();

        }
        scanner.close();
    }
}

static void polana(Player gracz) throws InterruptedException {
   int test;
    int test1;
    Scanner scanner = new Scanner(System.in);
    print.PrintTxt("Wkrosczyłeś na polanę. Widzisz jak ścieżka którą podążasz rozcina kwiecistą łąkę\n" +
            "Gdzie niespojrzysz widzisz kwiaty w najróźniejszych kolorach. Dostrzegasz że po lewej stronie\n" +
            "pośród kwiatów coś się porusza, zaś po prawej stronie widzisz górkę na szczycie której znajduje się\n" +
            "łysa plama bez kwiatów.\n" +
            "Co zamierzasz zrobić?\n" +
            "1 - sprawdzić co się porusza w trawie\n" +
            "2 - pójść na górkę\n" +
            "3 - podażać dalej ścieżką\n" +
            "4 - zawrócić",150);
    Polana polana = new Polana(gracz);
        test = scanner.nextInt();
        while (1==1){
            if (test==1){
                polana.wilk();
            } else if (test==2) {
                polana.Gorka(gracz);
            }else if (test==3){
                System.out.println("Jeżeli dalej pójdziesz ścieżką to nie będziesz mógł wrócić na polane i do miasta.\n" +
                        "Czy napewno chcesz isć?\n" +
                        "1 - tak\n" +
                        "2 - nie");
                test1=scanner.nextInt();
                if (test1==1){
                    idzdalej=true;
                        break;}

            } else if (test==4) {
                System.out.println("Zawracasz i udajesz się spowrotem pod drogowskaz.");
                break;

            }else{
                System.out.println("Nie ma takiej opcji. Proszę wybrać poprawną opcje");
                test= scanner.nextInt();
            }
            if (test==1|test==2||test==3){
                print.PrintTxt("Co zamierzasz teraz zrobić?\n" +
                        "1 - sprawdzić co się dzieje w trawie\n" +
                        "2 - pójść na górkę\n" +
                        "3- podążać dalej ścieżką\n" +
                        "4 - zawrócić",200);
                test=scanner.nextInt();
            }
        }
}


    static int enemy_attack(){
        Random random = new Random();
        int attack = random.nextInt(16);
        while (attack>15){
            attack= random.nextInt();
        }
        if (attack>=14){
            System.out.println("Trafienie krytyczne");
        }
        System.out.println("Otrzymujesz " + attack + " obrażeń");
        return attack;
    }


    static int PlayerAttack(){
        Random random = new Random();
        int attack = random.nextInt(26);
        while (attack>25){
            attack= random.nextInt();}
        if (attack>=23){
            System.out.println("Trafeinie krytyczne");
        }



        return attack;


    }


    static int leczenie(int PlayerHP){
        PlayerHP+=20;
        if (PlayerHP>100) {
            PlayerHP = 100;
        }

        return PlayerHP;
    }


    static int kula_ognia(int mana){
        if (mana<25){
            System.out.println("Nie masz wystarczająco many aby użyć tego zaklęcia");
            return mana;
        }else{
        Random random = new Random();
        int obrazenia = random.nextInt(51);
        if (obrazenia>=47){
            System.out.println("Trafienie krytyczne");
        }
        System.out.println("Rzucasz kulę ognia która zadaje " + obrazenia + " punktów życia");
        return obrazenia;}
    }

    //Coded by Antkaczo
    static void JajoWielkanocne (int HP, int Mana) throws InterruptedException {
        int szanse;
        Random random = new Random();
        print.PrintTxt("Odwracasz się do tyłu. Widzisz przed sobą podejrzanie wyglądający kamień. Gdy się do niego zbliżałeś ziemia zaczeła się trzęśc.",225);
        Thread.sleep(3000);
        print.PrintTxt( " Z pod kamienia wyłonił się kamienny golem. Ma on 5 metrów wzrostu, jego ciało jest pokryte mchem a w środku jego torsu lśni jego rdzeń",225);
        Thread.sleep(2000);
        int EnemyHP = 700;
        Scanner  scanner = new Scanner(System.in);
        while (EnemyHP>0 && HP>=0){
            System.out.println("twoje HP wynosi " + HP
                    + "/100\n" +
                    "masz " + Mana + "/50 many" +
                    "\n HP golema wynosi " + EnemyHP);
                    Thread.sleep(1000);
            System.out.println("Co zamierzasz zrobić?\n" +
                    "1 - zaatakować\n" +
                    "2 - użyć kuli ognia\n" +
                    "3- uleczyć się\n");
            int decyzja = scanner.nextInt();
            if (decyzja == 1){
                szanse = random.nextInt(2);
                if (szanse==0){
                int attack = PlayerAttack();
                System.out.println("zadałeś potworowi " + attack + "punktów obrażeń");
                EnemyHP=EnemyHP-attack;}
                else {
                    System.out.println("Nie udało ci się przebić skóry golema");
                }
            }else if(decyzja ==2 ){


                int attaack =kula_ognia(Mana);
                EnemyHP=EnemyHP-attaack;
                if (Mana>=25){
                    Mana=Mana-25;
                }



            } else if (decyzja==3) {
                HP=leczenie(HP);


            }
            else{
                System.out.println("nie ma takiej opcji do wyboru. tura stracona");
            }
            if (EnemyHP>0){
                szanse= random.nextInt(3);
                if (szanse==0){
                    System.out.println("Golem strzela promieniem ze swojego rdzenia");
                    szanse= random.nextInt(76);
                    Thread.sleep(1500);
                    System.out.println("Otrzymałeś " + szanse + " obrażeń");
                    HP=HP-szanse;
                }else if(szanse==1){
                    System.out.println("Golem uderza swoją ręką");
                    Thread.sleep(1500);
                    szanse= random.nextInt(51);
                    System.out.println("Otrzymujesz " + szanse + "obrażeń od uderzenia");
                    HP=HP-szanse;
                }else {
                    System.out.println("Golem nic nie robi");
                }
                }
            if (EnemyHP<=0){
                break;
            }

    }
        if (HP<=0){
            print.PrintTxt("GAME OVER",225);
            System.exit(0);
        }
        print.PrintTxt("Pokonałeś sekretnego bossa. Gratulację!",225);
        scanner.close();
}}
