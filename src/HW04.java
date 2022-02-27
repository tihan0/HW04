public class HW04 {

    public static void main(String[] args) {



/* пример 1 */

        int a=2;
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i]=a;
            a+=2;
            System.out.print(" " +array[i]);
        }
       System.out.println();
            for (int i=0; i<10; i++){
                System.out.println(" " + array[i]);
            }}}


/* пример 2*/

        /*
int a=1;
int []array=new int[50];
for (int i=0;i<50; i++){
array[i]=a; a+=2;
System.out.print(array[i]+" ");
}
System.out.print(" ");
int c=99;
for (int i=0;i<50;i++){
    array[i]=c; c-=2;
    System.out.print(array[i]+" ");
        }}}
*/

/* пример 3 */
/*
int []array = new int [15];
Random random= new Random();
for (int i=0;i<15;i++){
array[i]=random.nextInt(100);
System.out.print(array[i]+" ");}
System.out.println();
int a=0;
for (int i=0;i<15;i++){
    if (array[i]%2==0){;a=++a;
    System.out.println(array[i]);
        }}
System.out.println(a);
    }}*/

/*пример 4*/
/*
        int []array = new int [20];
        Random random= new Random();
        for (int i=0;i<20;i++){
            array[i]=random.nextInt(20);
            System.out.print(array[i]+" ");}
        System.out.println();
        for (int i=0;i<20;i++){
            if (array[i]%2==0){
                System.out.println(array[i]);
            } else {
            System.out.println("0");}}
    }}
     */

/*пример 5*/
        /*
        int a=0;
        double s1;
int [] amarray=new int [5];
Random random=new Random();
for (int i=0; i<5; i++) {
amarray[i]=random.nextInt(15);
a+=amarray[i];
System.out.print(amarray[i]+" ");}
System.out.println();
System.out.println(a); s1=(double) a/5;
System.out.println(s1);
        int b=0;
        double s2;
        int [] bmarray=new int [5];
        Random brandom=new Random();
        for (int i1=0; i1<5; i1++) {
            bmarray[i1]=brandom.nextInt(15);
            b+=bmarray[i1];
            System.out.print(bmarray[i1]+" ");}
        System.out.println();
        System.out.println(b); s2=(double) b/5;
        System.out.println(s2);
    if (s1>s2) {
        System.out.println("среднее арифметическое первого массива больше");}
    else if (s1<s2){
        System.out.println("среднее арифметическое второго массива больше");
    } else {  System.out.println("средние арифметические массивов равны");
    }}}
             */

/*пример 6*/
        /*
               int [] array=new int [4];
        Random random=new Random();
        for (int i=0; i<4; i++) {
            array[i]=random.nextInt(10);
                   System.out.print(array[i]+" ");}
    if ((array[0]<array[1])&&(array[1]<array[2])&&(array[2]<array[3])) {
    System.out.println("массив является строго возрастающим");} else {
        System.out.println("массив не является строго возрастающим");
    }
    }}
             */


/*пример 7*/
        /*
        int [] array=new int [12];
        Random random=new Random();
        for (int i=0; i<12; i++) {
            array[i]=random.nextInt(15);
            System.out.print(array[i]+" ");}
         */
/*
        int []array = new int []{92,55,44,8,92};

               for (int i=0; i<5; i++) {
            System.out.print(array[i]+" ");}
        System.out.println();
        int a=array[0]; int b; int c;
        for (int i=1;i<5;i++){
        b=array[i];
        c=array[i++];
        if (a>b) {a=array[i];b=array[i++];
        System.out.println(a);}
        else {b=a;c=a;}
        System.out.println(b);
    }}}*/


/*сортировка числел пузырьком (от обратного)*/
        /*
int []array=new int[]{2,3,1,4,0,-2};
for (int i=0; i<array.length; i++){
    for (int j=array.length-1;j>i;j--){
if (array[j-1]>array[j]){
    int buf =array[j];
    array[j]=array[j-1];
    array[j-1]=buf;
        }}}
    System.out.println(Arrays.toString(array));}}
             */

