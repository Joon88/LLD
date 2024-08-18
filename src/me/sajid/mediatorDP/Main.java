package me.sajid.mediatorDP;

import me.sajid.mediatorDP.bidders.Bidder;
import me.sajid.mediatorDP.bidders.IBidder;
import me.sajid.mediatorDP.mediators.IMediator;
import me.sajid.mediatorDP.mediators.Mediator;

public class Main {
    public static void main(String[] args) {
        // create the mediator
        IMediator mediator = new Mediator();

        // create the bidders
        IBidder bidder1 = new Bidder("Sajid");
        IBidder bidder2 = new Bidder("Suhail");

        bidder1.placeBid(100);

        // assign mediator to bidder
        bidder1.setAuctionMediator(mediator);
        bidder2.setAuctionMediator(mediator);

        bidder2.placeBid(120);
        bidder1.placeBid(100);
        bidder1.placeBid(200);
        bidder2.placeBid(300);
    }
}
