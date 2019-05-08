/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import static ödev.Ogrenci.x;

/**
 *
 * @author SEDAT
 */
class not extends OgretimUyesi {
    static float not[][]=new float[10][10];
    static int l;
    int p,q;
    
    String dersbul;
    void notgir(){
        System.out.println("Notu girilcek ogrenci numarasi giriniz...");
        String no1=  giris.next();
        
        if(x<=0){
            System.out.println("***Ogrenci Listesi Bos***");
        }else{
		
        for(i=0;i<x;i++){               
                if(no[i] == null ? no1 == null : no[i].equals(no1)){
                    System.out.println("Notu Girilcek Ogrenci Adi:"+isim[i]);
                    System.out.println("Notu Girilcek Ogrenci Soyadi:"+soyad[i]);
                    System.out.println("Notu Girilcek Ogrenci Numarasi:"+no[i]); 
                    System.out.println("*****Hangi Dersin Notunu Girceksiniz*****");
                    dersbul=giris.next();
                    for(p=0;p<ders.length;p++){                        
                         if(ders[i][p] == null ? dersbul == null : ders[i][p].equals(dersbul)){
                             System.out.println("*****Kac Tane Not Girceksiniz*****");
                             l=giris.nextInt();
                             System.out.println(ders[i][p] +" in notlarini giriniz.");
                             for(q=0;q<l;q++){
                                 not[p][q]=giris.nextInt();
                             }
                         }   
                        
                    }
                    System.out.println("*****Dersin Notlari Girildi*****");
            }
            
            
        } 
        } 
    }
    void notyazdir(){    
        System.out.println("Notu yazdirilcak ogrenci numarasi giriniz...");
        String no1=  giris.next();
        
        if(x<=0){
            System.out.println("***Ogrenci Listesi Bos***");
        }else{
		
        for(i=0;i<x;i++){               
                if(no[i] == null ? no1 == null : no[i].equals(no1)){           
                    System.out.println("*****Hangi Dersin Notunu Yazdircaksiniz*****");
                    dersbul=giris.next();
                    for(p=0;p<ders.length;p++){                        
                         if(ders[i][p] == null ? dersbul == null : ders[i][p].equals(dersbul)){
                        
                             System.out.println(ders[i][p] +" in notlari:");
                             for(q=0;q<not.length;q++){                                
                                 try{
                                    FileOutputStream f=new FileOutputStream("C:\\Users\\Sedat Er\\Desktop\\Yeni Metin Belgesi.txt",true) ;
                                    PrintStream yaz=new PrintStream(f);
                                    
                                    if(not[p][q]==0){
                                        q++;
                                    }else{ 
                                        
                                        yaz.println(q+1 +". not "+not[p][q]);
                                        
                                    }
                                 }
                                 catch(IOException e){        
                                }
                             }
                         }   
                        
                    }
                    System.out.println("*****Dersin Notlari Yazdirildi*****");
            }
           
            
        } 
        } 
}
    void notortalama(){
            float temp=0;
            int m=0;
             try{
                FileOutputStream f=new FileOutputStream("C:\\Users\\Sedat Er\\Desktop\\Yeni Metin Belgesi.txt",true) ;
                PrintStream yaz=new PrintStream(f);
            
            System.out.println("Ortalamasini Almak Istediginiz Dersin Notunu Girmediyseniz Not Girmek Icın:\"1\"e bas.");
            System.out.println("Eger Girdiyseniz ve Ortalama Almak Istiyosaniz:\"2\"ye basiniz.");
            p=giris.nextInt();
            if(p==1){
            this.notgir();}
            
                 System.out.println("Ortalamasi alincak dersi alan ogrencinin ogrenci numarasi giriniz...");
                 String no1=  giris.next();
        
        if(x<=0){
            System.out.println("***Ogrenci Listesi Bos***");
        }
        else{		
        for(i=0;i<x;i++){               
                if(no[i] == null ? no1 == null : no[i].equals(no1)){
           
                    System.out.println("*****Hangi Dersin Ortalamasini Yazdircaksiniz*****");
                    dersbul=giris.next();
                    for(p=0;p<ders.length;p++){                        
                         if(ders[i][p] == null ? dersbul == null : ders[i][p].equals(dersbul)){
                       
                             System.out.println(ders[i][p] +" in Ortalamasi:");
                             for(q=0;q<not.length;q++){                             
                                    
                                    if(not[p][q]==0){
                                        q++;
                                    }else{ 
                                        temp=temp+not[p][q];                                       
                                        m=q+1;
                                    }
                                }
                             yaz.println(ders[i][p] +" in Ortalamasi:"+ temp/m);
                             }
                             
                         }   
                        
                    }
                    
                    System.out.println("*****Dersin Ortalamasi Yazdirildi*****");
                }
           
            
            } 
            
        }
    
             
          catch(IOException e){        
            }
    }
    }
    
    
    
    

