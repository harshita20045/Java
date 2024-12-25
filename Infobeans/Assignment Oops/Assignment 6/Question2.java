class IndianSong 
{
    void play() 
	{
        System.out.println("Playing an Indian song.");
    }
}

class Bollywood extends IndianSong 
{
    void type() 
	{
        System.out.println("This is a Bollywood song.");
    }
}

class 	Punjabi extends Bollywood 
{
    void type() 
	{
        System.out.println("This is a Punjabi song.");
    }
}
class Hindi extends Bollywood 
{
    void type() 
	{
        System.out.println("This is an Hindi song.");
    }
}



class Question2 
{
    public static void main(String[] args) 
	{
        BollywoodSong b = new BollywoodSong();
        b.play();
        b.type();

        Punjabi p = new Punjabi();
        p.play();
        p.type();

        Hindi h = new Hindi();
        h.play();
        h.type();
    }
}
