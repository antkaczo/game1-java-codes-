import java.util.Scanner;

public class Loch {

    Scanner scanner = new Scanner(System.in);

    PrintTxt print = new PrintTxt();
    public Loch(){
    }
    int wybor;
    int wybor1;
    int wybor2;

    public void cela() throws InterruptedException {
        print.PrintTxt("Budzisz sie w mały pomieszczeniu",250);
        Thread.sleep(2500);
        print.PrintTxt("Dalej czujesz ból w żebrach",250);
        Thread.sleep(2500);
        print.PrintTxt("Powoli wraca ci wzrok",250);
        Thread.sleep(2500);
        print.PrintTxt("Widzisz, że jesteś w małym kiepsko oświetlonym pomieszczeniu.\n" +
                "Przed sobą widzisz ścianę z krat. Jest to jedyna taka ściana. Reszta\n" +
                "pokoju jest otoczona kamiennymi ścianami bez okien",250);
        Thread.sleep(2500);
        print.PrintTxt("Uświadamiasz sobie, że jesteś w celi. Nie wiesz czemu tu jesteś\n" +
                "i nie masz pojęcia jak to odkryć",250);
        Thread.sleep(5000);
        print.PrintTxt("Zauważasz, że siedzisz w kącie na małej usypanej słomianej stercie\n" +
                "W drugim narożniku widzisz wiadro.\n" +
                "Poza tym pomieszczenie jest puste ",250);
        print.PrintTxt("Co zamierasz zrobić?\n" +
                "1 - podejść do krat\n" +
                "2 - oberjzeć celę\n" +
                "3 - czekać",250);
        wybor=scanner.nextInt();
        while (1==1){
            if (wybor==1){
                kraty();
            }
       else if (wybor==2){
                pokoj();
            }
        else if (wybor==3){
             Czekanie();
             return;
        }
        if (wybor==1||wybor==2||wybor==3){
            print.PrintTxt("Co zamierzasz teraz zrobić?\n" +
                    "1 - podejść do krat\n" +
                    "2 - oberjzeć celę \n" +
                    "3 - czekać ",250);
            wybor= scanner.nextInt();
        }
        if (wybor!=1&&wybor!=2&&wybor!=3){
            System.out.println("Nie ma takiej opcji. Wybierz poprawną opcje");
            wybor=scanner.nextInt();
        }

       }
    }



    private void kraty() throws InterruptedException {
        print.PrintTxt("Podchodzisz do krat",250);
        Thread.sleep(2500);
        print.PrintTxt("Naperzeciwkow widzisz inną celę, z jakąś osobą w środku\n",250);
        Thread.sleep(2500);
        print.PrintTxt("Wisi nad nim tabliczka z numerem 3",250);
        Thread.sleep(2500);
        print.PrintTxt("Spoglądasz w lewo i widzisz jeszce jedną parę cel, a za nimi kamienną ścianę",250);
        Thread.sleep(2500);
        print.PrintTxt("Spoglądasz w prawo i widzisz ciągnący się korytarz z celami z obydwu stron",250);
        Thread.sleep(2500);
        print.PrintTxt("Po prawej stronie celi widzisz strażnika.",250);
        Thread.sleep(250);
        print.PrintTxt("Czy chcesz z nim porozmawiać?\n" +
                "1 - tak\n" +
                "2 - nie", 250);
        wybor1=scanner.nextInt();
        while (1==1){
            if (wybor1==1){
                dialog();
                return;
            }
            if (wybor1==2){
                print.PrintTxt("Odchodzisz od krat.",250);
                return;
            }else {
                System.out.println("Nie ma takiej opcji. Wybierz poprawną opcje");
                wybor1=scanner.nextInt();
            }
        }
    }

    private void pokoj() throws InterruptedException {
        print.PrintTxt("Rozglądasz się po celi i dostrzegasz wyryte pionowe kreski w ścianie.\n",250);
        Thread.sleep(2500);
        print.PrintTxt("Rozglądają się dalej dostrzegasz jescze trochę uszczerbów w kamieniach na ścianach i\n" +
                "zaschnięte plamy krwi na podłodze.",250);
        Thread.sleep(2500);
        print.PrintTxt("Pozatym nie dostrzegasz niczego interesujądego",250);
        return;
    }

