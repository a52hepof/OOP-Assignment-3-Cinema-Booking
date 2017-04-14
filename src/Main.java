import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;


import java.awt.*;
import java.util.ArrayList;

import java.io.IOException;


public class Main extends PApplet{

    //Create new Object
    Index Index;
    Seat seat;
    MovieSelection Movie;
    MovieInformation MovieInfo;

    PImage Guardians, Kong, GetOut, IT, LegoBatman, Shooter, StepBrothers, Spiderman;
    PImage GuardiansBackground, KongBackground,SpidermanBackground, MovieSelectBackground, GetOutBackground, LegoBatmanBackground, ShooterBackground, ITBackground, StepBrothersBackground;
    PFont MovieFont, Title, MovieText;
    Movie Movie1;
    SeatSelection screenage;

    //Screen State Variables
    final int WelcomeScreen = 0;
    final int MovieSelectScreen = 1;
    final int MovieInfoScreen = 2;
    final int SeatSelection = 3;
    //final int FoodDrinkSelection = 4;
    //final int EndScreen = 5; //Maybe Payment Screen
    int ScreenState = MovieInfoScreen;

    private int MoviePick = 4;
    private final int GuardiansMovie = 0;
    private final int KongMovie = 1;
    private final int GetOutMovie =2;
    private final int ITMovie = 3;
    private final int LegoBatmanMovie =4;
    private final int ShooterMovie = 5;
    private final int StepBrothersMovie = 6;
    private final int SpidermanMovie = 7;


    public void setup()
    {
        screenage = new SeatSelection(this, 1);
        background(34,34,34);
        Index = new Index(this);
        //seat = new Seat(this, 100, 100, true, 1);
        Movie = new MovieSelection(this);
        MovieInfo = new MovieInformation(this);
        //Movie1 = new Movie();
        //Movie.loadMovies();
        //Movie.getRating();

        Title = createFont("Title.ttf", 42);
        MovieFont = createFont("arial.ttf", 32);
        MovieText = createFont("cs_regular.ttf", 42);

        //textFont(MovieFont, 18);

        //Movie Poster Images
        Guardians = loadImage("Guardians.jpg");
        Kong = loadImage("Kong.jpg");
        GetOut = loadImage("GetOut.jpg");
        IT = loadImage("IT.jpg");
        LegoBatman = loadImage("LegoBatman.jpg");
        Shooter = loadImage("Shooter.jpg");
        StepBrothers = loadImage("StepBrothers.jpg");
        Spiderman = loadImage("Spiderman.jpg");

        //Background Images
        SpidermanBackground = loadImage("SpidermanBackground.jpg");
        GuardiansBackground = loadImage("GuardiansBackground.jpg");
        KongBackground = loadImage("KongBackground.jpg");
        MovieSelectBackground = loadImage("MovieSelectBackground.jpg");
        StepBrothersBackground = loadImage("StepBrothersBackground.jpg");
        ITBackground = loadImage("ITBackground.jpg");
        ShooterBackground = loadImage("ShooterBackground.jpg");
        LegoBatmanBackground = loadImage("LegoBatmanBackground.jpg");
        GetOutBackground = loadImage("GetOutBackground.jpg");
    }

    public void settings()
    {
        fullScreen();
    }

    public void draw()
    {
        switch (ScreenState)
        {
            case WelcomeScreen:
                WelcomeScreen();
                break;

            case MovieSelectScreen:
                MovieSelect();
                break;

            case MovieInfoScreen:
                Index.Header();
                Index.Footer();
                MovieInfo();
        }
    }

