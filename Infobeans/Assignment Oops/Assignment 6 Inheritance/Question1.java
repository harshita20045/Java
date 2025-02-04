class IndianSong 
{
    void play() 
	{
        System.out.println("Playing an Indian song.");
    }
}

class BollywoodSong extends IndianSong 
{
    void type() 
	{
        System.out.println("This is a Bollywood song.");
    }
}

class ClassicalSong extends IndianSong 
{
    void type() 
	{
        System.out.println("This is an Indian Classical song.");
    }
}

class FolkSong extends IndianSong 
{
    void type() 
	{
        System.out.println("This is an Indian Folk song.");
    }
}

class Question1 
{
    public static void main(String[] args) 
	{
        BollywoodSong bollywood = new BollywoodSong();
        bollywood.play();
        bollywood.type();

        ClassicalSong classical = new ClassicalSong();
        classical.play();
        classical.type();

        FolkSong folk = new FolkSong();
        folk.play();
        folk.type();
    }
}
