import javax.jws.soap.SOAPBinding;
import java.util.Random;
import java.util.Scanner;

public class PoleBitwy {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    PrintTxt print = new PrintTxt();
    boolean CzyStos=false;

    int wybor;
    int wybor1;
    int wybor2;
    Player gracz;
    boolean psy;
    boolean tattocheck;
    public PoleBitwy(Player gracz, boolean tattocheck, boolean psy){
        this.gracz=gracz;
        this.tattocheck=tattocheck;
        this.psy=psy;
    }

    Wolf gruby = new Wolf("gruby ghul",15,8,40);
    Wolf chudy = new Wolf("chydy ghul",12,6,30);
    Thug men = new Thug("Męźczyzna",0,0,100);


    public void polebitwy() throws InterruptedException {
        print.PrintTxt("Podążając dalej ściezką obserwujesz jak drzewa dookoła ciebie stają się coraz bardziej\n" +
                "pokryte popiołem.",250);
        Thread.sleep(5000);
        print.PrintTxt("Po wyjściu z lasu docierasz na otwarte pole.",250);
        Thread.sleep(2500);
        print.PrintTxt("Po swojej lewej widzisz płonące stosy, których płomienie zdają się sięgać nieba, a dym przez\n" +
                "nie emitowany zakrywa Słońce.",250);
        Thread.sleep(2500);
        print.PrintTxt("Po swojej prawej słyszysz odgłosu uderzania o siebie stali, tętent kopyt, ludzkie jęki,\n" +
                "jakieś niezrozumiałe okrzyki oraz szczekanie psów",250);
        Thread.sleep(2500);
        print.PrintTxt("Na wprost zaś widzisz zamek. Jest on potęrzny a jego mury zdają się być ciemno szare.\n" +
                "Z jego wież widzisz jak zwisają niebieskie sztandary z białym sokołem.",250);
        print.PrintTxt("Dokąd chcesz się udać?\n" +
                "1 - pod stosy\n" +
                "2 - do zamku\n" +
                "3 - w kierunku odgłosów",250);
        wybor=scanner.nextInt();
        while (1==1){
            if (wybor==1){
                stosy();
            } else if (wybor==2) {
                zamek();
                return;
            } else if (wybor==3) {
                oboz();
                return;

            }
            if (wybor==1||wybor==2||wybor==3){
                System.out.println("Ponownie znajdujesz się u wyjścia z lasu.\n" +
                        "Dokąd chcesz się teraz udać?\n" +
                        "1 - pod stosy\n" +
                        "2 - do zamku\n" +
                        "3 - w kierunku odgłosów");
                wybor=scanner.nextInt();
            }
            if (wybor!=1&&wybor!=2&&wybor!=3){
                System.out.println("Nie ma takiej opcji. Proszę wybrać poprawną opcje");
                wybor=scanner.nextInt();
            }
        }
    }

