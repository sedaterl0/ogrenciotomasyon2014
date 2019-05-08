/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
//import static ödev.Ogrenci.x;




/**
 *
 * @author SEDAT
 */
class OgretimUyesi extends Ogrenci {    
    public static int y=0;
    String[][] ders1 =new String[10][10];
    String[] ad1=new String[10];
    String[] soyad1=new String[10];
   
     public void ogretimuyesiekle(){       
        System.out.println("..............Ogretim Uyesi Ekle.............");
        System.out.printf("%d . Ogretim Uyesi adi ve soyadi giriniz...\n",y+1);
        
        ad1[y] = giris.next();
        soyad1[y] = giris.next();        
        System.out.println(".......Ogretim Uyesi Eklendi....");
        y++;
    
    }
     public void dersata(){
         String adata;
         System.out.println("..............Ders Atama.............");
         System.out.println("Ders Atamak Istediginiz Ogretim Uyesi Adi:");
         adata=giris.next();
        if(y<=0){
            System.out.println("***Ogretim Uyesi Listesi Bos***");
        }else{ 	
        for(i=0;i<y;i++){               
                if(ad1[i] == null ? adata == null : ad1[i].equals(adata)){
                    System.out.println("Ders Eklencek Ogretim Uyesi Adi:"+ad1[i]);
                    System.out.println("Ders Eklencek Ogretim Uyesi Soyadi:"+soyad1[i]);
                    System.out.println(".....Atanicak Dersi Giriniz....."); 
                    ders1[y][i]=giris.next();
                   // k=i;
                    System.out.println("*****Ders Atama Islemi Tamamlandi*****");
                }            
            } 
        }
     
     }
      public void ogretimuyesiyazdir(){
        
        int j=0; 
        System.out.println("........Ogretim Uyesi Yazdir.......");
        System.out.println("***Girdiginiz Ogretim Uyesi Listesi***");
       while(j<y){
        if(ad1[j]== null && soyad1[j] == null ){
            System.out.println("***Ogretim Uyesi Listesi Bos***");
            j++;
        }else{
        try{
        FileOutputStream f=new FileOutputStream("C:\\Users\\Sedat Er\\Desktop\\Yeni Metin Belgesi.txt",true) ;
        PrintStream yaz=new PrintStream(f);   
        if(ders1[y][j] == null){
            yaz.println( j+1 + ".Ogretim Uyesi");
            yaz.println("Ogretim Uyesi Adi: "+ad1[j]);
            yaz.println("Ogretim Uyesi Soyadi: "+soyad1[j]);
            yaz.println("Ogretim Uyesi Dersi: Atanmadi");
        
        }else{
        yaz.println( j+1 + ".Ogretim Uyesi");
        yaz.println("Ogretim Uyesi Adi: "+ad1[j]);
        yaz.println("Ogretim Uyesi Soyadi: "+soyad1[j]);
        yaz.println("Ogretim Uyesi Dersi: "+ders1[y][j]);}
     }
     catch(IOException e){        
     }                
        j++;
}        
}
       System.out.println("************");
      }
}
    