    public void MovieInfo()
    {
        switch(MoviePick)
        {
            case GuardiansMovie:
                GuardiansBackground.resize(width , height);
                image(GuardiansBackground,0,0);
                fill(0,0,0, 190);
                rect(width /4,0,  width / 2 , height);

                noLoop();
                Movie.loadMovies("Guardians of the Galaxy", MovieText);
                fill(255);
                textAlign(LEFT);
                textFont(MovieFont);
                text("Description :" , width/4 + 30, height / 4 + 50);
                textSize(18);
                text("In 1988, on Earth, the boy Peter Quill is abducted by a spacecraft after losing his, " + "\n" +
                        "is a ravager searching a valuable orb on the surface of the dead planet Morag. " + "\n" +
                        "When Peter finds the orb, he is hunted down by the Kree warship The Dark Aster of the " + "\n" +
                        "powerful Ronan the Accuser but he flees. Peter also double crosses his partner Yondu Udonta " + "\n" +
                        "that puts m. Peter Quill arrives on the Xandar city Nova Empire and is chased by " + "\n" +
                        "Ronan's warrior Gamora and by the bounty hunters Rocket and The Groot. They are arrested " + "\n" +
                        "by the police officer Corpsman Dey and his men and sent to the prison end the strong Drax. " + "\n" +
                        "Soon they learn that Gamora wants to orb to a dealer for a huge amount while Drax wants to " + "\n" +
                        "kill Ronan, who killed his wife and daughter. They plot a plan to escape from The Kyln " + "\n" +
                        "to sell the orb and split the money. But soon they also learn that the orb keeps the " + "\n" +
                        "infinity stone that gives immensurable destructive power to the owner. They self-proclaim " + "\n" +
                        "Guardians of the Galaxy and decide to deliver the orb to the leader Nova Prime to keep " + "\n" +
                        "it safe from Ronan. But they are hunted down by Ronan and his right-arm Nebula that want " + "\n" +
                        "to destroy Xandar and also by Yondu Udonta and the Ravagers that want to sell the infinity " + "\n" +
                        "stone to make lots of money. Who will keep the powerful orb?", width/4 + 30 , height /3);
                break;

            case KongMovie:
                KongBackground.resize(width , height);
                image(KongBackground,0,0);
                fill(0,0,0, 190);
                rect(width /4,0,  width / 2 , height);

                noLoop();
                Movie.loadMovies("Kong", MovieText);
                fill(255);
                textAlign(LEFT);
                textFont(MovieFont);
                text("Description :" , width/4 + 30, height / 4 + 50);
                textSize(18);
                text("It's 1971, a team of explorers with a company of soldiers are following myth" +  "\n" +
                        "and legend in the Pacific amidst rumors of an island where creatures both " + "\n" +
                        "prehistoric and monstrous are supposed to live. Soon they come across Skull Island," + "\n" +
                        "the very island of lore and legend. The creatures they soon come across make the " + "\n" +
                        "soldiers and explorers running for their very lives. Soon Kong shows up to let all " + "\n" +
                        "know that he is the King of Skull Island and top of the food chain. Will they survive " + "\n" +
                        "to tell their story? Will beauty win the heart of the beast? ", width/4 + 30  , height /3);

                break;

                    case GetOutMovie:
                        GetOutBackground.resize(width , height);
                        image(GetOutBackground,0,0);
                        fill(0,0,0, 190);
                        rect(width /4,0,  width / 2 , height);

                        noLoop();
                        Movie.loadMovies("Get Out", MovieText);
                        fill(255);
                        textAlign(LEFT);
                        textFont(MovieFont);
                        text("Description :" , width/4 + 30, height / 4 + 50);
                        textSize(18);
                        text("A young black man visits his white girlfriend's family estate where he learns" + "\n" +
                                " that many of its residents, who are black, have gone missing, and " + "\n" +
                                "he soon learns the horrible truth when a fellow black man on the estate warns" + "\n" +
                                " him to \"get out\". He soon learns this is easier said than done.", width/4 + 30  , height /3);

                        break;

                    case ShooterMovie:
                        ShooterBackground.resize(width , height);
                        image(ShooterBackground,0,0);
                        fill(0,0,0, 190);
                        rect(width /4,0,  width / 2 , height);

                        noLoop();
                        Movie.loadMovies("Shooter", MovieText);
                        fill(255);
                        textAlign(LEFT);
                        textFont(MovieFont);
                        text("Description :" , width/4 + 30, height / 4 + 50);
                        textSize(18);
                        text("Bob Lee Swagger, one of the world's great marksmen and the son of a " + "\n" +
                                "Congressional Medal of Honoree, is a loner living in the Rockies. He's left the " + "\n" +
                                "military, having been hung out to dry in a secret Ethiopian mission a few years " + "\n" +
                                "before, when he's recruited by a colonel to help find a way that the President of " + "\n" +
                                "the US might be assassinated in one of three cities in the next two weeks. " + "\n" +
                                "He does his work, but the shot is fired notwithstanding and Bob Lee is quickly " + "\n" +
                                "the fall guy: wounded and hunted by thousands, he goes to ground and, aided by " + "\n" +
                                "two unlikely allies, searches for the truth and for those who double-crossed " + "\n" +
                                "him. All roads lead back to Ethiopia.", width/4 + 30  , height /3);

                        break;

                    case ITMovie:
                        ITBackground.resize(width , height);
                        image(ITBackground,0,0);
                        fill(0,0,0, 190);
                        rect(width /4,0,  width / 2 , height);

                        noLoop();
                        Movie.loadMovies("IT", MovieText);
                        fill(255);
                        textAlign(LEFT);
                        textFont(MovieFont);
                        text("Description :" , width/4 + 30, height / 4 + 50);
                        textSize(18);
                        text("Mike Regan has everything he could ever want, a beautiful family and a top of " + "\n" +
                                "the line smart house. The company he owns is on the verge of changing flight " + "\n" +
                                "leasing forever. That is, until the relationship with his I.T. advisor turns nasty, " + "\n" +
                                "to the point where his teenage daughter is being stalked and his family is under " + "\n" +
                                "attack through every technological facet of their lives.", width/4 + 30  , height /3);
                        break;

                    case LegoBatmanMovie:
                        LegoBatmanBackground.resize(width , height);
                        image(LegoBatmanBackground,0,0);
                        fill(0,0,0, 190);
                        rect(width /4,0,  width / 2 , height);

                        noLoop();
                        Movie.loadMovies("Lego Batman", MovieText);
                        fill(255);
                        textAlign(LEFT);
                        textFont(MovieFont);
                        text("Description :" , width/4 + 30, height / 4 + 50);
                        textSize(18);
                        text("Bruce Wayne(Batman) is scared of having a family and he has to deal with " + "\n" +
                                "it when he accidentally adopted Dick Grayson (Robin). After The Joker " + "\n" +
                                "gets sent to the Phantom Zone, Batman soon finds out it was The Joker's plan " + "\n" +
                                "to get sent there and get all the villains in there out. It is Batman and his " + "\n" +
                                "friend's job to stop The Joker.", width/4 + 30  , height /3);
                        break;

                    case StepBrothersMovie:
                        StepBrothersBackground.resize(width , height);
                        image(StepBrothersBackground,0,0);
                        fill(0,0,0, 190);
                        rect(width /4,0,  width / 2 , height);

                        noLoop();
                        Movie.loadMovies("Step Brothers", MovieText);
                        fill(255);
                        textAlign(LEFT);
                        textFont(MovieFont);
                        text("Description :" , width/4 + 30, height / 4 + 50);
                        textSize(18);
                        text("Two unemployed, 40 year old Los Angeles area slackers - Brennen Huff and Dale Doback - " + "\n" +
                                "are brought together when Brennen's mom falls for and marries Dale's dad. As the two " + "\n" +
                                "get used to living together, tensions between Brennen and Dale grow incredibly " + "\n" +
                                "intense. However, at family gatherings, Brennen is always overshadowed by his " + "\n" +
                                "wealthy, successful, and obnoxious brother Derek - who drives a luxury car, has a " + "\n" +
                                "beautiful (but lonely) wife and two kids. As Brennan and Dale both quickly learn " + "\n" +
                                "they share the same hatred for Derek, they quickly find out they both have more in " + "\n" +
                                "common than once thought. They soon decide that they both have the ultimate business " + "\n" +
                                "idea, combine Brennan's singing abilities with Dale's drumming abilities to form a " + "\n" +
                                "rock and roll karaoke company. However, Dale's father's dream of sailing around the " + "\n" +
                                "world hinders their plans, along with a series of incidents that constantly shoot " + "\n" +
                                "themselves in the foot. Can they pull it off without driving each other completely crazy?", width/4 + 30  , height /3);
                        break;

                    case SpidermanMovie:
                        SpidermanBackground.resize(width , height);
                        image(SpidermanBackground,0,0);
                        fill(0,0,0, 190);
                        rect(width /4,0,  width / 2 , height);

                        noLoop();
                        Movie.loadMovies("Spiderman", MovieText);
                        fill(255);
                        textAlign(LEFT);
                        textFont(MovieFont);
                        text("Description :" , width/4 + 30, height / 4 + 50);
                        textSize(18);
                        text("It was announced by Marvel that a new ongoing series titled Peter Parker, " + "\n" +
                                "The Spectacular Spider-Man will begin publication in June 2017. The series is being " + "\n" +
                                "written by Chip Zdarsky with Adam Kubert providing the artwork.", width/4 + 30 , height /3);
                        break;


        }


    }

