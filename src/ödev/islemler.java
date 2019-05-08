/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev;



/**
 *
 * @author SEDAT
 */
class islemler extends not{
     int a,b,c,d;
     public void islem(){  
      System.out.println("Ogrenci Islemleri Icin:\"1\"e basiniz.\nDanisman Islemleri Icin:\"2\"ye basiniz.\nCikis Yapmak Icin \"9\"a basiniz.");
      System.out.println("Ogrenci Notlari Islemleri Icin:\"3\"e basiniz.");
      
       a=giris.nextInt();
      if(a!=9 && a!=2 && a!=1 && a!=3){
          System.out.println("Gecersiz Rakam Girdiniz");
          System.exit(1);
      }else if(a==1){          
          System.out.println("Ogrenci Eklemek Icin:\"1\"e basiniz.\nOgrenci Silmek Icin:\"2\"ye basiniz.");
          System.out.println("Ogrenci Yazdirmak Icin:\"3\"e basiniz.\nOgrenci Guncellemek Icin:\"4\"e basiniz.\nCikis Yapmak Icin \"9\"a basiniz.");
          b=giris.nextInt();
          if(b!=1 && b!=2 && b!=9 && b!=3 && b!=4) {
            System.out.println("Gecersiz Rakam Girdiniz");
            System.exit(1);
          }
          else if(b==1){
              ogrenciekle();
          }
          else if(b==2){
              ogrencisil();
          }
          else if(b==3){
              ogrenciyazdir();
          }
          else if(b==9){
              System.out.println("Cikis Rakami Girdiniz...");
              System.exit(1);
          }
          else if(b==4){
              ogrenciguncelle();
            }
          }
       else if(a==2){
           System.out.println("Ogretim Uyesi Eklemek Icin:\"1\"e basiniz.\nOgretim Uyesine Ders Atamak Icin:\"2\"ye basiniz.");
           System.out.println("Ogretim Uyesi Yazdirmak Icin:\"3\"e basiniz.\nCikis Yapmak Icin:\"9\"a basiniz.");
           c=giris.nextInt();
           if(c!=1 && c!=2 && c!=9 && c!=3) {
            System.out.println("Gecersiz Rakam Girdiniz");
            System.exit(1);
          }
           else if(c==1){
               ogretimuyesiekle();
           }
           else if(c==2){
               dersata();
           }
           else if(c==3){
               ogretimuyesiyazdir();
           }
           else if(c==9){
              System.out.println("Cikis Rakami Girdiniz...");
              System.exit(1);
           }
       }
       else if(a==3){
           System.out.println("Ogrenci Notu Girmek Icin:\"1\"e basiniz.\nOgrenci Notu Yazdirmak Icin:\"2\"ye basiniz.");
           System.out.println("Ogrenci Notunun Ortalamasi Icin:\"3\"e basiniz.\nCikis Yapmak Icin:\"9\"a basiniz.");
           d=giris.nextInt();
           if(d!=1 && d!=2 && d!=9 && d!=3){
               System.out.println("Gecersiz Rakam Girdiniz");
               System.exit(1); 
           }
           else if(d==1){
               notgir();
           }
           else if(d==2){
               notyazdir();
           }
           else if(d==3){
               notortalama();
           }
           else if(d==9){
              System.out.println("Cikis Rakami Girdiniz...");
              System.exit(1);
           }
       }
       else if(a==9){
              System.out.println("Cikis Rakami Girdiniz...");
              System.exit(1);
          }       
      islem();
    }  

  

}