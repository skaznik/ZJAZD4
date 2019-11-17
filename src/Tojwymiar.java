public class Tojwymiar {
    public static void main(String[] args) {
//        int a = 3;
//        int b = 3;
//        int c = 3;
//        int[][][] tab = new int[a][b][c];
//        for(int i = 0; i<a;i++)
//        {
//            for(int j = 0; j<b;j++)
//            {
//                for(int k = 0; k<c;k++)
//                {
//                    System.out.println("arr["+i+"]["+j+"]["+k+"]= "+ tab[i][j][k]);
//                }
//            }

            int [][][]arr = {{{5,5,5},{6,6,6},{7,7,7}},{{5,5,5},{6,6,6},{7,7,7}},{{5,5,5},{6,6,6},{7,7,7}}};
                for(int i =0;i<arr.length;i++)
                {
                    for(int j =0;j<arr[i].length;j++)
                    {
                        for(int k =0;k<arr[i][j].length;k++)
                        {
                            System.out.println("arr["+i+"]["+j+"]["+k+"]= "+ arr[i][j][k]);
                        }
                    }

                }
        }














    }

