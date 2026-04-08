import java.util.Scanner;
import java.util.Random;

public class miasto {
    Scanner scanner = new Scanner(System.in);
    boolean CzyBylWKarczmie=false;
    int wybor;
    int wybor1;
    int wybor2;
    int EnemyAction;
    Random random = new Random();
    Thug oko = new Thug("Łotr z blizną na oku",25,10,60);
    Thug policzki = new Thug("Łotr z dwiema bliznami",30,12,75);


    boolean CzyByłWKarczmie=false;
    public void wybrzerze() throws InterruptedException {
        System.out.println("Po dotarciu na wybrzeże Słońce odbijające się od piasku lekko razi twoje oczy" +
                "\n Gdy już się przyzwyczaiłeś zaczynasz podziwiać morze. Ma kolor ciemnego błękitu, a przy brzegu tworzą się małe fale, które następnie się o niego rozbijają.\n" +
                " Zdaje się być bezkresne.\n" +
                "W oddali dostrzegasz wyspę. Czy chcesz się jej przyjrzeć?\n" +
                "1 - tak\n" +
                "2 - nie ");
        wybor= scanner.nextInt();
        while (1==1){
            if (wybor==1){
                System.out.println("Zauważasz też że cała ziemia na wyspie jest czarna i ma metaliczny połysk, lecz na wyspie znajduje się roślinność.");
                Thread.sleep(1500);
                System.out.println("Po chwili przyglądania się wyspie dostrzegasz że na jej wybrzeżu znajduje się port.\n" +
                        "Zaś u portu stoi jakaś łódź. Na jej boku znajdują się znaki, które wyglądają jak litery K, S i U z twoich stron.\n" +
                        "Zaczynasz się zastanawiać czy ta łódź wyruszyła z twojej ojczyzny");
                Thread.sleep(2000);
                System.out.println("Po chwili rozmyślania udajesz się z powrotem na plac miejski\n\n\n\n\n\n\n");
                break;
            }
            else if (wybor==2) {
                System.out.println("Ignorując wyspę zawracasz i wracasz na plac miejski");
                break;}
            else {
                System.out.println("nie poprawna opcja. proszę wybrać poprawną opcję dialogową");
                wybor= scanner.nextInt();
            }


        }
    }


    public void  Stragany() throws InterruptedException {
        System.out.println("Przechadzasz się krętymi ulicami i podziwiasz róźnorodność oferowanych produktów.\n" +
                "Jesteś w szoku że na jednym straganie sprzedają surowe ryby, stragan oboku dania z ryb, a na przeciwko wyroby z ości\n" +
                "Czy chcesz do któregoś podejść? \n" +
                "1 - stragan z surowymi rybami\n" +
                "2 - stragan z daniami z ryb\n" +
                "3 - stragan z wyrobami z ości\n" +
                "4 - powróć na plac miejski");
        wybor = scanner.nextInt();
        while (1==1){
            if (wybor ==1){
                SuroweRyby();
            }
            else if (wybor==2){
                DaniaZRyb();
            }
            else if (wybor==3){
                WytrworyZOsci();
            }
            else if (wybor==4){
                System.out.println("Udajesz się z powrotem na plac miejski");
                break;


            }
            if (wybor!=1 && wybor!=2 && wybor!=3 && wybor!=4) {
                System.out.println("Nie ma takiej opcji. Wybierz ponownie");
                wybor=scanner.nextInt();
            } else{
                System.out.println("Wróciłeś na środek deptaka. Co zamierzasz teraz zrobić?Gdzie chcesz się udać? \n  1-udać się na stragan z surowymi rybami \n 2 -udać się na stragan z daniami z ryb\n 3- udać się na stragan z wyrobami z ości \n 4 - wrócić na plac miejski\n ");
                wybor= scanner.nextInt();
            }
        }


    }


