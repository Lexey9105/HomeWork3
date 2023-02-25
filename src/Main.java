public class Main {
    public static void main(String[] args) {
        byte a = -20;
        short b = 29550;
        int c = 2000000000;
        long d = 9000000000000L;
        float i = 1/(float)a;
        double f = 2*i;
         System.out.println("Значение переменной a"+" с типом byte"+" равно "+a);
         System.out.println("Значение переменной b"+" с типом short"+" равно "+b);
         System.out.println("Значение переменной c"+" с типом short"+" равно "+c);
         System.out.println("Значение переменной d"+" с типом Long"+" равно "+d);
         System.out.println("Значение переменной i"+" с типом float"+" равно "+i);
         System.out.println("Значение переменной f"+" с типом double"+" равно "+f);



            float aA= 27.12F;
            long bA= 987678965549L;
            double cA= 2.786;
            short dA= 569;
            short iA= -159;
            int fA=27897;
            byte gA=67;
             System.out.println(aA);
             System.out.println(bA);
             System.out.println(cA);
             System.out.println(dA);
             System.out.println(iA);
             System.out.println(fA);
             System.out.println(gA);



               byte aClass=23;
               byte bClass=27;
               byte cClass=30;
               short allPaper=480;
               byte allPupils =(byte) (aClass+bClass+cClass);
               byte pupilPaper=(byte)(allPaper/allPupils);
                System.out.println("На каждого учника рассчитано "+pupilPaper+" листов бумаги");



                    byte v = 8;
                    short aS =(short)(v*20);
                    short bS=(short)(v*1440);
                    int cS=v*1440*3;
                    int dS=v*1440*30;
                     System.out.println("За 20 минут машина произвела "+aS+" бутылок");
                     System.out.println("За сутки машина произвела "+bS+" бутылок");
                     System.out.println("За три дня машна произвела "+cS+" бутылок");
                     System.out.println("За месяц машина произвела "+dS+" бутылок");



                        byte allP=120;
                        byte classWP=2;
                        byte classBP=4;
                        byte allClass=(byte)(allP/(classWP+classBP));
                        byte allWP=(byte)(allClass*classWP);
                        byte allBP=(byte)(allClass*classBP);
                         System.out.println("В школе где "+allClass+" классов нужно "+allWP+" белых красок "+" и "+allBP+" коричневых красок ");



                           short bananas=5*80;
                           short milk=2*105;
                           short ice=2*100;
                           short eggs=4*70;
                           short weightGram=(short)(bananas+milk+ice+eggs);
                           float weightKilo=(float)(weightGram*0.001);
                            System.out.println("Общий вес спортзавтрака в граммах "+weightGram+" гр");
                            System.out.println("Общий все спортзавтрака в килограммах "+weightKilo+" кг");



                              short sWeightDelete= 7*1000;
                              short vWD=250;
                              short vDW=500;
                              short tWD=(short)(sWeightDelete/vWD);
                              short tDW=(short)(sWeightDelete/vDW);
                              short meanWD=(short)((tWD+tDW)/2);
                               System.out.println("Если спортсмен будет терять каждый день по "+vWD+" грамм то на похудене уйдет "+tWD+" дней");
                               System.out.println("Если спортсмен будет терять каждый день по "+vDW+" грамм то на похудене уйдет "+tDW+" дней");
                               System.out.println("В среднем на похудение уйдет "+meanWD+" дней");



                                  int mishaSalary=67760;
                                  int denisSalary=83690;
                                  int kristinaSalary=76230;
                                  int earMS=mishaSalary*12;
                                  int earDS=denisSalary*12;
                                  int earKS=kristinaSalary*12;
                                  float incr=0.1f;
                                  int incrMS=(int)(mishaSalary+mishaSalary*incr);
                                  int incrDS=(int)(denisSalary+denisSalary*incr);
                                  int incrKS=(int)(kristinaSalary+kristinaSalary*incr);
                                  int earIMS=incrMS*12;
                                  int earIDS=incrDS*12;
                                  int earIKS=incrKS*12;
                                  int differMS=earIMS-earMS;
                                  int differDS=earIDS-earDS;
                                  int differKS=earIKS-earKS;
                                   System.out.println("Миша теперь получает "+incrMS+" рублей в месяц."+"Годовой доход вырос на "+differMS+" рублей");
                                   System.out.println("Денис теперь получает "+incrDS+" рублей в месяц."+"Годовой доход вырос на "+differDS+" рублей");
                                   System.out.println("Кристина теперь получает "+incrKS+" рублей в месяц."+"Годовой доход вырос на "+differKS+" рублей");

    }
}