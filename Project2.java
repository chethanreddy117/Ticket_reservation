import java.util.*;

class Train1{
    private String trainName;
    static int availableSeat = 50;
    public String[] passName;
    public int[] passAge;
    public int nop;
    static int count =1;


    Train1(String[] passName,int[] passAge, int nop){
        this.passName = passName;
        this.passAge = passAge;
        this.nop = nop;
    }


   public void setname(String trainName){
        this.trainName = trainName;
    }
    

   public String getname(){
        return trainName;
    }
    

    void bookTicket(){
       System.out.println("************************************************************************************");
       System.out.println("                          Your Ticket Details                                       ");
       System.out.println("************************************************************************************");
       System.out.printf("                                Train Name : %s                           \n",getname());
       System.out.println("------------------------------------------------------------------------------------");
       System.out.println("                                  Passenger Details                                 ");
       System.out.println("------------------------------------------------------------------------------------");
       System.out.println("Passenger Name     Passenger Age        Seat Number");
       for(int j=0;j<nop;j++)
       {
       System.out.printf("%s                    %d                %d\n",passName[j],passAge[j],count);
       count++;
       availableSeat--;
       }
       System.out.println("------------------------------------------------------------------------------------");
       System.out.println("Ticket(s) booked Successfully!");
       System.out.println("Seats Remaining : "+availableSeat);
       System.out.println("************************************************************************************");
       System.out.println("                Thank You for using the Ticket Reservation System.                  ");
       System.out.println("************************************************************************************\n");
    }
    
}

public class Project2{
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();
      Scanner sc = new Scanner(System.in);
    boolean exit = false;
    
    
    System.out.println("*******************************************************************");
    System.out.println("         Wellcome to the Railway Ticket Reservation System         ");
    System.out.println("*******************************************************************");
    while(!exit){
    System.out.println("Please choose an option : ");
    System.out.println("1. Book a ticket");
    System.out.println("2. Exit");
    int op  = sc.nextInt();
    
    switch(op){
        case 1: 
        System.out.println("Enter the Train Name : ");
        sc.nextLine();
        String trainName = sc.nextLine();
        //creating object.
        Train1 obj = new Train1(null,null,0);
        obj.setname(trainName);

        System.out.println("Enter the number of tickets you want to book : ");
        int nop = sc.nextInt();
        String passName[] = new String[nop];
        int passAge[] = new int[nop];  
        

        System.out.println("   Passenger Details:    ");
        System.out.println("-------------------------");
        for(int i=0;i<nop;i++){
            System.out.printf("Passenger %d Details:\n\n",i+1);
           

            
            sc.nextLine();
    // --------------------------------- for duplicate name -----------------------------
            while(true){           
            System.out.print("Passenger Name : ");
           
            passName[i] = sc.nextLine();
            if(list.contains(passName[i])==false){
                 
                list.add(passName[i]);
        
                break;
                
            }
            else{
                System.out.println("Passenger name is alredy Exist. Please Enter another Name\n");
                
                
            }
            
        }
    // ----------------------------------------------------------------------------------------
            
            passName[i] = list.getLast();
            System.out.print("Passenger Age : ");
            passAge[i] = sc.nextInt();
            System.out.println("-------------------------");
        }
        obj.passName = passName;
        obj.passAge = passAge;
        obj.nop=nop;
        obj.bookTicket();
        
        break;
        case 2:
        System.out.println("Thank You for using the Ticket Reservation System. Goodbye! and Happy journey");
        exit=true;
        break;
        default : 
        System.out.println("Error!!! - please choose the correct option\n");
    
    }
}
sc.close();
    }
}