public class ArraiMuldimensionais {
    public static void main(String[] args) {

//EXEMPLOS DE COMO CRIAR MATRIZ 

        /*
        como funciona uma matriz ou array multidimensional:

     int dias [][] = new int [3][3];
                     dias [0][0] = 31;
                     dias [0][1] = 29;
                     dias [0][2] = 28;
                     dias [1][0] = 31;
                     dias [1][1] = 29;
                     dias [1][2] = 28;

     Para exibir a matriz = criar dois for();

     for(int i = 0; i < dias.length; i++){
        for(int j = 0; j < dias[i].length; j++){
            System.out.println();
        }
     }

         */
       
//        int dias[][] = new int[3][3];
//
//        dias[0][0] = 31;
//        dias[0][1] = 29;
//        dias[0][2] = 28;
//
//        dias[1][0] = 31;
//        dias[1][1] = 29;
//        dias[1][2] = 28;
//
//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[i].length; j++) {
//                System.out.println(dias[i][j]);
//            }
//        }


//        //foreach

//        System.out.println("usando foreach");
//        for (int[] arrBase: dias){ //uso de referencia
//            for (int num: arrBase){
//                System.out.println(num);
//            }
//        }


        //outros modo de usar o array
        int [] array = {1,2,3};
        int [][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        int [][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrayBase: arrayInt2){
            System.out.println("\n-----");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}