import java.util.*;

public class sort{
    public static void main(String args[])
    {
        final Scanner scr=new Scanner(System.in); 
        char ch='y';

        do{
            System.out.println("---------------SORTING MENU-------------------");
            System.out.println("1) Sort a list of integers in ascending order");
            System.out.println("3) Sort a list of doubles in ascending order");
            System.out.println("5) Sort student objects in ascending order");
            System.out.println("2) Sort a list of integers in descending order");
            System.out.println("4) Sort a list of doubles in descending order");
            System.out.println("6) Sort student objects in descending order");
            System.out.println("--------------------------------");
            System.out.print("Please make a selection! ");
         
            int userChoice=scr.nextInt();

            System.out.println("");

            switch(userChoice)
            {
                case 1:
                int n1;
                System.out.print("Please enter the size of the array:");
                n1 = scr.nextInt();
      
                int a1[] = new int[n1];
                System.out.println("Please enter all of the elements:");
                for (int i = 0; i < n1; i++){
                    a1[i] = scr.nextInt();
                }              
                Arrays.sort(a1);
                System.out.print("Integer array in Ascending Order:");
                for (int i = 0; i < n1 ; i++){
                    System.out.print(a1[i] + ",");
                }        
                    break;
          
                case 2:
                int n2;
                System.out.print("Please enter the size of the array:");
                n2 = scr.nextInt();
      
                double a2[] = new double[n2];
                System.out.println("Please enter all of the elements:");
                for (int i = 0; i < n2; i++) {
                    a2[i] = scr.nextDouble();
                }
                Arrays.sort(a2);
                System.out.print("Ascending Order of double array:");
                
                for (int i = 0; i < n2 ; i++){
                    System.out.print(a2[i] + ",");
                }
                        break;
                case 3:
                    List<Student> ar= new ArrayList<>() ;
                    System.out.println("Enter the number of students: ");
                    int n3= scr.nextInt();

                    for(int i=0; i<n3; i++){
                        scr.nextLine();
                        System.out.println("Enter name of new student: ");
                        String name = scr.nextLine();
                        System.out.println("Enter score of this student: ");
                        int score = scr.nextInt();
                        Student obj= new Student(score, name);
                        ar.add(obj);
                    }
                 
                    Collections.sort(ar, new SortbyName());
                    System.out.println("\nSorted by name in ascending order");
                    for (int i=0; i<ar.size(); i++)
                    System.out.println(ar.get(i));
                        break;
                
                case 4:
                    int n4, temp;
                    System.out.print("Please enter the size of the array:");
                    n4 = scr.nextInt();
         
                    int a4[] = new int[n4];
                    System.out.println("Please enter all of the elements:");
                    for (int i = 0; i < n4; i++)
                    {
                        a4[i] = scr.nextInt();
                    }
                 
                    for (int i = 0; i < n4; i++) {   
                        for (int j = i+1; j < n4; j++) {   
                            if(a4[i] < a4[j]) {  
                                temp = a4[i];
                                a4[i] = a4[j];  
                                a4[j] = temp;  
                            }   
                        }   
                    }
           
                    System.out.print("Integer Array in Descending Order");
                    for (int i = 0; i < n4 ; i++){
                        System.out.print(a4[i] + ",");
                    }             
                        break;
        
                case 5: 
                int n5;
                double temp1;
                System.out.print("Please enter the size of the array:");
                n5 = scr.nextInt();
      
                double a5[] = new double[n5];
                System.out.println("Please enter all of the elements:");
                for (int i = 0; i < n5; i++){
                    a5[i] = scr.nextDouble();
                }
      
                for (int i = 0; i < n5; i++) {   
                    for (int j = i+1; j < n5; j++){
                        if(a5[i] < a5[j]) {  
                            temp1 = a5[i];
                            a5[i] = a5[j];
                            a5[j] = temp1;  
                        }
                    }
                }
                System.out.print("Descending Order of double array:");
                for (int i = 0; i < n5 ; i++){
                    System.out.print(a5[i] + ",");
                }
                    break;

                case 6:
                 List<Student> ls= new ArrayList<>() ;
                 System.out.println("Enter the number of students: ");
                 int n6= scr.nextInt();

                 for(int i=0; i<n6; i++){
                     scr.nextLine();
                     System.out.println("Enter name of new student: ");
                     String name= scr.nextLine();
                     System.out.println("Enter score of this student: ");
                     int score= scr.nextInt();
                     
                     Student obj= new Student(score, name);
                     ls.add(obj);
                 }
                 Collections.sort(ls, new SortbyScore());
                 Collections.reverse(ls);
                 System.out.println("\nSorted by score in descending order");
                
                 for (int i=0; i<ls.size(); i++)
                 System.out.println(ls.get(i));
                    break;

                default:
                        System.out.println("Invalid input. Please try again!");
            }
            System.out.println("");
            System.out.print("Would you like to continue? (Y/N): ");
            ch=scr.next().charAt(0);
            System.out.println("");
        }while(ch=='y' || ch=='Y');
    } 
}
class Student {
    int score;
    String name;
    
    public Student(int score, String name){
        this.score = score;
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getscore(){
        return score;
    }

    public void setscore(Integer score){
        this.score = score;
    }
    public String toString()
    {
        return this.name+ " "+this.score;
    }
}

class SortbyName implements Comparator<Student>{
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
}
class SortbyScore implements Comparator<Student>{
    public int compare(Student a, Student b)
    {
        return a.score - b.score;
    }
}