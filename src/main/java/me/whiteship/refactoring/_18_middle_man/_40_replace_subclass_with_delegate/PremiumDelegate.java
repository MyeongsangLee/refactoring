package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate;

public class PremiumDelegate {
    private Booking host;
    private PremiumExtra premiumExtra;

    public PremiumDelegate(Booking host, PremiumExtra premiumExtra) {
        this.host = host;
        this.premiumExtra = premiumExtra;
    }

    public boolean hasTalkback() {
        return this.host.show.hasOwnProperty("talkback");
    }

}
