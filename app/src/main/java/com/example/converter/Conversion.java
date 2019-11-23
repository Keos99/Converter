package com.example.converter;

import androidx.annotation.StringRes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.example.converter.Unit.*;

public enum Conversion {
    SQUARE(R.string.square, Arrays.asList(SQ_SENTIMETERS, SQ_KILOMETRES, SQ_METRES, HECTARE)),
    COOKING(R.string.cooking, Collections.<Unit>emptyList()),
    CURRENCY(R.string.currency, Collections.<Unit>emptyList()),
    DATA(R.string.data, Collections.<Unit>emptyList()),
    ENERGY(R.string.energy, Collections.<Unit>emptyList()),
    FUEL(R.string.fuel, Collections.<Unit>emptyList()),
    LENGTH(R.string.length, Arrays.asList(KILOMETRE, MILE, METRE, CENTIMETRE, MILLIMETRE, MICROMETRE)),
    WEIGHT(R.string.weight, Collections.<Unit>emptyList()),
    POWER(R.string.power, Collections.<Unit>emptyList()),
    PRESSURE(R.string.pressure, Collections.<Unit>emptyList()),
    SPEED(R.string.speed, Collections.<Unit>emptyList());

    @StringRes
    int lable;
    List<Unit> mUnits;

    Conversion(@StringRes int lable, List<Unit> mUnits){
        this.lable = lable;
        this.mUnits = mUnits;
    }
}