    public void Karczma(Player gracz) throws InterruptedException{
        if (CzyBylWKarczmie==false){
            System.out.println("Po wejściu do karczmy pierwsza rzeczą która rzucza ci się w oczy jest\n" +
                    " cala ściana alkoholi oraz 2 drewniane beczki. Po chwili rozglądania się zauważasz 2 mężczyzn\n" +
                    "siedzących przy stole na środku karczmy między którymi stoi kilka pustych butelek\n" +
                    "oraz jedna w połowie pełna. Obydwoje są łysi oraz są ubrani w podarte i brudne\n" +
                    "ubrania. Jeden z mężczyzn ma bliznę na prawym oku, zaś drugi ma 2 blizny\n" +
                    "rozciągające się od kącików jego ust aż do uszu. Gdy spuściłeś już swój\n" +
                    "wzrok z tej dwójki w roku dostrzegasz mężczyznę sączącego coś z kufla.\n" +
                    "Ma on na sobie czarny płaszcz, spod którego wystaje końcówka rękojeści\n" +
                    "jego miecza. Kaptur jego płaszcza jest naciągnięty na jego głowę, więc nie\n" +
                    "masz pojęcia jak wygląda jego twarz.");
            Thread.sleep(7500);
            System.out.println("Co zamierzasz zrobić?\n" +
                    "1 - podejść do barmana\n" +
                    "2 - rozmawiać z mężczyznami\n" +
                    "3 - porozmawiać z facetem w płaszczu\n" +
                    "4 - wyjść z karczmy");
            wybor=scanner.nextInt();
            while (1==1){
                if (wybor==1){
                    System.out.println("Barman:\nCo dla ciebie podróżniku?\n" +
                            "\n Po zadaniu pytanie daje ci tabliczkę z menu\n" +
                            "|------------------| +\n" +
                            "|  Menu            |\n"  +
                            "|Piwo              |\n"  +
                            "|5 srebrnych monet |\n"  +
                            "|                  |\n"  +
                            "|Morska Bryza      |\n" +
                            "|7 srebrnych monet |\n" +
                            "|      /           |\n" +
                            "|4 złote monert    |\n" +
                            "|Rum               |\n" +
                            "|6 srebrnych monet |\n" +
                            "|      /           |\n" +
                            "|6 złotych monet   |\n ");
                    Thread.sleep(3500);
                    System.out.println("Co chcesz wybrać?\n" +
                            "1 - Piwo\n" +
                            "2 - Morska Bryza\n" +
                            "3 - Rum");
                    wybor1= scanner.nextInt();
                    if (wybor1==1){
                        System.out.println("Barman:\nTo będzie 5 srebrnych monet.\n\n" +
                                "Po przeszukaniu wszystkich swoich kieszeni uświadamiasz sobie że nie masz pieniędzy.\n" +
                                "Czy chczesz spróbować oszukać baramana\n" +
                                "1 - tak\n" +
                                "2 - nie");
                        wybor2= scanner.nextInt();
                    if (wybor2!=1 &&wybor2!=2){
                        System.out.println("nie ma takiej opcji. proszę wybrać poprawną opcje.");
                    }}
                    if (wybor1==2) {
                        System.out.println("Barman:\nTo będzie 7 srebrnych monet za kieliszek.\n\n" +
                                "Po przeszukaniu wszystkich swoich kieszeni uświadamiasz sobie że nie masz pieniędzy.\n" +
                                "Czy chczesz spróbować oszukać baramana\n" +
                                "1 - tak\n" +
                                "2 - nie");
                        wybor2 = scanner.nextInt();
                        if (wybor2 != 1 && wybor2 != 2) {
                            System.out.println("nie ma takiej opcji. proszę wybrać poprawną opcje.");
                        }
                    }
                    if (wybor1==3){System.out.println("Barman:\nTo będzie 6 srebrnych monet za kieliszek.\n\n" +
                            "Po przeszukaniu wszystkich swoich kieszeni uświadamiasz sobie że nie masz pieniędzy.\n" +
                            "Czy chczesz spróbować oszukać baramana\n" +
                            "1 - tak\n" +
                            "2 - nie");
                        wybor2= scanner.nextInt();
                        if (wybor2!=1 &&wybor2!=2){
                            System.out.println("nie ma takiej opcji. proszę wybrać poprawną opcje.");}
                    }
                        if (wybor2==1){
                            System.out.println("Pytasz barmana czy możesz kupić teraz i zapłacić później");
                            for (int i =0; i<7;i++){
                                System.out.print(". ");
                                Thread.sleep(500);
                            }
                            System.out.println();
                            if (los(10)==7){
                                if (wybor1 == 1) {
                                System.out.println("Barman po chwili namysłu daje ci odpowiedź\n" +
                                        "Barman:\n Oczywiście, aczkolwiek po wyjściu z tej knajpy będziesz miał tydzień\n" +
                                        "aby zapłacić cały dzisiejszy rachunek\n\n" +
                                        "Potakujesz barmanowi. Następnie gdy skończył mówić nalewa ci twoje piwo.\n" +
                                        "Pijesz je duszkiem. Było dobre lezcz trochę za gorzkie. Po wypiciu \n" +
                                        "odchodzisz od baru.");
                                Thread.sleep(5000);}
                                if (wybor1==2){ System.out.println("Barman po chwili namysłu daje ci odpowiedź\n" +
                                        "Barman:\n Oczywiście, aczkolwiek po wyjściu z tej knajpy będziesz miał tydzień\n" +
                                        "aby zapłacić cały dzisiejszy rachunek\n\n" +
                                        "Potakujesz barmanowi. Następnie gdy skończył mówić nalał ci kieliszek morskiej bryzy.\n" +
                                        "Jest to bezbarwna ciesz, której mocny alkoholowy zapach czujesz nawet bez pochylania się\n" +
                                        "aby ją powąchać.Pijesz cały kieliszek na raz. Po odstawieniu kieliszka czujesz jak morska\n" +
                                        "bryza drapie cię w gardło i lekko odkasłujesz próbując ją z tamtąd strącić.\n" +
                                        " Następnie wstajesz i  odchodzisz od baru.");
                                Thread.sleep(5000);}
                                if (wybor1 == 3) { System.out.println("Barman po chwili namysłu daje ci odpowiedź\n" +
                                        "Barman:\n Oczywiście, aczkolwiek po wyjściu z tej knajpy będziesz miał tydzień\n" +
                                        "aby zapłacić cały dzisiejszy rachunek\n\n" +
                                        "Potakujesz barmanowi. Następnie gdy skończył mówić nalewa ci szklankę rumu.\n" +
                                        "Przez jakiś czas sączysz ją siedząc na barze rozmyślając o tej walce w lesie.\n" +
                                        "Po jakimś czasie kończysz pić. Po wypiciu stwierdzasz że trunek był dobry\n" +
                                        "Lecz za słodki abyś mógł go pić regularnie. Następnie wstajesz i odchodzisz od\n baru.");
                                Thread.sleep(5000);}

                                }
                            }else {
                                System.out.println("Barman po chwili namysłu daje ci odpowiedź\n" +
                                        "Barman:\n Niestety nie mogę ci sprzedać na zeszyt.\n" +
                                        "Już mam wystarczająco delikwentów zalegających z pieniędzmi.\n\n" +
                                        "Po jego wypowiedzi potakujesz głową, lecz gdy odchodzisz to czujesz\n" +
                                        "jak złość się w tobie buduje");
                            }

                        }
                else if (wybor==2){
                    System.out.println("Podchodzisz do męzczyzn na środku lokalu.\n" +
                            "Nie zwracają uwagi na twoją obecność i mocno czuć od nich\n" +
                            "zapach gorzałki. Co zamierzasz zrobić?\n" +
                            "1 - spytać się czy możesz sie przyłączyć\n" +
                            "2 - stać i obserwować\n" +
                            "3 - spróbować z nimi porozmawiać\n" +
                            "4 - odejść od stolika\n");
                    wybor1=scanner.nextInt();
                    if (wybor1==1){
                        System.out.println("Gdy tylko usłyszeli twoje pytanie cała ich rozmowa chichnie\n" +
                                "Obydwoje kieruje swoje spojrzenia na ciebie\n" +
                                "Łotr z blizną na oku:\n Możesz jeżeli staniesz się taki jak my " +
                                "\n\n Od razu po powiedzeniu tego wyciąga swój miecz i próbuje\n" +
                                "naciąć ci nim twarz. W trakcie robienia tego wywraca stolik, tłukąc\n" +
                                "przy tym wszystkie butelki\n");
                        Thread.sleep(5000);
                        System.out.println("Na twoje szczęście udało ci się uniknąć jego ataku jednak musisz teraz odeprzeć jego atak");
                        walka(gracz,oko);
                    } else if (wybor1==2) {
                        System.out.println("Zacząłeś obserwować mężczyzn. Ich zachowanie nie jest na wysokim poziomie,\n" +
                                "a rozmowy zdają się powierzchowne. Po chwili meżczyzna z blizną na oku zauważa że stoisz\n" +
                                "Męźczyzna z blizną na oku:\n Co się tak gapisz? Problem masz?\n" +
                                "\n Po zadaniu tego pytania dobywa swojego miecza i wykonuje pchnięcie w twoim kierunku\n" +
                                "Na twoje szczęście nie trafił. \n" +
                                "Męźczyzna wstał od stołu i teraz musisz się z nim zmierzyć");
                        Thread.sleep(5000);
                        walka(gracz,oko);
                    }
                    else if (wybor1==3){
                        System.out.println("Próbujesz nieśmiało zagadać do męźczyzn.\n" +
                                "W momencie kiedy ostanie słowa opuściły twoje usta ich rozmowa ustała\n" +
                                "Obydwoje zaczeli cię mierzyć wzrokiem.\n" +
                                "Męźczyzna z blizną na oku:\n Widzisz/ Kolejny nie wychowany gnojek, który nie wiem,\n" +
                                "że sie nie przeszkadza jak ktoś rozmawia. Już ja go tego oduczę.\n\n" +
                                "Po powiedzeniu tego wstaje od stołu i dobywa swojego miecza.Tuż po zrobieniu tego\n" +
                                "zamachuje się mieczem, lecz w ciebie nie trafia.");
                        Thread.sleep(5000);
                        walka(gracz,oko);
                    } else if (wybor1==4) {
                        System.out.println("Gdy odwróciłeś się aby odejść od stolika czujesz jak ktoś lapie cię za nadgarstek");
                        Thread.sleep(500);
                        System.out.println("Po chwili słyszysz głos z jednego męźczyzn\n" +
                                "Meźczyzna:\n Hola hola kolego. A ty dokąd chcesz odejsć bez pożegnania?\n\n" +
                                "Następnie słyszysz odgłos tłuczonego szkła i czujesz jak rozbita butelka wbija ci się\n" +
                                "w rękę.\n\n" +
                                "Tracisz 5 punktów życia\n" +
                                "Twoje maksymalne obrażenia zminiejszyły się o 10%");
                        gracz.HP=gracz.HP-5;
                        gracz.player_effects-=0.1;
                        Thread.sleep(750);
                        System.out.println("Po odwróceniu się zauważasz że tym który cię zaatakował był męźczyzna z blizną na oku\n" +
                                "Męźczyzna z blizną na oku:\n Co ty taki oburzony? Dopiero zaczynamy sie bawić\n" +
                                "Po powiedzeniu tego dobywa swojego miecza");
                        walka(gracz,oko);
                    }else {
                        System.out.println("Nie ma takiej opcji. Wybierz poprawną opcje.");
                        wybor1=scanner.nextInt();
                    }
                    System.out.println("Po pokonaniu mężczyzny z blizną na oku zauważasz że drugi męźczyzna ma na twarzy\n" +
                            "coś pomiędzy smutkiem a gniewem.");
                    Thread.sleep(1000);
                    System.out.println("Po chwili ciszy męźczyzna z dwoma bliznami odzyskał język w gębie\n" +
                            "Mężczyzna z dwiema bliznami:\n NIE MYŚL ŻE UJDZIE CI TO NA SUCHO!!!!\n\n" +
                            "Po powiedzeniu tego on również dobywa swojego miecza");
                    walka(gracz,policzki);
                    Thread.sleep(1500);
                    System.out.println("Po tym jak mężczyzna z dwoma bliznami upadł na ziemię podchodzi do ciebie\n" +
                            "mężczyzna w płasczu.\n" +
                            "Męźczyzna w płaszczu:\n Dziękuje ci za pokonanie ich. Męczyli to miasto od dłuższego czasu,\n" +
                            "a ja nie miałem pomysłu jak się za nich zabrać. Masz wypij to, pomoże ci.\n\n" +
                            "Męźczyzna daje ci małą fiolkę, którą pijesz. Po wypiciu jej czujesz jak wracasz do pełni sił");
                    gracz.HP=100;
                    gracz.Mana=50;
                    Thread.sleep(2500);
                    System.out.println("Męźczyzna w płaszczu:\n Oraz weź jeszcze to. Przydzą ci się w trakcie twojej podróży\n\n" +
                            "Daje ci 1 złotą monetę i 5 srebrnych\n");
                    gracz.srebro+=5;
                    gracz.zloto+=1;
                    System.out.println("Następnie wychodzi z knajpy bez mówienia już niczego");
                    CzyBylWKarczmie=true;
                    System.out.println("Postanawiasz też wyjść z karczmy");
                    break;
                }
                else if (wybor==3){
                    System.out.println("Podchodzisz do mężczyzny. Po podejściu do niego zauważasz że nie przerwanie\n" +
                            "mierzy wzrokiem 2 mężczyzn na środku lokalu.\n" +
                            "Próbujesz do czegość się o nim dowiedziec\n" +
                            "O co chcesz go zapytać?\n" +
                            "1 - Skąd pochodzi?\n" +
                            "2- jak się tutaj znalazł\n" +
                            "3 - co pije\n");
                    wybor1= scanner.nextInt();
                    int ilePytan=0;
                    while (1 == 1) {
                        if (wybor1!=1&&wybor1!=2&&wybor1!=3){
                            System.out.println("Nie ma takiej opcji. Proszę wybrać poprawną opcje");
                        }
                        if (ilePytan==3){
                            System.out.println("Meżczyzna macha ci ręką abyś odszedł i mu nie przeszkadzał.\n" +
                                    "Chcąc uniknąc problemów odchodzisz\n");
                            break;
                        }else{
                            System.out.println("Mężczyzna nie reaguje na twoje pytanie i kontunuuje sączenie\n" +
                                    "swjego trunku bez tracenie z oczu 2 łysych mężczyzn");
                            ilePytan+=1;
                        }if (wybor1==1 || wybor1==2|| wybor1==3){
                            System.out.println("Co zamierzasz teraz zrobić?\n 1 - spytać go skąd pochodzi\n 2 - spytać jak się tutaj znalazł\n 3- spytać się co pije\n" +
                                    "4 - odejść od niego");
                            wybor1= scanner.nextInt();
                            if (wybor1==4){
                                System.out.println("Odchodzisz od jego stolika");
                                break;
                            }

                    }
                    }
                }
                    }
    }else {
            System.out.println("Knajpa jest w opłakanym stanie. Na środku leży wyrówcony stół oraz kawałki potłuczonych butelek.\n" +
                    "Nie ma już w niej nikogo poza barmanem. Na podłodze leżą jeszcze truchła tych 2 męźczyzn co zabiłeś wcześniej.\n" +
                    "Ich krew wsiąkneła już w drewnianą podłogę.\n" +
                    "Czy chesz porozmawiać z barmanem\n" +
                    "1 - tak\n" +
                    "2 - nie\n");
            wybor1= scanner.nextInt();
            if (wybor1==1){
                System.out.println("Podchodzisz do barmana ostrożnie omijając kawałki szkła na podłodze.\n" +
                        "Gdy przechodziłeś obok trupów zauwazyłeś że spod ich pociętych rękaów\n" +
                        "przebijają jakieś tatuaże.\n" +
                        "Czy chesz im się przyjrzeć?\n" +
                        "1 - tak\n" +
                        "2 - nie\n ");
                wybor2= scanner.nextInt();
                if (wybor2==1){
                    System.out.println("Przykucasz i odkrywasz tatuaże na rękach męźczyzn. Jeden i drugi\n" +
                            "mają taki sam tatuaż. Przedstawia on czarnego smoka owiniętego wokół miecza.\n" +
                            "Nie masz pojęcia co on oznacza, ale czujesz że nie oznacza on nic dobrego");
                }
                    if (gracz.sztylet==false){
                    System.out.println("Idziesz dalej do barmana.\n" +
                            "Barman:\n Dziękuje ci podróżniku za pokonanie tych łotrów. Od dłuższego czasu\n" +
                            "przesiadywali w tym lokalu i nękali innych ludzi.\n" +
                            "Masz weź to. Potraktuj to jako nagrodę za pomoc\n\n" +
                            "Barman daje ci mały stalowy sztylet ze zdobioną rękojeścią\n\n" +
                            "Barman:\n Coś czuję że tobie bardziej się przyda niż mnie.\n" +
                            "A teraz uciakaj stąd zanim przyjdą ich koledzy\n\n\n" +
                            "** możesz od teraz używać sztyletu w przyszłych starciach**");
                    gracz.sztylet=true;
            }else {
                        System.out.println("Idziesz dalej do barmana\n" +
                                "Barman:\n Uciekaj stąd. W każdej chwili mogą zjawić się ich koledzy");
                    }
            }
            System.out.println("W obawie o własne bezpieczeństow wychodzisz z karczmy.");
        }}


