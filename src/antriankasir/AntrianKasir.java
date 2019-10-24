/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antriankasir;

/**
 *
 * @author SMHab
 */
public class AntrianKasir {
     static int queue[];
    static int size;
    static int top;

    
    static void inisialisasi(int i)
    {
        size=i;
        queue=new int[size];
        top=0;
    }
    
    static boolean Kosong()
    {
        return top<=0;
    }
    
    static boolean Penuh()
    {
        return top>=size;
    }
    
    static void enqueue(int i)
    {
        if(Penuh())
            System.out.println("antrian penuh");
        else
        {
            System.out.println("Pelanggan dengan ID member "+i+" telah masuk ke antrian");
            queue[top++]=i;
        }
    }
    
    static void dequeue()
    {
        if(Kosong())
            System.out.println("antrian kosong");
        else
        {
            int pop=queue[0];
            int i=1;
            System.out.println("Pelanggan dengan ID member "+pop+" telah keluar dari antrian");
            while(i<top)
            {
                queue[i-1]=queue[i];
                i++;
            }
            top--;
        }
    }
    
    static void display()
    {
        System.out.println("\nDaftar antrian =");
        int i=0;
        while(i<top)
        {
            System.out.println("antrian ke "+(i+1)+" adalah pelanggan dengan ID member "+queue[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        AntrianKasir a=new AntrianKasir();
        a.inisialisasi(6);
        a.enqueue(12);
        a.enqueue(5);
        a.enqueue(2);
        a.dequeue();
        a.enqueue(9);
        a.dequeue();
        a.display();
   
       
    }


    
}
