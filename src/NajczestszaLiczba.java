public class NajczestszaLiczba {

    public static void main(String[] args) {

        int[] tab = {4, 1, 1, 4, 2, 3,5,5,5,5,5, 4, 4, 3, 3, 3, 3, 3};
        int[] powtorzenia = new int[tab.length];

        int najwyzsza = 0;
        int powt=0;
        int wynik = 0;
        int tymczasowa=0;

        for (int i = 0; i< tab.length;i++)
        {
            for(int j = 0; j<(tab.length);j++)
            {
                if(tab[i]==tab[j])
                {
                    powt++;
                }


            }
            powtorzenia[i] = powt;
            powt = 0;


        }
        
        for(int i = 0; i < tab.length;i++) {
            tymczasowa = powtorzenia[i];
                   if (tymczasowa>=najwyzsza)
            {
                najwyzsza = tymczasowa;
                wynik = i;

            }

        }

        System.out.println("Zmienna najczęstsza to  : "+tab[wynik]);
            

    }


}
