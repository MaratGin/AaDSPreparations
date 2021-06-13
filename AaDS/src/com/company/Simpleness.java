package com.company;

public class Simpleness {

    public static void main(String[] args) {
	Double a  =Math.sqrt(49);
        System.out.println(a);
    }


    boolean checkNumber(int p){

        boolean prime = true;
        for (int i = 2; i <= p/2; i++)
            if (p%i==0) prime = false;

            return prime;
            //ЛИНЕЙНАЯ
    }
    boolean checkNumber2(int p){

        boolean prime = true;
        if (p!=2)
            for (int i = 2; i <= Math.sqrt(p)+1; i++)
                if (p%i==0) {
                    prime = false;
                    break;
                }
        return prime;
            // КОРЕНЬ ИЗ P
    }


    int  simplecounter( int a, int b){
 int count=0;
        for ( int p = a; p<=b; p++){ //проход от а до b
            boolean prime = true;
//проверка на простоту
//док-во проверки в Вопросе 2
            for (int i = 2; i <= Math.sqrt(p); i++)
                if (p%i==0) prime = false;
            //если простое, увеличиваем счетчик
            if (prime) count++;
        }
        return count;
    }

    int  Eratosphen( int a, int b){

        boolean[] pr = new boolean[10000000];
        int count =0;
        for (int p = 2; p<=b; p++) pr[p] = true;
        for (int p = 2; p<=b; p++)
            if (pr[p]){
                count++;
//т.к. p - простое, то все j = p・k //-составные
                for (int j = 2*p; j <= b; j+=p)
                    pr[j] = false;
            }
  return  count;
    }



}
