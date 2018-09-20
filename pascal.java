package ejercicios;
public class pascal {
public static void main(String[] args) {
// TODO code application logic herepublic static void main(String[] args) {
int nfilas = 10;
// se indica que el numero maximo es 10 filas.it is indicated that the maximum number is 10 rows
int[] a = new int[1];
// se indica ña variable
for (int i = 1; i <= nfilas; i++) {
    // para que sea la condicion que debe cumplir si indice = 1 indica menor o igual a numero de filas indice suma 1.to be the condition to be met if index = 1 indicates less than or equal to number of rows index sum 1 
    for(int k=i-5;k<=10;k++){
        System.out.print( " ");
    }
    int[] x = new int[i];
    for (int j = 0; j < i; j++) {
        if (j == 0 || j == (i - 1)){
        x[j] = 1;
        } 
        else {
            x[j] = a[j] + a[j - 1];
            }
        if(x[j]<10){
            System.out.print(x[j] + " ");
        }  else{
                if (x[j]<100){
                    System.out.print(x[j] + " ");
                }else{
                        System.out.print(x[j] + " ");
                    }
                }
        }
    a = x;
    System.out.println();
    }
}

}

