package me.sajid.mediatorDP.bidders;

import me.sajid.mediatorDP.mediators.IMediator;

public class Bidder implements IBidder{
    private String name;
    private IMediator auctionMediator;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void setAuctionMediator(IMediator mediator) {
        auctionMediator = mediator;
        mediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        if(auctionMediator != null) {
            auctionMediator.placeBid(this, bidAmount);
        } else
            System.out.println(name + ":: No mediator assigned to bidder: " + name);
    }

    @Override
    public void receiveNotification(IBidder bidder, int newBidAmount) {
        System.out.println(name + ":: "  +((Bidder)bidder).name + " has put a new bid: " + newBidAmount);
    }
}
