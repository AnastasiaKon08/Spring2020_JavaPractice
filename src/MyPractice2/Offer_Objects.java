package MyPractice2;

import java.util.ArrayList;
import java.util.Arrays;

public class Offer_Objects {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setOfferInfo("Salt Lake, UT", "Rein Corp.", 130000, true);
        Offer offer2 = new Offer();
        offer2.setOfferInfo("Denver, CO", "CapitalOne", 1250000, false);
        Offer offer3 = new Offer();
        offer3.setOfferInfo("Salt Lake City, UT", "Vail Resorts Corp.", 1200000, false);
        Offer offer4 = new Offer();
        offer4.setOfferInfo("Seattle, WA", "Wells Fargo Bank", 110000, true);
        Offer offer5 = new Offer();
        offer5.setOfferInfo("San Diego, CA", "Google", 150000, true);

        ArrayList<Offer> jobOffers = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        jobOffers.removeIf(p-> !p.location.contains("UT"));
        for (Offer each: jobOffers){
            System.out.println("Local Area:\n" + each);

        }
        System.out.println("==============================");

        ArrayList<Offer> jobOffers2 = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        jobOffers.removeIf(p-> p.isFullTime == false);
        for (Offer each: jobOffers2){
            System.out.println("Full time Positions:\n" + each);
        }

        System.out.println("==============================");



    }
}

/*
Create 5 offer objects, and add them into the list of offers, and then:
			1. use for loop to print out the info of each offer
			2. write a program that can only retain the offers if:
					1. the offer is for fulltime position
					2. offer is from your local area
					3. salary is greater than 100K
 */