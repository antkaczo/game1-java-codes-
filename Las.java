import java.util.Random;
import java.util.Scanner;
public class Las {
    PrintTxt print = new PrintTxt();
    Player gracz;
    int wybor;
    int wybor1;
    int wybor2;
    int CzySpot=0;
    int wynik;

    Scanner scanner=new Scanner(System.in);
    Random random= new Random();
    Random random1 = new Random();

    void Las(Player gracz){
        this.gracz=gracz;
    }

    Thug plaszcz = new Thug("Męźczyzna w płaszczu",15,5,75);
    Thug lucznik = new Thug("Młodzieniec z łukiem",17,10,65);

    public void Forest() throws InterruptedException {
       print.PrintTxt("Po opusczeniu łąki wszedłeś w las. Podczas podążania ścieżką\n" +
                "widzisz skulonego żołdaka przy drodze.\n" +
                "Czt chcesz z nim porozmawiać?\n" +
                "1 - tak\n" +
                "2 - nie",225);
        wybor=scanner.nextInt();
        if(wybor==1){
            print.PrintTxt("Trącasz żołdaka i próbujesz się od niego dowiedzieć co się stało.",225);
            for (int i =0;i<5;i++){
                System.out.print(".");
                Thread.sleep(500);
            }
            System.out.println();
            print.PrintTxt("Po  chwili twojego trącania żołdak reaguje\n" +
                    "Źołdak:\n Nie, proszę nie. Nie zaciągaj mnie tam spowrotem.",225);
            Thread.sleep(750);
            print.PrintTxt("Próbujesz potem znowu z nim rozmawiać ale już nie odpowiada.",225);
            Thread.sleep(250);
            print.PrintTxt("Jedyne co robi to się trzesię i łka pod nosem",225);
            Thread.sleep(1500);
        }
        print.PrintTxt("Podążasz dalej ścieżką aż scieżka rozchodzi się na trzy strony.\n",225);
        System.out.println("Którą z nich chcesz podążyć?\n" +
                "1 - scieżką prowadzącą w lewo\n" +
                "2- scieżką prowadzącą prosto\n" +
                "3 - ściezką prowadzącą w prawo");
        wybor=scanner.nextInt();
        while (1==1){
            if (wybor==1){
                Spot(gracz);
            }
            else if (wybor==2){
                //coded by Antkaczo
                print.PrintTxt("Wyruszasz dalej w las",300);
                break;
            } else if (wybor==3) {
                prawo();
            }

            if (wybor==1||wybor==2||wybor==3){
                System.out.println("Którą ścieżką chcesz teraz pójść?\n" +
                        "1 - ściezką prowadzącą w lewo\n" +
                        "2 - ścieżką prowadzacą prosto\n" +
                        "3 - ściezką prowadzącą w prawo");
                wybor=scanner.nextInt();
            }
            else{
                System.out.println("Nie ma takiej opcji proszę wybrać poprawną");
                wybor= scanner.nextInt();
            }

        }

    }
    private void Spot(Player gracz) throws InterruptedException {
        if (CzySpot==0){
            print.PrintTxt("Podążasz tą ścieżką aż docierasz do małego skrawka ziemi\n" +
                    " z górką po środku, na której wciąż rośnie drzewo, jesteś w stanie \n" +
                    "stwierdzić że na całym tym obszarze rosły kiedys drzewa, ale zostały\n" +
                    "one już wykarczowane.",300);
            Thread.sleep(2000);
            print.PrintTxt("Widzisz że na środku bezdrzewnego obszaru pali się\n" +
                    "ognisko a dookoła niego stoją ludzie.",300);
            Thread.sleep(1000);
            print.PrintTxt("Po lewej od ogniska stoi długowłosy męźczyzna ubrany w długi, czarny, skórzany\n" +
                    "płaszcz. Na prawo od niego stoi inny facet. Nieco wyższy od niego odziany w \n" +
                    "ciemne lniane spodnie z łańcuchem przy pasie oraz jasną lnianą koszule",300);
            Thread.sleep(1750);
            print.PrintTxt("Następnie stoi młodzieniec ubrany w skórzaną kurtkę oraz spodnie z nieznanego\n" +
                    "ci materiału. Obok niego stoi kobieta odzianwa w długie spodnie z lnu oraz czarną bluzkę\n" +
                    "najprawdopodobniej też  z lnu",300);
            Thread.sleep(1750);
            print.PrintTxt("Za nimi dostrzegasz kolejną grupę ludzi, bardziej liczną. W niej rzuca ci się\n" +
                    "w oczy nizsza dziewczyna odziana w czarną skórzaną kurtkę z naszytymi białymi płatami\n" +
                    "materiału.",150);
            Thread.sleep(1500);
            print.PrintTxt("Po chwili męźczyzna w płaszczu zaczyna mówić.",225);
            Thread.sleep(2000);
            System.out.println("Męźczyzna w płaszczu:");
            print.PrintTxt("Credimus in cod.",750);
            Thread.sleep(1500);
            print.PrintTxt( "Nos immergimus in cod.",750);
            Thread.sleep(1500);
            print.PrintTxt("Penetramus cod.",750);
            Thread.sleep(1500);
            print.PrintTxt("Po wygłoszeniu ostatniego zdania męźczyzna dostrzega cię.\n",750);
            Thread.sleep(2000);
            print.PrintTxt("Przerywa kazanie",750);
            Thread.sleep(2000);
            print.PrintTxt("Patrzy się na ciebie",225);
            Thread.sleep(2000);
            print.PrintTxt("Mówi do ciebie",225);
            System.out.println("Męźczyzna w płaszczu:");
            print.PrintTxt("Wypierdalaj!",400);
            CzySpot+=1;
            System.out.println("Zawracasz ponieważ nie jesteś w nastroju na walkę");
            return;
        }if (CzySpot==1){
            print.PrintTxt("Ponownie podążasz tą ścieżką aż znowu docierasz na ten sam obszar",225);
            Thread.sleep(1500);
            print.PrintTxt("Meżczyzna w płasczu tym razem zauważa cię odrazu.\n" +
                    "Męźczyzna w płaszczu:",250);
            print.PrintTxt("Mówiłem ci abyś wypierdalał. Skoro nie słuhcałeś to ja ci to wytłumaczę.\n" +
                    "Majster szykuj łuk",225);
            System.out.println("Męźczyzna w płasczu wyciąga nóż z pod kieszeni, a wyższy facet podnosi z ziemi łuk i strzały");
            walka(plaszcz,lucznik,gracz);
            print.PrintTxt("Podczas gdy ciała poległy przeciwników upadają na ziemię uświadamiasz sobie że podczasz\n" +
                    "gdy wy walczyliście cała reszta ludzi zdążyła uciec",225);
            print.PrintTxt("Postanawiasz wrócić na ścieżkę bo wolisz nie ryzykować powrotu pozostałych",225);
            CzySpot+=1;
            return;
        }
        if (CzySpot>1){
            print.PrintTxt("Wracasz spowrotem na tą polanę.",250);
            Thread.sleep(1500);
            print.PrintTxt("Dostrzegasz że ciała ludzi których zabiłeś wciąż leżą na ziemi",250);
            print.PrintTxt("Postanawiasz zawrófić z obawy że inni wrócą z posiłkami",250);
            return;
        }
    }

