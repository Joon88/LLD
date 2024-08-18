package me.sajid.mediatorDP.mediators;

import me.sajid.mediatorDP.bidders.IBidder;

public interface IMediator {
    public void addBidder(IBidder bidder);
    public void placeBid(IBidder bidder, int bidAmount);
}
