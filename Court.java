import java.util.Scanner;

public class Court {

    Scanner scanner= new Scanner(System.in);
    PrintTxt print = new PrintTxt();
    public Court() {}
    int wybor;
    int wybor1;
    int[] wybory = new int[3];


    public void salasadowa() throws InterruptedException {
        print.PrintTxt("Po jakimś czasie takiego spaceru słyszysz otwieranie się drzwi",250);
        Thread.sleep(2500);
        print.PrintTxt("Następnie dalej jesteś gdzieś prowadzony",250);
        Thread.sleep(1500);
        print.PrintTxt("Po chwili jesteś mocno pchniętny na jakieś siedzenie",250);
        Thread.sleep(1500);
        print.PrintTxt("Czujesz jak twoje nadgarstki i kostki są przywiązywane do siedzenia",250);
        Thread.sleep(1500);
        print.PrintTxt("Ktoś zdejmuje ci worek z głowy",250);
        Thread.sleep(5000);
        print.PrintTxt("Widzisz, że jesteś przykuty do krzesła na środku sali.",250);
        Thread.sleep(2500);
        print.PrintTxt("Na przeciwko ciebie jest drewniana konstrukcja, która swoim kształtem\n" +
                "przypomina podium",250);
        Thread.sleep(1500);
        print.PrintTxt("W rogu sali widzisz, że siedzi skryba, który wręcz maniakalnie\n" +
                "ryje piórem po pergaminie",250);
        Thread.sleep(1500);
        print.PrintTxt("Po twojej lewej w drewnianych ławach siedzą jacyś ludzie",250);
        Thread.sleep(1500);
        print.PrintTxt("W tłumie tych ludzi dostrzegasz też mężczyznę, który\n" +
                "zabrał cię z celi",250);
        Thread.sleep(1500);
        print.PrintTxt("Po prawej stronie są takie same ławy jak po lewej tylko, że puste",250);
        Thread.sleep(1500);
        print.PrintTxt("Patrząc do tyłu widzisz kątem oka, że za barierkami stoją normalne ławki",250);
        Thread.sleep(1500);
        print.PrintTxt("Nie byłeś w stanie ocenić czy siedzą w nich ludzie, ponieważ strażnik szybko\n" +
                "przekręcił ci głowe abyś tam nie patrzył",250);
        Thread.sleep(5000);
        print.PrintTxt("Po chwili z za \"podium\" wchodzi męźczyzna",250);
        print.PrintTxt("W momencie w którym przekroczył próg wszyscy poza tobą i skrybą\n" +
                "staneli na baczność",250);
        Thread.sleep(2500);
        print.PrintTxt("Męźczyzna podchodzi do najwyższego miejsca na podium",250);
        Thread.sleep(1500);
        print.PrintTxt("Mężczyzna:\n" +
                "Spocznij!",250);
        Thread.sleep(1500);
        print.PrintTxt("Ludzie w ławach siadają, a strażnicy przechodzą\n" +
                "do bardziej swobodnej postawy",250);
        Thread.sleep(1500);
        print.PrintTxt("Męźczyzna:\n" +
                "Rozprawę czas zacząć.\n" +
                "Niniejszy tutaj bezimienny będzie sądzony pod zarzutem\n" +
                "nieautoryzowanego wtargnięcie do obozu wojskowego podczas\n" +
                "oblężenia",250);
        Thread.sleep(1500);
        print.PrintTxt("Czy oskarżony ma coś do powiedzenia?\n" +
                "Czy chcesz coś powiedzieć?\n" +
                " 1 -tak\n" +
                "2 - nie",250);
        wybor=scanner.nextInt();
        if (wybor==1){
            oskarzony();
        }
        print.PrintTxt("Sędzia:\n" +
                "Kontynując rozprawę...\n" +
                "Wtargnął pan do obozu i wszczął pan walkę z jednym z \n" +
                "generałów. Czy tak było?",250);
        Thread.sleep(1500);
        print.PrintTxt("Co odpowiesz?\n" +
                "1 - tak\n" +
                "2 - nie, zostałem zaatakowany",250);
        wybor=scanner.nextInt();
        while (1==1){
            if (wybor==1){
                print.PrintTxt("Sędzia:\n" +
                        "Dobrze",250);
                break;
            }
            if (wybor==2){
                print.PrintTxt("Sedzia:\n" +
                        "Czyli sadzi pan, że został pan zaatakowany?\n" +
                        "1 - tak\n" +
                        "2 - nie",250);
                wybor1=scanner.nextInt();
                while (1==1){
                    if (wybor1==1){
                        wybory[1]+=1;
                        print.PrintTxt("Sędzia:\n" +
                                "Dobrze. Uwzględnie to przed werdyktem.\n" +
                                "Miało by to racje bytu przy charakterze tego generała",250);
                        break;
                    }else if (wybor1==2){
                        print.PrintTxt("Sędzia:\n" +
                                "To dlaczego pan utrudnia rozprawę????",250);
                        break;
                    }
                    System.out.println("Nie ma takiej opcji. Proszę wybrać poprawną opcję");

                }
                break;
            }
        }
        print.PrintTxt("Sędzia:\n" +
                "Więcej zarzutów i zeznań nie ma.\n" +
                "Zarządza przerwę w rozprawie",250);
        Thread.sleep(2500);
        print.PrintTxt("Obserwujesz jak najpierw sędzia a następnie\n" +
                "ludzie z ławy opuszczają sale. Ostatni wychodzi skryba",250);
        Thread.sleep(2500);
        print.PrintTxt("Siedzisz teraz w pustej sali sądowej",250);
        for (int i =0;i<20;i++){
            System.out.print(".");
            Thread.sleep(1000);
            if (i%5==0){
                System.out.println();
            }
        }
        print.PrintTxt("Po jakimś czasie ludzie wracają na salę",250);
        Thread.sleep(1500);
        if (wybory[0]+wybory[1]>0){
            print.PrintTxt("Sędzia:\n" +
                    "Zostaniesz uznany za niewinnego, lecz zostaniesz\n" +
                    "zaciągnięty do naszej armi. Czy takie warunki ci odpowiadają?\n" +
                    "1 - tak\n" +
                    "2 - nie",250);
            wybor=scanner.nextInt();
            while (1==1){
                if (wybor==1){
                    print.PrintTxt("Sedzia:\n" +
                            "Znakomicie. Rozprawę uznaje za zakończoną.\n" +
                            "Proszę oddać temu mężczyźnie jego rzeczy i w skali\n" +
                            "maksymalnie 3 dni ma się stawić w punkcie poboru",250);
                    Thread.sleep(2500);
                    print.PrintTxt("Po powiedzeniu tego sędzia uderza młotkiem o podium i opuszcza salę",250);
                    return;
                }
                if (wybor==2){
                    print.PrintTxt("Sędzie:" +
                            "Skoro nie odpowiadają ci warunki to zapraszam na\n" +
                            "Stryczek. Niniejszym skazuje cię na śmierć przez powieszenie.\n" +
                            "Wyrok wykonać natychmiast",250);
                            Thread.sleep(2500);
                            print.PrintTxt("Po powiedzeniu tego sędzia uderza drewnianym młotkiem\n" +
                                    "o ramę podium, a następnie wychodzi z sali",250);
                            szubienica();
                }
                System.out.println("Nie ma takiej opcji. Proszę wybrać poprawną");
                wybor= scanner.nextInt();
            }
        }else {
            print.PrintTxt("Sędzie:\n" +
                    "Po rozważeniu sprawy doszedłem do wniosku, że\n" +
                    "jesteś winny. Niniejszym oto skazuje cię na karę\n" +
                    "śmierci przez powieszenie. Wyrok wykonać natychmiast",250);
            Thread.sleep(2500);
            print.PrintTxt("Po powiedzeniu tego sędzia uderza młotkiem o podium i opuszcza salę",250);
            szubienica();
        }

    }

