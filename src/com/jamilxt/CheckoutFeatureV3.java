package com.jamilxt;

// An interface can extend multiple interfaces.
public interface CheckoutFeatureV3 extends CheckoutFeatureV2, CheckoutFeature {
    void checkout();
}
