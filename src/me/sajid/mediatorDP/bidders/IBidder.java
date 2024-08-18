package me.sajid.mediatorDP.bidders;

import me.sajid.mediatorDP.mediators.IMediator;

public interface IBidder {
    public void setAuctionMediator(IMediator mediator);
    public void placeBid(int bidAmount);
    public void receiveNotification(IBidder bidder, int newBidAmount);
}
