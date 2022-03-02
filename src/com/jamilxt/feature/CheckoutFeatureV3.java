package com.jamilxt.feature;

import com.jamilxt.feature.CheckoutFeature;
import com.jamilxt.feature.CheckoutFeatureV2;

// An interface can extend multiple interfaces.
public interface CheckoutFeatureV3 extends CheckoutFeatureV2, CheckoutFeature {
    void checkout();
}