    private void Czekanie() throws InterruptedException {
        print.PrintTxt("Siadasz pod ścianą na środku celi i zaczynasz się wpatrywać w celę naprzeciwko.\n",250);
        Thread.sleep(2500);
        print.PrintTxt("Siedzisz tak do kolacji.",250);
        Thread.sleep(2500);
        print.PrintTxt("Dostajesz miskę ryżu i mleka, którą zjadasz odrazu",250);
        Thread.sleep(2500);
        print.PrintTxt("Kładziesz się spać na posłaniu z siana",250);
        Thread.sleep(2500);
        print.PrintTxt("Budzisz się rano i widzisz, że przy kratach stoi bochenek chleba i szklanka wody.",250);
        Thread.sleep(2500);
        print.PrintTxt("Zjadasz posiłek odrazu i wracasz do siedzenia pod ścianą. Zauważasz też że zmienił się straznik",250);
        Thread.sleep(2500);
        print.PrintTxt("Koło pory która zdaje ci się południem ktoś zabiera szklankę po wodzie",250);
        Thread.sleep(2500);
        print.PrintTxt("Jakiś czas potem dostajesz taki sam posiłek jak wczoraj",250);
        Thread.sleep(2500);
        print.PrintTxt("Kładziesz się spać",250);
        Thread.sleep(2500);
        print.PrintTxt("Kolejny dziś spędzasz tak samo jak ostani",250);
        Thread.sleep(2500);
        print.PrintTxt("Tak samo następny",250);
        Thread.sleep(2500);
        print.PrintTxt("I następny",250);
        for (int i =0;i<20;i++){
            System.out.print(".");
            Thread.sleep(500);
            if (i%5==0){
                System.out.println();
            }
        }
        Thread.sleep(2500);
        print.PrintTxt("Siedzisz tak i wegetujesz czekając aż coś się stanie.\n" +
                "Nie wiesz ile dni już mineło. Wiesz że siedzisz już na tyle długo, że\n" +
                "twoja broda miała czas zarosnąć.",250);
        Thread.sleep(1500);
        print.PrintTxt("Twoją jedyną rozrywką jest obserwowanie zmian strażników.",250);
        Thread.sleep(2500);
        print.PrintTxt("Pewnego wieczora na sam widok miski z ryżem i mlekiem dostajesz odruchu wymiotnego",250);
        Thread.sleep(2500);
        print.PrintTxt("Jednego dnia coś w końu się dzieje.",250);
        Thread.sleep(2500);
        print.PrintTxt("Widzisz jak strażnik zabiera kobietę z celi z naprzecika.",250);
        Thread.sleep(2500);
        print.PrintTxt("Słyszysz głos strażnika jak ją zabierają",250);
        print.PrintTxt("Strażnik:\n" +
                "Szybciej tam! Na szubienicy i tak mamy opóźnienie bez waszego ociągania",250);
        Thread.sleep(2500);
        for (int i=0;i<10;i++){
            System.out.print(".");
            if (i%5==0){
                System.out.println();
            }
        }
        print.PrintTxt("Następnych trochę dni dalej wegetujesz",250);
        Thread.sleep(2500);
        print.PrintTxt("Jednego dnia przychodzi do ciebie męźczyzna w galowym garniturze w obstwie 2 strażników",250);
        print.PrintTxt("Meźczyzna w galowym garniturze:\n" +
                "Pójdziesz z nami",250);
        Thread.sleep(2500);
        print.PrintTxt("Strażnicy nakładają ci worek na głowę i następnie czujesz, że cię gdzieś prowadzą",250);
        return;

    }


    private void dialog() throws InterruptedException {
        print.PrintTxt("Podchodzisz do strażnika.\n" +
                "O co chcesz go zapytać?\n" +
                "1 - o to jak się tutaj znalazłeś\n" +
                "2 - o to gdzie jesteś \n" +
                "3 - o to co cię czeka\n" +
                "4 - o nic",250);
        int question=0;
        wybor2=scanner.nextInt();
        while (3==3){
            if (wybor2==4){
                print.PrintTxt("Odchodzisz od krat",250);
                return;
            }
            if (wybor2==1){
                print.PrintTxt("Strażnik:\n" +
                        "Nie wiem.Ty mi powiedz",250);
                question+=1;
            }
            if (wybor2==2){
                print.PrintTxt("Strażnik:\n" +
                        "W lochach",250);
                question+=1;
            }
            if (wybor2==3){
                print.PrintTxt("Strażnik głośno przełyka ślinę, lecz nic nie mówi",250);
                question+=1;
            }
            if (question==3){
                break;
            }
            if (wybor2==1||wybor2==2||wybor2==3){
                print.PrintTxt("O co zamierzasz teraz zapytać\n" +
                        "1 - o to jak się tutaj znalazłeś\n" +
                        "2 - o to gdzie jesteś \n" +
                        "3 - o to co cię czeka\n" +
                        "4 - o nic",250);
                wybor2=scanner.nextInt();
            }
            if (wybor2!=1&&wybor2!=2&&wybor2!=3&&wybor2!=4){
                System.out.println("Nie ma takiej opcji. Proszę wybrać poprawną");
                wybor2=scanner.nextInt();
            }
        }
        print.PrintTxt("Strażnik się odwraca i nic nie mówiąc odpycha cię od krat",250);
        Thread.sleep(1500);
        return;
    }
}