    private void walka (Thug noz, Thug bow, Player gracz) throws InterruptedException {
        int bowaction=0;
        int demage=0;
        int nozaction=0;
        boolean bowdefeat=false;
        boolean nozdeafeat=false;
            while (noz.HP>0 || bow.HP>0) {
                if (noz.HP>0){
                    nozaction = los(3);
                    if (nozaction == 0) {
                        demage=noz.firstattack(noz.max_demage);
                        gracz.DemageTaken(demage, noz.name);

                    } else if (nozaction == 1) {
                        System.out.println("Nożownik leczy się");
                        noz.Heal();

                }   else if (nozaction==2){
                        demage=noz.secondattack;
                        gracz.DemageTaken(demage, noz.name);
                }
            }
                System.out.print("Masz " + gracz.HP +"/" +gracz.MaxHP + " punktów życia \n" +
                        "Masz " + gracz.Mana +"/"+gracz.MaxMana +" many\n");
                if (noz.HP>0){
                    System.out.print( "Męźczyzna w płaszczu ma " + noz.HP + " punktów życia\n");}
                if (bow.HP>0) {
                    System.out.print("Młodzieniec z łukiem ma " + bow.HP + " punktów życia\n");
                }
                System.out.println("Co zamierzasz zrobić?\n" +
                        "1 - zaatakować mieczem\n" +
                        "2 - uleczyć się\n" +
                        "3 -użyć kuli ognia ");
                if (gracz.sztylet) {
                    System.out.println("4 - zatakować sztyletem");
                }

                wybor1= scanner.nextInt();
                while (wybor1==4&& gracz.sztylet==false){
                    System.out.println("Nie ma takiej opcji. Wybierz poprawną opcje");
                    wybor1=scanner.nextInt();
                }
                while (wybor1 !=1 && wybor1!=2&&wybor1!=3) {
                    System.out.println("Nie ma takiej opcji. Wybierz poprawną opcje");
                    wybor1=scanner.nextInt();
                }
                if (wybor1!=2){
                    System.out.println("Którego przeciwnika chesz zaatakować?\n" +
                            "1 - męźczyzne w płaszczu\n" +
                            "2 - młodzieńca z łukiem");
                    wybor2=scanner.nextInt();
                    while (wybor2!=1&&wybor2!=2){
                        System.out.println("Nie ma takiego wroga. Wybierz poprawnego wroga");
                        wybor2=scanner.nextInt();
                    }}
                while (1==1){
                    if (wybor1!=2 &&wybor2==1 && noz.HP<=0){
                        System.out.println("Meczysz zwłoki męźczyzny w plasczu");
                        Thread.sleep(2500);
                        System.out.println("Nie wiesz po co to robisz ale to robisz");
                        Thread.sleep(2500);
                        break;
                    }
                    if (wybor1!=2 &&wybor2==2 && bow.HP<=0){
                        System.out.println("Meczysz zwłoki młodzieńca");
                        Thread.sleep(2500);
                        System.out.println("Nie wiesz po co to robisz ale to robisz");
                        Thread.sleep(2500);
                        break;}
                    if (wybor1==1){
                        if (wybor2==1){
                            System.out.println("Atakujesz męźczyznę w płaszczu mieczem");
                            noz.DemageTaken(gracz.PlayerAttack());
                            break;
                        }else{
                            System.out.println("Atakujesz młodzieńca z łukiem mieczem.");
                            bow.DemageTaken(gracz.PlayerAttack());
                            break;

                        }}
                        else if (wybor1==2){
                            gracz.leczenie();
                            break;
                        }
                        if (wybor1==3){
                            if (wybor2==1){
                                System.out.println("Rzucasz kulą ognia w męźczyzne w płaszczu");
                                noz.DemageTaken(gracz.kula_ognia());
                                break;
                            }else{
                                System.out.println("Rzuczasz kulą ognia w młodzieńća");
                                bow.DemageTaken(gracz.kula_ognia());
                                break;
                            }
                        }
                        if (wybor1==4 && gracz.sztylet==true){
                            if (wybor2==1){
                                System.out.println("Dźgasz sztyletem mężczyznę w płaszczu");
                                noz.DemageTaken(gracz.secondattack);
                            }else {
                                System.out.println("Dźgasz łucznika sztyletem");
                                bow.DemageTaken(gracz.secondattack);
                            }
                            break;
                        }}
                        if (bow.HP>0){
                            bowaction=random1.nextInt(3);
                            if (bowaction==0){
                                bowaction=0;
                                System.out.println("Młodzian strzela do ciebie z łuku");
                                demage=bow.firstattack();
                                gracz.DemageTaken(demage, bow.name);

                            }else if (bowaction==1){
                                System.out.println("Łucznik leczy się");
                                bow.Heal();
                            } else if (bowaction==2) {
                                System.out.println("Młodzieniec tłucze cię łukiem");
                                gracz.DemageTaken(bow.SecondAttack(bow.second_attack_max_demage), bow.name);

                            }



                }
                        if (nozdeafeat=false&&noz.HP<=0){
                            System.out.println("Męźczyzna w płąszczu pada");
                            nozdeafeat=true;
                        }
                        if (bowdefeat=false&&bow.HP<=0){
                            System.out.println("Młodzieniec pada");
                        }
                        if (gracz.HP<=0){
                            break;
                        }


            }
            if (bow.HP<=0 && noz.HP<=0){
                System.out.println("Gratulacje pokonałeś przeciwników");
            }
            if (gracz.HP<=0){
                System.out.println("        GAME OVER");
                System.exit(0);
            }

    }

    private void prawo() throws InterruptedException {
        print.PrintTxt("Podążasz scieżką przez las w prawo, aż docierasz na szczyt górki",250);
        Thread.sleep(2000);
        print.PrintTxt("Gdy rozglądasz się uświadamiasz sobie że las jest już na tyle gęsty że nie możesz\n" +
                "ujrzeć polany przez którą przechodziłeś.",250);
        Thread.sleep(2000);
        print.PrintTxt("W końcu spoglądasz przed siebie",500);
        Thread.sleep(1500);
        print.PrintTxt("Dostrzegasz tam szare pole rozciągające się po horyzont\n" +
                "Widzisz jak w oddali unoszą się słupy dymu oraz słyszysz krzyki\n" +
                "i odgłosu uderzania o siebie stalą",300);
        Thread.sleep(5000);
        System.out.println("Czy chesz się dalej przyglądać temu widokowi?\n" +
                "1 - tak\n" +
                "2 - nie");
        wybor1=scanner.nextInt();
        if (wybor1==1){
            Thread.sleep(7500);
        }
        print.PrintTxt("Odwracasz się i zchodzisz z górki wracając w las",500);
    }


    private  int los(int limit){
            wynik= random.nextInt(limit);
            return wynik;

    }



}
