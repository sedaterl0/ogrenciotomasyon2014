/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author SEDAT
 */
class Ogrenci {
    
    Scanner giris = new Scanner(System.in);
    public int i;
    public static int x=0,k=100,t;
    String[] no = new String[10];
    String[] isim = new String[10];
    String[] soyad = new String[10];
    String[][] ders = new String[10][10];
    public void ogrenciekle(){ 
        
        System.out.println("..............Ogrenci Ekle.............");
        System.out.printf("%d . Ogrenci adi,soyadi ve numara giriniz...\n",x+1);
        
        isim[x] = giris.next();
        soyad[x] = giris.next();
        no[x]= giris.next();
        System.out.println("Ogrenci Kac Tane Ders Alıyor.");
        t=giris.nextInt();
        for(int j=0;j<t;j++){
            System.out.println(j+1 +". Dersi Giriniz:");
            ders[x][j]=giris.next();
        }        
        System.out.println(".......Ogrenci Eklendi....");
        x++;
    
    }
    public void ogrencisil(){
        System.out.println("Silincek ogrenci numarasi giriniz...");
        String no1=  giris.next();
        if(x<=0){
            System.out.println("***Ogrenci Listesi Bos***\n***Ogrenci Eklemediniz***");
        }else{      
		
        for(i=0;i<x;i++){               
                if(no[i] == null ? no1 == null : no[i].equals(no1)){
                    System.out.println("Silincek Ogrenci Adi:"+isim[i]);
                    System.out.println("Silincek Ogrenci Soyadi:"+soyad[i]);
                    System.out.println("Silincek Ogrenci Numarasi:"+no[i]); 
                    isim[i] = null;                
                    soyad[i]=null;
                    no[i] =null;
                    ders[i]=null;
                    k=i;
                    System.out.println("*****Ogrenci Silindi*****");
            }
          
            
        } 
        } 
    }
    public void ogrenciyazdir(){
        
        int j=0; 
        System.out.println("........Ogrenci Yazdir.......");
        System.out.println("***Girdiginiz Ogrenci Listesi***");
       while(j<x){
        if(isim[j]== null && soyad[j] == null && no[j] == null){           
            j++;
        }else{
        try{
        FileOutputStream f=new FileOutputStream("C:\\Users\\Sedat Er\\Desktop\\Yeni Metin Belgesi.txt",true) ;
        PrintStream yaz=new PrintStream(f);
        if(k<j){
        yaz.println( j + ".Ogrenci");
        yaz.println("Ogrenci Adi: "+isim[j]);
        yaz.println("Ogrenci Soyadi: "+soyad[j]);
        yaz.println("Ogrenci Numarasi: "+no[j]);
        yaz.print("Ogrencinin Aldigi Dersler:");
        for(int z=0;z<ders.length;z++){
            if(ders[j][z]==null){
                z++;
            }else yaz.print(" "+ders[j][z]);
        }
        yaz.println();
        }
        else{ 
        yaz.println( j+1 + ".Ogrenci");
        yaz.println("Ogrenci Adi: "+isim[j]);
        yaz.println("Ogrenci Soyadi: "+soyad[j]);
        yaz.println("Ogrenci Numarasi: "+no[j]);
        yaz.print("Ogrencinin Aldigi Dersler:");
        for(int z=0;z<ders.length;z++){
             if(ders[j][z]==null){
                z++;
            }else yaz.print(" "+ders[j][z]);
        }
        yaz.println();
        }
      }
      catch(IOException e){        
      }                
        j++;
}        
}
       System.out.println("************");
    }
    void ogrenciguncelle(){
         System.out.println("Guncellenecek ogrenci numarasi giriniz...");
        String no1=  giris.next();
        String isim1,soyad1,num;
        if(x<=0){
            System.out.println("***Ogrenci Listesi Bos***\n***Ogrenci Eklemediniz***");
        }else{ 		
        for(i=0;i<x;i++){               
                if(no[i] == null ? no1 == null : no[i].equals(no1)){
                   System.out.println("Guncel ogrenci ismi giriniz...");
                   isim1= giris.next();
                   isim[i]=isim1; 
                   System.out.println("Guncel ogrenci soyadi giriniz...");
                   soyad1= giris.next();
                   soyad[i]=soyad1;
                   System.out.println("Guncel ogrenci numarasi giriniz...");
                   num= giris.next();
                   no[i]=num;
                }
            }       
               
        }   
    }  
}
