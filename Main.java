package interface_inheritances;

import java.util.Scanner;

public class Main {
	Scanner s = new Scanner (System.in);
	Child_1 c1;
	Child_2 c2;
	Child_3 c3;
	Child_4 c4;
	Child_5 c5;
	Child_6 c6;
	
	public void Characters()
    {
        c2 = new Child_2("Second Child","Karakter ini anak kedua");
        c4 = new Child_4("Forth Child","Karakter ini anak keempat");
        c1 = new Child_1("First Child","Karakter ini anak pertama");
        c5 = new Child_5("Fifth Child","Karakter ini anak kelima");
        c6 = new Child_6("Sixth Child","Karakter ini anak keenam");
        c3 = new Child_3("Third Child","Karakter ini anak ketiga");
}
	
	public Main() {
		Characters();
		String input;
        String str[];
        String str2[];

        System.out.println("Simulasi kelompok kemampuan");
        System.out.println("0:Child_2");
        System.out.println("1:Child_4");
        System.out.println("2:Child_1");
        System.out.println("3.Child_5");
        System.out.println("4:Child_6");
        System.out.println("5.Child_3");
        System.out.print("Input : ");
        input = s.nextLine();
 
        str = input.split(" ");
        str2 = str[1].split(",");
        
        if(str[0].equals("Info"))
        {
            for(int i = 0; i < str2.length; i++)
            {
                if(str2[i].equals("0"))
                	c2.getinfo();
                else if(str2[i].equals("1"))
                    c4.getinfo();
                else if (str2[i].equals("2"))
                    c1.getinfo();
                else if (str2[i].equals("3"))
                    c5.getinfo();
                else if (str2[i].equals("4"))
                    c6.getinfo();
                else if (str2[i].equals("5"))
                    c3.getinfo();
            }
        }
        else if (str[0].equals("Cook"))
        {
            for (int i = 0; i < str2.length; i++) {
                if(str2[i].equals("0"))
                    c2.Cook();
                else if(str2[i].equals("1"))
                    c4.Cook();
                else if (str2[i].equals("2"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("3"))
                   System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("4"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("5"))
                    c3.Cook();
            }

        }
        else if (str[0].equals("Drive"))
        {
            for (int i = 0; i < str2.length; i++) {
                if(str2[i].equals("0"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if(str2[i].equals("1"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("2"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("3"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("4"))
                    c6.Drive();
                else if (str2[i].equals("5"))
                    c3.Drive();
            }
        }
        else if (str[0].equals("Work"))
        {
            for (int i = 0; i < str2.length; i++) {
                if(str2[i].equals("0"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if(str2[i].equals("1"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("2"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("3"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("4"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("5"))
                    c3.Work();
            }
        }
        else if (str[0].equals("Paint"))
        {
            for (int i = 0; i < str2.length; i++) {
                if(str2[i].equals("0"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if(str2[i].equals("1"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("2"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("3"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("4"))
                    System.out.println("Karakter tidak bisa melakukan aksi");
                else if (str2[i].equals("5"))
                    c3.Paint();
            }

        }
	}

	public static void main(String[] args) {
		new Main();
	}

}
