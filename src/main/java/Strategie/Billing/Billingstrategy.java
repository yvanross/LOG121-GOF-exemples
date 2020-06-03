package Strategie.Billing;

//  reference https://en.wikipedia.org/wiki/Strategy_pattern#Java
interface BillingStrategy {
    // Use a price in cents to avoid floating point round-off error
    int getActPrice(int rawPrice);
  
    // Normal billing strategy (unchanged price)
    static BillingStrategy normalStrategy() {
        return rawPrice -> rawPrice;
    }
  
    // Strategy for Happy hour (50% discount)
    static BillingStrategy happyHourStrategy() {
        return rawPrice -> rawPrice / 2;
    }
}