    public void StoiskoWrożki(Player gracz)throws InterruptedException{
        System.out.println("Podchodzisz do stoiska wróżki.\n" +
                "Po podejściu widzisz starszą kobietę siedzącą za stołem, na którym\n" +
                "są rozłożone karty z dziwnymi rysunkami oraz na środku którego znajduje\n" +
                "się szklana kula. Po chwili staruszka cię zauważa\n\n" +
                "Staruszka:\n A więc w końcu się zjawiłeś. Wyczekiwałam twojego przybycia\n" +
                "od wielu lat.\n\n" +
                "Jej słowa cię zaskakują.\n Co jej odpowiesz?\n" +
                "1 - Co?\n" +
                "2 - Dlaczego akurat ja?\n" +
                "3 - Co to oznacza?\n");
        wybor= scanner.nextInt();
        while (1==1){
            if (wybor==1){
                System.out.println("Staruszka:\n" +
                        "Twoja obecność była zapowiedziana tutaj\n" +
                        "wiele lat temu. Pisane są ci wielkie rzeczy.");
                Thread.sleep(1500);
            }else if (wybor==2){
                System.out.println("Starusza:\n Nie mogę ci tego powiedzieć. Tak już było zapisane w\n" +
                        "gwiazdach. Gwiazdy miały na ciebie plan już wiele wieków temu.\n" +
                        "Nie zależnie jak bardzo będziesz się opierał i tak ono się wypełni");
                Thread.sleep(1500);
            } else if (wybor==3) {
                System.out.println("Staruszka:\nNie wiem co konkretnie to oznacza.\n" +
                        "Wiem tylko że pisane są ci wielkie rzeczy. Nie wiem czy dobre czy złe.\n" +
                        "Jedyne co wiem to to że będą one wielkie ");
                Thread.sleep(1500);

            } else if (wybor!=1 && wybor!=2 && wybor!=3) {
                System.out.println("Nie ma takiej opcji. Prosze wybrać poprawną opcje");

            }if (wybor==1||wybor==2||wybor==3){
                System.out.println("Czy chcesz spytać staruszkę o coś jeszcze?" +
                        "\n 1 - Co oznaczały twoje słowa na początku?\n" +
                        "2 - Dlaczego akurat ja?\n" +
                        "3 - Co oznaczają twoje słowa?\n" +
                        "4 - nie pytaj o nic i odejdż od straganu");
                wybor= scanner.nextInt();
            }
            if (wybor == 4) {
                System.out.println("Gdy miałeś odchodzić od straganu słyszysz znowu głos\n" +
                        "staruszki.\n" +
                        "Staruszka:\n Pokczekaj jeszcze! Podaj mi swoją dłoń. Zaufaj mi, to \n" +
                        "ci pomoże\n\n" +
                        "Wystawiasz swoją dłoń w kierunku staruszki. Od razu gdy ją wystawiłeś\n" +
                        "staruszka łapie ją i zaczyna odmawiać coś co brzmi jak jakaś nie znana ci modlitwa\n\n\n" +
                        "Czujesz jak twoje siły życiowe powracają");
                gracz.HP=100;
                gracz.Mana=50;
                System.out.println("Dziękujesz staruszcze i odchodzisz od jej straganu");
                Thread.sleep(3000);
                break;
            }
        }
    }
    private void SuroweRyby()throws InterruptedException{


        System.out.println("Po podejściu do straganu zaczynasz przeglądać rodzaje ryb. Zauważasz że na straganie znajdują się między innymi\n" +
                " dorsze, rekiny, karpie, karasie, krewetki, małże.\n" +
                "Twoje przeglądanie przerywa ci sprzedawca");
        Thread.sleep(4000);
        System.out.println("Sprzedawca:\n W czym mogę służyć podróżniku?\n" +
                "Co odpowiesz\n 1- opowiedz mi o tych rybach   \n 2- chciałbym kupić którąś z ryb \n3- tylko przeglądam nie mam zamiaru nic kupować");
        wybor1=scanner.nextInt();


        while (1==1){
            if (wybor1==3){
                System.out.println("Sprzedawca: \n Okej jakbyś był zainteresowany którąś z ryb to mnie zawołaj"
                );
            }
            if (wybor1==2){
                System.out.println("Sprzedawca:\n Którą rybę chciałbyś kupić?\n" +
                        "1 - dorsza\n 2 - rekina\n 3- karpia\n 4 - karasia\n 5 - krewetkę\n 6 - małża ");
                wybor2= scanner.nextInt();
                System.out.println("Sprzedawca:\n To będą 6 srebrne monety\n" +
                        "Zaczynasz szukać sakiewki w kieszeniach swoich spodni, lecz nie możesz jej znaleźć\n Sprzedawca to zauważa\n" +
                        "Sprzedawca:\n Widzę że nie masz pieniędzy. Nie rób sobie żartów i nie marnuj mojego czasu.\n Przyjdź jak zdobędziesz jakieś pieniądze to porozmawiamy");
            }
            if (wybor1==1){
                System.out.println("Sprzedawca:\nWszystkie nasze ryby są łowione u wybrzeży naszego morza.\n " +
                        "Następnie po połowie pakujemy je do beczek z solą, w których leżą" +
                        " do momentu jarmarku.\n Jestem w stanie ręczyć własnym życiem za jakość tych ryb\n " +
                        "Dziękujesz za odpowiedź po czym sprzedawca odchodzi");
            }
            else if(wybor1!=1 && wybor1!=2 && wybor1!=3){
                System.out.println("Nie ma takiej opcji. Wybierz poprawną opcję");
                wybor1= scanner.nextInt();
            }
            if (wybor1==1 || wybor1==2|| wybor1==3){
                System.out.println("Co zamierzasz teraz zrobić?\n 1 - zapytać o ryby\n 2 - kupić rybę\n 3- odejść od straganu");
                wybor1= scanner.nextInt();
                if (wybor1==3){
                    System.out.println("Odchodzisz od straganu i znajdujesz się ponownie na środku deptaka");
                    break;
                }
            }


        }


    }


