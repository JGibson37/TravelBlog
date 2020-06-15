package org.wecancodeit.reviews;


import java.util.ArrayList;
import java.util.Collection;

public class Country {

    private String countryName;




    private  Collection<City> cities = new ArrayList<>();

    ArrayList<City> cities = new ArrayList<>();

public void populateCities(){

        cities.add( new City("Bruce Peninsula", "Star Rating: 5 / 5", "Bruce Peninsula National Park", "Fish & Chip Place", "The Bruce Peninsula is an astounding area to visit if you enjoy hiking and\n" +
                "      nature. The winding pine forest trails and towering cliffs into crystal\n" +
                "      clear water demand you explore them. After exerting yourself in your\n" +
                "      travels, The Fish And Chip Place serves amazing white-fish tacos (And I\n" +
                "      don't even like fish!", "https://raw.githubusercontent.com/2020-Summer-Cohort/reviews-site-codingonthefly/dev/src/main/resources/static/images/brucepeninsulacliffs.jpg"));
        cities.add(new City("Cinque-Terre", "Star Rating: 5 / 5", "Boat Taxi", "Terre Trail", "We got to Cinque Terre and our mouths dropped. It had breath taking views. \n" +
                "        We stumbled on the Cinque Terre Trail after finding that there were three \n" +
                "        ways to travel in between the cities. We ended up taking the hike. It was worth it.\n" +
                "        Our taxi drivers name was Luca. He said we would make it to the city next door\n" +
                "        before the rain. We didn't make it... Very upset about our clothes being wet \n" +
                "        for dinner.", "https://raw.githubusercontent.com/2020-Summer-Cohort/reviews-site-codingonthefly/dev/src/main/resources/static/images/cinque-terre1.jpg"));
        cities.add( new City("Florence", "Star Rating 3 / 5", "Galleria dell'Accademia", "Cathedral of Santa Maria del Fiore", "The city was full of tourist and students. The Galleria dell'Accademia housed \n" +
                "        the Statue of David, which was impressive, but the security team does not allow photos.\n" +
                "        this is very upsetting to most travelers. During our visit the Cathedral of Santa Maria del \n" +
                "        Fiore was hosting a festival that filled the streets. The celebration was fun, but there \n" +
                "        are a few safety concerns with pick pickpockets. Be sure to keep your belongings safe.", "https://raw.githubusercontent.com/2020-Summer-Cohort/reviews-site-codingonthefly/dev/src/main/resources/static/images/florence1.jpg"));
        cities.add( new City("Gettysburg", "Star Rating 4 / 5", "Gettysburg National Military Park", "The Links At Gettysburg", "Gettysburg National Military Park is rated number one on things to do in Gettysburg, Pennsylvania, this\n" +
                "      historic military landmark was once a major turning point in the Civil\n" +
                "      War. Thought to have been one of the bloodiest battles during the Civil\n" +
                "      War, this was also a pivotal moment in history that gave inspiration for\n" +
                "      Abraham Lincoln’s “Gettysburg Address”. Many locals say that this landmark\n" +
                "      is also extremely haunted.\n" +
                "      For anyone who is an avid golfer, the\n" +
                "Links At Gettysburg links-style course presents a\n" +
                "      demanding layout with unforgiving fairways and greens, as well as various\n" +
                "      steep rock cliffs, lakes, and waterfalls spanning across its 18 holes. At\n" +
                "      a length of 7069 yards, this par-72 course is one of the larger public\n" +
                "      courses in the area, making it a challenge for some golfers off the tee.\n" +
                "      After the turn, or at the end of your round, The Links At Gettysburg also\n" +
                "      has a spacious indoor/outdoor bar with great food", "https://raw.githubusercontent.com/2020-Summer-Cohort/reviews-site-codingonthefly/dev/src/main/resources/static/images/gettysburg-links.jpg"));
        cities.add( new City("Jeju Island", "Star Rating 5 / 5", "Jungmun Lava Columns", "Museum of Glass", "These columns are located near the Mangnan Lava Tubes. They are formed by\n" +
                "      volcanic lava being cooled by the ocean water, naturally taking the\n" +
                "      striking column shape. They also have \"Black Sand Beaches\" nearby, which\n" +
                "      are beach fronts that have black sand, instead of the usual tan.\n" +
                "   \n" +
                "      The Museum of Glass is exactly what it sounds like. It is a museum that\n" +
                "      houses thousands of blown glass art pieces. Some reference old tales like\n" +
                "      jack and the bean stalk, while others reference Cinderella. Largely most\n" +
                "      of them are scenic views, like trees and flowers. ", "https://raw.githubusercontent.com/2020-Summer-Cohort/reviews-site-codingonthefly/dev/src/main/resources/static/images/JejuColumns.jpg"));
        cities.add( new City("Lucaya", "Start Rating 4 / 5", "Count Basie Square", "Leo's Art Gallery", " Here is what to do in Lucaya. Count Basie Square, Leo's Art Gallery, and Neptune's Cocktail Lounge are just to name a few. O, you can't forget Pelican Bay. I still haven't figured out how you can be on what seems like the top of a mountain and on the beach at the same time. Everything here seems perfect. You can't go wrong and the Marina is just at the bottom of the drive.", "https://raw.githubusercontent.com/2020-Summer-Cohort/reviews-site-codingonthefly/dev/src/main/resources/static/images/lbahama2.jpg"));
        cities.add( new City("Miami", "Star Rating 4 / 5", "Vizcaya Museum and Gardens ", "Wynwood Walls", "A historical Italian estate first built in 1916 as a private winter\n" +
                "      retreat for American Businessman James Deering, this beautiful villa pays\n" +
                "      tribute to the Italian Renaissance era. On this site tourists can visit a\n" +
                "      Museum that still has its earlier furnishings and artwork intact, as well\n" +
                "      as its beautiful formal gardens. Many tourists say this is one of the best\n" +
                "      bay views in Miami!\n" +
                "   \n" +
                "      Open to the public, and free of charge! Doesn’t get any better than that.\n" +
                "      Wynwood Walls was first established and opened in 2009 by well-known art\n" +
                "      visionary Tony Goldman. This outdoor museum features more than 40 street\n" +
                "      art murals from some of the leading street artists around the world. If\n" +
                "      you’re an up-and-coming artist looking for inspiration, this place is a\n" +
                "      must see! ", "https://raw.githubusercontent.com/2020-Summer-Cohort/reviews-site-codingonthefly/dev/src/main/resources/static/images/wynwood-walls.jpg"));
        cities.add( new City("Nassau", "Star Rating 4 / 5 ", "Cable Beach", "Blue Lagoon Island", "Nassau is known for quite a few attractions, including Cable Beach, Blue \n" +
                "      Lagoon Island, Queen's Staircase, Clifton\n" +
                "      Heritage National Park, and my favorite, the Aquaventure water park.  \n" +
                "      OMG, Beautiful water, nice people, great culture. I am coming\n" +
                "      back tomorrow, lol.", "https://raw.githubusercontent.com/2020-Summer-Cohort/reviews-site-codingonthefly/dev/src/main/resources/static/images/bahamas1.jpg"));
        cities.add( new City("Seoul", "Star Rating 4 / 5", "Gyeongbokgung Palace", "King Sejong's Statue ", "This site is a historical restoration of the original ancient palace constructed by the Joseon Empire. The original was destroyed by the japanese invasions in 1592-1598. It features historically accurate buildings, with numerous workers in historically accurate attire. King Sejong ruled from 1418-1450. He was most notably known for creating the Korean language Hangul. He was very progressive in other manners, passing laws to help establish more tourism, scientific discovery, and regional stabilization to Korea", "https://raw.githubusercontent.com/2020-Summer-Cohort/reviews-site-codingonthefly/dev/src/main/resources/static/images/Castle.jpg"));


    }


    public Country(String countryName) {
        this.countryName = countryName;

    }

    public String getCountryName() {
        return countryName;
    }
    public Collection<City> getCities() {
        return cities;
    }
    public void addCity(City city){
        cities.add(city);
    }

}


