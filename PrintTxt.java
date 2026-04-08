public class PrintTxt {

    public void PrintTxt(String txt,int MiliSeconsBetwenLetters) throws InterruptedException {
        String[] slowa = txt.split(" ");

        for (int i=0;i<slowa.length;i++){
            System.out.print(slowa[i] + " ");
            Thread.sleep(MiliSeconsBetwenLetters);
            //Coded by Antkaczo
        }
        char last = txt.charAt(txt.length()-1);
        if (last!='\n'){
            System.out.println();
        }

    }
}