    public void WelcomeScreen()
    {
        SpidermanBackground.resize(width , height);
        image(SpidermanBackground,0,0);
        fill(0,0,0, 220);
        rect(0,0, width , height);

        Index.BackgroundCircles();

        noStroke();
        beginShape();
        pushMatrix();
        translate(width/2, height/2 - 60);
        scale((float) 6);
        fill(0, 0, 0, 150);
        vertex(0, -50);
        vertex(14, -20);
        vertex(47, -15);
        vertex(23, 7);
        vertex(29, 40);
        vertex(0, 25);
        vertex(-29, 40);
        vertex(-23, 7);
        vertex(-47, -15);
        vertex(-14, -20);
        endShape(CLOSE);
        popMatrix();

        Index.TitleText(MovieFont, Title);

        Button TitleButton = new Button(this, Title,"Book Now", width/2, height - 225, 48, width/3 + 130, height - 280, width/5, height/16, false, WelcomeScreen, MovieSelectScreen);
        TitleButton.update();
        TitleButton.fillRect();
        TitleButton.overRect(width/3 + 130, height - 280, width/5, height/16);
        ScreenState = TitleButton.rectClick();
    }

    public void MovieSelect()
    {
        MovieSelectBackground.resize(width , height);
        image(MovieSelectBackground,0,0);
        fill(0,0,0, 220);
        rect(0,0, width , height);

        //Change this shit not hard coded values
        MoviePick = Index.MovieImagePlaceholder(Guardians, width/8, height/8, 310, 210, MovieSelectScreen, GuardiansMovie);
        MoviePick = Index.MovieImagePlaceholder(Kong, width/3, height/8, 310, 210, MovieSelectScreen, KongMovie);
        //Index.MovieImagePlaceholder(GetOut, width/2 + 100, height/8, 310, 210, MovieSelectScreen, );
        //Index.MovieImagePlaceholder(IT, width - width/4, height/8, 310, 210, MovieSelectScreen, );
        //Index.MovieImagePlaceholder(LegoBatman, width/8, height/2 + 20, 310, 210, MovieSelectScreen, );
        //Index.MovieImagePlaceholder(Shooter, width/3, height/2 + 20, 310, 210, MovieSelectScreen, );
        //Index.MovieImagePlaceholder(StepBrothers, width/2 + 100, height/2 + 20, 310, 210, MovieSelectScreen, );
        //Index.MovieImagePlaceholder(Spiderman, width - width/4, height/2 + 20, 310, 210, MovieSelectScreen, );
    }

    public void SeatSelection()
    {
        screenage.screenRender(1);
    }

    public static void main(String[] args)
    {
        String[] a = {"MAIN"};
        PApplet.runSketch( a, new Main());


        InsertData app = new InsertData();
        // insert three new rows
        //app.insert("IT", "Horror", 12, 4);
        //app.insert("Alien", "Horror", 13, 9);
    }

}