    private void DaniaZRyb() throws InterruptedException {
        System.out.println("Po podejściu do straganu z rybami zaczynasz przeglądać ich menu.\n" +
                "|------------------|\n" +
                "|  Menu            |\n" +
                "|Dorsz w           |\n" +
                "|sosie własnymm    |\n" +
                "|                  |\n" +
                "|Wątróbka rekina   |\n" +
                "|                  |\n" +
                "|Smażone krewetki  |\n" +
                "|------------------|");
        Thread.sleep(5000);
        System.out.println("Podczas czytania menu podchodzi do ciebie kucharz.\n Ma na sobie biały fartuch oraz lniane spodnie i koszule.\n" +
                "Kucharz:\n Czy coś dla pana Podać?\n Co odpowiesz?" +
                "\n 1 - Poproszę...\n 2 - A czy mógłbym najpierw dostać próbkę aby nie zmarnować pieniędzy?\n 3 - Nic mi nie trzeba ");
        wybor=scanner.nextInt();
        while (1==1){
            if (wybor==1){
                System.out.println("Co konkretnie wybierasz?\n 1 - Dorsza w sosie własnym\n 2 - Wątróbkę rekina\n 3 - smażone krewetki");
                wybor1=scanner.nextInt();
                System.out.println("Kucharz:\n to będzie 7 srebrnych monet.\n" +
                        "Przeczesując sakiewki przy swoim pasku uświadamiasz sobie że nie masz żadnych pieniędzy. Czy chcesz spróbować uzyskać danie za darmo?\n 1 - tak\n 2 - nie");
                wybor2=scanner.nextInt();
                if (wybor2==1){
                    System.out.println("Próbujesz oszukać kucharza i wmówić mu że zapłacisz później");


                    for (int i =0; i <=5;i+=1){
                        System.out.print(". ");
                        Thread.sleep(500);}
                    int szansa =los(5);
                    if(szansa==0){
                        System.out.println("Udało ci się oszukać kucharza.\n Kucharz:\n Przygotujemy twój posiłek, proszę zająć miejsce w środku ");
                        Thread.sleep(1500);
                        System.out.println("Po 15 minutach otrzymujesz swój posiłek. Jest dokładnie taki jak go sobie wyobrażałeś,\n a smakuje jeszcze lepiej.\n" +
                                "Po zjedzeniu opuszczasz lokal aby uniknąć kłopotów");
                        break;
                    }else{
                        System.out.println("Nie udało ci się.\n Kucharz:\n Prosze opuścić lokal i mi się wiecej tu nie pokazywać!!!\n Jesteś zmuszony opuścić lokal");
                        break;
                    }
                }else{
                    System.out.println("Przyznajesz się do braku pieniędzy przed kucharzem\n Kucharz:\n" +
                            "Cieszę się że się przyznałeś i nie próbowałeś mnie okraść.\n Niestety nie mogę cię nakarmić za darmo.\n" +
                            "Mogę co najwyżej dać ci próbkę jednego z naszych posiłków.");
                }
            }
            else if (wybor==2){
                System.out.println("Kucharz:\n Już proszę.\n Po powiedzeniu tego kucharz udaje się na tył lokalu");
                Thread.sleep(750);
                System.out.println("Po chwili czekania kucharz wraca z tależem, \n na którym znajduje się kawałek ryby polany jakimś białym sosem\n " +
                        "Kucharz: Oto próbka naszego najlepszego dania Dorsza w Sosie własnym\n" +
                        "Postanawiasz spróbować\n");
                Thread.sleep(1000);
                System.out.println("Ryba była dobrze wysmażona, lecz sos był podejrzanie lepki oraz trochę gorzki.\n" +
                        "Mimo to dziękujesz kucharzowi");
            }
            else if (wybor==3){
                System.out.println("Kucharz:\n Jeżeli czegoś będzie potrzeba to proszę mnie zawołać. Będę tuż obok.\n" +
                        " Po powiedzeniu tego odchodzi i zaczyna obsługiwać innego klienta");
            }else {
                System.out.println("Nie ma takiej opcji. Proszę wybrać poprawną opcję");
                wybor=scanner.nextInt();
            }
            System.out.println("Co zamierzasz teraz zrobić? \n 1 - zamówić jedzenie\n 2 - poprosić o próbkę jedzenie\n 3 - odejść od straganu");
            wybor=scanner.nextInt();
            if (wybor==3){
                System.out.println("Odchodzisz od straganu i wracasz na środek deptaka");
                break;
            }


        }


    }
    //Coded by Antkaczo


