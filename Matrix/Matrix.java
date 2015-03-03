package com.com.teststring;

/*Дано:
Матрица |A| :
2	3	4
5	6	7
8	9	10

Матрица |B| :
5	6	7
8	9	10
11	12	13
Найти матрицу |C| = |A| x |B|
Вычислим элементы матрицы |C|:

c1,1 = a1,1b1,1 + a1,2b2,1 +a1,3b3,1
c1,2 = a1,1b1,2+a1,2b2,2+a1,3b3,2
c1,3 = a1,1b1,3+a1,2b2,3+a1,3b3,3

c2,1 = a2,1b1,1+a2,2b2,1+a2,3b3,1
c2,2 = a2,1b1,2+a2,2b2,2+a2,3b3,2
c2,3 = a2,1b1,3+a2,2b2,3+a2,3b3,3

c3,1 = a3,1b1,1+a3,2b2,1+a3,3b3,1
c3,2 = a3,1b1,2+a3,2b2,2+a3,3b3,2
c3,3 = a3,1b1,3+a3,2b2,3+a3,3b3,3

c1,1 = 	2	*	5	+	3	*	8	+	4	*	11	=	10	+	24	+	44	=	78
c1,2 = 	2	*	6	+	3	*	9	+	4	*	12	=	12	+	27	+	48	=	87
c1,3 = 	2	*	7	+	3	*	10	+	4	*	13	=	14	+	30	+	52	=	96

c2,1 = 	5	*	5	+	6	*	8	+	7	*	11	=	25	+	48	+	77	=	150
c2,2 = 	5	*	6	+	6	*	9	+	7	*	12	=	30	+	54	+	84	=	168
c2,3 = 	5	*	7	+	6	*	10	+	7	*	13	=	35	+	60	+	91	=	186

c3,1 = 	8	*	5	+	9	*	8	+	10	*	11	=	40	+	72	+	110	=	222
c3,2 = 	8	*	6	+	9	*	9	+	10	*	12	=	48	+	81	+	120	=	249
c3,3 = 	8	*	7	+	9	*	10	+	10	*	13	=	56	+	90	+	130	=	276

Результирующая матрица |С| :

78	87	96
150	168	186
222	249	276
* */


import java.util.Arrays;

public class Matrix {

    private int sizeX = 3;
    private int sizeY = 3;
    private int[][] matrixBody;

    public Matrix(int sizeX, int sizeY, int[][] matrixBody) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.matrixBody = matrixBody;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public int[][] getMatrixBody() { return matrixBody; }

    public void setMatrixBody(int[][] matrixBody) {this.matrixBody = matrixBody; }

    public Matrix multiplicationMatrix(Matrix a, Matrix b) {
        Matrix matrixResult = new Matrix(a.getSizeX(),a.getSizeX(), new int[a.getSizeX()][a.getSizeX()]);

        for (int i = 0 ; i < a.getSizeX(); i++) {
            for (int j = 0 ;  j < a.getSizeX() ;  j++) {
                matrixResult.matrixBody[i][j] =  this.getCellResult(i, j, a.getMatrixBody(),b.getMatrixBody());
               // this.w("matrixResult[" + i + "][" + j + "]" + matrixResult.matrixBody[i][j]);
            }
        }
        return matrixResult;
    }

    public int getCellResult(int k , int h ,int[][] a, int[][] b){
        int result = 0;
        for (int i = 0; i < a.length ; i++) {
            result+= a[k][i] * b [i][h];
        }
        return result;
    }

    @Override
    public String toString() {

        String str = "Matrix{\n" ;
        for(int i = 0 ; i < matrixBody.length; i++) {
            str+="[" + Arrays.toString(matrixBody[i]) +"]\n";
        }
        str +='}';
        return str;
    }


    public void w(String s){
        System.out.println(s);
    }




}
