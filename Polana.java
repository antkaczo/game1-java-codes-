import java.util.Scanner;
import java.util.Random;
public class Polana {
    Scanner scanner = new Scanner(System.in);
    PrintTxt printer = new PrintTxt();
    Random random = new Random();
    Player gracz;
    int smth;
    int smth1;
    int wybor2;
    boolean CzyWalczyl=false;
    boolean CoinFound=false;

    Wolf wilk = new Wolf("Wilk",25,10,55);
    public Polana(Player Gracz){
        this.gracz=Gracz;
    }

    public void Gorka(Player gracz) throws InterruptedException {
        printer.PrintTxt("Wspinasz się na górkę. Z góry rozpościera się ładny widok na\n" +
                "całą polanę oraz otaczający ją las.",225);
        if (CzyWalczyl){
            printer.PrintTxt("Dostrzegasz też stąd plamę krwi po twojej walce z wilkiem.",125);
            Thread.sleep(2000);
            printer.PrintTxt("Starasz się nie myśleć o tym. Myśl o zabiciu tego biednego\n" +
                    "zwierzęcia dalej cię męczy, lecz starasz się o tym nie myśleć",175);
        }
        System.out.println("Czy chcesz tutaj odpocząć?\n" +
                "1 - tak\n" +
                "2 - nie");
        smth=scanner.nextInt();
        while (1==1){
            if (smth==1){
                printer.PrintTxt("Kładziesz się na ziemi.",225);
                Thread.sleep(1000);
                printer.PrintTxt("Zaczynasz przyglądać się chmurom\n" +
                        " i temu jak powolnie płyną po niebie",225);
                Thread.sleep(2500);
                printer.PrintTxt("Od takiego leżenia robisz się senny.",225);
                Thread.sleep(2500);
                System.out.println("Zasypiasz");
                Thread.sleep(5000);
                printer.PrintTxt("Po jakimś czasie budzisz się. Widzisz że Słońce\n" +
                        "przesuneło się na niebie. Czujesz jak twoje siły się zregenerowały\n\n\n",225);
                System.out.println("Twoje zdrowie wynosi teraz 100\n" +
                        "Twoja mana wynosi teraz 50");
                Thread.sleep(5000);
                gracz.HP=100;
                gracz.Mana=50;
                if (CoinFound==false){
                    printer.PrintTxt("Wstając aby wrócić na sciężkę zauważasz, że\n" +
                            "coś świeci się w trawie.\n" +
                            "Nachylasz się aby to obejrzeć.\n" +
                            "Znajdujesz złotą monetę i ją podnosisz",225);
                    CoinFound=true;
                    Thread.sleep(3000);
                }
                printer.PrintTxt("Po podniesieniu otrzepujesz się z ziemi i schodzisz z\n" +
                        "górki wracając na ścieżkę",225);
                break;
            }
            if (smth==2){
                printer.PrintTxt("Schodzisz z górki i wracasz na ścieżkę",225);
                break;
            }else {
                System.out.println("Nie ma takiej opcji. Proszę wybrać poprawną");
                smth=scanner.nextInt();
            }
        }
    }