    private void WytrworyZOsci()throws InterruptedException{
        System.out.println("Po podejściu do straganu zaczynasz przeglądać jego asortyment. Na blacie pod białym materiałowym dachem leżą\n" +
                "różnego rodzaju bronie, a z tyłu straganu na stojaku znajduje się zbroja w pełni wykonana z kości ryb.\n" +
                " Najbardziej rzucają ci się w oczy para ościanych noży oraz miecz zrobiony z ości.\n" +
                "Mocno przypomina on ten twój.\n" +
                "Zaczynasz zastanawiać się czy oba te miecze zrobiła ta sama osoba lub któryś z jego uczniów.\n" +
                "Twoje rozmyślanie przerywa ci sprzedawca\n" +
                "Sprzedawca:\n Czy mogę w czymś ci pomóc?\n \n" +
                "Co mu odpowiesz?" +
                "\n 1 - chciałbym kupić broń\n" +
                "2 - mógłbyś mi opowiedzieć o tym pancerzu z tyłu\n" +
                "3 - na razie tylko przeglądam");
        wybor=scanner.nextInt();
        while (1==1){
            if (wybor==1){
                System.out.println("Sprzedawca:\n Którą konkretnie\n" +
                        " 1 - para noży " +
                        "\n2 - miecz");
                wybor1=scanner.nextInt();
                System.out.println("Sprzedawca:\n Dobrze. To będzie 1 złota moneta i 7 srebrnych\n \n" +
                        "Po przeszukaniu wszystkich kieszeni w swojej koszuli uświadamiasz sobie że nie masz żadnych pieniędzy\n" +
                        "Czy chcesz spróbować oszukać sprzedawcę\n 1 - tak\n 2 - nie");
                wybor2=scanner.nextInt();
                if (wybor2==1){
                    System.out.println("Pytasz się sprzedawcy czy możesz kupić teraz i zapłacić później");
                    for (int i =0;i<10;i++){
                        Thread.sleep(250);
                        System.out.print(". ");
                        Thread.sleep(250);
                    }
                    System.out.println("\n Po chwili namysłu sprzedawca daje ci odpowiedź na twoje pytanie\n" +
                            "Sprzedawca:\n Niestety nie mogę ci tego sprzedać na zeszyt.\n" +
                            "Personalnie nie miałbym problemu, ale gdymym to zrobił to\n" +
                            "właściciel straganu zabił mnie jedną z broni, które widzisz.\n" +
                            "Dziękujesz za dobre chęci i wyrażasz zrozumienie.\n \n" +
                            " Sprzedawca odchodzi w głąb straganu");
                }else{
                    System.out.println("Mówisz sprzedawcy, że niestety nie posiadasz żadnych pieniędzy\n \n " +
                            "Sprzedawca:\n No cóż, niestety mój drogi przyjacielu nie moge ci oddać\n" +
                            "tej broni za darmo. Jak będziesz miał pieniądze to przyjdź i będzie twoja\n \n " +
                            "Po powiedzeniu tego sprzedawca odchodzi w głąb straganu");
                }
            } else if (wybor==2) {
                System.out.println("Sprzedawca:\n Więc mój drogi przyjacielu.\n" +
                        "Ten pancerz został zrobiony w całości z kości rekinów,\n" +
                        "które pływają przy czarnej wyspie. Legenda głosi, że mają\n" +
                        "one najtwardsze kości w całym morzu, więc i pancerz ten \n" +
                        "jest ekstremalnie wytrzymały.\n\n" +
                        "Na twojej twarzy pojawia się zainteresowanie\n" +
                        "Sprzedawca to zauważa po czym dodaje że nie jest on\n" +
                        "jeszcze na sprzedaż.\n \n  Po powiedzeniu tego odchodzi w głąb straganu");


            } else if (wybor==3) {
                System.out.println("Sprzedawca:\n" +
                        "Okej. Jeżeli czegoś będziesz potrzebował to mnie zawołaj. Będę na tyle\n" +
                        "Po powiedzeniu tego odchodzi na tył straganu");


            }else if(wybor!=1 && wybor!=2 && wybor!=3){
                System.out.println("Nie ma takiej opcji. Wybierz poprawną opcję.");
                wybor=scanner.nextInt();
            }
            System.out.println("Co zamierzasz teraz zrobić?\n" +
                    "1 - kupić broń\n" +
                    "2 - spytać się o pancerz\n" +
                    "3 - wrócić na deptak");
            wybor=scanner.nextInt();
            if (wybor==3){
                System.out.println("Odchodzisz od straganu i wracasz z powrotem na środek deptaka");
                break;
            }
        }
    }


