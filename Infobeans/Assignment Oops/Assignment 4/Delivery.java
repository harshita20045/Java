/*CRICKET SCOREBOARD
Create a class named Delivery with the following private attributes
1. over long
2. ball long
3. runs long
4. batsman String
5. bowler String
6. nonStriker String
Implement getters, setters, parameterized constructors and default constructors for the above attributes.
Create another class named Main and include a main method to test the above class.
Input format:
The first line consists of a long that represents over.
The second line consists of a long that represents the ball.
The third line consists of a long that represents the runs.
The fourth line consists of a String that represents a batsman.
The next line consists of a String that represents a bowler.
The next line consists of a String that represents a nonStriker.
Output format:
The output should display delivery details.
*/

class Delivery {
    private long over;
    private long ball;
    private long runs;
    private String batsman;
    private String bowler;
    private String nonStriker;

    public Delivery() {
        this.over =1 ;
        this.ball = 6;
        this.runs =2;
        this.batsman = "Kohli";
        this.bowler = "Bumrah";
        this.nonStriker = "Hardik";
    }

    public Delivery(long over, long ball, long runs, String batsman, String bowler, String nonStriker) {
        this.over = over;
        this.ball = ball;
        this.runs = runs;
        this.batsman = batsman;
        this.bowler = bowler;
        this.nonStriker = nonStriker;
    }

   
    public Delivery(Delivery other) {
        this.over = other.over;
        this.ball = other.ball;
        this.runs = other.runs;
        this.batsman = other.batsman;
        this.bowler = other.bowler;
        this.nonStriker = other.nonStriker;
    }

    

    public void setOver(long over)
	{
        this.over = over;
    }
    public long getOver()
	{
        return over;
    }


    public void setBall(long ball)
	{
        this.ball = ball;
    }
    public long getBall()
	{
        return ball;
    }


    public void setRuns(long runs)
	{
        this.runs = runs;
    }
    public long getRuns() 
	{
        return runs;
    }


    public void setBatsman(String batsman)
	{
        this.batsman = batsman;
    }
    public String getBatsman() 
	{
        return batsman;
    }


    public void setBowler(String bowler)
	{
        this.bowler = bowler;
    }

    public String getBowler()
	{
        return bowler;
    }

    public void setNonStriker(String nonStriker)
	{
        this.nonStriker = nonStriker;
    }
    public String getNonStriker()
	{
        return nonStriker;
    }

    
    public void display() {
        System.out.println("Delivery Details:");
        System.out.println("Over: " + over);
        System.out.println("Ball: " + ball);
        System.out.println("Runs: " + runs);
        System.out.println("Batsman: " + batsman);
        System.out.println("Bowler: " + bowler);
        System.out.println("Non-striker: " + nonStriker);
    }
}

class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        Delivery delivery = new Delivery();

        
        System.out.println("Set delivery details:");
        System.out.println("Enter over:");
        delivery.setOver(scanner.nextLong());
        System.out.println("Enter ball:");
        delivery.setBall(scanner.nextLong());
        System.out.println("Enter runs:");
        delivery.setRuns(scanner.nextLong());
        scanner.nextLine(); 
        System.out.println("Enter batsman:");
        delivery.setBatsman(scanner.nextLine());
        System.out.println("Enter bowler:");
        delivery.setBowler(scanner.nextLine());
        System.out.println("Enter non-striker:");
        delivery.setNonStriker(scanner.nextLine());

        
        System.out.println("Over: " + delivery.getOver());
        System.out.println("Ball: " + delivery.getBall());
        System.out.println("Runs: " + delivery.getRuns());
        System.out.println("Batsman: " + delivery.getBatsman());
        System.out.println("Bowler: " + delivery.getBowler());
        System.out.println("Non-striker: " + delivery.getNonStriker());

    
        delivery.display();

      
    }

	
}
