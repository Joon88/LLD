package me.sajid.mediatorDP.mediators;

import me.sajid.mediatorDP.bidders.IBidder;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements IMediator{
    private List<IBidder> bidders = new ArrayList<>();
    private int bidAmount;

    @Override
    public void addBidder(IBidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(IBidder bidder, int bidAmount) {
        if(bidAmount < this.bidAmount)
            System.out.println("MEDIATOR:: Wrong bid placed!");
        else {
            this.bidAmount = bidAmount;
            notifyAllBidders(bidder, bidAmount);
        }
    }

    private void notifyAllBidders(IBidder bidder, int bidAmount) {
        for(IBidder b: bidders) {
            if(b == bidder)
                continue;
            b.receiveNotification(bidder, bidAmount);
        }
    }
}