    private int los(int limit){

        int losowanie= random.nextInt(limit);
        return losowanie;
    }

    private void walka(Player gracz, Thug lotr){
        int fireball;
        boolean CzyRzucalJuz=false;
        while (1==1){
            System.out.println("Masz " + gracz.HP + " punktów życia\n" +
                    "oraz " + gracz.Mana + " many\n" +
                    lotr.getName()+" ma " + lotr.HP +  " punktów życia");
            System.out.println("Co zamierzasz teraz zrobić?\n" +
                    "1 - zaatakować mieczem\n" +
                    "2 - uleczyć się\n" +
                    "3 - użyć kuli ognia\n");
            wybor2 = scanner.nextInt();
            while (1==1){
                if (wybor2==1){
                    lotr.DemageTaken(gracz.PlayerAttack());
                    break;
                }
                else if (wybor2==2){
                    gracz.leczenie();
                    break;
                }
                else if (wybor2==3){
                    fireball= gracz.kula_ognia();
                    lotr.DemageTaken(fireball);
                    break;
                }else {
                    System.out.println("nie ma takiej opcji. Wybierz poprawną opcje");
                    wybor2= scanner.nextInt();
                }}
            if (lotr.HP<=0){
                System.out.println("Gratulacje. Pokonałeś " + lotr.getName());
                break;}
            EnemyAction=random.nextInt(4);
            while (1==1){
                if (EnemyAction==1){
                    System.out.println(lotr.getName() + " dźga cię swoim mieczem");
                    gracz.DemageTaken(lotr.firstattack(lotr.firstattack(lotr.max_demage)), lotr.name);
                    break;
                }
                else if (EnemyAction==2){
                    System.out.println(lotr.getName() + " uderza cię pięścią");
                    gracz.DemageTaken(lotr.SecondAttack(lotr.second_attack_max_demage), lotr.name);
                    break;
                }else if (EnemyAction==3 && CzyRzucalJuz==false){
                    System.out.println(lotr.getName() + " rzuca w ciebie krzesłem na którym przd chwilą siedział");
                    gracz.DemageTaken(15, lotr.name);
                    CzyRzucalJuz=true;
                    break;
                }else {
                    EnemyAction=random.nextInt(3);
                }
            }
            if (gracz.HP<=0){
                System.out.println("Skończczyły ci się punkty życia\n\n\n\n" +
                        "           GAME OVER\n\n\n\n\n");
                System.exit(0);
                break;
            }

            }
        }
}
