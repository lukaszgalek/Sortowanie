package SDA;

public class Tablice {

    private static int[] tabPomocnicza;
    private static int dlugoscTabPomocnicza;
    private static int[] tabPosortowana;

    public static void countingSort(int[] tabNieposortowana) {
        dlugoscTabPomocnicza = tabNieposortowana[0];
        for (int i = 0; i < tabNieposortowana.length; i++) {
//            if (i < tabNieposortowana.length-1){
            if (dlugoscTabPomocnicza <= tabNieposortowana[i]) {
                dlugoscTabPomocnicza = tabNieposortowana[i];

            }

        }

        tabPomocnicza = new int[dlugoscTabPomocnicza+1];
        for (int i = 0; i <= dlugoscTabPomocnicza; i++) {
            tabPomocnicza[i] = 0;
        }

        for (int i = 0; i < tabNieposortowana.length; i++) {
            tabPomocnicza[tabNieposortowana[i]] ++;
        }

        for (int i = 0; i < tabPomocnicza.length-1; i++) {
            tabPomocnicza[i + 1] = tabPomocnicza[i] + tabPomocnicza[i + 1];
        }

        tabPosortowana = new int[tabNieposortowana.length];
        for (int i = 0; i < tabNieposortowana.length; i++) {

//            int temp= tabPomocnicza[tabNieposortowana[i]];
//            tabPosortowana[temp]= tabNieposortowana[i];

            tabPomocnicza[tabNieposortowana[i]]--;
  tabPosortowana[tabPomocnicza[tabNieposortowana[i]]] = tabNieposortowana[i];
        }
        System.out.println();
for ( int  i = 0 ; i< tabPosortowana.length;i++){
        System.out.print(tabPosortowana[i]+" ");}
}


}