    private void oskarzony() throws InterruptedException {
        print.PrintTxt("Co chcesz powiedzieć?\n" +
                "1 - nie wiedziałem gdzie wchodzę\n" +
                "2 - ja nie chcioł ja nie wiedzioł\n" +
                "3 - jestem przekonany, że jestem nie winny\n" +
                "4 - zachowaj milczenie",250);
        wybor1=scanner.nextInt();
        while (1==1){
            if (wybor1==1){
                print.PrintTxt("Sedzia:\n" +
                        "Dobrze. Wezmę to pod uwagę",250);
                wybory[0]+=1;
                return;
            }
            if (wybor1==2){
                print.PrintTxt("Sędzia:\n" +
                        "To nie zmienia faktu, że złamał pan prawo wojskowe",250);
                return;
            }
            if (wybor1==3){
                print.PrintTxt("Sędzia:\n" +
                        "Zdziwiłbym się gdyby twierdził pan inaczej.\n" +
                        "Ułatwił by mi pan pracę",250);
                wybory[0]+=1;
                return;
            }
            if (wybor1==4){
                print.PrintTxt("Nic nie mówisz",250);
                return;
            }
            System.out.println("Nie ma takiej opcji. Wprowadź poprawną opcje");
            wybor1=scanner.nextInt();
        }
    }

    private void szubienica() throws InterruptedException {
        print.PrintTxt("Strażnicy odpinają cię od krzesła i zapinają cię w łańcuchy",150);
        Thread.sleep(1500);
        print.PrintTxt("Następnie wyprowadzają cię z sali",250);
        Thread.sleep(1500);
        print.PrintTxt("Później z budynku",250);
        Thread.sleep(1500);
        print.PrintTxt("Światło dzienne oślepia cię",250);
        Thread.sleep(1500);
        print.PrintTxt("Nim zdążyłeś się zorientować stoisz na platformie.",250);
        Thread.sleep(1500);
        print.PrintTxt("Widzisz przed sobą małą gromadkę ludzi",250);
        Thread.sleep(1500);
        print.PrintTxt("Czujesz jak lina zaciska ci się wokół szyi",250);
        Thread.sleep(1500);
        print.PrintTxt("Myślisz \"Czy to już koniec?\"",500);
        Thread.sleep(2500);
        print.PrintTxt("Czujesz jak klapa zapada się pod tobą",250);
        Thread.sleep(2500);
        print.PrintTxt("Przestajesz czuć",250);
        Thread.sleep(2500);
        print.PrintTxt("Wszystko staje się ciemne",1000);
        Thread.sleep(5000);
        System.out.println("Umierasz");
        Thread.sleep(7500);
        print.PrintTxt("G A M E   O V E R",2000);
        System.exit(0);
    }
}