    public void wilk() throws InterruptedException {
           if (CzyWalczyl==false){
            printer.PrintTxt("Gdy podchodzisz do miejsca gdzie coś się poruszało zauważasz, że\n" +
                    "wśród kwiatów grasuje wilk. Jest duży i ciemno szary. Jego ciało pokrywają blizny,\n" +
                    "które zdają się być od ostrzy. Na jego kłach dostrzegasz zaschniętą krew. Wzbudza on\n" +
                    "w tobie mieszankę strachu i odrazy. Czy chesz spróbować się oddalić od niego?\n" +
                    "1 - tak\n" +
                    "2 - nie",175);
            smth = scanner.nextInt();
            if (smth ==1){
                printer.PrintTxt("Próbujesz się powoli oddalić od wilka",225);
                for (int i =0; i <15;i++){
                    System.out.print(".");
                    Thread.sleep(500);
                    if (i==4||i==9||i==14){
                        System.out.println();
                    }
                }
                if (los(15)<2){
                        printer.PrintTxt("Udało ci się bezpiecznie oddalić od wilka.\n" +
                                "Wracasz na scieżkę na polanie.",225);
                        return;
                    }else{
                    printer.PrintTxt("Nie udało ci się oddalić od wilka. Wilk\n" +
                            "zauważa cię i zaczyna na ciebie warczec. Wiesz że oznacza\n" +
                            "to tylko jedno. ",190);
                    Thread.sleep(2000);
                    printer.PrintTxt("Będziesz musiał z nim walczyć.\n" +
                            "Dobywasz miecza.",160);
                }

            }else if (smth ==2){
                printer.PrintTxt("Kontynujesz przyglądanie się wilkowi. Po\n" +
                        "pewnym czasie twojego obserwowania on również zauważa ciebie.\n" +
                        "Dopiero gdy odwrócił swój łeb zauważasz że nie ma on jednego oka\n" +
                        "W pewnym momencie wilk zaczyna na ciebie warczeć, a następnie szarżować\n" +
                        "w twoim kierunku",225);
                Thread.sleep(2000);
                if (los(2)==1){
                    printer.PrintTxt("Na twoje sczęście udało ci się sparować jego atak, lecz\n" +
                            "teraz musisz z nim walczyć",225);
                }else{
                    printer.PrintTxt("Niestety nie udało ci się sparować jego ataku. Wilk gryzie cię w\n" +
                            "przedramie, po czym odskakuje. Niestety musisz się z nim teraz zmierzyć\n\n" +
                            "Tracisz 10 punktów życia\n" +
                            "Twój mnożnik obrażeń wynosi teraz 0.7",225);
                    gracz.HP-=10;
                    gracz.player_effects=0.7;
                }
            }
            walka(gracz,wilk);
               printer.PrintTxt("Po pokonaniu wilka jego truchło pada na kwiaty wśród, których walczyliście.\n" +
                       "Ocierasz swój miecz z krwi zwierzęcia, po czym chowasz go do pochwy.\n" +
                       "Następnie powracasz na ścieżkę.",270);}
           else {
               printer.PrintTxt("Podchodzisz do miejsca gdzie walczyłeś z wilkiem.",250);
               Thread.sleep(5000);
               printer.PrintTxt("Wśród kwiatów leży teraz truchło wilka, a kwiaty w \n" +
                       "pobliżu już nie emanują kolorem tylko uginają się pod ciężką krwią",225);
               Thread.sleep(5000);
               printer.PrintTxt("Po chwili oglądania tego co zrobiłeś dochodzisz do wniosku, że \n" +
                       "nie ma na co tu patrzeć. Po czym znów wracasz na ścieżke.",225);
           }

    }

    private int los(int limit){
        int wynik = random.nextInt(limit);
        return wynik;
    }

    private void walka(Player gracz, Wolf wilk) throws InterruptedException {
        int wolf_action;
        int szanse;
        int obrazenia;
        int tury=0;
        int fireball;
        while (gracz.HP>0 && wilk.HP>0){
            System.out.println("Masz " + gracz.HP + " punktów życia \n" +
                    "Masz " + gracz.Mana + " many\n" +
                    "Wilk ma " + wilk.HP + " punktów życia\n" +
                    "Co zamierzasz zrobić?\n" +
                    "1 - zaatakować mieczem\n" +
                    "2 - uleczyć się\n" +
                    "3 -użyć kuli ognia ");
            if (gracz.sztylet==true){
                System.out.println("4 - zatakować sztyletem");
            }
            smth1 = scanner.nextInt();
        wolf_action= random.nextInt(2);
        if (wolf_action==0){
            System.out.println("Wilk cię gryzie");
            obrazenia= wilk.firstattack(wilk.max_demage);
            gracz.DemageTaken(obrazenia, wilk.getName() );
            szanse=los(5);
            if (szanse==3&& obrazenia>0){
                System.out.println("Ugryzienie wywołało krwawienie");
                tury+=3;
                gracz.playernegative=true;
            }
        }
        if (wolf_action==1){
            System.out.println("Wilk drapie cię pazurem");
            gracz.DemageTaken(wilk.SecondAttack(wilk.secondattack), wilk.getName());
            //Coded by Antkaczo
        }
        Thread.sleep(2500);

        while (1==1){
        if (smth1 ==1){
                System.out.println("Atakujesz wilka mieczem.");
                wilk.DemageTaken(gracz.PlayerAttack());
                break;
            }else if (smth1 ==2){
                gracz.leczenie();
                break;
            }else if (smth1 ==3){
                fireball= gracz.kula_ognia();
                wilk.DemageTaken(fireball);
                break;
            } else if (smth1 ==4 && gracz.sztylet==true) {
                System.out.println("Dźgasz wilka sztyletem");
                wilk.DemageTaken(gracz.SecondAttack());
                break;
            }else {
                System.out.println("Nie ma takiej opcji. Wybierz pononownie");
        }}
        if (gracz.playernegative){
            gracz.negatywne(5,tury,"krwawienie");
        }
        }
        if (gracz.HP<=0){
            System.out.println("    GAME OVER"  );
            System.exit(0);
        }else {
            System.out.println("Gratulacje. Pokonałeś wilka.");
            CzyWalczyl=true;
        }
    }

}