    private void stosy() throws InterruptedException {
        if (CzyStos==false) {
            print.PrintTxt("Podążasz w kierunku stosów. Po trodze widzisz całe pola usłane trupami.\n" +
                    "Niestety też czujesz ich zapach i jesteś w stanie stwierdzić że leżą tutaj\n" +
                    "dłużej niż od dnia wczorajszego. Zauważasz też że mają na sobie rózne mundury.\n" +
                    "Niektóre truchła mają na sobie mundury z tym symbolem co widziałeś na fladze zamku,\n" +
                    "aczkolwiek wsród umarłych przeważa inne godło. Nie widziałeś takiego wcześniej.\n" +
                    "Znajduje się ono tuż nad sercem na zielonym mundurze. Przedstawia ono dwa skrzyżowane\n" +
                    "skrzydła. Jedno jest niebieskie a drugie białe, obydwa znajdują się w srebrnej tarczy.\n" +
                    "Są to jedyne oznaczenia na tych mundurach.", 225);
            Thread.sleep(5000);
            print.PrintTxt("Podczas swojego spaceru zauważasz też ciała w innych mundurach. Są one unikatowe\n" +
                    "i nie widziałeś dwóch takich samych.Zauważasz że polegli w takich mundurach zawsze mają taki sam\n" +
                    "tatuaż. Przedstawia on czrnego smoka owiniętego wokół miecza", 225);
            Thread.sleep(3000);
            if (tattocheck) {
                print.PrintTxt("Uświadamiasz sobie że taki sam tatuaż widziałeś u facetó w karczmie", 225);
            }
            print.PrintTxt("Podczas swojego 'podziwiania krajobrazu' dotarłeś do stosów. Z bliska robią jeszcze większe wrażenie.\n" +
                    "Stojąc przy nich czujesz się jak mrówka przy człowieku. Ich żar pali cię w twarz. Gdy zaczynasz się im przyglądać\n" +
                    "uświadamiasz sobie, że na tych stosach nie pali się drewno tylko ciała poległych.", 250);
            Thread.sleep(5000);
            print.PrintTxt("Po krótkiej chwili dochodzisz do wniosku że te wszystkie truchła co mijałeś suszył się aby dołączyć\n" +
                    "do stosu.", 250);
            Thread.sleep(2500);
            print.PrintTxt("Twoje rozmyślanie przerywa ci płonąca rękę spadająca przed twoje nogi.\n" +
                    "Odruchowo odskakujesz.", 250);
            Thread.sleep(1000);
            print.PrintTxt("Nagle zaczynasz słyszeć mlaskanie oraz jęk z za stosów.\n" +
                    "Jęk na tyle paskudny, że nie da się go opisać słowami.\n" +
                    "Ten dźwięk mimo, że krótki to napełnia twoje serce odrazą", 250);
            Thread.sleep(7500);
            print.PrintTxt("Czy chcesz podejść do źródła dźwięku?\n" +
                    "1 - tak\n" +
                    "2 - nie\n" +
                    "3 - ???", 250);
            wybor1 = scanner.nextInt();
            while (1 == 1) {
                if (wybor1 == 1) {
                    print.PrintTxt("Zaczynasz obchodzić stos i zmierzać w kierunku dźwięku.\n" +
                            "W miarę jak się zblizasz jęki stają się coraz gorsze.", 225);
                    Thread.sleep(2500);
                    print.PrintTxt("Gdy obszedłeś już wieżę z ciał dostrzegasz co jest żródło hałasu.\n" +
                            "Widzisz dwa ghule. Ich skóra zdaje się być pokryta łuskami. Jeden z nich jest większy,\n" +
                            "grubszy i zdaje się być starszy. Drugi jest mniejszy i przy kości. Odraża cię ich odór oraz\n" +
                            "groteskowy wygląd. Zauważasz, że ich pyski są pokryte czymś czerwonym.", 250);
                    Thread.sleep(5000);
                    print.PrintTxt("Po chwili widzisz osobę z której wychocą te jęki.Jest to starszy męźczyzna w zielonym mundurze,\n " +
                            "zapewne zajmował się on dorzucaniem ciał do stosów .Leży on pod ghulami, a jego flaki\n" +
                            "są rozbabrane dookoła jego ciała. Najwidowczniej ghula zwabił zapach trupów, a dlatego że je palił," +
                            "to go zaatakowały", 250);
                    Thread.sleep(5000);
                    print.PrintTxt("Gdy już otrząsłeś się z szoku zauważyłeś, że grubszy z ghuli się w ciebie wpatruje.", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Łapiesz z nim kontakt wzrokowy", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Patrzysz się na niego", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("On na ciebie", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Ty na niego.", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("On na ciebie", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Ty na niego.", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("On na ciebie", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Ty na niego.", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Po chwili takiego patrzenia ghul zaczyna na ciebie warczeć.\n" +
                            "Odciąga tym uwagę mniejszego od \"posiłku\", który po chiwli też zaczyna na ciebie\n" +
                            "warczeć.", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Następnie ghule zaczynają na ciebie szarżować.\n" +
                            " Dobywasz miecza bo wiesz, że walka jest nieunikniona", 250);
                    WalkaGhule();
                    print.PrintTxt("Po pokonaniu ghuli zamykasz oczy biedaka, którego rozszarpały, a następnie\n" +
                            "rzuczasz ciało jego i potworów na stos", 225);
                    Thread.sleep(3000);
                    print.PrintTxt("Po zrobieniu tego odchodzisz od stosów i wracasz tam skąd przyszedłeś", 250);
                    CzyStos=true;
                    return;
                } else if (wybor1 == 3) {
                    print.PrintTxt("Zaczynasz obchodzić stos i zmierzać w kierunku dźwięku.\n" +
                            "W miarę jak się zblizasz jęki stają się coraz gorsze.", 225);
                    Thread.sleep(2500);
                    print.PrintTxt("Gdy obszedłeś już wieżę z ciał dostrzegasz co jest żródło hałasu.\n" +
                            "Widzisz dwa ghule. Ich skóra zdaje się być pokryta łuskami. Jeden z nich jest większy,\n" +
                            "grubszy i zdaje się być starszy. Drugi jest mniejszy i przy kości. Odraża cię ich odór oraz\n" +
                            "groteskowy wygląd. Zauważasz, że ich pyski są pokryte czymś czerwonym.", 250);
                    Thread.sleep(5000);
                    print.PrintTxt("Po chwili widzisz osobę z której wychocą te jęki.Jest to starszy męźczyzna w zielonym mundurze,\n " +
                            "zapewne zajmował się on dorzucaniem ciał do stosów .Leży on pod ghulami, a jego flaki\n" +
                            "są rozbabrane dookoła jego ciała. Najwidowczniej ghula zwabił zapach trupów, a dlatego że je palił," +
                            "to go zaatakowały", 250);
                    Thread.sleep(5000);
                    print.PrintTxt("Gdy już otrząsłeś się z szoku zauważyłeś, że grubszy z ghuli się w ciebie wpatruje.", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Łapiesz z nim kontakt wzrokowy", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Patrzysz się na niego", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("On na ciebie", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Ty na niego.", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("On na ciebie", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Ty na niego.", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("On na ciebie", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Ty na niego.", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("On na ciebie",250);
                    Thread.sleep(1500);
                    print.PrintTxt("Po chwili takiego patrzenia zaczynacie do siebie biec\n" +
                            "Gdy już dosiebie dobiegliście zaczynacie się namiętnie całować.", 250);
                    Thread.sleep(7500);
                    print.PrintTxt("Po chwili namiętnego całowania rozbieracie się i zaczynacie odbywać\n" +
                            "hardcorowy gejowski sex", 250);
                    Thread.sleep(10000);
                    print.PrintTxt("Po stosunku lekko boli cię odbyt. Czujesz że \n" +
                            "twoje oragany są poprzestawiane bardziej niż tego trupa na ziemi.\n" +
                            "Mimo to ubierasz się i spowrotem wracasz przed stos", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Gdy masz zacząć obchodzić stos zaczynasz słyszeć warczenie.\n" +
                            "Odwracasz się i widzisz że ghul z którym przed chwilą się kochałeś chyba nie\n" +
                            "jest zadowolony z waszej rozrywki. Dobywasz miecza, bo widzisz jak trze łapami po ziemi.", 250);
                    Thread.sleep(2000);
                    print.PrintTxt("Po chwili taką samą postawę przyjmuje mniejszy ghul.", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Wiesz, że tym razem nie będzie miłości tylko nienawiść.\n", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Wiesz że niestety będziesz musiał teraz zabić większego ghula.\n", 250);
                    Thread.sleep(1500);
                    print.PrintTxt("Ghule zaczynają na ciebie szarżować", 300);
                    WalkaGhule();
                    print.PrintTxt("Po walce zamykasz oczy swojego kochanka oraz chudszego ghula i rzucasz ich ciała\n" +
                            "na stos.", 250);
                    Thread.sleep(3000);
                    print.PrintTxt("Nastepnie podchodzisz do ciała mężczyzny i też opuszczasz jego powieki, a następnie\n" +
                            "robisz to samo z jego ciałem co zrobiłeś z potworami", 225);
                    Thread.sleep(3000);
                    print.PrintTxt("Następnie odchodzisz od stosu i wracasz tam skąd przybyłeś", 250);
                    CzyStos=true;
                    return;
                } else if (wybor1 == 2) {
                    print.PrintTxt("Zawracasz się i odchodzisz udając, że nie słyszałeś czyichś katusz", 225);
                    return;
                } else if (wybor1 != 1 && wybor1 != 2 && wybor != 3) {
                    System.out.println("Nie ma takiej opcji. Proszę wybrać poprawną");
                    wybor1 = scanner.nextInt();
                }
            }
        } else if (CzyStos==true){
            print.PrintTxt("Znowu przechadzasz się polem pełnym trupów",250);
            Thread.sleep(2000);
            print.PrintTxt("Tym razem nie przyglądasz się im z taką ciekawością jak za pierwszym razem",250);
            Thread.sleep(2000);
            print.PrintTxt("Gdy szedłeś tak rozmyślając o niczym dotarłeś do stosu",250);
            Thread.sleep(2000);
            print.PrintTxt("Znów jego żar pali cie w twarz lecz tym razem nie słychać niczyich katuszy",250);
            Thread.sleep(2000);
            print.PrintTxt("Odchodzisz od stosu i spowrotem wracasz na pod wyjście z lasu, bo od tego żaru\n" +
                    "zaczyna ci się robić słabo",250);
            Thread.sleep(2000);
            return;
        }
        }


    private void zamek() throws InterruptedException {
            print.PrintTxt("Zaczynasz iść w kierunku zamku",250);
            Thread.sleep(5000);
            print.PrintTxt("Po chwili marszu odnosisz wrażenie jakbyś wogóle nie zbliżył się do zamku.\n" +
                    "Patrzysz za siebie i widzisz, że oddaliłeś się od lasu.\n" +
                    "Mimo wszystko zaczynasz biec bo czujesz, że Słońce już zachodzi",250);
            Thread.sleep(2500);
            print.PrintTxt("Po jakimś czasie sprintu zaczynasz słyszeć typot kopyt nadciągający z twojej prawej",250);
            if (CzyStos){
                print.PrintTxt("Domyślasz się, że jest to zmiana warty przy stosach.\n" +
                        "Biedak nie wie jeszcze co spotkało jego poprzednika",250);
            }
            print.PrintTxt("Te odgłosy sprawiają jedynie, że przyśpieeszasz kroku bo potwierdzają twoje\n" +
                    "podejrzenia o porze dnia",250);
            Thread.sleep(2500);
            print.PrintTxt("Po kolejnej chwili biegu dostrzegasz jeźdca, jednak nie podoba ci się\n" +
                    "jak szybko jedzie.",250);
            Thread.sleep(1500);
            print.PrintTxt("Nim zdążyłeś się zorientować czujesz mocne uderzenie w prawą stronę\n" +
                    "klatki piersiowej",250);
            Thread.sleep(1500);
            print.PrintTxt("Słyszysz odgłos łamania kości",250);
            Thread.sleep(1500);
            print.PrintTxt("Padasz na ziemię",250);
            Thread.sleep(1500);
            print.PrintTxt("Czujesz jak ból paraliżuje twoje ciało",250);
            Thread.sleep(1500);
            print.PrintTxt("Twoja wizja słabnie, wszystko zaczyna robić się czarne",250);
            Thread.sleep(3000);
            print.PrintTxt("Słyszysz tylko sapanie konia, odgłosy jego hamowania i \n" +
                    "męski głos, który coś krzyczy",250);
            Thread.sleep(5000);
            print.PrintTxt("Tracisz przytomność",250);
            Thread.sleep(10000);
    }


    private void oboz() throws InterruptedException {
        print.PrintTxt("Wyruszasz w kierunku odgłosów które słyszałeś",250);
        Thread.sleep(6500);
        print.PrintTxt("Po jakiejś godzinie marszu docierasz do obozu.",250);
        Thread.sleep(2000);
        if (CzyStos){
        print.PrintTxt("Składa się on w większości z  ciemno zielonych namiotów z takim samym herbem jak\n" +
                "ten co przeważał na trupach przy stosie",250);}
        else {
            print.PrintTxt("Składa się on głownie z ciemno zielonych namiotów z nieznanym ci herbem.\n" +
                    "Herb ów przedstawia parę skrzyżowanych skrzydeł na srebrenej tarczy.\n" +
                    " Jedno z nich jest  niebieskie, zaś drugie  białe.\n" +
                    "Dziwi cię ten dobór kolorów, aczkolwiek nie zagłebiasz się w to.",250);
        }
        Thread.sleep(1750);
        print.PrintTxt("Dostrzegasz też prowizoryczne drewniane budowle z których słychać odgłosy koni.",250);
        Thread.sleep(1500);
        print.PrintTxt("Widzisz również metalowe klatki z psami",250);
        if (psy){
            print.PrintTxt("Wyglądem bardzo przypominają wilka, z którym walczyłeś na polanie",250);
        }
        Thread.sleep(1500);
        print.PrintTxt("Twoje zwiedzanie obozu przerywa jakiś głos zza twoich pleców\n" +
                "[     ]:\n" +
                "Co tu robisz gnojku?",250);
        Thread.sleep(1500);
        print.PrintTxt("Odwraczasz się i widzisz posturnego męźczyznę w czarnej zbroi.\n" +
                "Ma on dość szpetną twarz aczkolwiek nie to najbardziej rzuca ci się w oczy.",250);
        Thread.sleep(1500);
        print.PrintTxt("Uwagę twoją przykuwa jego broń.\n" +
                "Jest to około półtorametrowy metalowy kij \n" +
                "naszpikowany kolcami  z jednym miejscem bez \n" +
                "nich - rękojeścią",250);
        Thread.sleep(2500);
        print.PrintTxt("Męźczyzna:\n" +
                "Odpowiesz z łaski swojej czy mam to z ciebie wyciągnąc?",250);
        System.out.println("Co zamierasz mu odpowiedzieć?\n" +
                "1 - że zabłądziłeś\n" +
                "2 - że znalazłeś się tutaj z przypadku");
        wybor1=scanner.nextInt();
        while (wybor1!=1&&wybor1!=2){
            System.out.println("Nie ma takiej odpowiedzi");
            wybor1=scanner.nextInt();
        }
        Thread.sleep(1500);
        print.PrintTxt("Na twarzy męźczyzny widzisz, że rozmyśla o tym co mu powiedziałeś",250);
        for (int i =0; i<10;i++){
            System.out.print(".");
            Thread.sleep(500);
        }
        System.out.println();
        print.PrintTxt("Męźczyzna:\n" +
                "Źle, chujowa odpowiedź!!!! Udowodnij mi, że nie powiniennem cię zabić",250);
        Thread.sleep(2500);
        print.PrintTxt("Po powiedzeniu tego męźczyzna łapie za swój kij, a ty dobywasz miecza",250);
        WalkaTypo();
        return;
    }

    private void WalkaGhule() throws InterruptedException {
        int grubyaction=0;
        int chudyaction=0;
        int demage;
        boolean grubypadl=false;
        boolean chudypadl=true;
        while (gruby.HP>0 || chudy.HP>0){
            if (gruby.HP>0){
                grubyaction=random.nextInt(2);
                if (grubyaction==0){
                    System.out.println("Grubszy z ghuli atakuje cię pazurami");
                    demage=gruby.firstattack();
                    gracz.DemageTaken(demage,gruby.getName());

                }else {
                    System.out.println("Grubszy ghul gryzie cię");
                    demage=gruby.SecondAttack();
                    gracz.DemageTaken(demage,gruby.getName());
                }
            }
            System.out.println("Masz " + gracz.HP +"/" + gracz.MaxHP +" HP\n" +
                    "Masz " + gracz.Mana + "/" + gracz.MaxMana + " many");
            if (gruby.HP>0){
                System.out.println("Gruby ghul ma " + gruby.HP + " HP\n");
            }
            if (chudy.HP>0){
                System.out.println("Chudy ghul ma " + chudy.HP + " HP");
            }

            //Coded by Antkaczo
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
                    System.out.println("Którego ghula chesz zaatakować?\n" +
                            "1 - grubego\n" +
                            "2 - chudego");
                    wybor2=scanner.nextInt();
                    while (wybor2!=1&&wybor2!=2){
                        System.out.println("Nie ma takiego wroga. Wybierz poprawnego wroga");
                        wybor2=scanner.nextInt();
                    }}
                while (1==1){
                    if (wybor1!=2 &&wybor2==1 && gruby.HP<=0){
                        System.out.println("Meczysz zwłoki starszego ghula");
                        Thread.sleep(2500);
                        System.out.println("Nie wiesz po co to robisz ale to robisz");
                        Thread.sleep(2500);
                        break;
                    }
                    if (wybor1!=2 &&wybor2==2 && chudy.HP<=0){
                        System.out.println("Meczysz małego potwora");
                        Thread.sleep(2500);
                        System.out.println("Nie wiesz po co to robisz ale to robisz");
                        Thread.sleep(2500);
                        break;}
                    if (wybor1==1){
                        if (wybor2==1){
                            System.out.println("Atakujesz cięższego ghula mieczem");
                            gruby.DemageTaken(gracz.PlayerAttack());
                            break;
                        }else{
                            System.out.println("Atakujesz lżejszego mieczem.");
                            chudy.DemageTaken(gracz.PlayerAttack());
                            break;

                        }}
                    else if (wybor1==2){
                        gracz.leczenie();
                        break;
                    }
                    if (wybor1==3){
                        if (wybor2==1){
                            System.out.println("Rzucasz kulą ognia ghula co nie zaznał głodu");
                            gruby.DemageTaken(gracz.kula_ognia());
                            break;
                        }else{
                            System.out.println("Rzuczasz kulą ognia wychudzonego ghula");
                            chudy.DemageTaken(gracz.kula_ognia());
                            break;
                        }
                    }
                    if (wybor1==4 && gracz.sztylet==true){
                        if (wybor2==1){
                            System.out.println("Dźgasz sztyletem grubego ghula");
                            gruby.DemageTaken(gracz.secondattack);
                        }else {
                            System.out.println("Dźgasz sztyletem chudego ghula");
                            chudy.DemageTaken(gracz.secondattack);
                        }
                        break;
                    }}
                if (gruby.HP<=0&&grubypadl==false){
                    System.out.println("Gruby ghul poległ");
                    grubypadl=true;
                }
                if (chudypadl==false&& chudy.HP<=0){
                    System.out.println("Chudy ghul padł");
                    chudypadl=true;
                }
                if (chudy.HP>0){
                    chudyaction= random.nextInt(2);
                    if (chudyaction==0){
                        System.out.println("Młody ghul atakuje cię pazurami");
                        demage=chudy.firstattack();
                        gracz.DemageTaken(demage,chudy.getName());

                    }else {
                        System.out.println("Lżejszy ghul gryzie cię");
                        demage=gruby.SecondAttack();
                        gracz.DemageTaken(demage,gruby.getName());
                    }
                }
                if (gruby.HP<=0&&chudy.HP<=0){
                    System.out.println("Gratulacje pokonałeś ghule");
                    break;
                }
                if (gracz.HP<=0){
                    System.out.println("GAME OVER");
                    System.exit(0);
                }



        }

    }

    private void WalkaTypo() throws InterruptedException {
        int EnemyHitCouner =1;
        boolean healblocker = false;
        while (1==1){
            //Coded by Antkaczo
            System.out.println("Masz " + gracz.HP + "/" + gracz.MaxHP + " HP\n" +
                    "Masz " + gracz.Mana + "/" + gracz.MaxMana + "many");
           while (1==1){
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
            if (wybor1==1){
                System.out.println("Atakujesz przeciwnika mieczem");
                Thread.sleep(2500);
                System.out.println("Lecz twój atak zdaje się nie robić na nim wrażenia");
                break;
            }if (wybor1==2 && healblocker==false){
                System.out.println("Próbujesz się uleczyć");
                Thread.sleep(2500);
                System.out.println("Lecz twój przeciwnik nie przerywa ci\n" +
                    "Dochodzisz do wniosku, że nie ma co próbować bo i tak ci sie nie uda");
                healblocker=true;
                   break;
        }   if (wybor1==2&&healblocker){
                System.out.println("Próbujesz się uleczyć, lecz męźczyzna znów ci przerywa");
                break;
        }   if (wybor1==3){
                if (gracz.Mana <25){
                    System.out.println("Nie masz wystarczająco many aby użyć tego zaklęcia");
                    break;
        }   else {
                System.out.println("Rzucasz kulę ognia lecz twój wróg nic sobie z tego nie robi");
            gracz.Mana-=25;
                break;}
        }
            if (wybor1==4){
                System.out.println("Dźgasz wroga sztyletem");
                Thread.sleep(2500);
                System.out.println("Lecz nie udaje ci się przebić jego zbroji");
                break;
        }if (wybor1!=1&&wybor1!=2&&wybor1!=3&&wybor1!=4){
                   System.out.println("Nie ma takiej opcji. Proszę wybrać poprawną");
               }
           }
            if (EnemyHitCouner==1){
                Thread.sleep(7500);
                print.PrintTxt("Męźczyzna:\n" +
                    "Tylko na tyle cię stać? Myślałem że chociaż się pobawię",250);
                Thread.sleep(5000);
                print.PrintTxt("Następnie zamachuje się kijem i uderza cię nim w nogi.\n" +
                    "Zaczynasz się chwiać lecz po chwili udaje ci się odzyskać równowagę",250);
            Thread.sleep(3000);
            EnemyHitCouner+=1;
        } else if (EnemyHitCouner==2) {
            Thread.sleep(5000);
            print.PrintTxt("Meźczyzna:\n" +
                    "Jak ci się udało przeżyć w tym świecie będąc takim słabym?",250);
            Thread.sleep(5000);
            print.PrintTxt("Po powiedzeniu tego wykonuje zamach kijem  z nad głowy",250);
            Thread.sleep(3000);
            print.PrintTxt("Na szczęście udaje ci się go uniknąć",250);
            Thread.sleep(3000);
            print.PrintTxt("Męźczyzna;\n" +
                    "O czyli jednak coś potrafisz",250);
            Thread.sleep(3000);
            EnemyHitCouner+=1;
        }else if (EnemyHitCouner==3){
            Thread.sleep(5500);
            print.PrintTxt("Męźczyzna:\n" +
                    "Dobra. Zabawa się skończyła",250);
            Thread.sleep(7500);
            print.PrintTxt("Po powiedzeniu tego wykonuje zamach wymierzony w twoje żebra,\n" +
                    "którym niesty trafia",300);
            Thread.sleep(7000);
            print.PrintTxt("Czujesz i słyszysz jak twoje żebra się łamią",250);
            Thread.sleep(1500);
            print.PrintTxt("Padasz na ziemie",250);
            Thread.sleep(1500);
            print.PrintTxt("Obraz zaczyna ci się rozmwyać",250);
            Thread.sleep(1500);
            print.PrintTxt("Słyszysz jeszcze ostatnią wypowiedź męźczyzny.\n" +
                    "Męźczyzna:\n" +
                    "Kolejny bezwartoświowy śmieć. Zabrać go!",250);
            Thread.sleep(1500);
            print.PrintTxt("Tracisz przytomność",250);
            Thread.sleep(10000);
            return;
        }

    }
    }


    private int los(int bound){
        int toReturn = random.nextInt(bound+1);
        return toReturn;
    }
}
